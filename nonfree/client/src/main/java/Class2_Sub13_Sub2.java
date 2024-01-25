import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lu")
public final class Class2_Sub13_Sub2 extends Class2_Sub13 {

	@OriginalMember(owner = "client!lu", name = "p", descriptor = "I")
	public int anInt5243;

	@OriginalMember(owner = "client!lu", name = "q", descriptor = "I")
	public int anInt5244;

	@OriginalMember(owner = "client!lu", name = "r", descriptor = "I")
	private int anInt5245;

	@OriginalMember(owner = "client!lu", name = "t", descriptor = "I")
	public int anInt5247;

	@OriginalMember(owner = "client!lu", name = "u", descriptor = "I")
	private int anInt5248;

	@OriginalMember(owner = "client!lu", name = "v", descriptor = "I")
	public int anInt5249;

	@OriginalMember(owner = "client!lu", name = "w", descriptor = "I")
	public int anInt5250;

	@OriginalMember(owner = "client!lu", name = "B", descriptor = "I")
	public int anInt5254;

	@OriginalMember(owner = "client!lu", name = "o", descriptor = "I")
	private final int anInt5242;

	@OriginalMember(owner = "client!lu", name = "A", descriptor = "I")
	private final int anInt5253;

	@OriginalMember(owner = "client!lu", name = "z", descriptor = "Z")
	private final boolean aBoolean371;

	@OriginalMember(owner = "client!lu", name = "y", descriptor = "I")
	private int anInt5252;

	@OriginalMember(owner = "client!lu", name = "x", descriptor = "I")
	private int anInt5251;

	@OriginalMember(owner = "client!lu", name = "s", descriptor = "I")
	private int anInt5246;

	@OriginalMember(owner = "client!lu", name = "C", descriptor = "I")
	public int anInt5255;

	@OriginalMember(owner = "client!lu", name = "<init>", descriptor = "(Lclient!aaa;III)V")
	public Class2_Sub13_Sub2(@OriginalArg(0) Class2_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass2_Sub1_6 = arg0;
		this.anInt5242 = arg0.anInt14;
		this.anInt5253 = arg0.anInt16;
		this.aBoolean371 = arg0.aBoolean1;
		this.anInt5252 = arg1;
		this.anInt5251 = arg2;
		this.anInt5246 = arg3;
		this.anInt5255 = 0;
		this.method4465();
	}

	@OriginalMember(owner = "client!lu", name = "d", descriptor = "()Lclient!ua;")
	@Override
	public Class2_Sub13 method8178() {
		return null;
	}

	@OriginalMember(owner = "client!lu", name = "b", descriptor = "(I)V")
	public synchronized void method4436(@OriginalArg(0) int arg0) {
		if (this.anInt5252 < 0) {
			this.anInt5252 = -arg0;
		} else {
			this.anInt5252 = arg0;
		}
	}

	@OriginalMember(owner = "client!lu", name = "e", descriptor = "()I")
	public synchronized int method4440() {
		return this.anInt5251 == Integer.MIN_VALUE ? 0 : this.anInt5251;
	}

	@OriginalMember(owner = "client!lu", name = "f", descriptor = "()Z")
	public boolean method4441() {
		return this.anInt5248 != 0;
	}

