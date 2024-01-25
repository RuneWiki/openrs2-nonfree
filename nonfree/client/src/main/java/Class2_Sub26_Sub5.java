import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ws")
public final class Class2_Sub26_Sub5 extends Class2_Sub26 {

	@OriginalMember(owner = "client!ws", name = "r", descriptor = "I")
	public int anInt11396;

	@OriginalMember(owner = "client!ws", name = "u", descriptor = "I")
	public int anInt11399;

	@OriginalMember(owner = "client!ws", name = "w", descriptor = "I")
	public int anInt11401;

	@OriginalMember(owner = "client!ws", name = "y", descriptor = "I")
	private int anInt11402;

	@OriginalMember(owner = "client!ws", name = "B", descriptor = "I")
	public int anInt11405;

	@OriginalMember(owner = "client!ws", name = "C", descriptor = "I")
	private int anInt11406;

	@OriginalMember(owner = "client!ws", name = "E", descriptor = "I")
	public int anInt11408;

	@OriginalMember(owner = "client!ws", name = "F", descriptor = "I")
	public int anInt11409;

	@OriginalMember(owner = "client!ws", name = "A", descriptor = "I")
	private final int anInt11404;

	@OriginalMember(owner = "client!ws", name = "s", descriptor = "I")
	private final int anInt11397;

	@OriginalMember(owner = "client!ws", name = "x", descriptor = "Z")
	private final boolean aBoolean806;

	@OriginalMember(owner = "client!ws", name = "D", descriptor = "I")
	private int anInt11407;

	@OriginalMember(owner = "client!ws", name = "t", descriptor = "I")
	private int anInt11398;

	@OriginalMember(owner = "client!ws", name = "v", descriptor = "I")
	private int anInt11400;

	@OriginalMember(owner = "client!ws", name = "z", descriptor = "I")
	public int anInt11403;

	@OriginalMember(owner = "client!ws", name = "<init>", descriptor = "(Lclient!ud;III)V")
	public Class2_Sub26_Sub5(@OriginalArg(0) Class2_Sub44_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass2_Sub44_6 = arg0;
		this.anInt11404 = arg0.anInt10349;
		this.anInt11397 = arg0.anInt10351;
		this.aBoolean806 = arg0.aBoolean748;
		this.anInt11407 = arg1;
		this.anInt11398 = arg2;
		this.anInt11400 = arg3;
		this.anInt11403 = 0;
		this.method9793();
	}

