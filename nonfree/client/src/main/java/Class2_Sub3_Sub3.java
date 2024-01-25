import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hn")
public final class Class2_Sub3_Sub3 extends Class2_Sub3 {

	@OriginalMember(owner = "client!hn", name = "p", descriptor = "I")
	public int anInt3104;

	@OriginalMember(owner = "client!hn", name = "q", descriptor = "I")
	public int anInt3105;

	@OriginalMember(owner = "client!hn", name = "s", descriptor = "I")
	public int anInt3107;

	@OriginalMember(owner = "client!hn", name = "t", descriptor = "I")
	public int anInt3108;

	@OriginalMember(owner = "client!hn", name = "x", descriptor = "I")
	private int anInt3112;

	@OriginalMember(owner = "client!hn", name = "y", descriptor = "I")
	public int anInt3113;

	@OriginalMember(owner = "client!hn", name = "A", descriptor = "I")
	public int anInt3115;

	@OriginalMember(owner = "client!hn", name = "C", descriptor = "I")
	private int anInt3117;

	@OriginalMember(owner = "client!hn", name = "B", descriptor = "I")
	private final int anInt3116;

	@OriginalMember(owner = "client!hn", name = "w", descriptor = "I")
	private final int anInt3111;

	@OriginalMember(owner = "client!hn", name = "o", descriptor = "Z")
	private final boolean aBoolean242;

	@OriginalMember(owner = "client!hn", name = "r", descriptor = "I")
	private int anInt3106;

	@OriginalMember(owner = "client!hn", name = "u", descriptor = "I")
	private int anInt3109;

	@OriginalMember(owner = "client!hn", name = "v", descriptor = "I")
	private int anInt3110;

	@OriginalMember(owner = "client!hn", name = "z", descriptor = "I")
	public int anInt3114;

	@OriginalMember(owner = "client!hn", name = "<init>", descriptor = "(Lclient!ck;II)V")
	public Class2_Sub3_Sub3(@OriginalArg(0) Class2_Sub10_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass2_Sub10_5 = arg0;
		this.anInt3116 = arg0.anInt848;
		this.anInt3111 = arg0.anInt850;
		this.aBoolean242 = arg0.aBoolean43;
		this.anInt3106 = arg1;
		this.anInt3109 = arg2;
		this.anInt3110 = 8192;
		this.anInt3114 = 0;
		this.method2482();
	}

	@OriginalMember(owner = "client!hn", name = "<init>", descriptor = "(Lclient!ck;III)V")
	public Class2_Sub3_Sub3(@OriginalArg(0) Class2_Sub10_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass2_Sub10_5 = arg0;
		this.anInt3116 = arg0.anInt848;
		this.anInt3111 = arg0.anInt850;
		this.aBoolean242 = arg0.aBoolean43;
		this.anInt3106 = arg1;
		this.anInt3109 = arg2;
		this.anInt3110 = arg3;
		this.anInt3114 = 0;
		this.method2482();
	}

