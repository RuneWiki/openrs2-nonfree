import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gg")
public final class Class6_Sub10_Sub2 extends Class6_Sub10 {

	@OriginalMember(owner = "client!gg", name = "q", descriptor = "I")
	public int anInt3855;

	@OriginalMember(owner = "client!gg", name = "s", descriptor = "I")
	public int anInt3857;

	@OriginalMember(owner = "client!gg", name = "t", descriptor = "I")
	public int anInt3858;

	@OriginalMember(owner = "client!gg", name = "x", descriptor = "I")
	private int anInt3861;

	@OriginalMember(owner = "client!gg", name = "z", descriptor = "I")
	public int anInt3863;

	@OriginalMember(owner = "client!gg", name = "C", descriptor = "I")
	private int anInt3866;

	@OriginalMember(owner = "client!gg", name = "D", descriptor = "I")
	public int anInt3867;

	@OriginalMember(owner = "client!gg", name = "E", descriptor = "I")
	public int anInt3868;

	@OriginalMember(owner = "client!gg", name = "B", descriptor = "I")
	private final int anInt3865;

	@OriginalMember(owner = "client!gg", name = "y", descriptor = "I")
	private final int anInt3862;

	@OriginalMember(owner = "client!gg", name = "w", descriptor = "Z")
	private final boolean aBoolean321;

	@OriginalMember(owner = "client!gg", name = "v", descriptor = "I")
	private int anInt3860;

	@OriginalMember(owner = "client!gg", name = "u", descriptor = "I")
	private int anInt3859;

	@OriginalMember(owner = "client!gg", name = "r", descriptor = "I")
	private int anInt3856;

	@OriginalMember(owner = "client!gg", name = "A", descriptor = "I")
	public int anInt3864;

	@OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(Lclient!wb;II)V")
	public Class6_Sub10_Sub2(@OriginalArg(0) Class6_Sub12_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass6_Sub12_5 = arg0;
		this.anInt3865 = arg0.anInt9542;
		this.anInt3862 = arg0.anInt9544;
		this.aBoolean321 = arg0.aBoolean706;
		this.anInt3860 = arg1;
		this.anInt3859 = arg2;
		this.anInt3856 = 8192;
		this.anInt3864 = 0;
		this.method3437();
	}

	@OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(Lclient!wb;III)V")
	public Class6_Sub10_Sub2(@OriginalArg(0) Class6_Sub12_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass6_Sub12_5 = arg0;
		this.anInt3865 = arg0.anInt9542;
		this.anInt3862 = arg0.anInt9544;
		this.aBoolean321 = arg0.aBoolean706;
		this.anInt3860 = arg1;
		this.anInt3859 = arg2;
		this.anInt3856 = arg3;
		this.anInt3864 = 0;
		this.method3437();
	}

