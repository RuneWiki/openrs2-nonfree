import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rf")
public final class Class1_Sub10_Sub4 extends Class1_Sub10 {

	@OriginalMember(owner = "client!rf", name = "p", descriptor = "I")
	public int anInt3173;

	@OriginalMember(owner = "client!rf", name = "q", descriptor = "I")
	public int anInt3174;

	@OriginalMember(owner = "client!rf", name = "s", descriptor = "I")
	public int anInt3176;

	@OriginalMember(owner = "client!rf", name = "v", descriptor = "I")
	public int anInt3179;

	@OriginalMember(owner = "client!rf", name = "w", descriptor = "I")
	private int anInt3180;

	@OriginalMember(owner = "client!rf", name = "A", descriptor = "I")
	public int anInt3184;

	@OriginalMember(owner = "client!rf", name = "C", descriptor = "I")
	private int anInt3185;

	@OriginalMember(owner = "client!rf", name = "D", descriptor = "I")
	public int anInt3186;

	@OriginalMember(owner = "client!rf", name = "t", descriptor = "I")
	private final int anInt3177;

	@OriginalMember(owner = "client!rf", name = "y", descriptor = "I")
	private final int anInt3182;

	@OriginalMember(owner = "client!rf", name = "B", descriptor = "Z")
	private final boolean aBoolean127;

	@OriginalMember(owner = "client!rf", name = "r", descriptor = "I")
	private int anInt3175;

	@OriginalMember(owner = "client!rf", name = "z", descriptor = "I")
	private int anInt3183;

	@OriginalMember(owner = "client!rf", name = "u", descriptor = "I")
	private int anInt3178;

	@OriginalMember(owner = "client!rf", name = "x", descriptor = "I")
	public int anInt3181;

	@OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(Lclient!dc;II)V")
	public Class1_Sub10_Sub4(@OriginalArg(0) Class1_Sub11_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass1_Sub11_5 = arg0;
		this.anInt3177 = arg0.anInt807;
		this.anInt3182 = arg0.anInt806;
		this.aBoolean127 = arg0.aBoolean27;
		this.anInt3175 = arg1;
		this.anInt3183 = arg2;
		this.anInt3178 = 8192;
		this.anInt3181 = 0;
		this.method2472();
	}

	@OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(Lclient!dc;III)V")
	public Class1_Sub10_Sub4(@OriginalArg(0) Class1_Sub11_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass1_Sub11_5 = arg0;
		this.anInt3177 = arg0.anInt807;
		this.anInt3182 = arg0.anInt806;
		this.aBoolean127 = arg0.aBoolean27;
		this.anInt3175 = arg1;
		this.anInt3183 = arg2;
		this.anInt3178 = arg3;
		this.anInt3181 = 0;
		this.method2472();
	}