	@OriginalMember(owner = "client!hn", name = "d", descriptor = "(I)V")
	public synchronized void method2467(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class2_Sub10_Sub1) super.aClass2_Sub10_5).aByteArray23.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt3114 = arg0;
	}

	@OriginalMember(owner = "client!hn", name = "e", descriptor = "()I")
	public synchronized int method2469() {
		return this.anInt3106 < 0 ? -this.anInt3106 : this.anInt3106;
	}

	@OriginalMember(owner = "client!hn", name = "b", descriptor = "(II)V")
	public synchronized void method2470(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method2494(arg0, arg1, this.method2500());
	}

	@OriginalMember(owner = "client!hn", name = "f", descriptor = "()Z")
	private boolean method2471() {
		@Pc(2) int local2 = this.anInt3109;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static460.method2478(local2, this.anInt3110);
			local8 = Static460.method2465(local2, this.anInt3110);
		}
		if (this.anInt3105 != local2 || this.anInt3113 != local10 || this.anInt3107 != local8) {
			if (this.anInt3105 < local2) {
				this.anInt3115 = 1;
				this.anInt3117 = local2 - this.anInt3105;
			} else if (this.anInt3105 > local2) {
				this.anInt3115 = -1;
				this.anInt3117 = this.anInt3105 - local2;
			} else {
				this.anInt3115 = 0;
			}
			if (this.anInt3113 < local10) {
				this.anInt3108 = 1;
				if (this.anInt3117 == 0 || this.anInt3117 > local10 - this.anInt3113) {
					this.anInt3117 = local10 - this.anInt3113;
				}
			} else if (this.anInt3113 > local10) {
				this.anInt3108 = -1;
				if (this.anInt3117 == 0 || this.anInt3117 > this.anInt3113 - local10) {
					this.anInt3117 = this.anInt3113 - local10;
				}
			} else {
				this.anInt3108 = 0;
			}
			if (this.anInt3107 < local8) {
				this.anInt3104 = 1;
				if (this.anInt3117 == 0 || this.anInt3117 > local8 - this.anInt3107) {
					this.anInt3117 = local8 - this.anInt3107;
				}
			} else if (this.anInt3107 > local8) {
				this.anInt3104 = -1;
				if (this.anInt3117 == 0 || this.anInt3117 > this.anInt3107 - local8) {
					this.anInt3117 = this.anInt3107 - local8;
				}
			} else {
				this.anInt3104 = 0;
			}
			return false;
		} else if (this.anInt3109 == Integer.MIN_VALUE) {
			this.anInt3109 = 0;
			this.anInt3105 = this.anInt3113 = this.anInt3107 = 0;
			this.method5866();
			return true;
		} else {
			this.method2482();
			return false;
		}
	}

	@OriginalMember(owner = "client!hn", name = "c", descriptor = "(II)V")
	private synchronized void method2472(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3109 = arg0;
		this.anInt3110 = arg1;
		this.anInt3117 = 0;
		this.method2482();
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "([IIIII)I")
	private int method2473(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt3117 <= 0) {
				if (this.anInt3106 == 256 && (this.anInt3114 & 0xFF) == 0) {
					if (Static314.aBoolean392) {
						return Static460.method2479(((Class2_Sub10_Sub1) super.aClass2_Sub10_5).aByteArray23, arg0, this.anInt3114, arg1, this.anInt3113, this.anInt3107, arg3, arg2, this);
					}
					return Static460.method2468(((Class2_Sub10_Sub1) super.aClass2_Sub10_5).aByteArray23, arg0, this.anInt3114, arg1, this.anInt3105, arg3, arg2, this);
				}
				if (Static314.aBoolean392) {
					return Static460.method2492(((Class2_Sub10_Sub1) super.aClass2_Sub10_5).aByteArray23, arg0, this.anInt3114, arg1, this.anInt3113, this.anInt3107, arg3, arg2, this, this.anInt3106, arg4);
				}
				return Static460.method2499(((Class2_Sub10_Sub1) super.aClass2_Sub10_5).aByteArray23, arg0, this.anInt3114, arg1, this.anInt3105, arg3, arg2, this, this.anInt3106, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt3117;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt3117 += arg1;
			if (this.anInt3106 == 256 && (this.anInt3114 & 0xFF) == 0) {
				if (Static314.aBoolean392) {
					arg1 = Static460.method2493(((Class2_Sub10_Sub1) super.aClass2_Sub10_5).aByteArray23, arg0, this.anInt3114, arg1, this.anInt3113, this.anInt3107, this.anInt3108, this.anInt3104, local5, arg2, this);
				} else {
					arg1 = Static460.method2496(((Class2_Sub10_Sub1) super.aClass2_Sub10_5).aByteArray23, arg0, this.anInt3114, arg1, this.anInt3105, this.anInt3115, local5, arg2, this);
				}
			} else if (Static314.aBoolean392) {
				arg1 = Static460.method2490(((Class2_Sub10_Sub1) super.aClass2_Sub10_5).aByteArray23, arg0, this.anInt3114, arg1, this.anInt3113, this.anInt3107, this.anInt3108, this.anInt3104, local5, arg2, this, this.anInt3106, arg4);
			} else {
				arg1 = Static460.method2474(((Class2_Sub10_Sub1) super.aClass2_Sub10_5).aByteArray23, arg0, this.anInt3114, arg1, this.anInt3105, this.anInt3115, local5, arg2, this, this.anInt3106, arg4);
			}
			this.anInt3117 -= arg1;
			if (this.anInt3117 != 0) {
				return arg1;
			}
		} while (!this.method2471());
		return arg3;
	}

	@OriginalMember(owner = "client!hn", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method4616(@OriginalArg(0) int arg0) {
		if (this.anInt3117 > 0) {
			if (arg0 >= this.anInt3117) {
				if (this.anInt3109 == Integer.MIN_VALUE) {
					this.anInt3109 = 0;
					this.anInt3105 = this.anInt3113 = this.anInt3107 = 0;
					this.method5866();
					arg0 = this.anInt3117;
				}
				this.anInt3117 = 0;
				this.method2482();
			} else {
				this.anInt3105 += this.anInt3115 * arg0;
				this.anInt3113 += this.anInt3108 * arg0;
				this.anInt3107 += this.anInt3104 * arg0;
				this.anInt3117 -= arg0;
			}
		}
		@Pc(71) Class2_Sub10_Sub1 local71 = (Class2_Sub10_Sub1) super.aClass2_Sub10_5;
		@Pc(76) int local76 = this.anInt3116 << 8;
		@Pc(81) int local81 = this.anInt3111 << 8;
		@Pc(87) int local87 = local71.aByteArray23.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt3112 = 0;
		}
		if (this.anInt3114 < 0) {
			if (this.anInt3106 <= 0) {
				this.method2488();
				this.method5866();
				return;
			}
			this.anInt3114 = 0;
		}
		if (this.anInt3114 >= local87) {
			if (this.anInt3106 >= 0) {
				this.method2488();
				this.method5866();
				return;
			}
			this.anInt3114 = local87 - 1;
		}
		this.anInt3114 += this.anInt3106 * arg0;
		if (this.anInt3112 >= 0) {
			if (this.anInt3112 > 0) {
				if (this.aBoolean242) {
					label125: {
						if (this.anInt3106 < 0) {
							if (this.anInt3114 >= local76) {
								return;
							}
							this.anInt3114 = local76 + local76 - this.anInt3114 - 1;
							this.anInt3106 = -this.anInt3106;
							if (--this.anInt3112 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt3114 < local81) {
								return;
							}
							this.anInt3114 = local81 + local81 - this.anInt3114 - 1;
							this.anInt3106 = -this.anInt3106;
							if (--this.anInt3112 == 0) {
								break;
							}
							if (this.anInt3114 >= local76) {
								return;
							}
							this.anInt3114 = local76 + local76 - this.anInt3114 - 1;
							this.anInt3106 = -this.anInt3106;
						} while (--this.anInt3112 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt3106 < 0) {
						if (this.anInt3114 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt3114 - 1) / local91;
						if (local361 < this.anInt3112) {
							this.anInt3114 += local91 * local361;
							this.anInt3112 -= local361;
							return;
						}
						this.anInt3114 += local91 * this.anInt3112;
						this.anInt3112 = 0;
					} else if (this.anInt3114 >= local81) {
						local361 = (this.anInt3114 - local76) / local91;
						if (local361 < this.anInt3112) {
							this.anInt3114 -= local91 * local361;
							this.anInt3112 -= local361;
							return;
						}
						this.anInt3114 -= local91 * this.anInt3112;
						this.anInt3112 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt3106 < 0) {
				if (this.anInt3114 < 0) {
					this.anInt3114 = -1;
					this.method2488();
					this.method5866();
					return;
				}
			} else if (this.anInt3114 >= local87) {
				this.anInt3114 = local87;
				this.method2488();
				this.method5866();
			}
		} else if (this.aBoolean242) {
			if (this.anInt3106 < 0) {
				if (this.anInt3114 >= local76) {
					return;
				}
				this.anInt3114 = local76 + local76 - this.anInt3114 - 1;
				this.anInt3106 = -this.anInt3106;
			}
			while (this.anInt3114 >= local81) {
				this.anInt3114 = local81 + local81 - this.anInt3114 - 1;
				this.anInt3106 = -this.anInt3106;
				if (this.anInt3114 >= local76) {
					return;
				}
				this.anInt3114 = local76 + local76 - this.anInt3114 - 1;
				this.anInt3106 = -this.anInt3106;
			}
		} else if (this.anInt3106 < 0) {
			if (this.anInt3114 < local76) {
				this.anInt3114 = local81 - (local81 - 1 - this.anInt3114) % local91 - 1;
			}
		} else if (this.anInt3114 >= local81) {
			this.anInt3114 = local76 + (this.anInt3114 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(Z)V")
	public synchronized void method2475() {
		this.anInt3106 = (this.anInt3106 ^ this.anInt3106 >> 31) + (this.anInt3106 >>> 31);
		this.anInt3106 = -this.anInt3106;
	}

	@OriginalMember(owner = "client!hn", name = "e", descriptor = "(I)V")
	public synchronized void method2477(@OriginalArg(0) int arg0) {
		this.method2472(arg0 << 6, this.method2500());
	}

	@OriginalMember(owner = "client!hn", name = "c", descriptor = "()Lclient!ad;")
	@Override
	public Class2_Sub3 method4615() {
		return null;
	}

	@OriginalMember(owner = "client!hn", name = "g", descriptor = "()V")
	private void method2482() {
		this.anInt3105 = this.anInt3109;
		this.anInt3113 = Static460.method2478(this.anInt3109, this.anInt3110);
		this.anInt3107 = Static460.method2465(this.anInt3109, this.anInt3110);
	}

	@OriginalMember(owner = "client!hn", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method4619(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt3109 == 0 && this.anInt3117 == 0) {
			this.method4616(arg2);
			return;
		}
		@Pc(13) Class2_Sub10_Sub1 local13 = (Class2_Sub10_Sub1) super.aClass2_Sub10_5;
		@Pc(18) int local18 = this.anInt3116 << 8;
		@Pc(23) int local23 = this.anInt3111 << 8;
		@Pc(29) int local29 = local13.aByteArray23.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt3112 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt3114 < 0) {
			if (this.anInt3106 <= 0) {
				this.method2488();
				this.method5866();
				return;
			}
			this.anInt3114 = 0;
		}
		if (this.anInt3114 >= local29) {
			if (this.anInt3106 >= 0) {
				this.method2488();
				this.method5866();
				return;
			}
			this.anInt3114 = local29 - 1;
		}
		if (this.anInt3112 >= 0) {
			if (this.anInt3112 > 0) {
				if (this.aBoolean242) {
					label130: {
						if (this.anInt3106 < 0) {
							local40 = this.method2489(arg0, arg1, local18, local44, local13.aByteArray23[this.anInt3116]);
							if (this.anInt3114 >= local18) {
								return;
							}
							this.anInt3114 = local18 + local18 - this.anInt3114 - 1;
							this.anInt3106 = -this.anInt3106;
							if (--this.anInt3112 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method2473(arg0, local40, local23, local44, local13.aByteArray23[this.anInt3111 - 1]);
							if (this.anInt3114 < local23) {
								return;
							}
							this.anInt3114 = local23 + local23 - this.anInt3114 - 1;
							this.anInt3106 = -this.anInt3106;
							if (--this.anInt3112 == 0) {
								break;
							}
							local40 = this.method2489(arg0, local40, local18, local44, local13.aByteArray23[this.anInt3116]);
							if (this.anInt3114 >= local18) {
								return;
							}
							this.anInt3114 = local18 + local18 - this.anInt3114 - 1;
							this.anInt3106 = -this.anInt3106;
						} while (--this.anInt3112 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt3106 < 0) {
						while (true) {
							local40 = this.method2489(arg0, local40, local18, local44, local13.aByteArray23[this.anInt3111 - 1]);
							if (this.anInt3114 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt3114 - 1) / local33;
							if (local416 >= this.anInt3112) {
								this.anInt3114 += local33 * this.anInt3112;
								this.anInt3112 = 0;
								break;
							}
							this.anInt3114 += local33 * local416;
							this.anInt3112 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method2473(arg0, local40, local23, local44, local13.aByteArray23[this.anInt3116]);
							if (this.anInt3114 < local23) {
								return;
							}
							local416 = (this.anInt3114 - local18) / local33;
							if (local416 >= this.anInt3112) {
								this.anInt3114 -= local33 * this.anInt3112;
								this.anInt3112 = 0;
								break;
							}
							this.anInt3114 -= local33 * local416;
							this.anInt3112 -= local416;
						}
					}
				}
			}
			if (this.anInt3106 < 0) {
				this.method2489(arg0, local40, 0, local44, 0);
				if (this.anInt3114 < 0) {
					this.anInt3114 = -1;
					this.method2488();
					this.method5866();
					return;
				}
			} else {
				this.method2473(arg0, local40, local29, local44, 0);
				if (this.anInt3114 >= local29) {
					this.anInt3114 = local29;
					this.method2488();
					this.method5866();
				}
			}
		} else if (this.aBoolean242) {
			if (this.anInt3106 < 0) {
				local40 = this.method2489(arg0, arg1, local18, local44, local13.aByteArray23[this.anInt3116]);
				if (this.anInt3114 >= local18) {
					return;
				}
				this.anInt3114 = local18 + local18 - this.anInt3114 - 1;
				this.anInt3106 = -this.anInt3106;
			}
			while (true) {
				local40 = this.method2473(arg0, local40, local23, local44, local13.aByteArray23[this.anInt3111 - 1]);
				if (this.anInt3114 < local23) {
					return;
				}
				this.anInt3114 = local23 + local23 - this.anInt3114 - 1;
				this.anInt3106 = -this.anInt3106;
				local40 = this.method2489(arg0, local40, local18, local44, local13.aByteArray23[this.anInt3116]);
				if (this.anInt3114 >= local18) {
					return;
				}
				this.anInt3114 = local18 + local18 - this.anInt3114 - 1;
				this.anInt3106 = -this.anInt3106;
			}
		} else if (this.anInt3106 < 0) {
			while (true) {
				local40 = this.method2489(arg0, local40, local18, local44, local13.aByteArray23[this.anInt3111 - 1]);
				if (this.anInt3114 >= local18) {
					return;
				}
				this.anInt3114 = local23 - (local23 - 1 - this.anInt3114) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method2473(arg0, local40, local23, local44, local13.aByteArray23[this.anInt3116]);
				if (this.anInt3114 < local23) {
					return;
				}
				this.anInt3114 = local18 + (this.anInt3114 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!hn", name = "b", descriptor = "()I")
	@Override
	public int method4614() {
		@Pc(6) int local6 = this.anInt3105 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt3112 == 0) {
			local6 -= local6 * this.anInt3114 / (((Class2_Sub10_Sub1) super.aClass2_Sub10_5).aByteArray23.length << 8);
		} else if (this.anInt3112 >= 0) {
			local6 -= local6 * this.anInt3116 / ((Class2_Sub10_Sub1) super.aClass2_Sub10_5).aByteArray23.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!hn", name = "f", descriptor = "(I)V")
	public synchronized void method2486(@OriginalArg(0) int arg0) {
		if (this.anInt3106 < 0) {
			this.anInt3106 = -arg0;
		} else {
			this.anInt3106 = arg0;
		}
	}

	@OriginalMember(owner = "client!hn", name = "g", descriptor = "(I)V")
	private synchronized void method2487() {
		this.method2472(0, this.method2500());
	}

	@OriginalMember(owner = "client!hn", name = "h", descriptor = "()V")
	private void method2488() {
		if (this.anInt3117 == 0) {
			return;
		}
		if (this.anInt3109 == Integer.MIN_VALUE) {
			this.anInt3109 = 0;
		}
		this.anInt3117 = 0;
		this.method2482();
	}

	@OriginalMember(owner = "client!hn", name = "d", descriptor = "()Lclient!ad;")
	@Override
	public Class2_Sub3 method4618() {
		return null;
	}

	@OriginalMember(owner = "client!hn", name = "b", descriptor = "([IIIII)I")
	private int method2489(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt3117 <= 0) {
				if (this.anInt3106 == -256 && (this.anInt3114 & 0xFF) == 0) {
					if (Static314.aBoolean392) {
						return Static460.method2484(((Class2_Sub10_Sub1) super.aClass2_Sub10_5).aByteArray23, arg0, this.anInt3114, arg1, this.anInt3113, this.anInt3107, arg3, arg2, this);
					}
					return Static460.method2491(((Class2_Sub10_Sub1) super.aClass2_Sub10_5).aByteArray23, arg0, this.anInt3114, arg1, this.anInt3105, arg3, arg2, this);
				}
				if (Static314.aBoolean392) {
					return Static460.method2481(((Class2_Sub10_Sub1) super.aClass2_Sub10_5).aByteArray23, arg0, this.anInt3114, arg1, this.anInt3113, this.anInt3107, arg3, arg2, this, this.anInt3106, arg4);
				}
				return Static460.method2483(((Class2_Sub10_Sub1) super.aClass2_Sub10_5).aByteArray23, arg0, this.anInt3114, arg1, this.anInt3105, arg3, arg2, this, this.anInt3106, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt3117;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt3117 += arg1;
			if (this.anInt3106 == -256 && (this.anInt3114 & 0xFF) == 0) {
				if (Static314.aBoolean392) {
					arg1 = Static460.method2466(((Class2_Sub10_Sub1) super.aClass2_Sub10_5).aByteArray23, arg0, this.anInt3114, arg1, this.anInt3113, this.anInt3107, this.anInt3108, this.anInt3104, local5, arg2, this);
				} else {
					arg1 = Static460.method2476(((Class2_Sub10_Sub1) super.aClass2_Sub10_5).aByteArray23, arg0, this.anInt3114, arg1, this.anInt3105, this.anInt3115, local5, arg2, this);
				}
			} else if (Static314.aBoolean392) {
				arg1 = Static460.method2480(((Class2_Sub10_Sub1) super.aClass2_Sub10_5).aByteArray23, arg0, this.anInt3114, arg1, this.anInt3113, this.anInt3107, this.anInt3108, this.anInt3104, local5, arg2, this, this.anInt3106, arg4);
			} else {
				arg1 = Static460.method2504(((Class2_Sub10_Sub1) super.aClass2_Sub10_5).aByteArray23, arg0, this.anInt3114, arg1, this.anInt3105, this.anInt3115, local5, arg2, this, this.anInt3106, arg4);
			}
			this.anInt3117 -= arg1;
			if (this.anInt3117 != 0) {
				return arg1;
			}
		} while (!this.method2471());
		return arg3;
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "()I")
	@Override
	public int method4613() {
		return this.anInt3109 == 0 && this.anInt3117 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(III)V")
	public synchronized void method2494(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method2472(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static460.method2478(arg1, arg2);
		@Pc(14) int local14 = Static460.method2465(arg1, arg2);
		if (this.anInt3113 == local10 && this.anInt3107 == local14) {
			this.anInt3117 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt3105;
		if (this.anInt3105 - arg1 > local31) {
			local31 = this.anInt3105 - arg1;
		}
		if (local10 - this.anInt3113 > local31) {
			local31 = local10 - this.anInt3113;
		}
		if (this.anInt3113 - local10 > local31) {
			local31 = this.anInt3113 - local10;
		}
		if (local14 - this.anInt3107 > local31) {
			local31 = local14 - this.anInt3107;
		}
		if (this.anInt3107 - local14 > local31) {
			local31 = this.anInt3107 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt3117 = arg0;
		this.anInt3109 = arg1;
		this.anInt3110 = arg2;
		this.anInt3115 = (arg1 - this.anInt3105) / arg0;
		this.anInt3108 = (local10 - this.anInt3113) / arg0;
		this.anInt3104 = (local14 - this.anInt3107) / arg0;
	}

	@OriginalMember(owner = "client!hn", name = "i", descriptor = "()I")
	public synchronized int method2495() {
		return this.anInt3109 == Integer.MIN_VALUE ? 0 : this.anInt3109;
	}

	@OriginalMember(owner = "client!hn", name = "h", descriptor = "(I)V")
	public synchronized void method2497(@OriginalArg(0) int arg0) {
		this.anInt3112 = arg0;
	}

	@OriginalMember(owner = "client!hn", name = "i", descriptor = "(I)V")
	public synchronized void method2498(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method2487();
			this.method5866();
		} else if (this.anInt3113 == 0 && this.anInt3107 == 0) {
			this.anInt3117 = 0;
			this.anInt3109 = 0;
			this.anInt3105 = 0;
			this.method5866();
		} else {
			@Pc(31) int local31 = -this.anInt3105;
			if (this.anInt3105 > local31) {
				local31 = this.anInt3105;
			}
			if (-this.anInt3113 > local31) {
				local31 = -this.anInt3113;
			}
			if (this.anInt3113 > local31) {
				local31 = this.anInt3113;
			}
			if (-this.anInt3107 > local31) {
				local31 = -this.anInt3107;
			}
			if (this.anInt3107 > local31) {
				local31 = this.anInt3107;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt3117 = arg0;
			this.anInt3109 = Integer.MIN_VALUE;
			this.anInt3115 = -this.anInt3105 / arg0;
			this.anInt3108 = -this.anInt3113 / arg0;
			this.anInt3104 = -this.anInt3107 / arg0;
		}
	}

	@OriginalMember(owner = "client!hn", name = "j", descriptor = "()I")
	public synchronized int method2500() {
		return this.anInt3110 < 0 ? -1 : this.anInt3110;
	}

	@OriginalMember(owner = "client!hn", name = "k", descriptor = "()Z")
	public boolean method2501() {
		return this.anInt3114 < 0 || this.anInt3114 >= ((Class2_Sub10_Sub1) super.aClass2_Sub10_5).aByteArray23.length << 8;
	}

	@OriginalMember(owner = "client!hn", name = "l", descriptor = "()Z")
	public boolean method2503() {
		return this.anInt3117 != 0;
	}
}
