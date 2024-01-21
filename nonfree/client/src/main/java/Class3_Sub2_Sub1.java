import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ba")
public final class Class3_Sub2_Sub1 extends Class3_Sub2 {

	@OriginalMember(owner = "client!ba", name = "K", descriptor = "I")
	public int anInt232;

	@OriginalMember(owner = "client!ba", name = "L", descriptor = "I")
	private int anInt233;

	@OriginalMember(owner = "client!ba", name = "O", descriptor = "I")
	public int anInt236;

	@OriginalMember(owner = "client!ba", name = "P", descriptor = "I")
	public int anInt237;

	@OriginalMember(owner = "client!ba", name = "Q", descriptor = "I")
	public int anInt238;

	@OriginalMember(owner = "client!ba", name = "R", descriptor = "I")
	private int anInt239;

	@OriginalMember(owner = "client!ba", name = "T", descriptor = "I")
	public int anInt241;

	@OriginalMember(owner = "client!ba", name = "X", descriptor = "I")
	public int anInt245;

	@OriginalMember(owner = "client!ba", name = "V", descriptor = "I")
	private final int anInt243;

	@OriginalMember(owner = "client!ba", name = "M", descriptor = "I")
	private final int anInt234;

	@OriginalMember(owner = "client!ba", name = "J", descriptor = "Z")
	private final boolean aBoolean7;

	@OriginalMember(owner = "client!ba", name = "U", descriptor = "I")
	private int anInt242;

	@OriginalMember(owner = "client!ba", name = "W", descriptor = "I")
	private int anInt244;

	@OriginalMember(owner = "client!ba", name = "S", descriptor = "I")
	private int anInt240;

	@OriginalMember(owner = "client!ba", name = "N", descriptor = "I")
	public int anInt235;

	@OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(Lclient!fc;II)V")
	public Class3_Sub2_Sub1(@OriginalArg(0) Class3_Sub9_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass3_Sub9_5 = arg0;
		this.anInt243 = arg0.anInt1104;
		this.anInt234 = arg0.anInt1102;
		this.aBoolean7 = arg0.aBoolean33;
		this.anInt242 = arg1;
		this.anInt244 = arg2;
		this.anInt240 = 8192;
		this.anInt235 = 0;
		this.method191();
	}

	@OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(Lclient!fc;III)V")
	public Class3_Sub2_Sub1(@OriginalArg(0) Class3_Sub9_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass3_Sub9_5 = arg0;
		this.anInt243 = arg0.anInt1104;
		this.anInt234 = arg0.anInt1102;
		this.aBoolean7 = arg0.aBoolean33;
		this.anInt242 = arg1;
		this.anInt244 = arg2;
		this.anInt240 = arg3;
		this.anInt235 = 0;
		this.method191();
	}