	@OriginalMember(owner = "client!gg", name = "e", descriptor = "()I")
	public synchronized int method3411() {
		return this.anInt3860 < 0 ? -this.anInt3860 : this.anInt3860;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(Z)V")
	public synchronized void method3412() {
		this.anInt3860 = (this.anInt3860 ^ this.anInt3860 >> 31) + (this.anInt3860 >>> 31);
		this.anInt3860 = -this.anInt3860;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method5651(@OriginalArg(0) int arg0) {
		if (this.anInt3861 > 0) {
			if (arg0 >= this.anInt3861) {
				if (this.anInt3859 == Integer.MIN_VALUE) {
					this.anInt3859 = 0;
					this.anInt3855 = this.anInt3858 = this.anInt3863 = 0;
					this.method8151();
					arg0 = this.anInt3861;
				}
				this.anInt3861 = 0;
				this.method3437();
			} else {
				this.anInt3855 += this.anInt3868 * arg0;
				this.anInt3858 += this.anInt3867 * arg0;
				this.anInt3863 += this.anInt3857 * arg0;
				this.anInt3861 -= arg0;
			}
		}
		@Pc(71) Class6_Sub12_Sub1 local71 = (Class6_Sub12_Sub1) super.aClass6_Sub12_5;
		@Pc(76) int local76 = this.anInt3865 << 8;
		@Pc(81) int local81 = this.anInt3862 << 8;
		@Pc(87) int local87 = local71.aByteArray124.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt3866 = 0;
		}
		if (this.anInt3864 < 0) {
			if (this.anInt3860 <= 0) {
				this.method3424();
				this.method8151();
				return;
			}
			this.anInt3864 = 0;
		}
		if (this.anInt3864 >= local87) {
			if (this.anInt3860 >= 0) {
				this.method3424();
				this.method8151();
				return;
			}
			this.anInt3864 = local87 - 1;
		}
		this.anInt3864 += this.anInt3860 * arg0;
		if (this.anInt3866 >= 0) {
			if (this.anInt3866 > 0) {
				if (this.aBoolean321) {
					label125: {
						if (this.anInt3860 < 0) {
							if (this.anInt3864 >= local76) {
								return;
							}
							this.anInt3864 = local76 + local76 - this.anInt3864 - 1;
							this.anInt3860 = -this.anInt3860;
							if (--this.anInt3866 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt3864 < local81) {
								return;
							}
							this.anInt3864 = local81 + local81 - this.anInt3864 - 1;
							this.anInt3860 = -this.anInt3860;
							if (--this.anInt3866 == 0) {
								break;
							}
							if (this.anInt3864 >= local76) {
								return;
							}
							this.anInt3864 = local76 + local76 - this.anInt3864 - 1;
							this.anInt3860 = -this.anInt3860;
						} while (--this.anInt3866 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt3860 < 0) {
						if (this.anInt3864 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt3864 - 1) / local91;
						if (local361 < this.anInt3866) {
							this.anInt3864 += local91 * local361;
							this.anInt3866 -= local361;
							return;
						}
						this.anInt3864 += local91 * this.anInt3866;
						this.anInt3866 = 0;
					} else if (this.anInt3864 >= local81) {
						local361 = (this.anInt3864 - local76) / local91;
						if (local361 < this.anInt3866) {
							this.anInt3864 -= local91 * local361;
							this.anInt3866 -= local361;
							return;
						}
						this.anInt3864 -= local91 * this.anInt3866;
						this.anInt3866 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt3860 < 0) {
				if (this.anInt3864 < 0) {
					this.anInt3864 = -1;
					this.method3424();
					this.method8151();
					return;
				}
			} else if (this.anInt3864 >= local87) {
				this.anInt3864 = local87;
				this.method3424();
				this.method8151();
			}
		} else if (this.aBoolean321) {
			if (this.anInt3860 < 0) {
				if (this.anInt3864 >= local76) {
					return;
				}
				this.anInt3864 = local76 + local76 - this.anInt3864 - 1;
				this.anInt3860 = -this.anInt3860;
			}
			while (this.anInt3864 >= local81) {
				this.anInt3864 = local81 + local81 - this.anInt3864 - 1;
				this.anInt3860 = -this.anInt3860;
				if (this.anInt3864 >= local76) {
					return;
				}
				this.anInt3864 = local76 + local76 - this.anInt3864 - 1;
				this.anInt3860 = -this.anInt3860;
			}
		} else if (this.anInt3860 < 0) {
			if (this.anInt3864 < local76) {
				this.anInt3864 = local81 - (local81 - 1 - this.anInt3864) % local91 - 1;
			}
		} else if (this.anInt3864 >= local81) {
			this.anInt3864 = local76 + (this.anInt3864 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!gg", name = "f", descriptor = "()I")
	public synchronized int method3413() {
		return this.anInt3859 == Integer.MIN_VALUE ? 0 : this.anInt3859;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "()I")
	@Override
	public int method5652() {
		return this.anInt3859 == 0 && this.anInt3861 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "([IIIII)I")
	private int method3415(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt3861 <= 0) {
				if (this.anInt3860 == -256 && (this.anInt3864 & 0xFF) == 0) {
					if (Static83.aBoolean193) {
						return Static587.method3449(((Class6_Sub12_Sub1) super.aClass6_Sub12_5).aByteArray124, arg0, this.anInt3864, arg1, this.anInt3858, this.anInt3863, arg3, arg2, this);
					}
					return Static587.method3445(((Class6_Sub12_Sub1) super.aClass6_Sub12_5).aByteArray124, arg0, this.anInt3864, arg1, this.anInt3855, arg3, arg2, this);
				}
				if (Static83.aBoolean193) {
					return Static587.method3436(((Class6_Sub12_Sub1) super.aClass6_Sub12_5).aByteArray124, arg0, this.anInt3864, arg1, this.anInt3858, this.anInt3863, arg3, arg2, this, this.anInt3860, arg4);
				}
				return Static587.method3425(((Class6_Sub12_Sub1) super.aClass6_Sub12_5).aByteArray124, arg0, this.anInt3864, arg1, this.anInt3855, arg3, arg2, this, this.anInt3860, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt3861;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt3861 += arg1;
			if (this.anInt3860 == -256 && (this.anInt3864 & 0xFF) == 0) {
				if (Static83.aBoolean193) {
					arg1 = Static587.method3417(((Class6_Sub12_Sub1) super.aClass6_Sub12_5).aByteArray124, arg0, this.anInt3864, arg1, this.anInt3858, this.anInt3863, this.anInt3867, this.anInt3857, local5, arg2, this);
				} else {
					arg1 = Static587.method3426(((Class6_Sub12_Sub1) super.aClass6_Sub12_5).aByteArray124, arg0, this.anInt3864, arg1, this.anInt3855, this.anInt3868, local5, arg2, this);
				}
			} else if (Static83.aBoolean193) {
				arg1 = Static587.method3450(((Class6_Sub12_Sub1) super.aClass6_Sub12_5).aByteArray124, arg0, this.anInt3864, arg1, this.anInt3858, this.anInt3863, this.anInt3867, this.anInt3857, local5, arg2, this, this.anInt3860, arg4);
			} else {
				arg1 = Static587.method3447(((Class6_Sub12_Sub1) super.aClass6_Sub12_5).aByteArray124, arg0, this.anInt3864, arg1, this.anInt3855, this.anInt3868, local5, arg2, this, this.anInt3860, arg4);
			}
			this.anInt3861 -= arg1;
			if (this.anInt3861 != 0) {
				return arg1;
			}
		} while (!this.method3448());
		return arg3;
	}

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "([IIIII)I")
	private int method3416(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt3861 <= 0) {
				if (this.anInt3860 == 256 && (this.anInt3864 & 0xFF) == 0) {
					if (Static83.aBoolean193) {
						return Static587.method3427(((Class6_Sub12_Sub1) super.aClass6_Sub12_5).aByteArray124, arg0, this.anInt3864, arg1, this.anInt3858, this.anInt3863, arg3, arg2, this);
					}
					return Static587.method3433(((Class6_Sub12_Sub1) super.aClass6_Sub12_5).aByteArray124, arg0, this.anInt3864, arg1, this.anInt3855, arg3, arg2, this);
				}
				if (Static83.aBoolean193) {
					return Static587.method3443(((Class6_Sub12_Sub1) super.aClass6_Sub12_5).aByteArray124, arg0, this.anInt3864, arg1, this.anInt3858, this.anInt3863, arg3, arg2, this, this.anInt3860, arg4);
				}
				return Static587.method3429(((Class6_Sub12_Sub1) super.aClass6_Sub12_5).aByteArray124, arg0, this.anInt3864, arg1, this.anInt3855, arg3, arg2, this, this.anInt3860, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt3861;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt3861 += arg1;
			if (this.anInt3860 == 256 && (this.anInt3864 & 0xFF) == 0) {
				if (Static83.aBoolean193) {
					arg1 = Static587.method3432(((Class6_Sub12_Sub1) super.aClass6_Sub12_5).aByteArray124, arg0, this.anInt3864, arg1, this.anInt3858, this.anInt3863, this.anInt3867, this.anInt3857, local5, arg2, this);
				} else {
					arg1 = Static587.method3442(((Class6_Sub12_Sub1) super.aClass6_Sub12_5).aByteArray124, arg0, this.anInt3864, arg1, this.anInt3855, this.anInt3868, local5, arg2, this);
				}
			} else if (Static83.aBoolean193) {
				arg1 = Static587.method3418(((Class6_Sub12_Sub1) super.aClass6_Sub12_5).aByteArray124, arg0, this.anInt3864, arg1, this.anInt3858, this.anInt3863, this.anInt3867, this.anInt3857, local5, arg2, this, this.anInt3860, arg4);
			} else {
				arg1 = Static587.method3431(((Class6_Sub12_Sub1) super.aClass6_Sub12_5).aByteArray124, arg0, this.anInt3864, arg1, this.anInt3855, this.anInt3868, local5, arg2, this, this.anInt3860, arg4);
			}
			this.anInt3861 -= arg1;
			if (this.anInt3861 != 0) {
				return arg1;
			}
		} while (!this.method3448());
		return arg3;
	}

	@OriginalMember(owner = "client!gg", name = "c", descriptor = "()Lclient!cd;")
	@Override
	public Class6_Sub10 method5655() {
		return null;
	}

	@OriginalMember(owner = "client!gg", name = "g", descriptor = "()Z")
	public boolean method3419() {
		return this.anInt3864 < 0 || this.anInt3864 >= ((Class6_Sub12_Sub1) super.aClass6_Sub12_5).aByteArray124.length << 8;
	}

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "(II)V")
	public synchronized void method3420(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method3441(arg0, arg1, this.method3446());
	}

	@OriginalMember(owner = "client!gg", name = "h", descriptor = "()Z")
	public boolean method3421() {
		return this.anInt3861 != 0;
	}

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "(I)V")
	public synchronized void method3423(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class6_Sub12_Sub1) super.aClass6_Sub12_5).aByteArray124.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt3864 = arg0;
	}

	@OriginalMember(owner = "client!gg", name = "i", descriptor = "()V")
	private void method3424() {
		if (this.anInt3861 == 0) {
			return;
		}
		if (this.anInt3859 == Integer.MIN_VALUE) {
			this.anInt3859 = 0;
		}
		this.anInt3861 = 0;
		this.method3437();
	}

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method5657(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt3859 == 0 && this.anInt3861 == 0) {
			this.method5651(arg2);
			return;
		}
		@Pc(13) Class6_Sub12_Sub1 local13 = (Class6_Sub12_Sub1) super.aClass6_Sub12_5;
		@Pc(18) int local18 = this.anInt3865 << 8;
		@Pc(23) int local23 = this.anInt3862 << 8;
		@Pc(29) int local29 = local13.aByteArray124.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt3866 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt3864 < 0) {
			if (this.anInt3860 <= 0) {
				this.method3424();
				this.method8151();
				return;
			}
			this.anInt3864 = 0;
		}
		if (this.anInt3864 >= local29) {
			if (this.anInt3860 >= 0) {
				this.method3424();
				this.method8151();
				return;
			}
			this.anInt3864 = local29 - 1;
		}
		if (this.anInt3866 >= 0) {
			if (this.anInt3866 > 0) {
				if (this.aBoolean321) {
					label130: {
						if (this.anInt3860 < 0) {
							local40 = this.method3415(arg0, arg1, local18, local44, local13.aByteArray124[this.anInt3865]);
							if (this.anInt3864 >= local18) {
								return;
							}
							this.anInt3864 = local18 + local18 - this.anInt3864 - 1;
							this.anInt3860 = -this.anInt3860;
							if (--this.anInt3866 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method3416(arg0, local40, local23, local44, local13.aByteArray124[this.anInt3862 - 1]);
							if (this.anInt3864 < local23) {
								return;
							}
							this.anInt3864 = local23 + local23 - this.anInt3864 - 1;
							this.anInt3860 = -this.anInt3860;
							if (--this.anInt3866 == 0) {
								break;
							}
							local40 = this.method3415(arg0, local40, local18, local44, local13.aByteArray124[this.anInt3865]);
							if (this.anInt3864 >= local18) {
								return;
							}
							this.anInt3864 = local18 + local18 - this.anInt3864 - 1;
							this.anInt3860 = -this.anInt3860;
						} while (--this.anInt3866 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt3860 < 0) {
						while (true) {
							local40 = this.method3415(arg0, local40, local18, local44, local13.aByteArray124[this.anInt3862 - 1]);
							if (this.anInt3864 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt3864 - 1) / local33;
							if (local416 >= this.anInt3866) {
								this.anInt3864 += local33 * this.anInt3866;
								this.anInt3866 = 0;
								break;
							}
							this.anInt3864 += local33 * local416;
							this.anInt3866 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method3416(arg0, local40, local23, local44, local13.aByteArray124[this.anInt3865]);
							if (this.anInt3864 < local23) {
								return;
							}
							local416 = (this.anInt3864 - local18) / local33;
							if (local416 >= this.anInt3866) {
								this.anInt3864 -= local33 * this.anInt3866;
								this.anInt3866 = 0;
								break;
							}
							this.anInt3864 -= local33 * local416;
							this.anInt3866 -= local416;
						}
					}
				}
			}
			if (this.anInt3860 < 0) {
				this.method3415(arg0, local40, 0, local44, 0);
				if (this.anInt3864 < 0) {
					this.anInt3864 = -1;
					this.method3424();
					this.method8151();
					return;
				}
			} else {
				this.method3416(arg0, local40, local29, local44, 0);
				if (this.anInt3864 >= local29) {
					this.anInt3864 = local29;
					this.method3424();
					this.method8151();
				}
			}
		} else if (this.aBoolean321) {
			if (this.anInt3860 < 0) {
				local40 = this.method3415(arg0, arg1, local18, local44, local13.aByteArray124[this.anInt3865]);
				if (this.anInt3864 >= local18) {
					return;
				}
				this.anInt3864 = local18 + local18 - this.anInt3864 - 1;
				this.anInt3860 = -this.anInt3860;
			}
			while (true) {
				local40 = this.method3416(arg0, local40, local23, local44, local13.aByteArray124[this.anInt3862 - 1]);
				if (this.anInt3864 < local23) {
					return;
				}
				this.anInt3864 = local23 + local23 - this.anInt3864 - 1;
				this.anInt3860 = -this.anInt3860;
				local40 = this.method3415(arg0, local40, local18, local44, local13.aByteArray124[this.anInt3865]);
				if (this.anInt3864 >= local18) {
					return;
				}
				this.anInt3864 = local18 + local18 - this.anInt3864 - 1;
				this.anInt3860 = -this.anInt3860;
			}
		} else if (this.anInt3860 < 0) {
			while (true) {
				local40 = this.method3415(arg0, local40, local18, local44, local13.aByteArray124[this.anInt3862 - 1]);
				if (this.anInt3864 >= local18) {
					return;
				}
				this.anInt3864 = local23 - (local23 - 1 - this.anInt3864) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method3416(arg0, local40, local23, local44, local13.aByteArray124[this.anInt3865]);
				if (this.anInt3864 < local23) {
					return;
				}
				this.anInt3864 = local18 + (this.anInt3864 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!gg", name = "c", descriptor = "(I)V")
	public synchronized void method3428(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method3440();
			this.method8151();
		} else if (this.anInt3858 == 0 && this.anInt3863 == 0) {
			this.anInt3861 = 0;
			this.anInt3859 = 0;
			this.anInt3855 = 0;
			this.method8151();
		} else {
			@Pc(31) int local31 = -this.anInt3855;
			if (this.anInt3855 > local31) {
				local31 = this.anInt3855;
			}
			if (-this.anInt3858 > local31) {
				local31 = -this.anInt3858;
			}
			if (this.anInt3858 > local31) {
				local31 = this.anInt3858;
			}
			if (-this.anInt3863 > local31) {
				local31 = -this.anInt3863;
			}
			if (this.anInt3863 > local31) {
				local31 = this.anInt3863;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt3861 = arg0;
			this.anInt3859 = Integer.MIN_VALUE;
			this.anInt3868 = -this.anInt3855 / arg0;
			this.anInt3867 = -this.anInt3858 / arg0;
			this.anInt3857 = -this.anInt3863 / arg0;
		}
	}

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "()I")
	@Override
	public int method5654() {
		@Pc(6) int local6 = this.anInt3855 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt3866 == 0) {
			local6 -= local6 * this.anInt3864 / (((Class6_Sub12_Sub1) super.aClass6_Sub12_5).aByteArray124.length << 8);
		} else if (this.anInt3866 >= 0) {
			local6 -= local6 * this.anInt3865 / ((Class6_Sub12_Sub1) super.aClass6_Sub12_5).aByteArray124.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!gg", name = "c", descriptor = "(II)V")
	private synchronized void method3430(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3859 = arg0;
		this.anInt3856 = arg1;
		this.anInt3861 = 0;
		this.method3437();
	}

	@OriginalMember(owner = "client!gg", name = "d", descriptor = "()Lclient!cd;")
	@Override
	public Class6_Sub10 method5656() {
		return null;
	}

	@OriginalMember(owner = "client!gg", name = "d", descriptor = "(I)V")
	public synchronized void method3434(@OriginalArg(0) int arg0) {
		this.anInt3866 = arg0;
	}

	@OriginalMember(owner = "client!gg", name = "h", descriptor = "(I)V")
	public synchronized void method3435(@OriginalArg(0) int arg0) {
		this.method3430(arg0 << 6, this.method3446());
	}

	@OriginalMember(owner = "client!gg", name = "j", descriptor = "()V")
	private void method3437() {
		this.anInt3855 = this.anInt3859;
		this.anInt3858 = Static587.method3414(this.anInt3859, this.anInt3856);
		this.anInt3863 = Static587.method3439(this.anInt3859, this.anInt3856);
	}

	@OriginalMember(owner = "client!gg", name = "i", descriptor = "(I)V")
	public synchronized void method3438(@OriginalArg(0) int arg0) {
		if (this.anInt3860 < 0) {
			this.anInt3860 = -arg0;
		} else {
			this.anInt3860 = arg0;
		}
	}

	@OriginalMember(owner = "client!gg", name = "j", descriptor = "(I)V")
	private synchronized void method3440() {
		this.method3430(0, this.method3446());
	}

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "(III)V")
	public synchronized void method3441(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method3430(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static587.method3414(arg1, arg2);
		@Pc(14) int local14 = Static587.method3439(arg1, arg2);
		if (this.anInt3858 == local10 && this.anInt3863 == local14) {
			this.anInt3861 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt3855;
		if (this.anInt3855 - arg1 > local31) {
			local31 = this.anInt3855 - arg1;
		}
		if (local10 - this.anInt3858 > local31) {
			local31 = local10 - this.anInt3858;
		}
		if (this.anInt3858 - local10 > local31) {
			local31 = this.anInt3858 - local10;
		}
		if (local14 - this.anInt3863 > local31) {
			local31 = local14 - this.anInt3863;
		}
		if (this.anInt3863 - local14 > local31) {
			local31 = this.anInt3863 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt3861 = arg0;
		this.anInt3859 = arg1;
		this.anInt3856 = arg2;
		this.anInt3868 = (arg1 - this.anInt3855) / arg0;
		this.anInt3867 = (local10 - this.anInt3858) / arg0;
		this.anInt3857 = (local14 - this.anInt3863) / arg0;
	}

	@OriginalMember(owner = "client!gg", name = "k", descriptor = "()I")
	public synchronized int method3446() {
		return this.anInt3856 < 0 ? -1 : this.anInt3856;
	}

	@OriginalMember(owner = "client!gg", name = "l", descriptor = "()Z")
	private boolean method3448() {
		@Pc(2) int local2 = this.anInt3859;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static587.method3414(local2, this.anInt3856);
			local8 = Static587.method3439(local2, this.anInt3856);
		}
		if (this.anInt3855 != local2 || this.anInt3858 != local10 || this.anInt3863 != local8) {
			if (this.anInt3855 < local2) {
				this.anInt3868 = 1;
				this.anInt3861 = local2 - this.anInt3855;
			} else if (this.anInt3855 > local2) {
				this.anInt3868 = -1;
				this.anInt3861 = this.anInt3855 - local2;
			} else {
				this.anInt3868 = 0;
			}
			if (this.anInt3858 < local10) {
				this.anInt3867 = 1;
				if (this.anInt3861 == 0 || this.anInt3861 > local10 - this.anInt3858) {
					this.anInt3861 = local10 - this.anInt3858;
				}
			} else if (this.anInt3858 > local10) {
				this.anInt3867 = -1;
				if (this.anInt3861 == 0 || this.anInt3861 > this.anInt3858 - local10) {
					this.anInt3861 = this.anInt3858 - local10;
				}
			} else {
				this.anInt3867 = 0;
			}
			if (this.anInt3863 < local8) {
				this.anInt3857 = 1;
				if (this.anInt3861 == 0 || this.anInt3861 > local8 - this.anInt3863) {
					this.anInt3861 = local8 - this.anInt3863;
				}
			} else if (this.anInt3863 > local8) {
				this.anInt3857 = -1;
				if (this.anInt3861 == 0 || this.anInt3861 > this.anInt3863 - local8) {
					this.anInt3861 = this.anInt3863 - local8;
				}
			} else {
				this.anInt3857 = 0;
			}
			return false;
		} else if (this.anInt3859 == Integer.MIN_VALUE) {
			this.anInt3859 = 0;
			this.anInt3855 = this.anInt3858 = this.anInt3863 = 0;
			this.method8151();
			return true;
		} else {
			this.method3437();
			return false;
		}
	}
}
