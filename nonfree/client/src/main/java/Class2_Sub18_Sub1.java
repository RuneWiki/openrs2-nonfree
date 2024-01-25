import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!il")
public final class Class2_Sub18_Sub1 extends Class2_Sub18 {

	@OriginalMember(owner = "client!il", name = "s", descriptor = "I")
	private int anInt3322;

	@OriginalMember(owner = "client!il", name = "v", descriptor = "I")
	public int anInt3325;

	@OriginalMember(owner = "client!il", name = "w", descriptor = "I")
	private int anInt3326;

	@OriginalMember(owner = "client!il", name = "x", descriptor = "I")
	public int anInt3327;

	@OriginalMember(owner = "client!il", name = "B", descriptor = "I")
	public int anInt3331;

	@OriginalMember(owner = "client!il", name = "C", descriptor = "I")
	public int anInt3332;

	@OriginalMember(owner = "client!il", name = "D", descriptor = "I")
	public int anInt3333;

	@OriginalMember(owner = "client!il", name = "F", descriptor = "I")
	public int anInt3335;

	@OriginalMember(owner = "client!il", name = "E", descriptor = "I")
	private final int anInt3334;

	@OriginalMember(owner = "client!il", name = "y", descriptor = "I")
	private final int anInt3328;

	@OriginalMember(owner = "client!il", name = "r", descriptor = "Z")
	private final boolean aBoolean284;

	@OriginalMember(owner = "client!il", name = "A", descriptor = "I")
	private int anInt3330;

	@OriginalMember(owner = "client!il", name = "u", descriptor = "I")
	private int anInt3324;

	@OriginalMember(owner = "client!il", name = "z", descriptor = "I")
	private int anInt3329;

	@OriginalMember(owner = "client!il", name = "t", descriptor = "I")
	public int anInt3323;

	@OriginalMember(owner = "client!il", name = "<init>", descriptor = "(Lclient!uo;II)V")
	public Class2_Sub18_Sub1(@OriginalArg(0) Class2_Sub41_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass2_Sub41_5 = arg0;
		this.anInt3334 = arg0.anInt7099;
		this.anInt3328 = arg0.anInt7100;
		this.aBoolean284 = arg0.aBoolean601;
		this.anInt3330 = arg1;
		this.anInt3324 = arg2;
		this.anInt3329 = 8192;
		this.anInt3323 = 0;
		this.method2675();
	}

	@OriginalMember(owner = "client!il", name = "<init>", descriptor = "(Lclient!uo;III)V")
	public Class2_Sub18_Sub1(@OriginalArg(0) Class2_Sub41_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass2_Sub41_5 = arg0;
		this.anInt3334 = arg0.anInt7099;
		this.anInt3328 = arg0.anInt7100;
		this.aBoolean284 = arg0.aBoolean601;
		this.anInt3330 = arg1;
		this.anInt3324 = arg2;
		this.anInt3329 = arg3;
		this.anInt3323 = 0;
		this.method2675();
	}

	@OriginalMember(owner = "client!il", name = "e", descriptor = "()Z")
	public boolean method2674() {
		return this.anInt3323 < 0 || this.anInt3323 >= ((Class2_Sub41_Sub1) super.aClass2_Sub41_5).aByteArray195.length << 8;
	}

	@OriginalMember(owner = "client!il", name = "f", descriptor = "()V")
	private void method2675() {
		this.anInt3335 = this.anInt3324;
		this.anInt3333 = Static458.method2712(this.anInt3324, this.anInt3329);
		this.anInt3325 = Static458.method2708(this.anInt3324, this.anInt3329);
	}