	@OriginalMember(owner = "client!rf", name = "d", descriptor = "()I")
	@Override
	public int method2441() {
		@Pc(6) int local6 = this.anInt3179 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt3185 == 0) {
			local6 -= local6 * this.anInt3181 / (((Class1_Sub11_Sub1) super.aClass1_Sub11_5).aByteArray4.length << 8);
		} else if (this.anInt3185 >= 0) {
			local6 -= local6 * this.anInt3177 / ((Class1_Sub11_Sub1) super.aClass1_Sub11_5).aByteArray4.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!rf", name = "c", descriptor = "(I)V")
	public synchronized void method2447(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class1_Sub11_Sub1) super.aClass1_Sub11_5).aByteArray4.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt3181 = arg0;
	}

	@OriginalMember(owner = "client!rf", name = "e", descriptor = "()V")
	private void method2448() {
		if (this.anInt3180 == 0) {
			return;
		}
		if (this.anInt3183 == Integer.MIN_VALUE) {
			this.anInt3183 = 0;
		}
		this.anInt3180 = 0;
		this.method2472();
	}

	@OriginalMember(owner = "client!rf", name = "d", descriptor = "(I)V")
	private synchronized void method2450() {
		this.method2459(0, this.method2467());
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "([IIIII)I")
	private int method2452(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt3180 <= 0) {
				if (this.anInt3175 == -256 && (this.anInt3181 & 0xFF) == 0) {
					if (Static107.aBoolean100) {
						return Static193.method2443(((Class1_Sub11_Sub1) super.aClass1_Sub11_5).aByteArray4, arg0, this.anInt3181, arg1, this.anInt3186, this.anInt3176, arg3, arg2, this);
					}
					return Static193.method2458(((Class1_Sub11_Sub1) super.aClass1_Sub11_5).aByteArray4, arg0, this.anInt3181, arg1, this.anInt3179, arg3, arg2, this);
				}
				if (Static107.aBoolean100) {
					return Static193.method2475(((Class1_Sub11_Sub1) super.aClass1_Sub11_5).aByteArray4, arg0, this.anInt3181, arg1, this.anInt3186, this.anInt3176, arg3, arg2, this, this.anInt3175, arg4);
				}
				return Static193.method2476(((Class1_Sub11_Sub1) super.aClass1_Sub11_5).aByteArray4, arg0, this.anInt3181, arg1, this.anInt3179, arg3, arg2, this, this.anInt3175, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt3180;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt3180 += arg1;
			if (this.anInt3175 == -256 && (this.anInt3181 & 0xFF) == 0) {
				if (Static107.aBoolean100) {
					arg1 = Static193.method2451(((Class1_Sub11_Sub1) super.aClass1_Sub11_5).aByteArray4, arg0, this.anInt3181, arg1, this.anInt3186, this.anInt3176, this.anInt3184, this.anInt3174, local5, arg2, this);
				} else {
					arg1 = Static193.method2469(((Class1_Sub11_Sub1) super.aClass1_Sub11_5).aByteArray4, arg0, this.anInt3181, arg1, this.anInt3179, this.anInt3173, local5, arg2, this);
				}
			} else if (Static107.aBoolean100) {
				arg1 = Static193.method2446(((Class1_Sub11_Sub1) super.aClass1_Sub11_5).aByteArray4, arg0, this.anInt3181, arg1, this.anInt3186, this.anInt3176, this.anInt3184, this.anInt3174, local5, arg2, this, this.anInt3175, arg4);
			} else {
				arg1 = Static193.method2445(((Class1_Sub11_Sub1) super.aClass1_Sub11_5).aByteArray4, arg0, this.anInt3181, arg1, this.anInt3179, this.anInt3173, local5, arg2, this, this.anInt3175, arg4);
			}
			this.anInt3180 -= arg1;
			if (this.anInt3180 != 0) {
				return arg1;
			}
		} while (!this.method2463());
		return arg3;
	}

	@OriginalMember(owner = "client!rf", name = "e", descriptor = "(I)V")
	public synchronized void method2453(@OriginalArg(0) int arg0) {
		this.method2459(arg0 << 6, this.method2467());
	}

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "(Z)V")
	public synchronized void method2454() {
		this.anInt3175 = (this.anInt3175 ^ this.anInt3175 >> 31) + (this.anInt3175 >>> 31);
		this.anInt3175 = -this.anInt3175;
	}

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "(II)V")
	public synchronized void method2457(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method2477(arg0, arg1, this.method2467());
	}

	@OriginalMember(owner = "client!rf", name = "c", descriptor = "(II)V")
	private synchronized void method2459(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3183 = arg0;
		this.anInt3178 = arg1;
		this.anInt3180 = 0;
		this.method2472();
	}

	@OriginalMember(owner = "client!rf", name = "f", descriptor = "()Z")
	public boolean method2460() {
		return this.anInt3181 < 0 || this.anInt3181 >= ((Class1_Sub11_Sub1) super.aClass1_Sub11_5).aByteArray4.length << 8;
	}

	@OriginalMember(owner = "client!rf", name = "f", descriptor = "(I)V")
	public synchronized void method2461(@OriginalArg(0) int arg0) {
		this.anInt3185 = arg0;
	}

	@OriginalMember(owner = "client!rf", name = "g", descriptor = "()Z")
	private boolean method2463() {
		@Pc(2) int local2 = this.anInt3183;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static193.method2466(local2, this.anInt3178);
			local8 = Static193.method2444(local2, this.anInt3178);
		}
		if (this.anInt3179 != local2 || this.anInt3186 != local10 || this.anInt3176 != local8) {
			if (this.anInt3179 < local2) {
				this.anInt3173 = 1;
				this.anInt3180 = local2 - this.anInt3179;
			} else if (this.anInt3179 > local2) {
				this.anInt3173 = -1;
				this.anInt3180 = this.anInt3179 - local2;
			} else {
				this.anInt3173 = 0;
			}
			if (this.anInt3186 < local10) {
				this.anInt3184 = 1;
				if (this.anInt3180 == 0 || this.anInt3180 > local10 - this.anInt3186) {
					this.anInt3180 = local10 - this.anInt3186;
				}
			} else if (this.anInt3186 > local10) {
				this.anInt3184 = -1;
				if (this.anInt3180 == 0 || this.anInt3180 > this.anInt3186 - local10) {
					this.anInt3180 = this.anInt3186 - local10;
				}
			} else {
				this.anInt3184 = 0;
			}
			if (this.anInt3176 < local8) {
				this.anInt3174 = 1;
				if (this.anInt3180 == 0 || this.anInt3180 > local8 - this.anInt3176) {
					this.anInt3180 = local8 - this.anInt3176;
				}
			} else if (this.anInt3176 > local8) {
				this.anInt3174 = -1;
				if (this.anInt3180 == 0 || this.anInt3180 > this.anInt3176 - local8) {
					this.anInt3180 = this.anInt3176 - local8;
				}
			} else {
				this.anInt3174 = 0;
			}
			return false;
		} else if (this.anInt3183 == Integer.MIN_VALUE) {
			this.anInt3183 = 0;
			this.anInt3179 = this.anInt3186 = this.anInt3176 = 0;
			this.method3134();
			return true;
		} else {
			this.method2472();
			return false;
		}
	}

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method2442(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt3183 == 0 && this.anInt3180 == 0) {
			this.method2438(arg2);
			return;
		}
		@Pc(13) Class1_Sub11_Sub1 local13 = (Class1_Sub11_Sub1) super.aClass1_Sub11_5;
		@Pc(18) int local18 = this.anInt3177 << 8;
		@Pc(23) int local23 = this.anInt3182 << 8;
		@Pc(29) int local29 = local13.aByteArray4.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt3185 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt3181 < 0) {
			if (this.anInt3175 <= 0) {
				this.method2448();
				this.method3134();
				return;
			}
			this.anInt3181 = 0;
		}
		if (this.anInt3181 >= local29) {
			if (this.anInt3175 >= 0) {
				this.method2448();
				this.method3134();
				return;
			}
			this.anInt3181 = local29 - 1;
		}
		if (this.anInt3185 >= 0) {
			if (this.anInt3185 > 0) {
				if (this.aBoolean127) {
					label130: {
						if (this.anInt3175 < 0) {
							local40 = this.method2452(arg0, arg1, local18, local44, local13.aByteArray4[this.anInt3177]);
							if (this.anInt3181 >= local18) {
								return;
							}
							this.anInt3181 = local18 + local18 - this.anInt3181 - 1;
							this.anInt3175 = -this.anInt3175;
							if (--this.anInt3185 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method2480(arg0, local40, local23, local44, local13.aByteArray4[this.anInt3182 - 1]);
							if (this.anInt3181 < local23) {
								return;
							}
							this.anInt3181 = local23 + local23 - this.anInt3181 - 1;
							this.anInt3175 = -this.anInt3175;
							if (--this.anInt3185 == 0) {
								break;
							}
							local40 = this.method2452(arg0, local40, local18, local44, local13.aByteArray4[this.anInt3177]);
							if (this.anInt3181 >= local18) {
								return;
							}
							this.anInt3181 = local18 + local18 - this.anInt3181 - 1;
							this.anInt3175 = -this.anInt3175;
						} while (--this.anInt3185 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt3175 < 0) {
						while (true) {
							local40 = this.method2452(arg0, local40, local18, local44, local13.aByteArray4[this.anInt3182 - 1]);
							if (this.anInt3181 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt3181 - 1) / local33;
							if (local416 >= this.anInt3185) {
								this.anInt3181 += local33 * this.anInt3185;
								this.anInt3185 = 0;
								break;
							}
							this.anInt3181 += local33 * local416;
							this.anInt3185 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method2480(arg0, local40, local23, local44, local13.aByteArray4[this.anInt3177]);
							if (this.anInt3181 < local23) {
								return;
							}
							local416 = (this.anInt3181 - local18) / local33;
							if (local416 >= this.anInt3185) {
								this.anInt3181 -= local33 * this.anInt3185;
								this.anInt3185 = 0;
								break;
							}
							this.anInt3181 -= local33 * local416;
							this.anInt3185 -= local416;
						}
					}
				}
			}
			if (this.anInt3175 < 0) {
				this.method2452(arg0, local40, 0, local44, 0);
				if (this.anInt3181 < 0) {
					this.anInt3181 = -1;
					this.method2448();
					this.method3134();
					return;
				}
			} else {
				this.method2480(arg0, local40, local29, local44, 0);
				if (this.anInt3181 >= local29) {
					this.anInt3181 = local29;
					this.method2448();
					this.method3134();
				}
			}
		} else if (this.aBoolean127) {
			if (this.anInt3175 < 0) {
				local40 = this.method2452(arg0, arg1, local18, local44, local13.aByteArray4[this.anInt3177]);
				if (this.anInt3181 >= local18) {
					return;
				}
				this.anInt3181 = local18 + local18 - this.anInt3181 - 1;
				this.anInt3175 = -this.anInt3175;
			}
			while (true) {
				local40 = this.method2480(arg0, local40, local23, local44, local13.aByteArray4[this.anInt3182 - 1]);
				if (this.anInt3181 < local23) {
					return;
				}
				this.anInt3181 = local23 + local23 - this.anInt3181 - 1;
				this.anInt3175 = -this.anInt3175;
				local40 = this.method2452(arg0, local40, local18, local44, local13.aByteArray4[this.anInt3177]);
				if (this.anInt3181 >= local18) {
					return;
				}
				this.anInt3181 = local18 + local18 - this.anInt3181 - 1;
				this.anInt3175 = -this.anInt3175;
			}
		} else if (this.anInt3175 < 0) {
			while (true) {
				local40 = this.method2452(arg0, local40, local18, local44, local13.aByteArray4[this.anInt3182 - 1]);
				if (this.anInt3181 >= local18) {
					return;
				}
				this.anInt3181 = local23 - (local23 - 1 - this.anInt3181) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method2480(arg0, local40, local23, local44, local13.aByteArray4[this.anInt3177]);
				if (this.anInt3181 < local23) {
					return;
				}
				this.anInt3181 = local18 + (this.anInt3181 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "()Lclient!vh;")
	@Override
	public Class1_Sub10 method2439() {
		return null;
	}

	@OriginalMember(owner = "client!rf", name = "h", descriptor = "()I")
	public synchronized int method2467() {
		return this.anInt3178 < 0 ? -1 : this.anInt3178;
	}

	@OriginalMember(owner = "client!rf", name = "i", descriptor = "()I")
	public synchronized int method2470() {
		return this.anInt3183 == Integer.MIN_VALUE ? 0 : this.anInt3183;
	}

	@OriginalMember(owner = "client!rf", name = "j", descriptor = "()Z")
	public boolean method2471() {
		return this.anInt3180 != 0;
	}

	@OriginalMember(owner = "client!rf", name = "k", descriptor = "()V")
	private void method2472() {
		this.anInt3179 = this.anInt3183;
		this.anInt3186 = Static193.method2466(this.anInt3183, this.anInt3178);
		this.anInt3176 = Static193.method2444(this.anInt3183, this.anInt3178);
	}

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method2438(@OriginalArg(0) int arg0) {
		if (this.anInt3180 > 0) {
			if (arg0 >= this.anInt3180) {
				if (this.anInt3183 == Integer.MIN_VALUE) {
					this.anInt3183 = 0;
					this.anInt3179 = this.anInt3186 = this.anInt3176 = 0;
					this.method3134();
					arg0 = this.anInt3180;
				}
				this.anInt3180 = 0;
				this.method2472();
			} else {
				this.anInt3179 += this.anInt3173 * arg0;
				this.anInt3186 += this.anInt3184 * arg0;
				this.anInt3176 += this.anInt3174 * arg0;
				this.anInt3180 -= arg0;
			}
		}
		@Pc(71) Class1_Sub11_Sub1 local71 = (Class1_Sub11_Sub1) super.aClass1_Sub11_5;
		@Pc(76) int local76 = this.anInt3177 << 8;
		@Pc(81) int local81 = this.anInt3182 << 8;
		@Pc(87) int local87 = local71.aByteArray4.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt3185 = 0;
		}
		if (this.anInt3181 < 0) {
			if (this.anInt3175 <= 0) {
				this.method2448();
				this.method3134();
				return;
			}
			this.anInt3181 = 0;
		}
		if (this.anInt3181 >= local87) {
			if (this.anInt3175 >= 0) {
				this.method2448();
				this.method3134();
				return;
			}
			this.anInt3181 = local87 - 1;
		}
		this.anInt3181 += this.anInt3175 * arg0;
		if (this.anInt3185 >= 0) {
			if (this.anInt3185 > 0) {
				if (this.aBoolean127) {
					label125: {
						if (this.anInt3175 < 0) {
							if (this.anInt3181 >= local76) {
								return;
							}
							this.anInt3181 = local76 + local76 - this.anInt3181 - 1;
							this.anInt3175 = -this.anInt3175;
							if (--this.anInt3185 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt3181 < local81) {
								return;
							}
							this.anInt3181 = local81 + local81 - this.anInt3181 - 1;
							this.anInt3175 = -this.anInt3175;
							if (--this.anInt3185 == 0) {
								break;
							}
							if (this.anInt3181 >= local76) {
								return;
							}
							this.anInt3181 = local76 + local76 - this.anInt3181 - 1;
							this.anInt3175 = -this.anInt3175;
						} while (--this.anInt3185 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt3175 < 0) {
						if (this.anInt3181 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt3181 - 1) / local91;
						if (local361 < this.anInt3185) {
							this.anInt3181 += local91 * local361;
							this.anInt3185 -= local361;
							return;
						}
						this.anInt3181 += local91 * this.anInt3185;
						this.anInt3185 = 0;
					} else if (this.anInt3181 >= local81) {
						local361 = (this.anInt3181 - local76) / local91;
						if (local361 < this.anInt3185) {
							this.anInt3181 -= local91 * local361;
							this.anInt3185 -= local361;
							return;
						}
						this.anInt3181 -= local91 * this.anInt3185;
						this.anInt3185 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt3175 < 0) {
				if (this.anInt3181 < 0) {
					this.anInt3181 = -1;
					this.method2448();
					this.method3134();
					return;
				}
			} else if (this.anInt3181 >= local87) {
				this.anInt3181 = local87;
				this.method2448();
				this.method3134();
			}
		} else if (this.aBoolean127) {
			if (this.anInt3175 < 0) {
				if (this.anInt3181 >= local76) {
					return;
				}
				this.anInt3181 = local76 + local76 - this.anInt3181 - 1;
				this.anInt3175 = -this.anInt3175;
			}
			while (this.anInt3181 >= local81) {
				this.anInt3181 = local81 + local81 - this.anInt3181 - 1;
				this.anInt3175 = -this.anInt3175;
				if (this.anInt3181 >= local76) {
					return;
				}
				this.anInt3181 = local76 + local76 - this.anInt3181 - 1;
				this.anInt3175 = -this.anInt3175;
			}
		} else if (this.anInt3175 < 0) {
			if (this.anInt3181 < local76) {
				this.anInt3181 = local81 - (local81 - 1 - this.anInt3181) % local91 - 1;
			}
		} else if (this.anInt3181 >= local81) {
			this.anInt3181 = local76 + (this.anInt3181 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!rf", name = "l", descriptor = "()I")
	public synchronized int method2474() {
		return this.anInt3175 < 0 ? -this.anInt3175 : this.anInt3175;
	}

	@OriginalMember(owner = "client!rf", name = "c", descriptor = "()Lclient!vh;")
	@Override
	public Class1_Sub10 method2440() {
		return null;
	}

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "(III)V")
	public synchronized void method2477(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method2459(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static193.method2466(arg1, arg2);
		@Pc(14) int local14 = Static193.method2444(arg1, arg2);
		if (this.anInt3186 == local10 && this.anInt3176 == local14) {
			this.anInt3180 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt3179;
		if (this.anInt3179 - arg1 > local31) {
			local31 = this.anInt3179 - arg1;
		}
		if (local10 - this.anInt3186 > local31) {
			local31 = local10 - this.anInt3186;
		}
		if (this.anInt3186 - local10 > local31) {
			local31 = this.anInt3186 - local10;
		}
		if (local14 - this.anInt3176 > local31) {
			local31 = local14 - this.anInt3176;
		}
		if (this.anInt3176 - local14 > local31) {
			local31 = this.anInt3176 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt3180 = arg0;
		this.anInt3183 = arg1;
		this.anInt3178 = arg2;
		this.anInt3173 = (arg1 - this.anInt3179) / arg0;
		this.anInt3184 = (local10 - this.anInt3186) / arg0;
		this.anInt3174 = (local14 - this.anInt3176) / arg0;
	}

	@OriginalMember(owner = "client!rf", name = "g", descriptor = "(I)V")
	public synchronized void method2478(@OriginalArg(0) int arg0) {
		if (this.anInt3175 < 0) {
			this.anInt3175 = -arg0;
		} else {
			this.anInt3175 = arg0;
		}
	}

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "([IIIII)I")
	private int method2480(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt3180 <= 0) {
				if (this.anInt3175 == 256 && (this.anInt3181 & 0xFF) == 0) {
					if (Static107.aBoolean100) {
						return Static193.method2449(((Class1_Sub11_Sub1) super.aClass1_Sub11_5).aByteArray4, arg0, this.anInt3181, arg1, this.anInt3186, this.anInt3176, arg3, arg2, this);
					}
					return Static193.method2456(((Class1_Sub11_Sub1) super.aClass1_Sub11_5).aByteArray4, arg0, this.anInt3181, arg1, this.anInt3179, arg3, arg2, this);
				}
				if (Static107.aBoolean100) {
					return Static193.method2464(((Class1_Sub11_Sub1) super.aClass1_Sub11_5).aByteArray4, arg0, this.anInt3181, arg1, this.anInt3186, this.anInt3176, arg3, arg2, this, this.anInt3175, arg4);
				}
				return Static193.method2473(((Class1_Sub11_Sub1) super.aClass1_Sub11_5).aByteArray4, arg0, this.anInt3181, arg1, this.anInt3179, arg3, arg2, this, this.anInt3175, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt3180;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt3180 += arg1;
			if (this.anInt3175 == 256 && (this.anInt3181 & 0xFF) == 0) {
				if (Static107.aBoolean100) {
					arg1 = Static193.method2465(((Class1_Sub11_Sub1) super.aClass1_Sub11_5).aByteArray4, arg0, this.anInt3181, arg1, this.anInt3186, this.anInt3176, this.anInt3184, this.anInt3174, local5, arg2, this);
				} else {
					arg1 = Static193.method2468(((Class1_Sub11_Sub1) super.aClass1_Sub11_5).aByteArray4, arg0, this.anInt3181, arg1, this.anInt3179, this.anInt3173, local5, arg2, this);
				}
			} else if (Static107.aBoolean100) {
				arg1 = Static193.method2481(((Class1_Sub11_Sub1) super.aClass1_Sub11_5).aByteArray4, arg0, this.anInt3181, arg1, this.anInt3186, this.anInt3176, this.anInt3184, this.anInt3174, local5, arg2, this, this.anInt3175, arg4);
			} else {
				arg1 = Static193.method2462(((Class1_Sub11_Sub1) super.aClass1_Sub11_5).aByteArray4, arg0, this.anInt3181, arg1, this.anInt3179, this.anInt3173, local5, arg2, this, this.anInt3175, arg4);
			}
			this.anInt3180 -= arg1;
			if (this.anInt3180 != 0) {
				return arg1;
			}
		} while (!this.method2463());
		return arg3;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "()I")
	@Override
	public int method2436() {
		return this.anInt3183 == 0 && this.anInt3180 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!rf", name = "h", descriptor = "(I)V")
	public synchronized void method2482(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method2450();
			this.method3134();
		} else if (this.anInt3186 == 0 && this.anInt3176 == 0) {
			this.anInt3180 = 0;
			this.anInt3183 = 0;
			this.anInt3179 = 0;
			this.method3134();
		} else {
			@Pc(31) int local31 = -this.anInt3179;
			if (this.anInt3179 > local31) {
				local31 = this.anInt3179;
			}
			if (-this.anInt3186 > local31) {
				local31 = -this.anInt3186;
			}
			if (this.anInt3186 > local31) {
				local31 = this.anInt3186;
			}
			if (-this.anInt3176 > local31) {
				local31 = -this.anInt3176;
			}
			if (this.anInt3176 > local31) {
				local31 = this.anInt3176;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt3180 = arg0;
			this.anInt3183 = Integer.MIN_VALUE;
			this.anInt3173 = -this.anInt3179 / arg0;
			this.anInt3184 = -this.anInt3186 / arg0;
			this.anInt3174 = -this.anInt3176 / arg0;
		}
	}
}