	@OriginalMember(owner = "client!ws", name = "b", descriptor = "(I)V")
	public synchronized void method9763(@OriginalArg(0) int arg0) {
		this.anInt11406 = arg0;
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(Z)V")
	public synchronized void method9764() {
		this.anInt11407 = (this.anInt11407 ^ this.anInt11407 >> 31) + (this.anInt11407 >>> 31);
		this.anInt11407 = -this.anInt11407;
	}

	@OriginalMember(owner = "client!ws", name = "f", descriptor = "(I)V")
	public synchronized void method9765(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method9772();
			this.method9825();
		} else if (this.anInt11408 == 0 && this.anInt11401 == 0) {
			this.anInt11402 = 0;
			this.anInt11398 = 0;
			this.anInt11409 = 0;
			this.method9825();
		} else {
			@Pc(31) int local31 = -this.anInt11409;
			if (this.anInt11409 > local31) {
				local31 = this.anInt11409;
			}
			if (-this.anInt11408 > local31) {
				local31 = -this.anInt11408;
			}
			if (this.anInt11408 > local31) {
				local31 = this.anInt11408;
			}
			if (-this.anInt11401 > local31) {
				local31 = -this.anInt11401;
			}
			if (this.anInt11401 > local31) {
				local31 = this.anInt11401;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt11402 = arg0;
			this.anInt11398 = Integer.MIN_VALUE;
			this.anInt11396 = -this.anInt11409 / arg0;
			this.anInt11405 = -this.anInt11408 / arg0;
			this.anInt11399 = -this.anInt11401 / arg0;
		}
	}

	@OriginalMember(owner = "client!ws", name = "e", descriptor = "()I")
	public synchronized int method9767() {
		return this.anInt11407 < 0 ? -this.anInt11407 : this.anInt11407;
	}

	@OriginalMember(owner = "client!ws", name = "g", descriptor = "(I)V")
	public synchronized void method9770(@OriginalArg(0) int arg0) {
		this.method9777(this.method9792(), arg0);
	}

	@OriginalMember(owner = "client!ws", name = "h", descriptor = "(I)V")
	private synchronized void method9772() {
		this.method9777(0, this.method9781());
	}

	@OriginalMember(owner = "client!ws", name = "i", descriptor = "(I)V")
	public synchronized void method9776(@OriginalArg(0) int arg0) {
		this.method9777(arg0 << 6, this.method9781());
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(II)V")
	private synchronized void method9777(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt11398 = arg0;
		this.anInt11400 = arg1;
		this.anInt11402 = 0;
		this.method9793();
	}

	@OriginalMember(owner = "client!ws", name = "f", descriptor = "()I")
	public synchronized int method9781() {
		return this.anInt11400 < 0 ? -1 : this.anInt11400;
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "([IIIII)I")
	private int method9782(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt11402 <= 0) {
				if (this.anInt11407 == -256 && (this.anInt11403 & 0xFF) == 0) {
					if (Static41.aBoolean53) {
						return Static686.method9771(((Class2_Sub44_Sub1) super.aClass2_Sub44_6).aByteArray92, arg0, this.anInt11403, arg1, this.anInt11408, this.anInt11401, arg3, arg2, this);
					}
					return Static686.method9800(((Class2_Sub44_Sub1) super.aClass2_Sub44_6).aByteArray92, arg0, this.anInt11403, arg1, this.anInt11409, arg3, arg2, this);
				}
				if (Static41.aBoolean53) {
					return Static686.method9769(((Class2_Sub44_Sub1) super.aClass2_Sub44_6).aByteArray92, arg0, this.anInt11403, arg1, this.anInt11408, this.anInt11401, arg3, arg2, this, this.anInt11407, arg4);
				}
				return Static686.method9778(((Class2_Sub44_Sub1) super.aClass2_Sub44_6).aByteArray92, arg0, this.anInt11403, arg1, this.anInt11409, arg3, arg2, this, this.anInt11407, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt11402;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt11402 += arg1;
			if (this.anInt11407 == -256 && (this.anInt11403 & 0xFF) == 0) {
				if (Static41.aBoolean53) {
					arg1 = Static686.method9775(((Class2_Sub44_Sub1) super.aClass2_Sub44_6).aByteArray92, arg0, this.anInt11403, arg1, this.anInt11408, this.anInt11401, this.anInt11405, this.anInt11399, local5, arg2, this);
				} else {
					arg1 = Static686.method9790(((Class2_Sub44_Sub1) super.aClass2_Sub44_6).aByteArray92, arg0, this.anInt11403, arg1, this.anInt11409, this.anInt11396, local5, arg2, this);
				}
			} else if (Static41.aBoolean53) {
				arg1 = Static686.method9768(((Class2_Sub44_Sub1) super.aClass2_Sub44_6).aByteArray92, arg0, this.anInt11403, arg1, this.anInt11408, this.anInt11401, this.anInt11405, this.anInt11399, local5, arg2, this, this.anInt11407, arg4);
			} else {
				arg1 = Static686.method9785(((Class2_Sub44_Sub1) super.aClass2_Sub44_6).aByteArray92, arg0, this.anInt11403, arg1, this.anInt11409, this.anInt11396, local5, arg2, this, this.anInt11407, arg4);
			}
			this.anInt11402 -= arg1;
			if (this.anInt11402 != 0) {
				return arg1;
			}
		} while (!this.method9801());
		return arg3;
	}

	@OriginalMember(owner = "client!ws", name = "j", descriptor = "(I)V")
	public synchronized void method9783(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class2_Sub44_Sub1) super.aClass2_Sub44_6).aByteArray92.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt11403 = arg0;
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method9759(@OriginalArg(0) int arg0) {
		if (this.anInt11402 > 0) {
			if (arg0 >= this.anInt11402) {
				if (this.anInt11398 == Integer.MIN_VALUE) {
					this.anInt11398 = 0;
					this.anInt11409 = this.anInt11408 = this.anInt11401 = 0;
					this.method9825();
					arg0 = this.anInt11402;
				}
				this.anInt11402 = 0;
				this.method9793();
			} else {
				this.anInt11409 += this.anInt11396 * arg0;
				this.anInt11408 += this.anInt11405 * arg0;
				this.anInt11401 += this.anInt11399 * arg0;
				this.anInt11402 -= arg0;
			}
		}
		@Pc(71) Class2_Sub44_Sub1 local71 = (Class2_Sub44_Sub1) super.aClass2_Sub44_6;
		@Pc(76) int local76 = this.anInt11404 << 8;
		@Pc(81) int local81 = this.anInt11397 << 8;
		@Pc(87) int local87 = local71.aByteArray92.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt11406 = 0;
		}
		if (this.anInt11403 < 0) {
			if (this.anInt11407 <= 0) {
				this.method9796();
				this.method9825();
				return;
			}
			this.anInt11403 = 0;
		}
		if (this.anInt11403 >= local87) {
			if (this.anInt11407 >= 0) {
				this.method9796();
				this.method9825();
				return;
			}
			this.anInt11403 = local87 - 1;
		}
		this.anInt11403 += this.anInt11407 * arg0;
		if (this.anInt11406 >= 0) {
			if (this.anInt11406 > 0) {
				if (this.aBoolean806) {
					label125: {
						if (this.anInt11407 < 0) {
							if (this.anInt11403 >= local76) {
								return;
							}
							this.anInt11403 = local76 + local76 - this.anInt11403 - 1;
							this.anInt11407 = -this.anInt11407;
							if (--this.anInt11406 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt11403 < local81) {
								return;
							}
							this.anInt11403 = local81 + local81 - this.anInt11403 - 1;
							this.anInt11407 = -this.anInt11407;
							if (--this.anInt11406 == 0) {
								break;
							}
							if (this.anInt11403 >= local76) {
								return;
							}
							this.anInt11403 = local76 + local76 - this.anInt11403 - 1;
							this.anInt11407 = -this.anInt11407;
						} while (--this.anInt11406 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt11407 < 0) {
						if (this.anInt11403 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt11403 - 1) / local91;
						if (local361 < this.anInt11406) {
							this.anInt11403 += local91 * local361;
							this.anInt11406 -= local361;
							return;
						}
						this.anInt11403 += local91 * this.anInt11406;
						this.anInt11406 = 0;
					} else if (this.anInt11403 >= local81) {
						local361 = (this.anInt11403 - local76) / local91;
						if (local361 < this.anInt11406) {
							this.anInt11403 -= local91 * local361;
							this.anInt11406 -= local361;
							return;
						}
						this.anInt11403 -= local91 * this.anInt11406;
						this.anInt11406 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt11407 < 0) {
				if (this.anInt11403 < 0) {
					this.anInt11403 = -1;
					this.method9796();
					this.method9825();
					return;
				}
			} else if (this.anInt11403 >= local87) {
				this.anInt11403 = local87;
				this.method9796();
				this.method9825();
			}
		} else if (this.aBoolean806) {
			if (this.anInt11407 < 0) {
				if (this.anInt11403 >= local76) {
					return;
				}
				this.anInt11403 = local76 + local76 - this.anInt11403 - 1;
				this.anInt11407 = -this.anInt11407;
			}
			while (this.anInt11403 >= local81) {
				this.anInt11403 = local81 + local81 - this.anInt11403 - 1;
				this.anInt11407 = -this.anInt11407;
				if (this.anInt11403 >= local76) {
					return;
				}
				this.anInt11403 = local76 + local76 - this.anInt11403 - 1;
				this.anInt11407 = -this.anInt11407;
			}
		} else if (this.anInt11407 < 0) {
			if (this.anInt11403 < local76) {
				this.anInt11403 = local81 - (local81 - 1 - this.anInt11403) % local91 - 1;
			}
		} else if (this.anInt11403 >= local81) {
			this.anInt11403 = local76 + (this.anInt11403 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!ws", name = "d", descriptor = "()Lclient!fja;")
	@Override
	public Class2_Sub26 method9761() {
		return null;
	}

	@OriginalMember(owner = "client!ws", name = "b", descriptor = "()I")
	@Override
	public int method9757() {
		@Pc(6) int local6 = this.anInt11409 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt11406 == 0) {
			local6 -= local6 * this.anInt11403 / (((Class2_Sub44_Sub1) super.aClass2_Sub44_6).aByteArray92.length << 8);
		} else if (this.anInt11406 >= 0) {
			local6 -= local6 * this.anInt11404 / ((Class2_Sub44_Sub1) super.aClass2_Sub44_6).aByteArray92.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!ws", name = "g", descriptor = "()Z")
	public boolean method9786() {
		return this.anInt11402 != 0;
	}

	@OriginalMember(owner = "client!ws", name = "c", descriptor = "(II)V")
	public synchronized void method9787(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method9798(arg0, arg1, this.method9781());
	}

	@OriginalMember(owner = "client!ws", name = "b", descriptor = "([IIIII)I")
	private int method9788(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt11402 <= 0) {
				if (this.anInt11407 == 256 && (this.anInt11403 & 0xFF) == 0) {
					if (Static41.aBoolean53) {
						return Static686.method9762(((Class2_Sub44_Sub1) super.aClass2_Sub44_6).aByteArray92, arg0, this.anInt11403, arg1, this.anInt11408, this.anInt11401, arg3, arg2, this);
					}
					return Static686.method9789(((Class2_Sub44_Sub1) super.aClass2_Sub44_6).aByteArray92, arg0, this.anInt11403, arg1, this.anInt11409, arg3, arg2, this);
				}
				if (Static41.aBoolean53) {
					return Static686.method9766(((Class2_Sub44_Sub1) super.aClass2_Sub44_6).aByteArray92, arg0, this.anInt11403, arg1, this.anInt11408, this.anInt11401, arg3, arg2, this, this.anInt11407, arg4);
				}
				return Static686.method9773(((Class2_Sub44_Sub1) super.aClass2_Sub44_6).aByteArray92, arg0, this.anInt11403, arg1, this.anInt11409, arg3, arg2, this, this.anInt11407, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt11402;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt11402 += arg1;
			if (this.anInt11407 == 256 && (this.anInt11403 & 0xFF) == 0) {
				if (Static41.aBoolean53) {
					arg1 = Static686.method9784(((Class2_Sub44_Sub1) super.aClass2_Sub44_6).aByteArray92, arg0, this.anInt11403, arg1, this.anInt11408, this.anInt11401, this.anInt11405, this.anInt11399, local5, arg2, this);
				} else {
					arg1 = Static686.method9774(((Class2_Sub44_Sub1) super.aClass2_Sub44_6).aByteArray92, arg0, this.anInt11403, arg1, this.anInt11409, this.anInt11396, local5, arg2, this);
				}
			} else if (Static41.aBoolean53) {
				arg1 = Static686.method9794(((Class2_Sub44_Sub1) super.aClass2_Sub44_6).aByteArray92, arg0, this.anInt11403, arg1, this.anInt11408, this.anInt11401, this.anInt11405, this.anInt11399, local5, arg2, this, this.anInt11407, arg4);
			} else {
				arg1 = Static686.method9779(((Class2_Sub44_Sub1) super.aClass2_Sub44_6).aByteArray92, arg0, this.anInt11403, arg1, this.anInt11409, this.anInt11396, local5, arg2, this, this.anInt11407, arg4);
			}
			this.anInt11402 -= arg1;
			if (this.anInt11402 != 0) {
				return arg1;
			}
		} while (!this.method9801());
		return arg3;
	}

	@OriginalMember(owner = "client!ws", name = "k", descriptor = "(I)V")
	public synchronized void method9791(@OriginalArg(0) int arg0) {
		if (this.anInt11407 < 0) {
			this.anInt11407 = -arg0;
		} else {
			this.anInt11407 = arg0;
		}
	}

	@OriginalMember(owner = "client!ws", name = "h", descriptor = "()I")
	public synchronized int method9792() {
		return this.anInt11398 == Integer.MIN_VALUE ? 0 : this.anInt11398;
	}

	@OriginalMember(owner = "client!ws", name = "i", descriptor = "()V")
	private void method9793() {
		this.anInt11409 = this.anInt11398;
		this.anInt11408 = Static686.method9780(this.anInt11398, this.anInt11400);
		this.anInt11401 = Static686.method9795(this.anInt11398, this.anInt11400);
	}

	@OriginalMember(owner = "client!ws", name = "j", descriptor = "()V")
	private void method9796() {
		if (this.anInt11402 == 0) {
			return;
		}
		if (this.anInt11398 == Integer.MIN_VALUE) {
			this.anInt11398 = 0;
		}
		this.anInt11402 = 0;
		this.method9793();
	}

	@OriginalMember(owner = "client!ws", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method9760(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt11398 == 0 && this.anInt11402 == 0) {
			this.method9759(arg2);
			return;
		}
		@Pc(13) Class2_Sub44_Sub1 local13 = (Class2_Sub44_Sub1) super.aClass2_Sub44_6;
		@Pc(18) int local18 = this.anInt11404 << 8;
		@Pc(23) int local23 = this.anInt11397 << 8;
		@Pc(29) int local29 = local13.aByteArray92.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt11406 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt11403 < 0) {
			if (this.anInt11407 <= 0) {
				this.method9796();
				this.method9825();
				return;
			}
			this.anInt11403 = 0;
		}
		if (this.anInt11403 >= local29) {
			if (this.anInt11407 >= 0) {
				this.method9796();
				this.method9825();
				return;
			}
			this.anInt11403 = local29 - 1;
		}
		if (this.anInt11406 >= 0) {
			if (this.anInt11406 > 0) {
				if (this.aBoolean806) {
					label130: {
						if (this.anInt11407 < 0) {
							local40 = this.method9782(arg0, arg1, local18, local44, local13.aByteArray92[this.anInt11404]);
							if (this.anInt11403 >= local18) {
								return;
							}
							this.anInt11403 = local18 + local18 - this.anInt11403 - 1;
							this.anInt11407 = -this.anInt11407;
							if (--this.anInt11406 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method9788(arg0, local40, local23, local44, local13.aByteArray92[this.anInt11397 - 1]);
							if (this.anInt11403 < local23) {
								return;
							}
							this.anInt11403 = local23 + local23 - this.anInt11403 - 1;
							this.anInt11407 = -this.anInt11407;
							if (--this.anInt11406 == 0) {
								break;
							}
							local40 = this.method9782(arg0, local40, local18, local44, local13.aByteArray92[this.anInt11404]);
							if (this.anInt11403 >= local18) {
								return;
							}
							this.anInt11403 = local18 + local18 - this.anInt11403 - 1;
							this.anInt11407 = -this.anInt11407;
						} while (--this.anInt11406 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt11407 < 0) {
						while (true) {
							local40 = this.method9782(arg0, local40, local18, local44, local13.aByteArray92[this.anInt11397 - 1]);
							if (this.anInt11403 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt11403 - 1) / local33;
							if (local416 >= this.anInt11406) {
								this.anInt11403 += local33 * this.anInt11406;
								this.anInt11406 = 0;
								break;
							}
							this.anInt11403 += local33 * local416;
							this.anInt11406 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method9788(arg0, local40, local23, local44, local13.aByteArray92[this.anInt11404]);
							if (this.anInt11403 < local23) {
								return;
							}
							local416 = (this.anInt11403 - local18) / local33;
							if (local416 >= this.anInt11406) {
								this.anInt11403 -= local33 * this.anInt11406;
								this.anInt11406 = 0;
								break;
							}
							this.anInt11403 -= local33 * local416;
							this.anInt11406 -= local416;
						}
					}
				}
			}
			if (this.anInt11407 < 0) {
				this.method9782(arg0, local40, 0, local44, 0);
				if (this.anInt11403 < 0) {
					this.anInt11403 = -1;
					this.method9796();
					this.method9825();
					return;
				}
			} else {
				this.method9788(arg0, local40, local29, local44, 0);
				if (this.anInt11403 >= local29) {
					this.anInt11403 = local29;
					this.method9796();
					this.method9825();
				}
			}
		} else if (this.aBoolean806) {
			if (this.anInt11407 < 0) {
				local40 = this.method9782(arg0, arg1, local18, local44, local13.aByteArray92[this.anInt11404]);
				if (this.anInt11403 >= local18) {
					return;
				}
				this.anInt11403 = local18 + local18 - this.anInt11403 - 1;
				this.anInt11407 = -this.anInt11407;
			}
			while (true) {
				local40 = this.method9788(arg0, local40, local23, local44, local13.aByteArray92[this.anInt11397 - 1]);
				if (this.anInt11403 < local23) {
					return;
				}
				this.anInt11403 = local23 + local23 - this.anInt11403 - 1;
				this.anInt11407 = -this.anInt11407;
				local40 = this.method9782(arg0, local40, local18, local44, local13.aByteArray92[this.anInt11404]);
				if (this.anInt11403 >= local18) {
					return;
				}
				this.anInt11403 = local18 + local18 - this.anInt11403 - 1;
				this.anInt11407 = -this.anInt11407;
			}
		} else if (this.anInt11407 < 0) {
			while (true) {
				local40 = this.method9782(arg0, local40, local18, local44, local13.aByteArray92[this.anInt11397 - 1]);
				if (this.anInt11403 >= local18) {
					return;
				}
				this.anInt11403 = local23 - (local23 - 1 - this.anInt11403) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method9788(arg0, local40, local23, local44, local13.aByteArray92[this.anInt11404]);
				if (this.anInt11403 < local23) {
					return;
				}
				this.anInt11403 = local18 + (this.anInt11403 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(III)V")
	public synchronized void method9798(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method9777(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static686.method9780(arg1, arg2);
		@Pc(14) int local14 = Static686.method9795(arg1, arg2);
		if (this.anInt11408 == local10 && this.anInt11401 == local14) {
			this.anInt11402 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt11409;
		if (this.anInt11409 - arg1 > local31) {
			local31 = this.anInt11409 - arg1;
		}
		if (local10 - this.anInt11408 > local31) {
			local31 = local10 - this.anInt11408;
		}
		if (this.anInt11408 - local10 > local31) {
			local31 = this.anInt11408 - local10;
		}
		if (local14 - this.anInt11401 > local31) {
			local31 = local14 - this.anInt11401;
		}
		if (this.anInt11401 - local14 > local31) {
			local31 = this.anInt11401 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt11402 = arg0;
		this.anInt11398 = arg1;
		this.anInt11400 = arg2;
		this.anInt11396 = (arg1 - this.anInt11409) / arg0;
		this.anInt11405 = (local10 - this.anInt11408) / arg0;
		this.anInt11399 = (local14 - this.anInt11401) / arg0;
	}

	@OriginalMember(owner = "client!ws", name = "c", descriptor = "()Lclient!fja;")
	@Override
	public Class2_Sub26 method9758() {
		return null;
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "()I")
	@Override
	public int method9756() {
		return this.anInt11398 == 0 && this.anInt11402 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!ws", name = "k", descriptor = "()Z")
	public boolean method9799() {
		return this.anInt11403 < 0 || this.anInt11403 >= ((Class2_Sub44_Sub1) super.aClass2_Sub44_6).aByteArray92.length << 8;
	}

	@OriginalMember(owner = "client!ws", name = "l", descriptor = "()Z")
	private boolean method9801() {
		@Pc(2) int local2 = this.anInt11398;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static686.method9780(local2, this.anInt11400);
			local8 = Static686.method9795(local2, this.anInt11400);
		}
		if (this.anInt11409 != local2 || this.anInt11408 != local10 || this.anInt11401 != local8) {
			if (this.anInt11409 < local2) {
				this.anInt11396 = 1;
				this.anInt11402 = local2 - this.anInt11409;
			} else if (this.anInt11409 > local2) {
				this.anInt11396 = -1;
				this.anInt11402 = this.anInt11409 - local2;
			} else {
				this.anInt11396 = 0;
			}
			if (this.anInt11408 < local10) {
				this.anInt11405 = 1;
				if (this.anInt11402 == 0 || this.anInt11402 > local10 - this.anInt11408) {
					this.anInt11402 = local10 - this.anInt11408;
				}
			} else if (this.anInt11408 > local10) {
				this.anInt11405 = -1;
				if (this.anInt11402 == 0 || this.anInt11402 > this.anInt11408 - local10) {
					this.anInt11402 = this.anInt11408 - local10;
				}
			} else {
				this.anInt11405 = 0;
			}
			if (this.anInt11401 < local8) {
				this.anInt11399 = 1;
				if (this.anInt11402 == 0 || this.anInt11402 > local8 - this.anInt11401) {
					this.anInt11402 = local8 - this.anInt11401;
				}
			} else if (this.anInt11401 > local8) {
				this.anInt11399 = -1;
				if (this.anInt11402 == 0 || this.anInt11402 > this.anInt11401 - local8) {
					this.anInt11402 = this.anInt11401 - local8;
				}
			} else {
				this.anInt11399 = 0;
			}
			return false;
		} else if (this.anInt11398 == Integer.MIN_VALUE) {
			this.anInt11398 = 0;
			this.anInt11409 = this.anInt11408 = this.anInt11401 = 0;
			this.method9825();
			return true;
		} else {
			this.method9793();
			return false;
		}
	}
}
