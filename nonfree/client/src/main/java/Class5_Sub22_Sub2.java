import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lm")
public final class Class5_Sub22_Sub2 extends Class5_Sub22 {

	@OriginalMember(owner = "client!lm", name = "q", descriptor = "I")
	public int anInt3910;

	@OriginalMember(owner = "client!lm", name = "s", descriptor = "I")
	public int anInt3912;

	@OriginalMember(owner = "client!lm", name = "t", descriptor = "I")
	public int anInt3913;

	@OriginalMember(owner = "client!lm", name = "v", descriptor = "I")
	public int anInt3915;

	@OriginalMember(owner = "client!lm", name = "w", descriptor = "I")
	private int anInt3916;

	@OriginalMember(owner = "client!lm", name = "x", descriptor = "I")
	public int anInt3917;

	@OriginalMember(owner = "client!lm", name = "y", descriptor = "I")
	private int anInt3918;

	@OriginalMember(owner = "client!lm", name = "C", descriptor = "I")
	public int anInt3922;

	@OriginalMember(owner = "client!lm", name = "u", descriptor = "I")
	private final int anInt3914;

	@OriginalMember(owner = "client!lm", name = "p", descriptor = "I")
	private final int anInt3909;

	@OriginalMember(owner = "client!lm", name = "o", descriptor = "Z")
	private final boolean aBoolean249;

	@OriginalMember(owner = "client!lm", name = "B", descriptor = "I")
	private int anInt3921;

	@OriginalMember(owner = "client!lm", name = "z", descriptor = "I")
	private int anInt3919;

	@OriginalMember(owner = "client!lm", name = "r", descriptor = "I")
	private int anInt3911;

	@OriginalMember(owner = "client!lm", name = "A", descriptor = "I")
	public int anInt3920;

	@OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(Lclient!rm;II)V")
	public Class5_Sub22_Sub2(@OriginalArg(0) Class5_Sub5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass5_Sub5_5 = arg0;
		this.anInt3914 = arg0.anInt5863;
		this.anInt3909 = arg0.anInt5862;
		this.aBoolean249 = arg0.aBoolean396;
		this.anInt3921 = arg1;
		this.anInt3919 = arg2;
		this.anInt3911 = 8192;
		this.anInt3920 = 0;
		this.method3136();
	}

