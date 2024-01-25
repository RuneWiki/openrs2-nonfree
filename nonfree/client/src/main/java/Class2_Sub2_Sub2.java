import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lc")
public final class Class2_Sub2_Sub2 extends Class2_Sub2 {

	@OriginalMember(owner = "client!lc", name = "t", descriptor = "I")
	public int anInt3451;

	@OriginalMember(owner = "client!lc", name = "u", descriptor = "I")
	private int anInt3452;

	@OriginalMember(owner = "client!lc", name = "v", descriptor = "I")
	public int anInt3453;

	@OriginalMember(owner = "client!lc", name = "x", descriptor = "I")
	private int anInt3455;

	@OriginalMember(owner = "client!lc", name = "z", descriptor = "I")
	public int anInt3457;

	@OriginalMember(owner = "client!lc", name = "A", descriptor = "I")
	public int anInt3458;

	@OriginalMember(owner = "client!lc", name = "B", descriptor = "I")
	public int anInt3459;

	@OriginalMember(owner = "client!lc", name = "C", descriptor = "I")
	public int anInt3460;

	@OriginalMember(owner = "client!lc", name = "s", descriptor = "I")
	private final int anInt3450;

	@OriginalMember(owner = "client!lc", name = "E", descriptor = "I")
	private final int anInt3462;

	@OriginalMember(owner = "client!lc", name = "F", descriptor = "Z")
	private final boolean aBoolean256;

	@OriginalMember(owner = "client!lc", name = "G", descriptor = "I")
	private int anInt3463;

	@OriginalMember(owner = "client!lc", name = "w", descriptor = "I")
	private int anInt3454;

	@OriginalMember(owner = "client!lc", name = "y", descriptor = "I")
	private int anInt3456;

	@OriginalMember(owner = "client!lc", name = "D", descriptor = "I")
	public int anInt3461;

	@OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(Lclient!cu;II)V")
	public Class2_Sub2_Sub2(@OriginalArg(0) Class2_Sub4_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass2_Sub4_5 = arg0;
		this.anInt3450 = arg0.anInt955;
		this.anInt3462 = arg0.anInt956;
		this.aBoolean256 = arg0.aBoolean88;
		this.anInt3463 = arg1;
		this.anInt3454 = arg2;
		this.anInt3456 = 8192;
		this.anInt3461 = 0;
		this.method3217();
	}