	@OriginalMember(owner = "client!ba", name = "g", descriptor = "(I)V")
	public synchronized void method163(@OriginalArg(0) int arg0) {
		this.anInt239 = arg0;
	}

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "(Z)V")
	public synchronized void method165() {
		this.anInt242 = (this.anInt242 ^ this.anInt242 >> 31) + (this.anInt242 >>> 31);
		this.anInt242 = -this.anInt242;
	}

	@OriginalMember(owner = "client!ba", name = "e", descriptor = "()I")
	public synchronized int method167() {
		return this.anInt240 < 0 ? -1 : this.anInt240;
	}

	@OriginalMember(owner = "client!ba", name = "f", descriptor = "()Z")
	public boolean method168() {
		return this.anInt235 < 0 || this.anInt235 >= ((Class3_Sub9_Sub1) super.aClass3_Sub9_5).aByteArray32.length << 8;
	}

	@OriginalMember(owner = "client!ba", name = "d", descriptor = "()I")
	@Override
	public int method2170() {
		return this.anInt244 == 0 && this.anInt233 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!ba", name = "g", descriptor = "()V")
	private void method171() {
		if (this.anInt233 == 0) {
			return;
		}
		if (this.anInt244 == Integer.MIN_VALUE) {
			this.anInt244 = 0;
		}
		this.anInt233 = 0;
		this.method191();
	}

	@OriginalMember(owner = "client!ba", name = "h", descriptor = "(I)V")
	public synchronized void method172(@OriginalArg(0) int arg0) {
		this.method189(arg0 << 6, this.method167());
	}

	@OriginalMember(owner = "client!ba", name = "i", descriptor = "(I)V")
	public synchronized void method176(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method196();
			this.method2264();
		} else if (this.anInt236 == 0 && this.anInt232 == 0) {
			this.anInt233 = 0;
			this.anInt244 = 0;
			this.anInt237 = 0;
			this.method2264();
		} else {
			@Pc(31) int local31 = -this.anInt237;
			if (this.anInt237 > local31) {
				local31 = this.anInt237;
			}
			if (-this.anInt236 > local31) {
				local31 = -this.anInt236;
			}
			if (this.anInt236 > local31) {
				local31 = this.anInt236;
			}
			if (-this.anInt232 > local31) {
				local31 = -this.anInt232;
			}
			if (this.anInt232 > local31) {
				local31 = this.anInt232;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt233 = arg0;
			this.anInt244 = Integer.MIN_VALUE;
			this.anInt241 = -this.anInt237 / arg0;
			this.anInt245 = -this.anInt236 / arg0;
			this.anInt238 = -this.anInt232 / arg0;
		}
	}

	@OriginalMember(owner = "client!ba", name = "h", descriptor = "()Z")
	private boolean method177() {
		@Pc(2) int local2 = this.anInt244;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static131.method200(local2, this.anInt240);
			local8 = Static131.method198(local2, this.anInt240);
		}
		if (this.anInt237 != local2 || this.anInt236 != local10 || this.anInt232 != local8) {
			if (this.anInt237 < local2) {
				this.anInt241 = 1;
				this.anInt233 = local2 - this.anInt237;
			} else if (this.anInt237 > local2) {
				this.anInt241 = -1;
				this.anInt233 = this.anInt237 - local2;
			} else {
				this.anInt241 = 0;
			}
			if (this.anInt236 < local10) {
				this.anInt245 = 1;
				if (this.anInt233 == 0 || this.anInt233 > local10 - this.anInt236) {
					this.anInt233 = local10 - this.anInt236;
				}
			} else if (this.anInt236 > local10) {
				this.anInt245 = -1;
				if (this.anInt233 == 0 || this.anInt233 > this.anInt236 - local10) {
					this.anInt233 = this.anInt236 - local10;
				}
			} else {
				this.anInt245 = 0;
			}
			if (this.anInt232 < local8) {
				this.anInt238 = 1;
				if (this.anInt233 == 0 || this.anInt233 > local8 - this.anInt232) {
					this.anInt233 = local8 - this.anInt232;
				}
			} else if (this.anInt232 > local8) {
				this.anInt238 = -1;
				if (this.anInt233 == 0 || this.anInt233 > this.anInt232 - local8) {
					this.anInt233 = this.anInt232 - local8;
				}
			} else {
				this.anInt238 = 0;
			}
			return false;
		} else if (this.anInt244 == Integer.MIN_VALUE) {
			this.anInt244 = 0;
			this.anInt237 = this.anInt236 = this.anInt232 = 0;
			this.method2264();
			return true;
		} else {
			this.method191();
			return false;
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "([IIIII)I")
	private int method179(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt233 <= 0) {
				if (this.anInt242 == -256 && (this.anInt235 & 0xFF) == 0) {
					if (Static68.aBoolean70) {
						return Static131.method178(((Class3_Sub9_Sub1) super.aClass3_Sub9_5).aByteArray32, arg0, this.anInt235, arg1, this.anInt236, this.anInt232, arg3, arg2, this);
					}
					return Static131.method166(((Class3_Sub9_Sub1) super.aClass3_Sub9_5).aByteArray32, arg0, this.anInt235, arg1, this.anInt237, arg3, arg2, this);
				}
				if (Static68.aBoolean70) {
					return Static131.method174(((Class3_Sub9_Sub1) super.aClass3_Sub9_5).aByteArray32, arg0, this.anInt235, arg1, this.anInt236, this.anInt232, arg3, arg2, this, this.anInt242, arg4);
				}
				return Static131.method190(((Class3_Sub9_Sub1) super.aClass3_Sub9_5).aByteArray32, arg0, this.anInt235, arg1, this.anInt237, arg3, arg2, this, this.anInt242, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt233;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt233 += arg1;
			if (this.anInt242 == -256 && (this.anInt235 & 0xFF) == 0) {
				if (Static68.aBoolean70) {
					arg1 = Static131.method164(((Class3_Sub9_Sub1) super.aClass3_Sub9_5).aByteArray32, arg0, this.anInt235, arg1, this.anInt236, this.anInt232, this.anInt245, this.anInt238, local5, arg2, this);
				} else {
					arg1 = Static131.method175(((Class3_Sub9_Sub1) super.aClass3_Sub9_5).aByteArray32, arg0, this.anInt235, arg1, this.anInt237, this.anInt241, local5, arg2, this);
				}
			} else if (Static68.aBoolean70) {
				arg1 = Static131.method173(((Class3_Sub9_Sub1) super.aClass3_Sub9_5).aByteArray32, arg0, this.anInt235, arg1, this.anInt236, this.anInt232, this.anInt245, this.anInt238, local5, arg2, this, this.anInt242, arg4);
			} else {
				arg1 = Static131.method194(((Class3_Sub9_Sub1) super.aClass3_Sub9_5).aByteArray32, arg0, this.anInt235, arg1, this.anInt237, this.anInt241, local5, arg2, this, this.anInt242, arg4);
			}
			this.anInt233 -= arg1;
			if (this.anInt233 != 0) {
				return arg1;
			}
		} while (!this.method177());
		return arg3;
	}

	@OriginalMember(owner = "client!ba", name = "i", descriptor = "()Z")
	public boolean method181() {
		return this.anInt233 != 0;
	}

	@OriginalMember(owner = "client!ba", name = "j", descriptor = "(I)V")
	public synchronized void method182(@OriginalArg(0) int arg0) {
		if (this.anInt242 < 0) {
			this.anInt242 = -arg0;
		} else {
			this.anInt242 = arg0;
		}
	}

	@OriginalMember(owner = "client!ba", name = "f", descriptor = "(I)V")
	@Override
	public synchronized void method2169(@OriginalArg(0) int arg0) {
		if (this.anInt233 > 0) {
			if (arg0 >= this.anInt233) {
				if (this.anInt244 == Integer.MIN_VALUE) {
					this.anInt244 = 0;
					this.anInt237 = this.anInt236 = this.anInt232 = 0;
					this.method2264();
					arg0 = this.anInt233;
				}
				this.anInt233 = 0;
				this.method191();
			} else {
				this.anInt237 += this.anInt241 * arg0;
				this.anInt236 += this.anInt245 * arg0;
				this.anInt232 += this.anInt238 * arg0;
				this.anInt233 -= arg0;
			}
		}
		@Pc(71) Class3_Sub9_Sub1 local71 = (Class3_Sub9_Sub1) super.aClass3_Sub9_5;
		@Pc(76) int local76 = this.anInt243 << 8;
		@Pc(81) int local81 = this.anInt234 << 8;
		@Pc(87) int local87 = local71.aByteArray32.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt239 = 0;
		}
		if (this.anInt235 < 0) {
			if (this.anInt242 <= 0) {
				this.method171();
				this.method2264();
				return;
			}
			this.anInt235 = 0;
		}
		if (this.anInt235 >= local87) {
			if (this.anInt242 >= 0) {
				this.method171();
				this.method2264();
				return;
			}
			this.anInt235 = local87 - 1;
		}
		this.anInt235 += this.anInt242 * arg0;
		if (this.anInt239 >= 0) {
			if (this.anInt239 > 0) {
				if (this.aBoolean7) {
					label125: {
						if (this.anInt242 < 0) {
							if (this.anInt235 >= local76) {
								return;
							}
							this.anInt235 = local76 + local76 - this.anInt235 - 1;
							this.anInt242 = -this.anInt242;
							if (--this.anInt239 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt235 < local81) {
								return;
							}
							this.anInt235 = local81 + local81 - this.anInt235 - 1;
							this.anInt242 = -this.anInt242;
							if (--this.anInt239 == 0) {
								break;
							}
							if (this.anInt235 >= local76) {
								return;
							}
							this.anInt235 = local76 + local76 - this.anInt235 - 1;
							this.anInt242 = -this.anInt242;
						} while (--this.anInt239 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt242 < 0) {
						if (this.anInt235 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt235 - 1) / local91;
						if (local361 < this.anInt239) {
							this.anInt235 += local91 * local361;
							this.anInt239 -= local361;
							return;
						}
						this.anInt235 += local91 * this.anInt239;
						this.anInt239 = 0;
					} else if (this.anInt235 >= local81) {
						local361 = (this.anInt235 - local76) / local91;
						if (local361 < this.anInt239) {
							this.anInt235 -= local91 * local361;
							this.anInt239 -= local361;
							return;
						}
						this.anInt235 -= local91 * this.anInt239;
						this.anInt239 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt242 < 0) {
				if (this.anInt235 < 0) {
					this.anInt235 = -1;
					this.method171();
					this.method2264();
					return;
				}
			} else if (this.anInt235 >= local87) {
				this.anInt235 = local87;
				this.method171();
				this.method2264();
			}
		} else if (this.aBoolean7) {
			if (this.anInt242 < 0) {
				if (this.anInt235 >= local76) {
					return;
				}
				this.anInt235 = local76 + local76 - this.anInt235 - 1;
				this.anInt242 = -this.anInt242;
			}
			while (this.anInt235 >= local81) {
				this.anInt235 = local81 + local81 - this.anInt235 - 1;
				this.anInt242 = -this.anInt242;
				if (this.anInt235 >= local76) {
					return;
				}
				this.anInt235 = local76 + local76 - this.anInt235 - 1;
				this.anInt242 = -this.anInt242;
			}
		} else if (this.anInt242 < 0) {
			if (this.anInt235 < local76) {
				this.anInt235 = local81 - (local81 - 1 - this.anInt235) % local91 - 1;
			}
		} else if (this.anInt235 >= local81) {
			this.anInt235 = local76 + (this.anInt235 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!ba", name = "j", descriptor = "()I")
	public synchronized int method184() {
		return this.anInt242 < 0 ? -this.anInt242 : this.anInt242;
	}

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "()Lclient!mc;")
	@Override
	public Class3_Sub2 method2166() {
		return null;
	}

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "(II)V")
	private synchronized void method189(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt244 = arg0;
		this.anInt240 = arg1;
		this.anInt233 = 0;
		this.method191();
	}

	@OriginalMember(owner = "client!ba", name = "k", descriptor = "()V")
	private void method191() {
		this.anInt237 = this.anInt244;
		this.anInt236 = Static131.method200(this.anInt244, this.anInt240);
		this.anInt232 = Static131.method198(this.anInt244, this.anInt240);
	}

	@OriginalMember(owner = "client!ba", name = "l", descriptor = "()I")
	public synchronized int method193() {
		return this.anInt244 == Integer.MIN_VALUE ? 0 : this.anInt244;
	}

	@OriginalMember(owner = "client!ba", name = "c", descriptor = "(II)V")
	public synchronized void method195(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method201(arg0, arg1, this.method167());
	}

	@OriginalMember(owner = "client!ba", name = "k", descriptor = "(I)V")
	private synchronized void method196() {
		this.method189(0, this.method167());
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "()I")
	@Override
	public int method2165() {
		@Pc(6) int local6 = this.anInt237 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt239 == 0) {
			local6 -= local6 * this.anInt235 / (((Class3_Sub9_Sub1) super.aClass3_Sub9_5).aByteArray32.length << 8);
		} else if (this.anInt239 >= 0) {
			local6 -= local6 * this.anInt243 / ((Class3_Sub9_Sub1) super.aClass3_Sub9_5).aByteArray32.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method2164(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt244 == 0 && this.anInt233 == 0) {
			this.method2169(arg2);
			return;
		}
		@Pc(13) Class3_Sub9_Sub1 local13 = (Class3_Sub9_Sub1) super.aClass3_Sub9_5;
		@Pc(18) int local18 = this.anInt243 << 8;
		@Pc(23) int local23 = this.anInt234 << 8;
		@Pc(29) int local29 = local13.aByteArray32.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt239 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt235 < 0) {
			if (this.anInt242 <= 0) {
				this.method171();
				this.method2264();
				return;
			}
			this.anInt235 = 0;
		}
		if (this.anInt235 >= local29) {
			if (this.anInt242 >= 0) {
				this.method171();
				this.method2264();
				return;
			}
			this.anInt235 = local29 - 1;
		}
		if (this.anInt239 >= 0) {
			if (this.anInt239 > 0) {
				if (this.aBoolean7) {
					label130: {
						if (this.anInt242 < 0) {
							local40 = this.method179(arg0, arg1, local18, local44, local13.aByteArray32[this.anInt243]);
							if (this.anInt235 >= local18) {
								return;
							}
							this.anInt235 = local18 + local18 - this.anInt235 - 1;
							this.anInt242 = -this.anInt242;
							if (--this.anInt239 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method202(arg0, local40, local23, local44, local13.aByteArray32[this.anInt234 - 1]);
							if (this.anInt235 < local23) {
								return;
							}
							this.anInt235 = local23 + local23 - this.anInt235 - 1;
							this.anInt242 = -this.anInt242;
							if (--this.anInt239 == 0) {
								break;
							}
							local40 = this.method179(arg0, local40, local18, local44, local13.aByteArray32[this.anInt243]);
							if (this.anInt235 >= local18) {
								return;
							}
							this.anInt235 = local18 + local18 - this.anInt235 - 1;
							this.anInt242 = -this.anInt242;
						} while (--this.anInt239 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt242 < 0) {
						while (true) {
							local40 = this.method179(arg0, local40, local18, local44, local13.aByteArray32[this.anInt234 - 1]);
							if (this.anInt235 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt235 - 1) / local33;
							if (local416 >= this.anInt239) {
								this.anInt235 += local33 * this.anInt239;
								this.anInt239 = 0;
								break;
							}
							this.anInt235 += local33 * local416;
							this.anInt239 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method202(arg0, local40, local23, local44, local13.aByteArray32[this.anInt243]);
							if (this.anInt235 < local23) {
								return;
							}
							local416 = (this.anInt235 - local18) / local33;
							if (local416 >= this.anInt239) {
								this.anInt235 -= local33 * this.anInt239;
								this.anInt239 = 0;
								break;
							}
							this.anInt235 -= local33 * local416;
							this.anInt239 -= local416;
						}
					}
				}
			}
			if (this.anInt242 < 0) {
				this.method179(arg0, local40, 0, local44, 0);
				if (this.anInt235 < 0) {
					this.anInt235 = -1;
					this.method171();
					this.method2264();
					return;
				}
			} else {
				this.method202(arg0, local40, local29, local44, 0);
				if (this.anInt235 >= local29) {
					this.anInt235 = local29;
					this.method171();
					this.method2264();
				}
			}
		} else if (this.aBoolean7) {
			if (this.anInt242 < 0) {
				local40 = this.method179(arg0, arg1, local18, local44, local13.aByteArray32[this.anInt243]);
				if (this.anInt235 >= local18) {
					return;
				}
				this.anInt235 = local18 + local18 - this.anInt235 - 1;
				this.anInt242 = -this.anInt242;
			}
			while (true) {
				local40 = this.method202(arg0, local40, local23, local44, local13.aByteArray32[this.anInt234 - 1]);
				if (this.anInt235 < local23) {
					return;
				}
				this.anInt235 = local23 + local23 - this.anInt235 - 1;
				this.anInt242 = -this.anInt242;
				local40 = this.method179(arg0, local40, local18, local44, local13.aByteArray32[this.anInt243]);
				if (this.anInt235 >= local18) {
					return;
				}
				this.anInt235 = local18 + local18 - this.anInt235 - 1;
				this.anInt242 = -this.anInt242;
			}
		} else if (this.anInt242 < 0) {
			while (true) {
				local40 = this.method179(arg0, local40, local18, local44, local13.aByteArray32[this.anInt234 - 1]);
				if (this.anInt235 >= local18) {
					return;
				}
				this.anInt235 = local23 - (local23 - 1 - this.anInt235) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method202(arg0, local40, local23, local44, local13.aByteArray32[this.anInt243]);
				if (this.anInt235 < local23) {
					return;
				}
				this.anInt235 = local18 + (this.anInt235 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!ba", name = "l", descriptor = "(I)V")
	public synchronized void method199(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class3_Sub9_Sub1) super.aClass3_Sub9_5).aByteArray32.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt235 = arg0;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(III)V")
	public synchronized void method201(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method189(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static131.method200(arg1, arg2);
		@Pc(14) int local14 = Static131.method198(arg1, arg2);
		if (this.anInt236 == local10 && this.anInt232 == local14) {
			this.anInt233 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt237;
		if (this.anInt237 - arg1 > local31) {
			local31 = this.anInt237 - arg1;
		}
		if (local10 - this.anInt236 > local31) {
			local31 = local10 - this.anInt236;
		}
		if (this.anInt236 - local10 > local31) {
			local31 = this.anInt236 - local10;
		}
		if (local14 - this.anInt232 > local31) {
			local31 = local14 - this.anInt232;
		}
		if (this.anInt232 - local14 > local31) {
			local31 = this.anInt232 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt233 = arg0;
		this.anInt244 = arg1;
		this.anInt240 = arg2;
		this.anInt241 = (arg1 - this.anInt237) / arg0;
		this.anInt245 = (local10 - this.anInt236) / arg0;
		this.anInt238 = (local14 - this.anInt232) / arg0;
	}

	@OriginalMember(owner = "client!ba", name = "c", descriptor = "()Lclient!mc;")
	@Override
	public Class3_Sub2 method2167() {
		return null;
	}

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "([IIIII)I")
	private int method202(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt233 <= 0) {
				if (this.anInt242 == 256 && (this.anInt235 & 0xFF) == 0) {
					if (Static68.aBoolean70) {
						return Static131.method188(((Class3_Sub9_Sub1) super.aClass3_Sub9_5).aByteArray32, arg0, this.anInt235, arg1, this.anInt236, this.anInt232, arg3, arg2, this);
					}
					return Static131.method180(((Class3_Sub9_Sub1) super.aClass3_Sub9_5).aByteArray32, arg0, this.anInt235, arg1, this.anInt237, arg3, arg2, this);
				}
				if (Static68.aBoolean70) {
					return Static131.method192(((Class3_Sub9_Sub1) super.aClass3_Sub9_5).aByteArray32, arg0, this.anInt235, arg1, this.anInt236, this.anInt232, arg3, arg2, this, this.anInt242, arg4);
				}
				return Static131.method197(((Class3_Sub9_Sub1) super.aClass3_Sub9_5).aByteArray32, arg0, this.anInt235, arg1, this.anInt237, arg3, arg2, this, this.anInt242, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt233;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt233 += arg1;
			if (this.anInt242 == 256 && (this.anInt235 & 0xFF) == 0) {
				if (Static68.aBoolean70) {
					arg1 = Static131.method169(((Class3_Sub9_Sub1) super.aClass3_Sub9_5).aByteArray32, arg0, this.anInt235, arg1, this.anInt236, this.anInt232, this.anInt245, this.anInt238, local5, arg2, this);
				} else {
					arg1 = Static131.method186(((Class3_Sub9_Sub1) super.aClass3_Sub9_5).aByteArray32, arg0, this.anInt235, arg1, this.anInt237, this.anInt241, local5, arg2, this);
				}
			} else if (Static68.aBoolean70) {
				arg1 = Static131.method187(((Class3_Sub9_Sub1) super.aClass3_Sub9_5).aByteArray32, arg0, this.anInt235, arg1, this.anInt236, this.anInt232, this.anInt245, this.anInt238, local5, arg2, this, this.anInt242, arg4);
			} else {
				arg1 = Static131.method183(((Class3_Sub9_Sub1) super.aClass3_Sub9_5).aByteArray32, arg0, this.anInt235, arg1, this.anInt237, this.anInt241, local5, arg2, this, this.anInt242, arg4);
			}
			this.anInt233 -= arg1;
			if (this.anInt233 != 0) {
				return arg1;
			}
		} while (!this.method177());
		return arg3;
	}
}