	@OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(Lclient!rm;III)V")
	public Class5_Sub22_Sub2(@OriginalArg(0) Class5_Sub5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass5_Sub5_5 = arg0;
		this.anInt3914 = arg0.anInt5863;
		this.anInt3909 = arg0.anInt5862;
		this.aBoolean249 = arg0.aBoolean396;
		this.anInt3921 = arg1;
		this.anInt3919 = arg2;
		this.anInt3911 = arg3;
		this.anInt3920 = 0;
		this.method3136();
	}

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "()Lclient!ms;")
	@Override
	public Class5_Sub22 method5929() {
		return null;
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method5930(@OriginalArg(0) int arg0) {
		if (this.anInt3916 > 0) {
			if (arg0 >= this.anInt3916) {
				if (this.anInt3919 == Integer.MIN_VALUE) {
					this.anInt3919 = 0;
					this.anInt3912 = this.anInt3917 = this.anInt3913 = 0;
					this.method6003();
					arg0 = this.anInt3916;
				}
				this.anInt3916 = 0;
				this.method3136();
			} else {
				this.anInt3912 += this.anInt3915 * arg0;
				this.anInt3917 += this.anInt3910 * arg0;
				this.anInt3913 += this.anInt3922 * arg0;
				this.anInt3916 -= arg0;
			}
		}
		@Pc(71) Class5_Sub5_Sub1 local71 = (Class5_Sub5_Sub1) super.aClass5_Sub5_5;
		@Pc(76) int local76 = this.anInt3914 << 8;
		@Pc(81) int local81 = this.anInt3909 << 8;
		@Pc(87) int local87 = local71.aByteArray74.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt3918 = 0;
		}
		if (this.anInt3920 < 0) {
			if (this.anInt3921 <= 0) {
				this.method3131();
				this.method6003();
				return;
			}
			this.anInt3920 = 0;
		}
		if (this.anInt3920 >= local87) {
			if (this.anInt3921 >= 0) {
				this.method3131();
				this.method6003();
				return;
			}
			this.anInt3920 = local87 - 1;
		}
		this.anInt3920 += this.anInt3921 * arg0;
		if (this.anInt3918 >= 0) {
			if (this.anInt3918 > 0) {
				if (this.aBoolean249) {
					label125: {
						if (this.anInt3921 < 0) {
							if (this.anInt3920 >= local76) {
								return;
							}
							this.anInt3920 = local76 + local76 - this.anInt3920 - 1;
							this.anInt3921 = -this.anInt3921;
							if (--this.anInt3918 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt3920 < local81) {
								return;
							}
							this.anInt3920 = local81 + local81 - this.anInt3920 - 1;
							this.anInt3921 = -this.anInt3921;
							if (--this.anInt3918 == 0) {
								break;
							}
							if (this.anInt3920 >= local76) {
								return;
							}
							this.anInt3920 = local76 + local76 - this.anInt3920 - 1;
							this.anInt3921 = -this.anInt3921;
						} while (--this.anInt3918 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt3921 < 0) {
						if (this.anInt3920 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt3920 - 1) / local91;
						if (local361 < this.anInt3918) {
							this.anInt3920 += local91 * local361;
							this.anInt3918 -= local361;
							return;
						}
						this.anInt3920 += local91 * this.anInt3918;
						this.anInt3918 = 0;
					} else if (this.anInt3920 >= local81) {
						local361 = (this.anInt3920 - local76) / local91;
						if (local361 < this.anInt3918) {
							this.anInt3920 -= local91 * local361;
							this.anInt3918 -= local361;
							return;
						}
						this.anInt3920 -= local91 * this.anInt3918;
						this.anInt3918 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt3921 < 0) {
				if (this.anInt3920 < 0) {
					this.anInt3920 = -1;
					this.method3131();
					this.method6003();
					return;
				}
			} else if (this.anInt3920 >= local87) {
				this.anInt3920 = local87;
				this.method3131();
				this.method6003();
			}
		} else if (this.aBoolean249) {
			if (this.anInt3921 < 0) {
				if (this.anInt3920 >= local76) {
					return;
				}
				this.anInt3920 = local76 + local76 - this.anInt3920 - 1;
				this.anInt3921 = -this.anInt3921;
			}
			while (this.anInt3920 >= local81) {
				this.anInt3920 = local81 + local81 - this.anInt3920 - 1;
				this.anInt3921 = -this.anInt3921;
				if (this.anInt3920 >= local76) {
					return;
				}
				this.anInt3920 = local76 + local76 - this.anInt3920 - 1;
				this.anInt3921 = -this.anInt3921;
			}
		} else if (this.anInt3921 < 0) {
			if (this.anInt3920 < local76) {
				this.anInt3920 = local81 - (local81 - 1 - this.anInt3920) % local91 - 1;
			}
		} else if (this.anInt3920 >= local81) {
			this.anInt3920 = local76 + (this.anInt3920 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "(I)V")
	public synchronized void method3100(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method3105();
			this.method6003();
		} else if (this.anInt3917 == 0 && this.anInt3913 == 0) {
			this.anInt3916 = 0;
			this.anInt3919 = 0;
			this.anInt3912 = 0;
			this.method6003();
		} else {
			@Pc(31) int local31 = -this.anInt3912;
			if (this.anInt3912 > local31) {
				local31 = this.anInt3912;
			}
			if (-this.anInt3917 > local31) {
				local31 = -this.anInt3917;
			}
			if (this.anInt3917 > local31) {
				local31 = this.anInt3917;
			}
			if (-this.anInt3913 > local31) {
				local31 = -this.anInt3913;
			}
			if (this.anInt3913 > local31) {
				local31 = this.anInt3913;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt3916 = arg0;
			this.anInt3919 = Integer.MIN_VALUE;
			this.anInt3915 = -this.anInt3912 / arg0;
			this.anInt3910 = -this.anInt3917 / arg0;
			this.anInt3922 = -this.anInt3913 / arg0;
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "()Lclient!ms;")
	@Override
	public Class5_Sub22 method5928() {
		return null;
	}

	@OriginalMember(owner = "client!lm", name = "f", descriptor = "(I)V")
	private synchronized void method3105() {
		this.method3113(0, this.method3118());
	}

	@OriginalMember(owner = "client!lm", name = "e", descriptor = "()Z")
	public boolean method3108() {
		return this.anInt3916 != 0;
	}

	@OriginalMember(owner = "client!lm", name = "g", descriptor = "(I)V")
	public synchronized void method3111(@OriginalArg(0) int arg0) {
		this.method3113(arg0 << 6, this.method3118());
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "([IIIII)I")
	private int method3112(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt3916 <= 0) {
				if (this.anInt3921 == 256 && (this.anInt3920 & 0xFF) == 0) {
					if (Static335.aBoolean372) {
						return Static467.method3132(((Class5_Sub5_Sub1) super.aClass5_Sub5_5).aByteArray74, arg0, this.anInt3920, arg1, this.anInt3917, this.anInt3913, arg3, arg2, this);
					}
					return Static467.method3104(((Class5_Sub5_Sub1) super.aClass5_Sub5_5).aByteArray74, arg0, this.anInt3920, arg1, this.anInt3912, arg3, arg2, this);
				}
				if (Static335.aBoolean372) {
					return Static467.method3106(((Class5_Sub5_Sub1) super.aClass5_Sub5_5).aByteArray74, arg0, this.anInt3920, arg1, this.anInt3917, this.anInt3913, arg3, arg2, this, this.anInt3921, arg4);
				}
				return Static467.method3102(((Class5_Sub5_Sub1) super.aClass5_Sub5_5).aByteArray74, arg0, this.anInt3920, arg1, this.anInt3912, arg3, arg2, this, this.anInt3921, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt3916;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt3916 += arg1;
			if (this.anInt3921 == 256 && (this.anInt3920 & 0xFF) == 0) {
				if (Static335.aBoolean372) {
					arg1 = Static467.method3107(((Class5_Sub5_Sub1) super.aClass5_Sub5_5).aByteArray74, arg0, this.anInt3920, arg1, this.anInt3917, this.anInt3913, this.anInt3910, this.anInt3922, local5, arg2, this);
				} else {
					arg1 = Static467.method3097(((Class5_Sub5_Sub1) super.aClass5_Sub5_5).aByteArray74, arg0, this.anInt3920, arg1, this.anInt3912, this.anInt3915, local5, arg2, this);
				}
			} else if (Static335.aBoolean372) {
				arg1 = Static467.method3109(((Class5_Sub5_Sub1) super.aClass5_Sub5_5).aByteArray74, arg0, this.anInt3920, arg1, this.anInt3917, this.anInt3913, this.anInt3910, this.anInt3922, local5, arg2, this, this.anInt3921, arg4);
			} else {
				arg1 = Static467.method3110(((Class5_Sub5_Sub1) super.aClass5_Sub5_5).aByteArray74, arg0, this.anInt3920, arg1, this.anInt3912, this.anInt3915, local5, arg2, this, this.anInt3921, arg4);
			}
			this.anInt3916 -= arg1;
			if (this.anInt3916 != 0) {
				return arg1;
			}
		} while (!this.method3134());
		return arg3;
	}

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "(II)V")
	private synchronized void method3113(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3919 = arg0;
		this.anInt3911 = arg1;
		this.anInt3916 = 0;
		this.method3136();
	}

	@OriginalMember(owner = "client!lm", name = "f", descriptor = "()I")
	public synchronized int method3114() {
		return this.anInt3921 < 0 ? -this.anInt3921 : this.anInt3921;
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(Z)V")
	public synchronized void method3115() {
		this.anInt3921 = (this.anInt3921 ^ this.anInt3921 >> 31) + (this.anInt3921 >>> 31);
		this.anInt3921 = -this.anInt3921;
	}

	@OriginalMember(owner = "client!lm", name = "g", descriptor = "()Z")
	public boolean method3116() {
		return this.anInt3920 < 0 || this.anInt3920 >= ((Class5_Sub5_Sub1) super.aClass5_Sub5_5).aByteArray74.length << 8;
	}

	@OriginalMember(owner = "client!lm", name = "h", descriptor = "()I")
	public synchronized int method3118() {
		return this.anInt3911 < 0 ? -1 : this.anInt3911;
	}

	@OriginalMember(owner = "client!lm", name = "i", descriptor = "()I")
	public synchronized int method3119() {
		return this.anInt3919 == Integer.MIN_VALUE ? 0 : this.anInt3919;
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(III)V")
	public synchronized void method3122(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method3113(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static467.method3130(arg1, arg2);
		@Pc(14) int local14 = Static467.method3101(arg1, arg2);
		if (this.anInt3917 == local10 && this.anInt3913 == local14) {
			this.anInt3916 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt3912;
		if (this.anInt3912 - arg1 > local31) {
			local31 = this.anInt3912 - arg1;
		}
		if (local10 - this.anInt3917 > local31) {
			local31 = local10 - this.anInt3917;
		}
		if (this.anInt3917 - local10 > local31) {
			local31 = this.anInt3917 - local10;
		}
		if (local14 - this.anInt3913 > local31) {
			local31 = local14 - this.anInt3913;
		}
		if (this.anInt3913 - local14 > local31) {
			local31 = this.anInt3913 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt3916 = arg0;
		this.anInt3919 = arg1;
		this.anInt3911 = arg2;
		this.anInt3915 = (arg1 - this.anInt3912) / arg0;
		this.anInt3910 = (local10 - this.anInt3917) / arg0;
		this.anInt3922 = (local14 - this.anInt3913) / arg0;
	}

	@OriginalMember(owner = "client!lm", name = "h", descriptor = "(I)V")
	public synchronized void method3125(@OriginalArg(0) int arg0) {
		if (this.anInt3921 < 0) {
			this.anInt3921 = -arg0;
		} else {
			this.anInt3921 = arg0;
		}
	}

	@OriginalMember(owner = "client!lm", name = "c", descriptor = "(II)V")
	public synchronized void method3126(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method3122(arg0, arg1, this.method3118());
	}

	@OriginalMember(owner = "client!lm", name = "d", descriptor = "()I")
	@Override
	public int method5933() {
		@Pc(6) int local6 = this.anInt3912 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt3918 == 0) {
			local6 -= local6 * this.anInt3920 / (((Class5_Sub5_Sub1) super.aClass5_Sub5_5).aByteArray74.length << 8);
		} else if (this.anInt3918 >= 0) {
			local6 -= local6 * this.anInt3914 / ((Class5_Sub5_Sub1) super.aClass5_Sub5_5).aByteArray74.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!lm", name = "i", descriptor = "(I)V")
	public synchronized void method3128(@OriginalArg(0) int arg0) {
		this.anInt3918 = arg0;
	}

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "([IIIII)I")
	private int method3129(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt3916 <= 0) {
				if (this.anInt3921 == -256 && (this.anInt3920 & 0xFF) == 0) {
					if (Static335.aBoolean372) {
						return Static467.method3124(((Class5_Sub5_Sub1) super.aClass5_Sub5_5).aByteArray74, arg0, this.anInt3920, arg1, this.anInt3917, this.anInt3913, arg3, arg2, this);
					}
					return Static467.method3123(((Class5_Sub5_Sub1) super.aClass5_Sub5_5).aByteArray74, arg0, this.anInt3920, arg1, this.anInt3912, arg3, arg2, this);
				}
				if (Static335.aBoolean372) {
					return Static467.method3121(((Class5_Sub5_Sub1) super.aClass5_Sub5_5).aByteArray74, arg0, this.anInt3920, arg1, this.anInt3917, this.anInt3913, arg3, arg2, this, this.anInt3921, arg4);
				}
				return Static467.method3127(((Class5_Sub5_Sub1) super.aClass5_Sub5_5).aByteArray74, arg0, this.anInt3920, arg1, this.anInt3912, arg3, arg2, this, this.anInt3921, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt3916;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt3916 += arg1;
			if (this.anInt3921 == -256 && (this.anInt3920 & 0xFF) == 0) {
				if (Static335.aBoolean372) {
					arg1 = Static467.method3117(((Class5_Sub5_Sub1) super.aClass5_Sub5_5).aByteArray74, arg0, this.anInt3920, arg1, this.anInt3917, this.anInt3913, this.anInt3910, this.anInt3922, local5, arg2, this);
				} else {
					arg1 = Static467.method3120(((Class5_Sub5_Sub1) super.aClass5_Sub5_5).aByteArray74, arg0, this.anInt3920, arg1, this.anInt3912, this.anInt3915, local5, arg2, this);
				}
			} else if (Static335.aBoolean372) {
				arg1 = Static467.method3098(((Class5_Sub5_Sub1) super.aClass5_Sub5_5).aByteArray74, arg0, this.anInt3920, arg1, this.anInt3917, this.anInt3913, this.anInt3910, this.anInt3922, local5, arg2, this, this.anInt3921, arg4);
			} else {
				arg1 = Static467.method3099(((Class5_Sub5_Sub1) super.aClass5_Sub5_5).aByteArray74, arg0, this.anInt3920, arg1, this.anInt3912, this.anInt3915, local5, arg2, this, this.anInt3921, arg4);
			}
			this.anInt3916 -= arg1;
			if (this.anInt3916 != 0) {
				return arg1;
			}
		} while (!this.method3134());
		return arg3;
	}

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method5934(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt3919 == 0 && this.anInt3916 == 0) {
			this.method5930(arg2);
			return;
		}
		@Pc(13) Class5_Sub5_Sub1 local13 = (Class5_Sub5_Sub1) super.aClass5_Sub5_5;
		@Pc(18) int local18 = this.anInt3914 << 8;
		@Pc(23) int local23 = this.anInt3909 << 8;
		@Pc(29) int local29 = local13.aByteArray74.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt3918 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt3920 < 0) {
			if (this.anInt3921 <= 0) {
				this.method3131();
				this.method6003();
				return;
			}
			this.anInt3920 = 0;
		}
		if (this.anInt3920 >= local29) {
			if (this.anInt3921 >= 0) {
				this.method3131();
				this.method6003();
				return;
			}
			this.anInt3920 = local29 - 1;
		}
		if (this.anInt3918 >= 0) {
			if (this.anInt3918 > 0) {
				if (this.aBoolean249) {
					label130: {
						if (this.anInt3921 < 0) {
							local40 = this.method3129(arg0, arg1, local18, local44, local13.aByteArray74[this.anInt3914]);
							if (this.anInt3920 >= local18) {
								return;
							}
							this.anInt3920 = local18 + local18 - this.anInt3920 - 1;
							this.anInt3921 = -this.anInt3921;
							if (--this.anInt3918 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method3112(arg0, local40, local23, local44, local13.aByteArray74[this.anInt3909 - 1]);
							if (this.anInt3920 < local23) {
								return;
							}
							this.anInt3920 = local23 + local23 - this.anInt3920 - 1;
							this.anInt3921 = -this.anInt3921;
							if (--this.anInt3918 == 0) {
								break;
							}
							local40 = this.method3129(arg0, local40, local18, local44, local13.aByteArray74[this.anInt3914]);
							if (this.anInt3920 >= local18) {
								return;
							}
							this.anInt3920 = local18 + local18 - this.anInt3920 - 1;
							this.anInt3921 = -this.anInt3921;
						} while (--this.anInt3918 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt3921 < 0) {
						while (true) {
							local40 = this.method3129(arg0, local40, local18, local44, local13.aByteArray74[this.anInt3909 - 1]);
							if (this.anInt3920 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt3920 - 1) / local33;
							if (local416 >= this.anInt3918) {
								this.anInt3920 += local33 * this.anInt3918;
								this.anInt3918 = 0;
								break;
							}
							this.anInt3920 += local33 * local416;
							this.anInt3918 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method3112(arg0, local40, local23, local44, local13.aByteArray74[this.anInt3914]);
							if (this.anInt3920 < local23) {
								return;
							}
							local416 = (this.anInt3920 - local18) / local33;
							if (local416 >= this.anInt3918) {
								this.anInt3920 -= local33 * this.anInt3918;
								this.anInt3918 = 0;
								break;
							}
							this.anInt3920 -= local33 * local416;
							this.anInt3918 -= local416;
						}
					}
				}
			}
			if (this.anInt3921 < 0) {
				this.method3129(arg0, local40, 0, local44, 0);
				if (this.anInt3920 < 0) {
					this.anInt3920 = -1;
					this.method3131();
					this.method6003();
					return;
				}
			} else {
				this.method3112(arg0, local40, local29, local44, 0);
				if (this.anInt3920 >= local29) {
					this.anInt3920 = local29;
					this.method3131();
					this.method6003();
				}
			}
		} else if (this.aBoolean249) {
			if (this.anInt3921 < 0) {
				local40 = this.method3129(arg0, arg1, local18, local44, local13.aByteArray74[this.anInt3914]);
				if (this.anInt3920 >= local18) {
					return;
				}
				this.anInt3920 = local18 + local18 - this.anInt3920 - 1;
				this.anInt3921 = -this.anInt3921;
			}
			while (true) {
				local40 = this.method3112(arg0, local40, local23, local44, local13.aByteArray74[this.anInt3909 - 1]);
				if (this.anInt3920 < local23) {
					return;
				}
				this.anInt3920 = local23 + local23 - this.anInt3920 - 1;
				this.anInt3921 = -this.anInt3921;
				local40 = this.method3129(arg0, local40, local18, local44, local13.aByteArray74[this.anInt3914]);
				if (this.anInt3920 >= local18) {
					return;
				}
				this.anInt3920 = local18 + local18 - this.anInt3920 - 1;
				this.anInt3921 = -this.anInt3921;
			}
		} else if (this.anInt3921 < 0) {
			while (true) {
				local40 = this.method3129(arg0, local40, local18, local44, local13.aByteArray74[this.anInt3909 - 1]);
				if (this.anInt3920 >= local18) {
					return;
				}
				this.anInt3920 = local23 - (local23 - 1 - this.anInt3920) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method3112(arg0, local40, local23, local44, local13.aByteArray74[this.anInt3914]);
				if (this.anInt3920 < local23) {
					return;
				}
				this.anInt3920 = local18 + (this.anInt3920 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!lm", name = "j", descriptor = "()V")
	private void method3131() {
		if (this.anInt3916 == 0) {
			return;
		}
		if (this.anInt3919 == Integer.MIN_VALUE) {
			this.anInt3919 = 0;
		}
		this.anInt3916 = 0;
		this.method3136();
	}

	@OriginalMember(owner = "client!lm", name = "j", descriptor = "(I)V")
	public synchronized void method3133(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class5_Sub5_Sub1) super.aClass5_Sub5_5).aByteArray74.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt3920 = arg0;
	}

	@OriginalMember(owner = "client!lm", name = "k", descriptor = "()Z")
	private boolean method3134() {
		@Pc(2) int local2 = this.anInt3919;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static467.method3130(local2, this.anInt3911);
			local8 = Static467.method3101(local2, this.anInt3911);
		}
		if (this.anInt3912 != local2 || this.anInt3917 != local10 || this.anInt3913 != local8) {
			if (this.anInt3912 < local2) {
				this.anInt3915 = 1;
				this.anInt3916 = local2 - this.anInt3912;
			} else if (this.anInt3912 > local2) {
				this.anInt3915 = -1;
				this.anInt3916 = this.anInt3912 - local2;
			} else {
				this.anInt3915 = 0;
			}
			if (this.anInt3917 < local10) {
				this.anInt3910 = 1;
				if (this.anInt3916 == 0 || this.anInt3916 > local10 - this.anInt3917) {
					this.anInt3916 = local10 - this.anInt3917;
				}
			} else if (this.anInt3917 > local10) {
				this.anInt3910 = -1;
				if (this.anInt3916 == 0 || this.anInt3916 > this.anInt3917 - local10) {
					this.anInt3916 = this.anInt3917 - local10;
				}
			} else {
				this.anInt3910 = 0;
			}
			if (this.anInt3913 < local8) {
				this.anInt3922 = 1;
				if (this.anInt3916 == 0 || this.anInt3916 > local8 - this.anInt3913) {
					this.anInt3916 = local8 - this.anInt3913;
				}
			} else if (this.anInt3913 > local8) {
				this.anInt3922 = -1;
				if (this.anInt3916 == 0 || this.anInt3916 > this.anInt3913 - local8) {
					this.anInt3916 = this.anInt3913 - local8;
				}
			} else {
				this.anInt3922 = 0;
			}
			return false;
		} else if (this.anInt3919 == Integer.MIN_VALUE) {
			this.anInt3919 = 0;
			this.anInt3912 = this.anInt3917 = this.anInt3913 = 0;
			this.method6003();
			return true;
		} else {
			this.method3136();
			return false;
		}
	}

	@OriginalMember(owner = "client!lm", name = "c", descriptor = "()I")
	@Override
	public int method5931() {
		return this.anInt3919 == 0 && this.anInt3916 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!lm", name = "l", descriptor = "()V")
	private void method3136() {
		this.anInt3912 = this.anInt3919;
		this.anInt3917 = Static467.method3130(this.anInt3919, this.anInt3911);
		this.anInt3913 = Static467.method3101(this.anInt3919, this.anInt3911);
	}
}