	@OriginalMember(owner = "client!il", name = "c", descriptor = "()I")
	@Override
	public int method4449() {
		@Pc(6) int local6 = this.anInt3335 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt3322 == 0) {
			local6 -= local6 * this.anInt3323 / (((Class2_Sub41_Sub1) super.aClass2_Sub41_5).aByteArray195.length << 8);
		} else if (this.anInt3322 >= 0) {
			local6 -= local6 * this.anInt3334 / ((Class2_Sub41_Sub1) super.aClass2_Sub41_5).aByteArray195.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(II)V")
	public synchronized void method2680(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method2700(arg0, arg1, this.method2681());
	}

	@OriginalMember(owner = "client!il", name = "g", descriptor = "()I")
	public synchronized int method2681() {
		return this.anInt3329 < 0 ? -1 : this.anInt3329;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "([IIIII)I")
	private int method2683(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt3326 <= 0) {
				if (this.anInt3330 == -256 && (this.anInt3323 & 0xFF) == 0) {
					if (Static451.aBoolean125) {
						return Static458.method2688(((Class2_Sub41_Sub1) super.aClass2_Sub41_5).aByteArray195, arg0, this.anInt3323, arg1, this.anInt3333, this.anInt3325, arg3, arg2, this);
					}
					return Static458.method2678(((Class2_Sub41_Sub1) super.aClass2_Sub41_5).aByteArray195, arg0, this.anInt3323, arg1, this.anInt3335, arg3, arg2, this);
				}
				if (Static451.aBoolean125) {
					return Static458.method2699(((Class2_Sub41_Sub1) super.aClass2_Sub41_5).aByteArray195, arg0, this.anInt3323, arg1, this.anInt3333, this.anInt3325, arg3, arg2, this, this.anInt3330, arg4);
				}
				return Static458.method2679(((Class2_Sub41_Sub1) super.aClass2_Sub41_5).aByteArray195, arg0, this.anInt3323, arg1, this.anInt3335, arg3, arg2, this, this.anInt3330, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt3326;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt3326 += arg1;
			if (this.anInt3330 == -256 && (this.anInt3323 & 0xFF) == 0) {
				if (Static451.aBoolean125) {
					arg1 = Static458.method2711(((Class2_Sub41_Sub1) super.aClass2_Sub41_5).aByteArray195, arg0, this.anInt3323, arg1, this.anInt3333, this.anInt3325, this.anInt3331, this.anInt3332, local5, arg2, this);
				} else {
					arg1 = Static458.method2702(((Class2_Sub41_Sub1) super.aClass2_Sub41_5).aByteArray195, arg0, this.anInt3323, arg1, this.anInt3335, this.anInt3327, local5, arg2, this);
				}
			} else if (Static451.aBoolean125) {
				arg1 = Static458.method2673(((Class2_Sub41_Sub1) super.aClass2_Sub41_5).aByteArray195, arg0, this.anInt3323, arg1, this.anInt3333, this.anInt3325, this.anInt3331, this.anInt3332, local5, arg2, this, this.anInt3330, arg4);
			} else {
				arg1 = Static458.method2676(((Class2_Sub41_Sub1) super.aClass2_Sub41_5).aByteArray195, arg0, this.anInt3323, arg1, this.anInt3335, this.anInt3327, local5, arg2, this, this.anInt3330, arg4);
			}
			this.anInt3326 -= arg1;
			if (this.anInt3326 != 0) {
				return arg1;
			}
		} while (!this.method2707());
		return arg3;
	}

	@OriginalMember(owner = "client!il", name = "h", descriptor = "()Z")
	public boolean method2684() {
		return this.anInt3326 != 0;
	}

	@OriginalMember(owner = "client!il", name = "i", descriptor = "()V")
	private void method2685() {
		if (this.anInt3326 == 0) {
			return;
		}
		if (this.anInt3324 == Integer.MIN_VALUE) {
			this.anInt3324 = 0;
		}
		this.anInt3326 = 0;
		this.method2675();
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method4450(@OriginalArg(0) int arg0) {
		if (this.anInt3326 > 0) {
			if (arg0 >= this.anInt3326) {
				if (this.anInt3324 == Integer.MIN_VALUE) {
					this.anInt3324 = 0;
					this.anInt3335 = this.anInt3333 = this.anInt3325 = 0;
					this.method6072();
					arg0 = this.anInt3326;
				}
				this.anInt3326 = 0;
				this.method2675();
			} else {
				this.anInt3335 += this.anInt3327 * arg0;
				this.anInt3333 += this.anInt3331 * arg0;
				this.anInt3325 += this.anInt3332 * arg0;
				this.anInt3326 -= arg0;
			}
		}
		@Pc(71) Class2_Sub41_Sub1 local71 = (Class2_Sub41_Sub1) super.aClass2_Sub41_5;
		@Pc(76) int local76 = this.anInt3334 << 8;
		@Pc(81) int local81 = this.anInt3328 << 8;
		@Pc(87) int local87 = local71.aByteArray195.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt3322 = 0;
		}
		if (this.anInt3323 < 0) {
			if (this.anInt3330 <= 0) {
				this.method2685();
				this.method6072();
				return;
			}
			this.anInt3323 = 0;
		}
		if (this.anInt3323 >= local87) {
			if (this.anInt3330 >= 0) {
				this.method2685();
				this.method6072();
				return;
			}
			this.anInt3323 = local87 - 1;
		}
		this.anInt3323 += this.anInt3330 * arg0;
		if (this.anInt3322 >= 0) {
			if (this.anInt3322 > 0) {
				if (this.aBoolean284) {
					label125: {
						if (this.anInt3330 < 0) {
							if (this.anInt3323 >= local76) {
								return;
							}
							this.anInt3323 = local76 + local76 - this.anInt3323 - 1;
							this.anInt3330 = -this.anInt3330;
							if (--this.anInt3322 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt3323 < local81) {
								return;
							}
							this.anInt3323 = local81 + local81 - this.anInt3323 - 1;
							this.anInt3330 = -this.anInt3330;
							if (--this.anInt3322 == 0) {
								break;
							}
							if (this.anInt3323 >= local76) {
								return;
							}
							this.anInt3323 = local76 + local76 - this.anInt3323 - 1;
							this.anInt3330 = -this.anInt3330;
						} while (--this.anInt3322 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt3330 < 0) {
						if (this.anInt3323 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt3323 - 1) / local91;
						if (local361 < this.anInt3322) {
							this.anInt3323 += local91 * local361;
							this.anInt3322 -= local361;
							return;
						}
						this.anInt3323 += local91 * this.anInt3322;
						this.anInt3322 = 0;
					} else if (this.anInt3323 >= local81) {
						local361 = (this.anInt3323 - local76) / local91;
						if (local361 < this.anInt3322) {
							this.anInt3323 -= local91 * local361;
							this.anInt3322 -= local361;
							return;
						}
						this.anInt3323 -= local91 * this.anInt3322;
						this.anInt3322 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt3330 < 0) {
				if (this.anInt3323 < 0) {
					this.anInt3323 = -1;
					this.method2685();
					this.method6072();
					return;
				}
			} else if (this.anInt3323 >= local87) {
				this.anInt3323 = local87;
				this.method2685();
				this.method6072();
			}
		} else if (this.aBoolean284) {
			if (this.anInt3330 < 0) {
				if (this.anInt3323 >= local76) {
					return;
				}
				this.anInt3323 = local76 + local76 - this.anInt3323 - 1;
				this.anInt3330 = -this.anInt3330;
			}
			while (this.anInt3323 >= local81) {
				this.anInt3323 = local81 + local81 - this.anInt3323 - 1;
				this.anInt3330 = -this.anInt3330;
				if (this.anInt3323 >= local76) {
					return;
				}
				this.anInt3323 = local76 + local76 - this.anInt3323 - 1;
				this.anInt3330 = -this.anInt3330;
			}
		} else if (this.anInt3330 < 0) {
			if (this.anInt3323 < local76) {
				this.anInt3323 = local81 - (local81 - 1 - this.anInt3323) % local91 - 1;
			}
		} else if (this.anInt3323 >= local81) {
			this.anInt3323 = local76 + (this.anInt3323 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!il", name = "d", descriptor = "(I)V")
	public synchronized void method2689(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method2703();
			this.method6072();
		} else if (this.anInt3333 == 0 && this.anInt3325 == 0) {
			this.anInt3326 = 0;
			this.anInt3324 = 0;
			this.anInt3335 = 0;
			this.method6072();
		} else {
			@Pc(31) int local31 = -this.anInt3335;
			if (this.anInt3335 > local31) {
				local31 = this.anInt3335;
			}
			if (-this.anInt3333 > local31) {
				local31 = -this.anInt3333;
			}
			if (this.anInt3333 > local31) {
				local31 = this.anInt3333;
			}
			if (-this.anInt3325 > local31) {
				local31 = -this.anInt3325;
			}
			if (this.anInt3325 > local31) {
				local31 = this.anInt3325;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt3326 = arg0;
			this.anInt3324 = Integer.MIN_VALUE;
			this.anInt3327 = -this.anInt3335 / arg0;
			this.anInt3331 = -this.anInt3333 / arg0;
			this.anInt3332 = -this.anInt3325 / arg0;
		}
	}

	@OriginalMember(owner = "client!il", name = "b", descriptor = "([IIIII)I")
	private int method2690(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt3326 <= 0) {
				if (this.anInt3330 == 256 && (this.anInt3323 & 0xFF) == 0) {
					if (Static451.aBoolean125) {
						return Static458.method2692(((Class2_Sub41_Sub1) super.aClass2_Sub41_5).aByteArray195, arg0, this.anInt3323, arg1, this.anInt3333, this.anInt3325, arg3, arg2, this);
					}
					return Static458.method2677(((Class2_Sub41_Sub1) super.aClass2_Sub41_5).aByteArray195, arg0, this.anInt3323, arg1, this.anInt3335, arg3, arg2, this);
				}
				if (Static451.aBoolean125) {
					return Static458.method2691(((Class2_Sub41_Sub1) super.aClass2_Sub41_5).aByteArray195, arg0, this.anInt3323, arg1, this.anInt3333, this.anInt3325, arg3, arg2, this, this.anInt3330, arg4);
				}
				return Static458.method2697(((Class2_Sub41_Sub1) super.aClass2_Sub41_5).aByteArray195, arg0, this.anInt3323, arg1, this.anInt3335, arg3, arg2, this, this.anInt3330, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt3326;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt3326 += arg1;
			if (this.anInt3330 == 256 && (this.anInt3323 & 0xFF) == 0) {
				if (Static451.aBoolean125) {
					arg1 = Static458.method2706(((Class2_Sub41_Sub1) super.aClass2_Sub41_5).aByteArray195, arg0, this.anInt3323, arg1, this.anInt3333, this.anInt3325, this.anInt3331, this.anInt3332, local5, arg2, this);
				} else {
					arg1 = Static458.method2686(((Class2_Sub41_Sub1) super.aClass2_Sub41_5).aByteArray195, arg0, this.anInt3323, arg1, this.anInt3335, this.anInt3327, local5, arg2, this);
				}
			} else if (Static451.aBoolean125) {
				arg1 = Static458.method2701(((Class2_Sub41_Sub1) super.aClass2_Sub41_5).aByteArray195, arg0, this.anInt3323, arg1, this.anInt3333, this.anInt3325, this.anInt3331, this.anInt3332, local5, arg2, this, this.anInt3330, arg4);
			} else {
				arg1 = Static458.method2687(((Class2_Sub41_Sub1) super.aClass2_Sub41_5).aByteArray195, arg0, this.anInt3323, arg1, this.anInt3335, this.anInt3327, local5, arg2, this, this.anInt3330, arg4);
			}
			this.anInt3326 -= arg1;
			if (this.anInt3326 != 0) {
				return arg1;
			}
		} while (!this.method2707());
		return arg3;
	}

	@OriginalMember(owner = "client!il", name = "e", descriptor = "(I)V")
	public synchronized void method2693(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class2_Sub41_Sub1) super.aClass2_Sub41_5).aByteArray195.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt3323 = arg0;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method4446(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt3324 == 0 && this.anInt3326 == 0) {
			this.method4450(arg2);
			return;
		}
		@Pc(13) Class2_Sub41_Sub1 local13 = (Class2_Sub41_Sub1) super.aClass2_Sub41_5;
		@Pc(18) int local18 = this.anInt3334 << 8;
		@Pc(23) int local23 = this.anInt3328 << 8;
		@Pc(29) int local29 = local13.aByteArray195.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt3322 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt3323 < 0) {
			if (this.anInt3330 <= 0) {
				this.method2685();
				this.method6072();
				return;
			}
			this.anInt3323 = 0;
		}
		if (this.anInt3323 >= local29) {
			if (this.anInt3330 >= 0) {
				this.method2685();
				this.method6072();
				return;
			}
			this.anInt3323 = local29 - 1;
		}
		if (this.anInt3322 >= 0) {
			if (this.anInt3322 > 0) {
				if (this.aBoolean284) {
					label130: {
						if (this.anInt3330 < 0) {
							local40 = this.method2683(arg0, arg1, local18, local44, local13.aByteArray195[this.anInt3334]);
							if (this.anInt3323 >= local18) {
								return;
							}
							this.anInt3323 = local18 + local18 - this.anInt3323 - 1;
							this.anInt3330 = -this.anInt3330;
							if (--this.anInt3322 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method2690(arg0, local40, local23, local44, local13.aByteArray195[this.anInt3328 - 1]);
							if (this.anInt3323 < local23) {
								return;
							}
							this.anInt3323 = local23 + local23 - this.anInt3323 - 1;
							this.anInt3330 = -this.anInt3330;
							if (--this.anInt3322 == 0) {
								break;
							}
							local40 = this.method2683(arg0, local40, local18, local44, local13.aByteArray195[this.anInt3334]);
							if (this.anInt3323 >= local18) {
								return;
							}
							this.anInt3323 = local18 + local18 - this.anInt3323 - 1;
							this.anInt3330 = -this.anInt3330;
						} while (--this.anInt3322 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt3330 < 0) {
						while (true) {
							local40 = this.method2683(arg0, local40, local18, local44, local13.aByteArray195[this.anInt3328 - 1]);
							if (this.anInt3323 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt3323 - 1) / local33;
							if (local416 >= this.anInt3322) {
								this.anInt3323 += local33 * this.anInt3322;
								this.anInt3322 = 0;
								break;
							}
							this.anInt3323 += local33 * local416;
							this.anInt3322 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method2690(arg0, local40, local23, local44, local13.aByteArray195[this.anInt3334]);
							if (this.anInt3323 < local23) {
								return;
							}
							local416 = (this.anInt3323 - local18) / local33;
							if (local416 >= this.anInt3322) {
								this.anInt3323 -= local33 * this.anInt3322;
								this.anInt3322 = 0;
								break;
							}
							this.anInt3323 -= local33 * local416;
							this.anInt3322 -= local416;
						}
					}
				}
			}
			if (this.anInt3330 < 0) {
				this.method2683(arg0, local40, 0, local44, 0);
				if (this.anInt3323 < 0) {
					this.anInt3323 = -1;
					this.method2685();
					this.method6072();
					return;
				}
			} else {
				this.method2690(arg0, local40, local29, local44, 0);
				if (this.anInt3323 >= local29) {
					this.anInt3323 = local29;
					this.method2685();
					this.method6072();
				}
			}
		} else if (this.aBoolean284) {
			if (this.anInt3330 < 0) {
				local40 = this.method2683(arg0, arg1, local18, local44, local13.aByteArray195[this.anInt3334]);
				if (this.anInt3323 >= local18) {
					return;
				}
				this.anInt3323 = local18 + local18 - this.anInt3323 - 1;
				this.anInt3330 = -this.anInt3330;
			}
			while (true) {
				local40 = this.method2690(arg0, local40, local23, local44, local13.aByteArray195[this.anInt3328 - 1]);
				if (this.anInt3323 < local23) {
					return;
				}
				this.anInt3323 = local23 + local23 - this.anInt3323 - 1;
				this.anInt3330 = -this.anInt3330;
				local40 = this.method2683(arg0, local40, local18, local44, local13.aByteArray195[this.anInt3334]);
				if (this.anInt3323 >= local18) {
					return;
				}
				this.anInt3323 = local18 + local18 - this.anInt3323 - 1;
				this.anInt3330 = -this.anInt3330;
			}
		} else if (this.anInt3330 < 0) {
			while (true) {
				local40 = this.method2683(arg0, local40, local18, local44, local13.aByteArray195[this.anInt3328 - 1]);
				if (this.anInt3323 >= local18) {
					return;
				}
				this.anInt3323 = local23 - (local23 - 1 - this.anInt3323) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method2690(arg0, local40, local23, local44, local13.aByteArray195[this.anInt3334]);
				if (this.anInt3323 < local23) {
					return;
				}
				this.anInt3323 = local18 + (this.anInt3323 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!il", name = "b", descriptor = "(II)V")
	private synchronized void method2695(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3324 = arg0;
		this.anInt3329 = arg1;
		this.anInt3326 = 0;
		this.method2675();
	}

	@OriginalMember(owner = "client!il", name = "j", descriptor = "()I")
	public synchronized int method2696() {
		return this.anInt3330 < 0 ? -this.anInt3330 : this.anInt3330;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "()I")
	@Override
	public int method4445() {
		return this.anInt3324 == 0 && this.anInt3326 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!il", name = "f", descriptor = "(I)V")
	public synchronized void method2698(@OriginalArg(0) int arg0) {
		this.anInt3322 = arg0;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(III)V")
	public synchronized void method2700(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method2695(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static458.method2712(arg1, arg2);
		@Pc(14) int local14 = Static458.method2708(arg1, arg2);
		if (this.anInt3333 == local10 && this.anInt3325 == local14) {
			this.anInt3326 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt3335;
		if (this.anInt3335 - arg1 > local31) {
			local31 = this.anInt3335 - arg1;
		}
		if (local10 - this.anInt3333 > local31) {
			local31 = local10 - this.anInt3333;
		}
		if (this.anInt3333 - local10 > local31) {
			local31 = this.anInt3333 - local10;
		}
		if (local14 - this.anInt3325 > local31) {
			local31 = local14 - this.anInt3325;
		}
		if (this.anInt3325 - local14 > local31) {
			local31 = this.anInt3325 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt3326 = arg0;
		this.anInt3324 = arg1;
		this.anInt3329 = arg2;
		this.anInt3327 = (arg1 - this.anInt3335) / arg0;
		this.anInt3331 = (local10 - this.anInt3333) / arg0;
		this.anInt3332 = (local14 - this.anInt3325) / arg0;
	}

	@OriginalMember(owner = "client!il", name = "b", descriptor = "()Lclient!gm;")
	@Override
	public Class2_Sub18 method4448() {
		return null;
	}

	@OriginalMember(owner = "client!il", name = "g", descriptor = "(I)V")
	private synchronized void method2703() {
		this.method2695(0, this.method2681());
	}

	@OriginalMember(owner = "client!il", name = "d", descriptor = "()Lclient!gm;")
	@Override
	public Class2_Sub18 method4451() {
		return null;
	}

	@OriginalMember(owner = "client!il", name = "k", descriptor = "()I")
	public synchronized int method2704() {
		return this.anInt3324 == Integer.MIN_VALUE ? 0 : this.anInt3324;
	}

	@OriginalMember(owner = "client!il", name = "b", descriptor = "(Z)V")
	public synchronized void method2705() {
		this.anInt3330 = (this.anInt3330 ^ this.anInt3330 >> 31) + (this.anInt3330 >>> 31);
		this.anInt3330 = -this.anInt3330;
	}

	@OriginalMember(owner = "client!il", name = "l", descriptor = "()Z")
	private boolean method2707() {
		@Pc(2) int local2 = this.anInt3324;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static458.method2712(local2, this.anInt3329);
			local8 = Static458.method2708(local2, this.anInt3329);
		}
		if (this.anInt3335 != local2 || this.anInt3333 != local10 || this.anInt3325 != local8) {
			if (this.anInt3335 < local2) {
				this.anInt3327 = 1;
				this.anInt3326 = local2 - this.anInt3335;
			} else if (this.anInt3335 > local2) {
				this.anInt3327 = -1;
				this.anInt3326 = this.anInt3335 - local2;
			} else {
				this.anInt3327 = 0;
			}
			if (this.anInt3333 < local10) {
				this.anInt3331 = 1;
				if (this.anInt3326 == 0 || this.anInt3326 > local10 - this.anInt3333) {
					this.anInt3326 = local10 - this.anInt3333;
				}
			} else if (this.anInt3333 > local10) {
				this.anInt3331 = -1;
				if (this.anInt3326 == 0 || this.anInt3326 > this.anInt3333 - local10) {
					this.anInt3326 = this.anInt3333 - local10;
				}
			} else {
				this.anInt3331 = 0;
			}
			if (this.anInt3325 < local8) {
				this.anInt3332 = 1;
				if (this.anInt3326 == 0 || this.anInt3326 > local8 - this.anInt3325) {
					this.anInt3326 = local8 - this.anInt3325;
				}
			} else if (this.anInt3325 > local8) {
				this.anInt3332 = -1;
				if (this.anInt3326 == 0 || this.anInt3326 > this.anInt3325 - local8) {
					this.anInt3326 = this.anInt3325 - local8;
				}
			} else {
				this.anInt3332 = 0;
			}
			return false;
		} else if (this.anInt3324 == Integer.MIN_VALUE) {
			this.anInt3324 = 0;
			this.anInt3335 = this.anInt3333 = this.anInt3325 = 0;
			this.method6072();
			return true;
		} else {
			this.method2675();
			return false;
		}
	}

	@OriginalMember(owner = "client!il", name = "h", descriptor = "(I)V")
	public synchronized void method2709(@OriginalArg(0) int arg0) {
		this.method2695(arg0 << 6, this.method2681());
	}

	@OriginalMember(owner = "client!il", name = "i", descriptor = "(I)V")
	public synchronized void method2710(@OriginalArg(0) int arg0) {
		if (this.anInt3330 < 0) {
			this.anInt3330 = -arg0;
		} else {
			this.anInt3330 = arg0;
		}
	}
}