	@OriginalMember(owner = "client!lu", name = "g", descriptor = "()Z")
	private boolean method4442() {
		@Pc(2) int local2 = this.anInt5251;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static652.method4450(local2, this.anInt5246);
			local8 = Static652.method4437(local2, this.anInt5246);
		}
		if (this.anInt5250 != local2 || this.anInt5249 != local10 || this.anInt5244 != local8) {
			if (this.anInt5250 < local2) {
				this.anInt5254 = 1;
				this.anInt5248 = local2 - this.anInt5250;
			} else if (this.anInt5250 > local2) {
				this.anInt5254 = -1;
				this.anInt5248 = this.anInt5250 - local2;
			} else {
				this.anInt5254 = 0;
			}
			if (this.anInt5249 < local10) {
				this.anInt5247 = 1;
				if (this.anInt5248 == 0 || this.anInt5248 > local10 - this.anInt5249) {
					this.anInt5248 = local10 - this.anInt5249;
				}
			} else if (this.anInt5249 > local10) {
				this.anInt5247 = -1;
				if (this.anInt5248 == 0 || this.anInt5248 > this.anInt5249 - local10) {
					this.anInt5248 = this.anInt5249 - local10;
				}
			} else {
				this.anInt5247 = 0;
			}
			if (this.anInt5244 < local8) {
				this.anInt5243 = 1;
				if (this.anInt5248 == 0 || this.anInt5248 > local8 - this.anInt5244) {
					this.anInt5248 = local8 - this.anInt5244;
				}
			} else if (this.anInt5244 > local8) {
				this.anInt5243 = -1;
				if (this.anInt5248 == 0 || this.anInt5248 > this.anInt5244 - local8) {
					this.anInt5248 = this.anInt5244 - local8;
				}
			} else {
				this.anInt5243 = 0;
			}
			return false;
		} else if (this.anInt5251 == Integer.MIN_VALUE) {
			this.anInt5251 = 0;
			this.anInt5250 = this.anInt5249 = this.anInt5244 = 0;
			this.method8653();
			return true;
		} else {
			this.method4465();
			return false;
		}
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "([IIIII)I")
	private int method4443(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt5248 <= 0) {
				if (this.anInt5252 == -256 && (this.anInt5255 & 0xFF) == 0) {
					if (Static452.aBoolean540) {
						return Static652.method4435(((Class2_Sub1_Sub1) super.aClass2_Sub1_6).aByteArray1, arg0, this.anInt5255, arg1, this.anInt5249, this.anInt5244, arg3, arg2, this);
					}
					return Static652.method4459(((Class2_Sub1_Sub1) super.aClass2_Sub1_6).aByteArray1, arg0, this.anInt5255, arg1, this.anInt5250, arg3, arg2, this);
				}
				if (Static452.aBoolean540) {
					return Static652.method4460(((Class2_Sub1_Sub1) super.aClass2_Sub1_6).aByteArray1, arg0, this.anInt5255, arg1, this.anInt5249, this.anInt5244, arg3, arg2, this, this.anInt5252, arg4);
				}
				return Static652.method4467(((Class2_Sub1_Sub1) super.aClass2_Sub1_6).aByteArray1, arg0, this.anInt5255, arg1, this.anInt5250, arg3, arg2, this, this.anInt5252, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt5248;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt5248 += arg1;
			if (this.anInt5252 == -256 && (this.anInt5255 & 0xFF) == 0) {
				if (Static452.aBoolean540) {
					arg1 = Static652.method4433(((Class2_Sub1_Sub1) super.aClass2_Sub1_6).aByteArray1, arg0, this.anInt5255, arg1, this.anInt5249, this.anInt5244, this.anInt5247, this.anInt5243, local5, arg2, this);
				} else {
					arg1 = Static652.method4469(((Class2_Sub1_Sub1) super.aClass2_Sub1_6).aByteArray1, arg0, this.anInt5255, arg1, this.anInt5250, this.anInt5254, local5, arg2, this);
				}
			} else if (Static452.aBoolean540) {
				arg1 = Static652.method4445(((Class2_Sub1_Sub1) super.aClass2_Sub1_6).aByteArray1, arg0, this.anInt5255, arg1, this.anInt5249, this.anInt5244, this.anInt5247, this.anInt5243, local5, arg2, this, this.anInt5252, arg4);
			} else {
				arg1 = Static652.method4434(((Class2_Sub1_Sub1) super.aClass2_Sub1_6).aByteArray1, arg0, this.anInt5255, arg1, this.anInt5250, this.anInt5254, local5, arg2, this, this.anInt5252, arg4);
			}
			this.anInt5248 -= arg1;
			if (this.anInt5248 != 0) {
				return arg1;
			}
		} while (!this.method4442());
		return arg3;
	}

	@OriginalMember(owner = "client!lu", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method8180(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt5251 == 0 && this.anInt5248 == 0) {
			this.method8176(arg2);
			return;
		}
		@Pc(13) Class2_Sub1_Sub1 local13 = (Class2_Sub1_Sub1) super.aClass2_Sub1_6;
		@Pc(18) int local18 = this.anInt5242 << 8;
		@Pc(23) int local23 = this.anInt5253 << 8;
		@Pc(29) int local29 = local13.aByteArray1.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt5245 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt5255 < 0) {
			if (this.anInt5252 <= 0) {
				this.method4448();
				this.method8653();
				return;
			}
			this.anInt5255 = 0;
		}
		if (this.anInt5255 >= local29) {
			if (this.anInt5252 >= 0) {
				this.method4448();
				this.method8653();
				return;
			}
			this.anInt5255 = local29 - 1;
		}
		if (this.anInt5245 >= 0) {
			if (this.anInt5245 > 0) {
				if (this.aBoolean371) {
					label130: {
						if (this.anInt5252 < 0) {
							local40 = this.method4443(arg0, arg1, local18, local44, local13.aByteArray1[this.anInt5242]);
							if (this.anInt5255 >= local18) {
								return;
							}
							this.anInt5255 = local18 + local18 - this.anInt5255 - 1;
							this.anInt5252 = -this.anInt5252;
							if (--this.anInt5245 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method4472(arg0, local40, local23, local44, local13.aByteArray1[this.anInt5253 - 1]);
							if (this.anInt5255 < local23) {
								return;
							}
							this.anInt5255 = local23 + local23 - this.anInt5255 - 1;
							this.anInt5252 = -this.anInt5252;
							if (--this.anInt5245 == 0) {
								break;
							}
							local40 = this.method4443(arg0, local40, local18, local44, local13.aByteArray1[this.anInt5242]);
							if (this.anInt5255 >= local18) {
								return;
							}
							this.anInt5255 = local18 + local18 - this.anInt5255 - 1;
							this.anInt5252 = -this.anInt5252;
						} while (--this.anInt5245 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt5252 < 0) {
						while (true) {
							local40 = this.method4443(arg0, local40, local18, local44, local13.aByteArray1[this.anInt5253 - 1]);
							if (this.anInt5255 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt5255 - 1) / local33;
							if (local416 >= this.anInt5245) {
								this.anInt5255 += local33 * this.anInt5245;
								this.anInt5245 = 0;
								break;
							}
							this.anInt5255 += local33 * local416;
							this.anInt5245 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method4472(arg0, local40, local23, local44, local13.aByteArray1[this.anInt5242]);
							if (this.anInt5255 < local23) {
								return;
							}
							local416 = (this.anInt5255 - local18) / local33;
							if (local416 >= this.anInt5245) {
								this.anInt5255 -= local33 * this.anInt5245;
								this.anInt5245 = 0;
								break;
							}
							this.anInt5255 -= local33 * local416;
							this.anInt5245 -= local416;
						}
					}
				}
			}
			if (this.anInt5252 < 0) {
				this.method4443(arg0, local40, 0, local44, 0);
				if (this.anInt5255 < 0) {
					this.anInt5255 = -1;
					this.method4448();
					this.method8653();
					return;
				}
			} else {
				this.method4472(arg0, local40, local29, local44, 0);
				if (this.anInt5255 >= local29) {
					this.anInt5255 = local29;
					this.method4448();
					this.method8653();
				}
			}
		} else if (this.aBoolean371) {
			if (this.anInt5252 < 0) {
				local40 = this.method4443(arg0, arg1, local18, local44, local13.aByteArray1[this.anInt5242]);
				if (this.anInt5255 >= local18) {
					return;
				}
				this.anInt5255 = local18 + local18 - this.anInt5255 - 1;
				this.anInt5252 = -this.anInt5252;
			}
			while (true) {
				local40 = this.method4472(arg0, local40, local23, local44, local13.aByteArray1[this.anInt5253 - 1]);
				if (this.anInt5255 < local23) {
					return;
				}
				this.anInt5255 = local23 + local23 - this.anInt5255 - 1;
				this.anInt5252 = -this.anInt5252;
				local40 = this.method4443(arg0, local40, local18, local44, local13.aByteArray1[this.anInt5242]);
				if (this.anInt5255 >= local18) {
					return;
				}
				this.anInt5255 = local18 + local18 - this.anInt5255 - 1;
				this.anInt5252 = -this.anInt5252;
			}
		} else if (this.anInt5252 < 0) {
			while (true) {
				local40 = this.method4443(arg0, local40, local18, local44, local13.aByteArray1[this.anInt5253 - 1]);
				if (this.anInt5255 >= local18) {
					return;
				}
				this.anInt5255 = local23 - (local23 - 1 - this.anInt5255) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method4472(arg0, local40, local23, local44, local13.aByteArray1[this.anInt5242]);
				if (this.anInt5255 < local23) {
					return;
				}
				this.anInt5255 = local18 + (this.anInt5255 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "()Lclient!ua;")
	@Override
	public Class2_Sub13 method8174() {
		return null;
	}

	@OriginalMember(owner = "client!lu", name = "h", descriptor = "()V")
	private void method4448() {
		if (this.anInt5248 == 0) {
			return;
		}
		if (this.anInt5251 == Integer.MIN_VALUE) {
			this.anInt5251 = 0;
		}
		this.anInt5248 = 0;
		this.method4465();
	}

	@OriginalMember(owner = "client!lu", name = "b", descriptor = "(II)V")
	private synchronized void method4449(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5251 = arg0;
		this.anInt5246 = arg1;
		this.anInt5248 = 0;
		this.method4465();
	}

	@OriginalMember(owner = "client!lu", name = "c", descriptor = "()I")
	@Override
	public int method8177() {
		@Pc(6) int local6 = this.anInt5250 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt5245 == 0) {
			local6 -= local6 * this.anInt5255 / (((Class2_Sub1_Sub1) super.aClass2_Sub1_6).aByteArray1.length << 8);
		} else if (this.anInt5245 >= 0) {
			local6 -= local6 * this.anInt5242 / ((Class2_Sub1_Sub1) super.aClass2_Sub1_6).aByteArray1.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!lu", name = "i", descriptor = "()I")
	public synchronized int method4452() {
		return this.anInt5246 < 0 ? -1 : this.anInt5246;
	}

	@OriginalMember(owner = "client!lu", name = "f", descriptor = "(I)V")
	public synchronized void method4453(@OriginalArg(0) int arg0) {
		this.anInt5245 = arg0;
	}

	@OriginalMember(owner = "client!lu", name = "g", descriptor = "(I)V")
	public synchronized void method4454(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class2_Sub1_Sub1) super.aClass2_Sub1_6).aByteArray1.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt5255 = arg0;
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(Z)V")
	public synchronized void method4455() {
		this.anInt5252 = (this.anInt5252 ^ this.anInt5252 >> 31) + (this.anInt5252 >>> 31);
		this.anInt5252 = -this.anInt5252;
	}

	@OriginalMember(owner = "client!lu", name = "b", descriptor = "()I")
	@Override
	public int method8175() {
		return this.anInt5251 == 0 && this.anInt5248 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!lu", name = "j", descriptor = "()Z")
	public boolean method4457() {
		return this.anInt5255 < 0 || this.anInt5255 >= ((Class2_Sub1_Sub1) super.aClass2_Sub1_6).aByteArray1.length << 8;
	}

	@OriginalMember(owner = "client!lu", name = "k", descriptor = "()I")
	public synchronized int method4458() {
		return this.anInt5252 < 0 ? -this.anInt5252 : this.anInt5252;
	}

	@OriginalMember(owner = "client!lu", name = "d", descriptor = "(II)V")
	public synchronized void method4461(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method4463(arg0, arg1, this.method4452());
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method8176(@OriginalArg(0) int arg0) {
		if (this.anInt5248 > 0) {
			if (arg0 >= this.anInt5248) {
				if (this.anInt5251 == Integer.MIN_VALUE) {
					this.anInt5251 = 0;
					this.anInt5250 = this.anInt5249 = this.anInt5244 = 0;
					this.method8653();
					arg0 = this.anInt5248;
				}
				this.anInt5248 = 0;
				this.method4465();
			} else {
				this.anInt5250 += this.anInt5254 * arg0;
				this.anInt5249 += this.anInt5247 * arg0;
				this.anInt5244 += this.anInt5243 * arg0;
				this.anInt5248 -= arg0;
			}
		}
		@Pc(71) Class2_Sub1_Sub1 local71 = (Class2_Sub1_Sub1) super.aClass2_Sub1_6;
		@Pc(76) int local76 = this.anInt5242 << 8;
		@Pc(81) int local81 = this.anInt5253 << 8;
		@Pc(87) int local87 = local71.aByteArray1.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt5245 = 0;
		}
		if (this.anInt5255 < 0) {
			if (this.anInt5252 <= 0) {
				this.method4448();
				this.method8653();
				return;
			}
			this.anInt5255 = 0;
		}
		if (this.anInt5255 >= local87) {
			if (this.anInt5252 >= 0) {
				this.method4448();
				this.method8653();
				return;
			}
			this.anInt5255 = local87 - 1;
		}
		this.anInt5255 += this.anInt5252 * arg0;
		if (this.anInt5245 >= 0) {
			if (this.anInt5245 > 0) {
				if (this.aBoolean371) {
					label125: {
						if (this.anInt5252 < 0) {
							if (this.anInt5255 >= local76) {
								return;
							}
							this.anInt5255 = local76 + local76 - this.anInt5255 - 1;
							this.anInt5252 = -this.anInt5252;
							if (--this.anInt5245 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt5255 < local81) {
								return;
							}
							this.anInt5255 = local81 + local81 - this.anInt5255 - 1;
							this.anInt5252 = -this.anInt5252;
							if (--this.anInt5245 == 0) {
								break;
							}
							if (this.anInt5255 >= local76) {
								return;
							}
							this.anInt5255 = local76 + local76 - this.anInt5255 - 1;
							this.anInt5252 = -this.anInt5252;
						} while (--this.anInt5245 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt5252 < 0) {
						if (this.anInt5255 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt5255 - 1) / local91;
						if (local361 < this.anInt5245) {
							this.anInt5255 += local91 * local361;
							this.anInt5245 -= local361;
							return;
						}
						this.anInt5255 += local91 * this.anInt5245;
						this.anInt5245 = 0;
					} else if (this.anInt5255 >= local81) {
						local361 = (this.anInt5255 - local76) / local91;
						if (local361 < this.anInt5245) {
							this.anInt5255 -= local91 * local361;
							this.anInt5245 -= local361;
							return;
						}
						this.anInt5255 -= local91 * this.anInt5245;
						this.anInt5245 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt5252 < 0) {
				if (this.anInt5255 < 0) {
					this.anInt5255 = -1;
					this.method4448();
					this.method8653();
					return;
				}
			} else if (this.anInt5255 >= local87) {
				this.anInt5255 = local87;
				this.method4448();
				this.method8653();
			}
		} else if (this.aBoolean371) {
			if (this.anInt5252 < 0) {
				if (this.anInt5255 >= local76) {
					return;
				}
				this.anInt5255 = local76 + local76 - this.anInt5255 - 1;
				this.anInt5252 = -this.anInt5252;
			}
			while (this.anInt5255 >= local81) {
				this.anInt5255 = local81 + local81 - this.anInt5255 - 1;
				this.anInt5252 = -this.anInt5252;
				if (this.anInt5255 >= local76) {
					return;
				}
				this.anInt5255 = local76 + local76 - this.anInt5255 - 1;
				this.anInt5252 = -this.anInt5252;
			}
		} else if (this.anInt5252 < 0) {
			if (this.anInt5255 < local76) {
				this.anInt5255 = local81 - (local81 - 1 - this.anInt5255) % local91 - 1;
			}
		} else if (this.anInt5255 >= local81) {
			this.anInt5255 = local76 + (this.anInt5255 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(III)V")
	public synchronized void method4463(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method4449(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static652.method4450(arg1, arg2);
		@Pc(14) int local14 = Static652.method4437(arg1, arg2);
		if (this.anInt5249 == local10 && this.anInt5244 == local14) {
			this.anInt5248 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt5250;
		if (this.anInt5250 - arg1 > local31) {
			local31 = this.anInt5250 - arg1;
		}
		if (local10 - this.anInt5249 > local31) {
			local31 = local10 - this.anInt5249;
		}
		if (this.anInt5249 - local10 > local31) {
			local31 = this.anInt5249 - local10;
		}
		if (local14 - this.anInt5244 > local31) {
			local31 = local14 - this.anInt5244;
		}
		if (this.anInt5244 - local14 > local31) {
			local31 = this.anInt5244 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt5248 = arg0;
		this.anInt5251 = arg1;
		this.anInt5246 = arg2;
		this.anInt5254 = (arg1 - this.anInt5250) / arg0;
		this.anInt5247 = (local10 - this.anInt5249) / arg0;
		this.anInt5243 = (local14 - this.anInt5244) / arg0;
	}

	@OriginalMember(owner = "client!lu", name = "h", descriptor = "(I)V")
	public synchronized void method4464(@OriginalArg(0) int arg0) {
		this.method4449(this.method4440(), arg0);
	}

	@OriginalMember(owner = "client!lu", name = "l", descriptor = "()V")
	private void method4465() {
		this.anInt5250 = this.anInt5251;
		this.anInt5249 = Static652.method4450(this.anInt5251, this.anInt5246);
		this.anInt5244 = Static652.method4437(this.anInt5251, this.anInt5246);
	}

	@OriginalMember(owner = "client!lu", name = "i", descriptor = "(I)V")
	private synchronized void method4466() {
		this.method4449(0, this.method4452());
	}

	@OriginalMember(owner = "client!lu", name = "j", descriptor = "(I)V")
	public synchronized void method4468(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method4466();
			this.method8653();
		} else if (this.anInt5249 == 0 && this.anInt5244 == 0) {
			this.anInt5248 = 0;
			this.anInt5251 = 0;
			this.anInt5250 = 0;
			this.method8653();
		} else {
			@Pc(31) int local31 = -this.anInt5250;
			if (this.anInt5250 > local31) {
				local31 = this.anInt5250;
			}
			if (-this.anInt5249 > local31) {
				local31 = -this.anInt5249;
			}
			if (this.anInt5249 > local31) {
				local31 = this.anInt5249;
			}
			if (-this.anInt5244 > local31) {
				local31 = -this.anInt5244;
			}
			if (this.anInt5244 > local31) {
				local31 = this.anInt5244;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt5248 = arg0;
			this.anInt5251 = Integer.MIN_VALUE;
			this.anInt5254 = -this.anInt5250 / arg0;
			this.anInt5247 = -this.anInt5249 / arg0;
			this.anInt5243 = -this.anInt5244 / arg0;
		}
	}

	@OriginalMember(owner = "client!lu", name = "k", descriptor = "(I)V")
	public synchronized void method4470(@OriginalArg(0) int arg0) {
		this.method4449(arg0 << 6, this.method4452());
	}

	@OriginalMember(owner = "client!lu", name = "b", descriptor = "([IIIII)I")
	private int method4472(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt5248 <= 0) {
				if (this.anInt5252 == 256 && (this.anInt5255 & 0xFF) == 0) {
					if (Static452.aBoolean540) {
						return Static652.method4439(((Class2_Sub1_Sub1) super.aClass2_Sub1_6).aByteArray1, arg0, this.anInt5255, arg1, this.anInt5249, this.anInt5244, arg3, arg2, this);
					}
					return Static652.method4462(((Class2_Sub1_Sub1) super.aClass2_Sub1_6).aByteArray1, arg0, this.anInt5255, arg1, this.anInt5250, arg3, arg2, this);
				}
				if (Static452.aBoolean540) {
					return Static652.method4444(((Class2_Sub1_Sub1) super.aClass2_Sub1_6).aByteArray1, arg0, this.anInt5255, arg1, this.anInt5249, this.anInt5244, arg3, arg2, this, this.anInt5252, arg4);
				}
				return Static652.method4438(((Class2_Sub1_Sub1) super.aClass2_Sub1_6).aByteArray1, arg0, this.anInt5255, arg1, this.anInt5250, arg3, arg2, this, this.anInt5252, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt5248;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt5248 += arg1;
			if (this.anInt5252 == 256 && (this.anInt5255 & 0xFF) == 0) {
				if (Static452.aBoolean540) {
					arg1 = Static652.method4451(((Class2_Sub1_Sub1) super.aClass2_Sub1_6).aByteArray1, arg0, this.anInt5255, arg1, this.anInt5249, this.anInt5244, this.anInt5247, this.anInt5243, local5, arg2, this);
				} else {
					arg1 = Static652.method4447(((Class2_Sub1_Sub1) super.aClass2_Sub1_6).aByteArray1, arg0, this.anInt5255, arg1, this.anInt5250, this.anInt5254, local5, arg2, this);
				}
			} else if (Static452.aBoolean540) {
				arg1 = Static652.method4456(((Class2_Sub1_Sub1) super.aClass2_Sub1_6).aByteArray1, arg0, this.anInt5255, arg1, this.anInt5249, this.anInt5244, this.anInt5247, this.anInt5243, local5, arg2, this, this.anInt5252, arg4);
			} else {
				arg1 = Static652.method4471(((Class2_Sub1_Sub1) super.aClass2_Sub1_6).aByteArray1, arg0, this.anInt5255, arg1, this.anInt5250, this.anInt5254, local5, arg2, this, this.anInt5252, arg4);
			}
			this.anInt5248 -= arg1;
			if (this.anInt5248 != 0) {
				return arg1;
			}
		} while (!this.method4442());
		return arg3;
	}
}