	@OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(Lclient!cu;III)V")
	public Class2_Sub2_Sub2(@OriginalArg(0) Class2_Sub4_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass2_Sub4_5 = arg0;
		this.anInt3450 = arg0.anInt955;
		this.anInt3462 = arg0.anInt956;
		this.aBoolean256 = arg0.aBoolean88;
		this.anInt3463 = arg1;
		this.anInt3454 = arg2;
		this.anInt3456 = arg3;
		this.anInt3461 = 0;
		this.method3217();
	}

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "(I)V")
	public synchronized void method3183(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method3192();
			this.method5745();
		} else if (this.anInt3457 == 0 && this.anInt3459 == 0) {
			this.anInt3452 = 0;
			this.anInt3454 = 0;
			this.anInt3460 = 0;
			this.method5745();
		} else {
			@Pc(31) int local31 = -this.anInt3460;
			if (this.anInt3460 > local31) {
				local31 = this.anInt3460;
			}
			if (-this.anInt3457 > local31) {
				local31 = -this.anInt3457;
			}
			if (this.anInt3457 > local31) {
				local31 = this.anInt3457;
			}
			if (-this.anInt3459 > local31) {
				local31 = -this.anInt3459;
			}
			if (this.anInt3459 > local31) {
				local31 = this.anInt3459;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt3452 = arg0;
			this.anInt3454 = Integer.MIN_VALUE;
			this.anInt3458 = -this.anInt3460 / arg0;
			this.anInt3451 = -this.anInt3457 / arg0;
			this.anInt3453 = -this.anInt3459 / arg0;
		}
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "()Lclient!gh;")
	@Override
	public Class2_Sub2 method4830() {
		return null;
	}

	@OriginalMember(owner = "client!lc", name = "e", descriptor = "()V")
	private void method3184() {
		if (this.anInt3452 == 0) {
			return;
		}
		if (this.anInt3454 == Integer.MIN_VALUE) {
			this.anInt3454 = 0;
		}
		this.anInt3452 = 0;
		this.method3217();
	}

	@OriginalMember(owner = "client!lc", name = "f", descriptor = "()I")
	public synchronized int method3185() {
		return this.anInt3454 == Integer.MIN_VALUE ? 0 : this.anInt3454;
	}

	@OriginalMember(owner = "client!lc", name = "g", descriptor = "()I")
	public synchronized int method3188() {
		return this.anInt3456 < 0 ? -1 : this.anInt3456;
	}

	@OriginalMember(owner = "client!lc", name = "h", descriptor = "()Z")
	public boolean method3190() {
		return this.anInt3452 != 0;
	}

	@OriginalMember(owner = "client!lc", name = "e", descriptor = "(I)V")
	public synchronized void method3191(@OriginalArg(0) int arg0) {
		this.method3201(arg0 << 6, this.method3188());
	}

	@OriginalMember(owner = "client!lc", name = "f", descriptor = "(I)V")
	private synchronized void method3192() {
		this.method3201(0, this.method3188());
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "([IIIII)I")
	private int method3194(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt3452 <= 0) {
				if (this.anInt3463 == 256 && (this.anInt3461 & 0xFF) == 0) {
					if (Static148.aBoolean202) {
						return Static398.method3216(((Class2_Sub4_Sub1) super.aClass2_Sub4_5).aByteArray19, arg0, this.anInt3461, arg1, this.anInt3457, this.anInt3459, arg3, arg2, this);
					}
					return Static398.method3203(((Class2_Sub4_Sub1) super.aClass2_Sub4_5).aByteArray19, arg0, this.anInt3461, arg1, this.anInt3460, arg3, arg2, this);
				}
				if (Static148.aBoolean202) {
					return Static398.method3206(((Class2_Sub4_Sub1) super.aClass2_Sub4_5).aByteArray19, arg0, this.anInt3461, arg1, this.anInt3457, this.anInt3459, arg3, arg2, this, this.anInt3463, arg4);
				}
				return Static398.method3208(((Class2_Sub4_Sub1) super.aClass2_Sub4_5).aByteArray19, arg0, this.anInt3461, arg1, this.anInt3460, arg3, arg2, this, this.anInt3463, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt3452;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt3452 += arg1;
			if (this.anInt3463 == 256 && (this.anInt3461 & 0xFF) == 0) {
				if (Static148.aBoolean202) {
					arg1 = Static398.method3218(((Class2_Sub4_Sub1) super.aClass2_Sub4_5).aByteArray19, arg0, this.anInt3461, arg1, this.anInt3457, this.anInt3459, this.anInt3451, this.anInt3453, local5, arg2, this);
				} else {
					arg1 = Static398.method3189(((Class2_Sub4_Sub1) super.aClass2_Sub4_5).aByteArray19, arg0, this.anInt3461, arg1, this.anInt3460, this.anInt3458, local5, arg2, this);
				}
			} else if (Static148.aBoolean202) {
				arg1 = Static398.method3221(((Class2_Sub4_Sub1) super.aClass2_Sub4_5).aByteArray19, arg0, this.anInt3461, arg1, this.anInt3457, this.anInt3459, this.anInt3451, this.anInt3453, local5, arg2, this, this.anInt3463, arg4);
			} else {
				arg1 = Static398.method3195(((Class2_Sub4_Sub1) super.aClass2_Sub4_5).aByteArray19, arg0, this.anInt3461, arg1, this.anInt3460, this.anInt3458, local5, arg2, this, this.anInt3463, arg4);
			}
			this.anInt3452 -= arg1;
			if (this.anInt3452 != 0) {
				return arg1;
			}
		} while (!this.method3205());
		return arg3;
	}

	@OriginalMember(owner = "client!lc", name = "g", descriptor = "(I)V")
	public synchronized void method3196(@OriginalArg(0) int arg0) {
		this.anInt3455 = arg0;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Z)V")
	public synchronized void method3197() {
		this.anInt3463 = (this.anInt3463 ^ this.anInt3463 >> 31) + (this.anInt3463 >>> 31);
		this.anInt3463 = -this.anInt3463;
	}

	@OriginalMember(owner = "client!lc", name = "i", descriptor = "()I")
	public synchronized int method3198() {
		return this.anInt3463 < 0 ? -this.anInt3463 : this.anInt3463;
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(II)V")
	private synchronized void method3201(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3454 = arg0;
		this.anInt3456 = arg1;
		this.anInt3452 = 0;
		this.method3217();
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(III)V")
	public synchronized void method3202(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method3201(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static398.method3186(arg1, arg2);
		@Pc(14) int local14 = Static398.method3211(arg1, arg2);
		if (this.anInt3457 == local10 && this.anInt3459 == local14) {
			this.anInt3452 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt3460;
		if (this.anInt3460 - arg1 > local31) {
			local31 = this.anInt3460 - arg1;
		}
		if (local10 - this.anInt3457 > local31) {
			local31 = local10 - this.anInt3457;
		}
		if (this.anInt3457 - local10 > local31) {
			local31 = this.anInt3457 - local10;
		}
		if (local14 - this.anInt3459 > local31) {
			local31 = local14 - this.anInt3459;
		}
		if (this.anInt3459 - local14 > local31) {
			local31 = this.anInt3459 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt3452 = arg0;
		this.anInt3454 = arg1;
		this.anInt3456 = arg2;
		this.anInt3458 = (arg1 - this.anInt3460) / arg0;
		this.anInt3451 = (local10 - this.anInt3457) / arg0;
		this.anInt3453 = (local14 - this.anInt3459) / arg0;
	}

	@OriginalMember(owner = "client!lc", name = "h", descriptor = "(I)V")
	public synchronized void method3204(@OriginalArg(0) int arg0) {
		if (this.anInt3463 < 0) {
			this.anInt3463 = -arg0;
		} else {
			this.anInt3463 = arg0;
		}
	}

	@OriginalMember(owner = "client!lc", name = "j", descriptor = "()Z")
	private boolean method3205() {
		@Pc(2) int local2 = this.anInt3454;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static398.method3186(local2, this.anInt3456);
			local8 = Static398.method3211(local2, this.anInt3456);
		}
		if (this.anInt3460 != local2 || this.anInt3457 != local10 || this.anInt3459 != local8) {
			if (this.anInt3460 < local2) {
				this.anInt3458 = 1;
				this.anInt3452 = local2 - this.anInt3460;
			} else if (this.anInt3460 > local2) {
				this.anInt3458 = -1;
				this.anInt3452 = this.anInt3460 - local2;
			} else {
				this.anInt3458 = 0;
			}
			if (this.anInt3457 < local10) {
				this.anInt3451 = 1;
				if (this.anInt3452 == 0 || this.anInt3452 > local10 - this.anInt3457) {
					this.anInt3452 = local10 - this.anInt3457;
				}
			} else if (this.anInt3457 > local10) {
				this.anInt3451 = -1;
				if (this.anInt3452 == 0 || this.anInt3452 > this.anInt3457 - local10) {
					this.anInt3452 = this.anInt3457 - local10;
				}
			} else {
				this.anInt3451 = 0;
			}
			if (this.anInt3459 < local8) {
				this.anInt3453 = 1;
				if (this.anInt3452 == 0 || this.anInt3452 > local8 - this.anInt3459) {
					this.anInt3452 = local8 - this.anInt3459;
				}
			} else if (this.anInt3459 > local8) {
				this.anInt3453 = -1;
				if (this.anInt3452 == 0 || this.anInt3452 > this.anInt3459 - local8) {
					this.anInt3452 = this.anInt3459 - local8;
				}
			} else {
				this.anInt3453 = 0;
			}
			return false;
		} else if (this.anInt3454 == Integer.MIN_VALUE) {
			this.anInt3454 = 0;
			this.anInt3460 = this.anInt3457 = this.anInt3459 = 0;
			this.method5745();
			return true;
		} else {
			this.method3217();
			return false;
		}
	}

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method4833(@OriginalArg(0) int arg0) {
		if (this.anInt3452 > 0) {
			if (arg0 >= this.anInt3452) {
				if (this.anInt3454 == Integer.MIN_VALUE) {
					this.anInt3454 = 0;
					this.anInt3460 = this.anInt3457 = this.anInt3459 = 0;
					this.method5745();
					arg0 = this.anInt3452;
				}
				this.anInt3452 = 0;
				this.method3217();
			} else {
				this.anInt3460 += this.anInt3458 * arg0;
				this.anInt3457 += this.anInt3451 * arg0;
				this.anInt3459 += this.anInt3453 * arg0;
				this.anInt3452 -= arg0;
			}
		}
		@Pc(71) Class2_Sub4_Sub1 local71 = (Class2_Sub4_Sub1) super.aClass2_Sub4_5;
		@Pc(76) int local76 = this.anInt3450 << 8;
		@Pc(81) int local81 = this.anInt3462 << 8;
		@Pc(87) int local87 = local71.aByteArray19.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt3455 = 0;
		}
		if (this.anInt3461 < 0) {
			if (this.anInt3463 <= 0) {
				this.method3184();
				this.method5745();
				return;
			}
			this.anInt3461 = 0;
		}
		if (this.anInt3461 >= local87) {
			if (this.anInt3463 >= 0) {
				this.method3184();
				this.method5745();
				return;
			}
			this.anInt3461 = local87 - 1;
		}
		this.anInt3461 += this.anInt3463 * arg0;
		if (this.anInt3455 >= 0) {
			if (this.anInt3455 > 0) {
				if (this.aBoolean256) {
					label125: {
						if (this.anInt3463 < 0) {
							if (this.anInt3461 >= local76) {
								return;
							}
							this.anInt3461 = local76 + local76 - this.anInt3461 - 1;
							this.anInt3463 = -this.anInt3463;
							if (--this.anInt3455 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt3461 < local81) {
								return;
							}
							this.anInt3461 = local81 + local81 - this.anInt3461 - 1;
							this.anInt3463 = -this.anInt3463;
							if (--this.anInt3455 == 0) {
								break;
							}
							if (this.anInt3461 >= local76) {
								return;
							}
							this.anInt3461 = local76 + local76 - this.anInt3461 - 1;
							this.anInt3463 = -this.anInt3463;
						} while (--this.anInt3455 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt3463 < 0) {
						if (this.anInt3461 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt3461 - 1) / local91;
						if (local361 < this.anInt3455) {
							this.anInt3461 += local91 * local361;
							this.anInt3455 -= local361;
							return;
						}
						this.anInt3461 += local91 * this.anInt3455;
						this.anInt3455 = 0;
					} else if (this.anInt3461 >= local81) {
						local361 = (this.anInt3461 - local76) / local91;
						if (local361 < this.anInt3455) {
							this.anInt3461 -= local91 * local361;
							this.anInt3455 -= local361;
							return;
						}
						this.anInt3461 -= local91 * this.anInt3455;
						this.anInt3455 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt3463 < 0) {
				if (this.anInt3461 < 0) {
					this.anInt3461 = -1;
					this.method3184();
					this.method5745();
					return;
				}
			} else if (this.anInt3461 >= local87) {
				this.anInt3461 = local87;
				this.method3184();
				this.method5745();
			}
		} else if (this.aBoolean256) {
			if (this.anInt3463 < 0) {
				if (this.anInt3461 >= local76) {
					return;
				}
				this.anInt3461 = local76 + local76 - this.anInt3461 - 1;
				this.anInt3463 = -this.anInt3463;
			}
			while (this.anInt3461 >= local81) {
				this.anInt3461 = local81 + local81 - this.anInt3461 - 1;
				this.anInt3463 = -this.anInt3463;
				if (this.anInt3461 >= local76) {
					return;
				}
				this.anInt3461 = local76 + local76 - this.anInt3461 - 1;
				this.anInt3463 = -this.anInt3463;
			}
		} else if (this.anInt3463 < 0) {
			if (this.anInt3461 < local76) {
				this.anInt3461 = local81 - (local81 - 1 - this.anInt3461) % local91 - 1;
			}
		} else if (this.anInt3461 >= local81) {
			this.anInt3461 = local76 + (this.anInt3461 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "()Lclient!gh;")
	@Override
	public Class2_Sub2 method4832() {
		return null;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "()I")
	@Override
	public int method4829() {
		@Pc(6) int local6 = this.anInt3460 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt3455 == 0) {
			local6 -= local6 * this.anInt3461 / (((Class2_Sub4_Sub1) super.aClass2_Sub4_5).aByteArray19.length << 8);
		} else if (this.anInt3455 >= 0) {
			local6 -= local6 * this.anInt3450 / ((Class2_Sub4_Sub1) super.aClass2_Sub4_5).aByteArray19.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!lc", name = "k", descriptor = "()Z")
	public boolean method3209() {
		return this.anInt3461 < 0 || this.anInt3461 >= ((Class2_Sub4_Sub1) super.aClass2_Sub4_5).aByteArray19.length << 8;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method4828(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt3454 == 0 && this.anInt3452 == 0) {
			this.method4833(arg2);
			return;
		}
		@Pc(13) Class2_Sub4_Sub1 local13 = (Class2_Sub4_Sub1) super.aClass2_Sub4_5;
		@Pc(18) int local18 = this.anInt3450 << 8;
		@Pc(23) int local23 = this.anInt3462 << 8;
		@Pc(29) int local29 = local13.aByteArray19.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt3455 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt3461 < 0) {
			if (this.anInt3463 <= 0) {
				this.method3184();
				this.method5745();
				return;
			}
			this.anInt3461 = 0;
		}
		if (this.anInt3461 >= local29) {
			if (this.anInt3463 >= 0) {
				this.method3184();
				this.method5745();
				return;
			}
			this.anInt3461 = local29 - 1;
		}
		if (this.anInt3455 >= 0) {
			if (this.anInt3455 > 0) {
				if (this.aBoolean256) {
					label130: {
						if (this.anInt3463 < 0) {
							local40 = this.method3219(arg0, arg1, local18, local44, local13.aByteArray19[this.anInt3450]);
							if (this.anInt3461 >= local18) {
								return;
							}
							this.anInt3461 = local18 + local18 - this.anInt3461 - 1;
							this.anInt3463 = -this.anInt3463;
							if (--this.anInt3455 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method3194(arg0, local40, local23, local44, local13.aByteArray19[this.anInt3462 - 1]);
							if (this.anInt3461 < local23) {
								return;
							}
							this.anInt3461 = local23 + local23 - this.anInt3461 - 1;
							this.anInt3463 = -this.anInt3463;
							if (--this.anInt3455 == 0) {
								break;
							}
							local40 = this.method3219(arg0, local40, local18, local44, local13.aByteArray19[this.anInt3450]);
							if (this.anInt3461 >= local18) {
								return;
							}
							this.anInt3461 = local18 + local18 - this.anInt3461 - 1;
							this.anInt3463 = -this.anInt3463;
						} while (--this.anInt3455 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt3463 < 0) {
						while (true) {
							local40 = this.method3219(arg0, local40, local18, local44, local13.aByteArray19[this.anInt3462 - 1]);
							if (this.anInt3461 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt3461 - 1) / local33;
							if (local416 >= this.anInt3455) {
								this.anInt3461 += local33 * this.anInt3455;
								this.anInt3455 = 0;
								break;
							}
							this.anInt3461 += local33 * local416;
							this.anInt3455 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method3194(arg0, local40, local23, local44, local13.aByteArray19[this.anInt3450]);
							if (this.anInt3461 < local23) {
								return;
							}
							local416 = (this.anInt3461 - local18) / local33;
							if (local416 >= this.anInt3455) {
								this.anInt3461 -= local33 * this.anInt3455;
								this.anInt3455 = 0;
								break;
							}
							this.anInt3461 -= local33 * local416;
							this.anInt3455 -= local416;
						}
					}
				}
			}
			if (this.anInt3463 < 0) {
				this.method3219(arg0, local40, 0, local44, 0);
				if (this.anInt3461 < 0) {
					this.anInt3461 = -1;
					this.method3184();
					this.method5745();
					return;
				}
			} else {
				this.method3194(arg0, local40, local29, local44, 0);
				if (this.anInt3461 >= local29) {
					this.anInt3461 = local29;
					this.method3184();
					this.method5745();
				}
			}
		} else if (this.aBoolean256) {
			if (this.anInt3463 < 0) {
				local40 = this.method3219(arg0, arg1, local18, local44, local13.aByteArray19[this.anInt3450]);
				if (this.anInt3461 >= local18) {
					return;
				}
				this.anInt3461 = local18 + local18 - this.anInt3461 - 1;
				this.anInt3463 = -this.anInt3463;
			}
			while (true) {
				local40 = this.method3194(arg0, local40, local23, local44, local13.aByteArray19[this.anInt3462 - 1]);
				if (this.anInt3461 < local23) {
					return;
				}
				this.anInt3461 = local23 + local23 - this.anInt3461 - 1;
				this.anInt3463 = -this.anInt3463;
				local40 = this.method3219(arg0, local40, local18, local44, local13.aByteArray19[this.anInt3450]);
				if (this.anInt3461 >= local18) {
					return;
				}
				this.anInt3461 = local18 + local18 - this.anInt3461 - 1;
				this.anInt3463 = -this.anInt3463;
			}
		} else if (this.anInt3463 < 0) {
			while (true) {
				local40 = this.method3219(arg0, local40, local18, local44, local13.aByteArray19[this.anInt3462 - 1]);
				if (this.anInt3461 >= local18) {
					return;
				}
				this.anInt3461 = local23 - (local23 - 1 - this.anInt3461) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method3194(arg0, local40, local23, local44, local13.aByteArray19[this.anInt3450]);
				if (this.anInt3461 < local23) {
					return;
				}
				this.anInt3461 = local18 + (this.anInt3461 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "(II)V")
	public synchronized void method3213(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method3202(arg0, arg1, this.method3188());
	}

	@OriginalMember(owner = "client!lc", name = "l", descriptor = "()V")
	private void method3217() {
		this.anInt3460 = this.anInt3454;
		this.anInt3457 = Static398.method3186(this.anInt3454, this.anInt3456);
		this.anInt3459 = Static398.method3211(this.anInt3454, this.anInt3456);
	}

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "()I")
	@Override
	public int method4834() {
		return this.anInt3454 == 0 && this.anInt3452 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "([IIIII)I")
	private int method3219(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt3452 <= 0) {
				if (this.anInt3463 == -256 && (this.anInt3461 & 0xFF) == 0) {
					if (Static148.aBoolean202) {
						return Static398.method3214(((Class2_Sub4_Sub1) super.aClass2_Sub4_5).aByteArray19, arg0, this.anInt3461, arg1, this.anInt3457, this.anInt3459, arg3, arg2, this);
					}
					return Static398.method3200(((Class2_Sub4_Sub1) super.aClass2_Sub4_5).aByteArray19, arg0, this.anInt3461, arg1, this.anInt3460, arg3, arg2, this);
				}
				if (Static148.aBoolean202) {
					return Static398.method3222(((Class2_Sub4_Sub1) super.aClass2_Sub4_5).aByteArray19, arg0, this.anInt3461, arg1, this.anInt3457, this.anInt3459, arg3, arg2, this, this.anInt3463, arg4);
				}
				return Static398.method3199(((Class2_Sub4_Sub1) super.aClass2_Sub4_5).aByteArray19, arg0, this.anInt3461, arg1, this.anInt3460, arg3, arg2, this, this.anInt3463, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt3452;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt3452 += arg1;
			if (this.anInt3463 == -256 && (this.anInt3461 & 0xFF) == 0) {
				if (Static148.aBoolean202) {
					arg1 = Static398.method3207(((Class2_Sub4_Sub1) super.aClass2_Sub4_5).aByteArray19, arg0, this.anInt3461, arg1, this.anInt3457, this.anInt3459, this.anInt3451, this.anInt3453, local5, arg2, this);
				} else {
					arg1 = Static398.method3210(((Class2_Sub4_Sub1) super.aClass2_Sub4_5).aByteArray19, arg0, this.anInt3461, arg1, this.anInt3460, this.anInt3458, local5, arg2, this);
				}
			} else if (Static148.aBoolean202) {
				arg1 = Static398.method3193(((Class2_Sub4_Sub1) super.aClass2_Sub4_5).aByteArray19, arg0, this.anInt3461, arg1, this.anInt3457, this.anInt3459, this.anInt3451, this.anInt3453, local5, arg2, this, this.anInt3463, arg4);
			} else {
				arg1 = Static398.method3212(((Class2_Sub4_Sub1) super.aClass2_Sub4_5).aByteArray19, arg0, this.anInt3461, arg1, this.anInt3460, this.anInt3458, local5, arg2, this, this.anInt3463, arg4);
			}
			this.anInt3452 -= arg1;
			if (this.anInt3452 != 0) {
				return arg1;
			}
		} while (!this.method3205());
		return arg3;
	}

	@OriginalMember(owner = "client!lc", name = "i", descriptor = "(I)V")
	public synchronized void method3220(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class2_Sub4_Sub1) super.aClass2_Sub4_5).aByteArray19.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt3461 = arg0;
	}
}
