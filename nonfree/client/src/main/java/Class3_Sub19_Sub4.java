import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wb")
public final class Class3_Sub19_Sub4 extends Class3_Sub19 {

	@OriginalMember(owner = "client!wb", name = "u", descriptor = "I")
	public int anInt4185;

	@OriginalMember(owner = "client!wb", name = "v", descriptor = "I")
	public int anInt4186;

	@OriginalMember(owner = "client!wb", name = "x", descriptor = "I")
	public int anInt4187;

	@OriginalMember(owner = "client!wb", name = "y", descriptor = "I")
	public int anInt4188;

	@OriginalMember(owner = "client!wb", name = "z", descriptor = "I")
	public int anInt4189;

	@OriginalMember(owner = "client!wb", name = "A", descriptor = "I")
	public int anInt4190;

	@OriginalMember(owner = "client!wb", name = "D", descriptor = "I")
	private int anInt4193;

	@OriginalMember(owner = "client!wb", name = "F", descriptor = "I")
	private int anInt4195;

	@OriginalMember(owner = "client!wb", name = "C", descriptor = "I")
	private final int anInt4192;

	@OriginalMember(owner = "client!wb", name = "G", descriptor = "I")
	private final int anInt4196;

	@OriginalMember(owner = "client!wb", name = "w", descriptor = "Z")
	private final boolean aBoolean188;

	@OriginalMember(owner = "client!wb", name = "E", descriptor = "I")
	private int anInt4194;

	@OriginalMember(owner = "client!wb", name = "B", descriptor = "I")
	private int anInt4191;

	@OriginalMember(owner = "client!wb", name = "H", descriptor = "I")
	private int anInt4197;

	@OriginalMember(owner = "client!wb", name = "t", descriptor = "I")
	public int anInt4184;

	@OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(Lclient!tb;II)V")
	public Class3_Sub19_Sub4(@OriginalArg(0) Class3_Sub24_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass3_Sub24_5 = arg0;
		this.anInt4192 = arg0.anInt3686;
		this.anInt4196 = arg0.anInt3685;
		this.aBoolean188 = arg0.aBoolean167;
		this.anInt4194 = arg1;
		this.anInt4191 = arg2;
		this.anInt4197 = 8192;
		this.anInt4184 = 0;
		this.method3258();
	}

	@OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(Lclient!tb;III)V")
	public Class3_Sub19_Sub4(@OriginalArg(0) Class3_Sub24_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass3_Sub24_5 = arg0;
		this.anInt4192 = arg0.anInt3686;
		this.anInt4196 = arg0.anInt3685;
		this.aBoolean188 = arg0.aBoolean167;
		this.anInt4194 = arg1;
		this.anInt4191 = arg2;
		this.anInt4197 = arg3;
		this.anInt4184 = 0;
		this.method3258();
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "([IIIII)I")
	private int method3251(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt4195 <= 0) {
				if (this.anInt4194 == -256 && (this.anInt4184 & 0xFF) == 0) {
					if (Static150.aBoolean144) {
						return Static220.method3288(((Class3_Sub24_Sub1) super.aClass3_Sub24_5).aByteArray47, arg0, this.anInt4184, arg1, this.anInt4188, this.anInt4185, arg3, arg2, this);
					}
					return Static220.method3261(((Class3_Sub24_Sub1) super.aClass3_Sub24_5).aByteArray47, arg0, this.anInt4184, arg1, this.anInt4187, arg3, arg2, this);
				}
				if (Static150.aBoolean144) {
					return Static220.method3279(((Class3_Sub24_Sub1) super.aClass3_Sub24_5).aByteArray47, arg0, this.anInt4184, arg1, this.anInt4188, this.anInt4185, arg3, arg2, this, this.anInt4194, arg4);
				}
				return Static220.method3283(((Class3_Sub24_Sub1) super.aClass3_Sub24_5).aByteArray47, arg0, this.anInt4184, arg1, this.anInt4187, arg3, arg2, this, this.anInt4194, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt4195;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt4195 += arg1;
			if (this.anInt4194 == -256 && (this.anInt4184 & 0xFF) == 0) {
				if (Static150.aBoolean144) {
					arg1 = Static220.method3287(((Class3_Sub24_Sub1) super.aClass3_Sub24_5).aByteArray47, arg0, this.anInt4184, arg1, this.anInt4188, this.anInt4185, this.anInt4186, this.anInt4190, local5, arg2, this);
				} else {
					arg1 = Static220.method3277(((Class3_Sub24_Sub1) super.aClass3_Sub24_5).aByteArray47, arg0, this.anInt4184, arg1, this.anInt4187, this.anInt4189, local5, arg2, this);
				}
			} else if (Static150.aBoolean144) {
				arg1 = Static220.method3275(((Class3_Sub24_Sub1) super.aClass3_Sub24_5).aByteArray47, arg0, this.anInt4184, arg1, this.anInt4188, this.anInt4185, this.anInt4186, this.anInt4190, local5, arg2, this, this.anInt4194, arg4);
			} else {
				arg1 = Static220.method3272(((Class3_Sub24_Sub1) super.aClass3_Sub24_5).aByteArray47, arg0, this.anInt4184, arg1, this.anInt4187, this.anInt4189, local5, arg2, this, this.anInt4194, arg4);
			}
			this.anInt4195 -= arg1;
			if (this.anInt4195 != 0) {
				return arg1;
			}
		} while (!this.method3267());
		return arg3;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method3248(@OriginalArg(0) int arg0) {
		if (this.anInt4195 > 0) {
			if (arg0 >= this.anInt4195) {
				if (this.anInt4191 == Integer.MIN_VALUE) {
					this.anInt4191 = 0;
					this.anInt4187 = this.anInt4188 = this.anInt4185 = 0;
					this.method3320();
					arg0 = this.anInt4195;
				}
				this.anInt4195 = 0;
				this.method3258();
			} else {
				this.anInt4187 += this.anInt4189 * arg0;
				this.anInt4188 += this.anInt4186 * arg0;
				this.anInt4185 += this.anInt4190 * arg0;
				this.anInt4195 -= arg0;
			}
		}
		@Pc(71) Class3_Sub24_Sub1 local71 = (Class3_Sub24_Sub1) super.aClass3_Sub24_5;
		@Pc(76) int local76 = this.anInt4192 << 8;
		@Pc(81) int local81 = this.anInt4196 << 8;
		@Pc(87) int local87 = local71.aByteArray47.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt4193 = 0;
		}
		if (this.anInt4184 < 0) {
			if (this.anInt4194 <= 0) {
				this.method3276();
				this.method3320();
				return;
			}
			this.anInt4184 = 0;
		}
		if (this.anInt4184 >= local87) {
			if (this.anInt4194 >= 0) {
				this.method3276();
				this.method3320();
				return;
			}
			this.anInt4184 = local87 - 1;
		}
		this.anInt4184 += this.anInt4194 * arg0;
		if (this.anInt4193 >= 0) {
			if (this.anInt4193 > 0) {
				if (this.aBoolean188) {
					label125: {
						if (this.anInt4194 < 0) {
							if (this.anInt4184 >= local76) {
								return;
							}
							this.anInt4184 = local76 + local76 - this.anInt4184 - 1;
							this.anInt4194 = -this.anInt4194;
							if (--this.anInt4193 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt4184 < local81) {
								return;
							}
							this.anInt4184 = local81 + local81 - this.anInt4184 - 1;
							this.anInt4194 = -this.anInt4194;
							if (--this.anInt4193 == 0) {
								break;
							}
							if (this.anInt4184 >= local76) {
								return;
							}
							this.anInt4184 = local76 + local76 - this.anInt4184 - 1;
							this.anInt4194 = -this.anInt4194;
						} while (--this.anInt4193 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt4194 < 0) {
						if (this.anInt4184 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt4184 - 1) / local91;
						if (local361 < this.anInt4193) {
							this.anInt4184 += local91 * local361;
							this.anInt4193 -= local361;
							return;
						}
						this.anInt4184 += local91 * this.anInt4193;
						this.anInt4193 = 0;
					} else if (this.anInt4184 >= local81) {
						local361 = (this.anInt4184 - local76) / local91;
						if (local361 < this.anInt4193) {
							this.anInt4184 -= local91 * local361;
							this.anInt4193 -= local361;
							return;
						}
						this.anInt4184 -= local91 * this.anInt4193;
						this.anInt4193 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt4194 < 0) {
				if (this.anInt4184 < 0) {
					this.anInt4184 = -1;
					this.method3276();
					this.method3320();
					return;
				}
			} else if (this.anInt4184 >= local87) {
				this.anInt4184 = local87;
				this.method3276();
				this.method3320();
			}
		} else if (this.aBoolean188) {
			if (this.anInt4194 < 0) {
				if (this.anInt4184 >= local76) {
					return;
				}
				this.anInt4184 = local76 + local76 - this.anInt4184 - 1;
				this.anInt4194 = -this.anInt4194;
			}
			while (this.anInt4184 >= local81) {
				this.anInt4184 = local81 + local81 - this.anInt4184 - 1;
				this.anInt4194 = -this.anInt4194;
				if (this.anInt4184 >= local76) {
					return;
				}
				this.anInt4184 = local76 + local76 - this.anInt4184 - 1;
				this.anInt4194 = -this.anInt4194;
			}
		} else if (this.anInt4194 < 0) {
			if (this.anInt4184 < local76) {
				this.anInt4184 = local81 - (local81 - 1 - this.anInt4184) % local91 - 1;
			}
		} else if (this.anInt4184 >= local81) {
			this.anInt4184 = local76 + (this.anInt4184 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(I)V")
	public synchronized void method3253(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class3_Sub24_Sub1) super.aClass3_Sub24_5).aByteArray47.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt4184 = arg0;
	}

	@OriginalMember(owner = "client!wb", name = "e", descriptor = "()Z")
	public boolean method3254() {
		return this.anInt4195 != 0;
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "()Lclient!pb;")
	@Override
	public Class3_Sub19 method3246() {
		return null;
	}

	@OriginalMember(owner = "client!wb", name = "f", descriptor = "()I")
	public synchronized int method3256() {
		return this.anInt4197 < 0 ? -1 : this.anInt4197;
	}

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "(I)V")
	private synchronized void method3257() {
		this.method3266(0, this.method3256());
	}

	@OriginalMember(owner = "client!wb", name = "g", descriptor = "()V")
	private void method3258() {
		this.anInt4187 = this.anInt4191;
		this.anInt4188 = Static220.method3271(this.anInt4191, this.anInt4197);
		this.anInt4185 = Static220.method3284(this.anInt4191, this.anInt4197);
	}

	@OriginalMember(owner = "client!wb", name = "h", descriptor = "()I")
	public synchronized int method3259() {
		return this.anInt4191 == Integer.MIN_VALUE ? 0 : this.anInt4191;
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method3249(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt4191 == 0 && this.anInt4195 == 0) {
			this.method3248(arg2);
			return;
		}
		@Pc(13) Class3_Sub24_Sub1 local13 = (Class3_Sub24_Sub1) super.aClass3_Sub24_5;
		@Pc(18) int local18 = this.anInt4192 << 8;
		@Pc(23) int local23 = this.anInt4196 << 8;
		@Pc(29) int local29 = local13.aByteArray47.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt4193 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt4184 < 0) {
			if (this.anInt4194 <= 0) {
				this.method3276();
				this.method3320();
				return;
			}
			this.anInt4184 = 0;
		}
		if (this.anInt4184 >= local29) {
			if (this.anInt4194 >= 0) {
				this.method3276();
				this.method3320();
				return;
			}
			this.anInt4184 = local29 - 1;
		}
		if (this.anInt4193 >= 0) {
			if (this.anInt4193 > 0) {
				if (this.aBoolean188) {
					label130: {
						if (this.anInt4194 < 0) {
							local40 = this.method3251(arg0, arg1, local18, local44, local13.aByteArray47[this.anInt4192]);
							if (this.anInt4184 >= local18) {
								return;
							}
							this.anInt4184 = local18 + local18 - this.anInt4184 - 1;
							this.anInt4194 = -this.anInt4194;
							if (--this.anInt4193 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method3289(arg0, local40, local23, local44, local13.aByteArray47[this.anInt4196 - 1]);
							if (this.anInt4184 < local23) {
								return;
							}
							this.anInt4184 = local23 + local23 - this.anInt4184 - 1;
							this.anInt4194 = -this.anInt4194;
							if (--this.anInt4193 == 0) {
								break;
							}
							local40 = this.method3251(arg0, local40, local18, local44, local13.aByteArray47[this.anInt4192]);
							if (this.anInt4184 >= local18) {
								return;
							}
							this.anInt4184 = local18 + local18 - this.anInt4184 - 1;
							this.anInt4194 = -this.anInt4194;
						} while (--this.anInt4193 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt4194 < 0) {
						while (true) {
							local40 = this.method3251(arg0, local40, local18, local44, local13.aByteArray47[this.anInt4196 - 1]);
							if (this.anInt4184 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt4184 - 1) / local33;
							if (local416 >= this.anInt4193) {
								this.anInt4184 += local33 * this.anInt4193;
								this.anInt4193 = 0;
								break;
							}
							this.anInt4184 += local33 * local416;
							this.anInt4193 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method3289(arg0, local40, local23, local44, local13.aByteArray47[this.anInt4192]);
							if (this.anInt4184 < local23) {
								return;
							}
							local416 = (this.anInt4184 - local18) / local33;
							if (local416 >= this.anInt4193) {
								this.anInt4184 -= local33 * this.anInt4193;
								this.anInt4193 = 0;
								break;
							}
							this.anInt4184 -= local33 * local416;
							this.anInt4193 -= local416;
						}
					}
				}
			}
			if (this.anInt4194 < 0) {
				this.method3251(arg0, local40, 0, local44, 0);
				if (this.anInt4184 < 0) {
					this.anInt4184 = -1;
					this.method3276();
					this.method3320();
					return;
				}
			} else {
				this.method3289(arg0, local40, local29, local44, 0);
				if (this.anInt4184 >= local29) {
					this.anInt4184 = local29;
					this.method3276();
					this.method3320();
				}
			}
		} else if (this.aBoolean188) {
			if (this.anInt4194 < 0) {
				local40 = this.method3251(arg0, arg1, local18, local44, local13.aByteArray47[this.anInt4192]);
				if (this.anInt4184 >= local18) {
					return;
				}
				this.anInt4184 = local18 + local18 - this.anInt4184 - 1;
				this.anInt4194 = -this.anInt4194;
			}
			while (true) {
				local40 = this.method3289(arg0, local40, local23, local44, local13.aByteArray47[this.anInt4196 - 1]);
				if (this.anInt4184 < local23) {
					return;
				}
				this.anInt4184 = local23 + local23 - this.anInt4184 - 1;
				this.anInt4194 = -this.anInt4194;
				local40 = this.method3251(arg0, local40, local18, local44, local13.aByteArray47[this.anInt4192]);
				if (this.anInt4184 >= local18) {
					return;
				}
				this.anInt4184 = local18 + local18 - this.anInt4184 - 1;
				this.anInt4194 = -this.anInt4194;
			}
		} else if (this.anInt4194 < 0) {
			while (true) {
				local40 = this.method3251(arg0, local40, local18, local44, local13.aByteArray47[this.anInt4196 - 1]);
				if (this.anInt4184 >= local18) {
					return;
				}
				this.anInt4184 = local23 - (local23 - 1 - this.anInt4184) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method3289(arg0, local40, local23, local44, local13.aByteArray47[this.anInt4192]);
				if (this.anInt4184 < local23) {
					return;
				}
				this.anInt4184 = local18 + (this.anInt4184 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(III)V")
	public synchronized void method3262(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method3266(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static220.method3271(arg1, arg2);
		@Pc(14) int local14 = Static220.method3284(arg1, arg2);
		if (this.anInt4188 == local10 && this.anInt4185 == local14) {
			this.anInt4195 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt4187;
		if (this.anInt4187 - arg1 > local31) {
			local31 = this.anInt4187 - arg1;
		}
		if (local10 - this.anInt4188 > local31) {
			local31 = local10 - this.anInt4188;
		}
		if (this.anInt4188 - local10 > local31) {
			local31 = this.anInt4188 - local10;
		}
		if (local14 - this.anInt4185 > local31) {
			local31 = local14 - this.anInt4185;
		}
		if (this.anInt4185 - local14 > local31) {
			local31 = this.anInt4185 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt4195 = arg0;
		this.anInt4191 = arg1;
		this.anInt4197 = arg2;
		this.anInt4189 = (arg1 - this.anInt4187) / arg0;
		this.anInt4186 = (local10 - this.anInt4188) / arg0;
		this.anInt4190 = (local14 - this.anInt4185) / arg0;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(II)V")
	private synchronized void method3266(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4191 = arg0;
		this.anInt4197 = arg1;
		this.anInt4195 = 0;
		this.method3258();
	}

	@OriginalMember(owner = "client!wb", name = "i", descriptor = "()Z")
	private boolean method3267() {
		@Pc(2) int local2 = this.anInt4191;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static220.method3271(local2, this.anInt4197);
			local8 = Static220.method3284(local2, this.anInt4197);
		}
		if (this.anInt4187 != local2 || this.anInt4188 != local10 || this.anInt4185 != local8) {
			if (this.anInt4187 < local2) {
				this.anInt4189 = 1;
				this.anInt4195 = local2 - this.anInt4187;
			} else if (this.anInt4187 > local2) {
				this.anInt4189 = -1;
				this.anInt4195 = this.anInt4187 - local2;
			} else {
				this.anInt4189 = 0;
			}
			if (this.anInt4188 < local10) {
				this.anInt4186 = 1;
				if (this.anInt4195 == 0 || this.anInt4195 > local10 - this.anInt4188) {
					this.anInt4195 = local10 - this.anInt4188;
				}
			} else if (this.anInt4188 > local10) {
				this.anInt4186 = -1;
				if (this.anInt4195 == 0 || this.anInt4195 > this.anInt4188 - local10) {
					this.anInt4195 = this.anInt4188 - local10;
				}
			} else {
				this.anInt4186 = 0;
			}
			if (this.anInt4185 < local8) {
				this.anInt4190 = 1;
				if (this.anInt4195 == 0 || this.anInt4195 > local8 - this.anInt4185) {
					this.anInt4195 = local8 - this.anInt4185;
				}
			} else if (this.anInt4185 > local8) {
				this.anInt4190 = -1;
				if (this.anInt4195 == 0 || this.anInt4195 > this.anInt4185 - local8) {
					this.anInt4195 = this.anInt4185 - local8;
				}
			} else {
				this.anInt4190 = 0;
			}
			return false;
		} else if (this.anInt4191 == Integer.MIN_VALUE) {
			this.anInt4191 = 0;
			this.anInt4187 = this.anInt4188 = this.anInt4185 = 0;
			this.method3320();
			return true;
		} else {
			this.method3258();
			return false;
		}
	}

	@OriginalMember(owner = "client!wb", name = "d", descriptor = "(I)V")
	public synchronized void method3268(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method3257();
			this.method3320();
		} else if (this.anInt4188 == 0 && this.anInt4185 == 0) {
			this.anInt4195 = 0;
			this.anInt4191 = 0;
			this.anInt4187 = 0;
			this.method3320();
		} else {
			@Pc(31) int local31 = -this.anInt4187;
			if (this.anInt4187 > local31) {
				local31 = this.anInt4187;
			}
			if (-this.anInt4188 > local31) {
				local31 = -this.anInt4188;
			}
			if (this.anInt4188 > local31) {
				local31 = this.anInt4188;
			}
			if (-this.anInt4185 > local31) {
				local31 = -this.anInt4185;
			}
			if (this.anInt4185 > local31) {
				local31 = this.anInt4185;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt4195 = arg0;
			this.anInt4191 = Integer.MIN_VALUE;
			this.anInt4189 = -this.anInt4187 / arg0;
			this.anInt4186 = -this.anInt4188 / arg0;
			this.anInt4190 = -this.anInt4185 / arg0;
		}
	}

	@OriginalMember(owner = "client!wb", name = "e", descriptor = "(I)V")
	public synchronized void method3269(@OriginalArg(0) int arg0) {
		this.method3266(arg0 << 6, this.method3256());
	}

	@OriginalMember(owner = "client!wb", name = "f", descriptor = "(I)V")
	public synchronized void method3270(@OriginalArg(0) int arg0) {
		if (this.anInt4194 < 0) {
			this.anInt4194 = -arg0;
		} else {
			this.anInt4194 = arg0;
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Z)V")
	public synchronized void method3273() {
		this.anInt4194 = (this.anInt4194 ^ this.anInt4194 >> 31) + (this.anInt4194 >>> 31);
		this.anInt4194 = -this.anInt4194;
	}

	@OriginalMember(owner = "client!wb", name = "d", descriptor = "()I")
	@Override
	public int method3250() {
		@Pc(6) int local6 = this.anInt4187 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt4193 == 0) {
			local6 -= local6 * this.anInt4184 / (((Class3_Sub24_Sub1) super.aClass3_Sub24_5).aByteArray47.length << 8);
		} else if (this.anInt4193 >= 0) {
			local6 -= local6 * this.anInt4192 / ((Class3_Sub24_Sub1) super.aClass3_Sub24_5).aByteArray47.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!wb", name = "j", descriptor = "()V")
	private void method3276() {
		if (this.anInt4195 == 0) {
			return;
		}
		if (this.anInt4191 == Integer.MIN_VALUE) {
			this.anInt4191 = 0;
		}
		this.anInt4195 = 0;
		this.method3258();
	}

	@OriginalMember(owner = "client!wb", name = "k", descriptor = "()I")
	public synchronized int method3278() {
		return this.anInt4194 < 0 ? -this.anInt4194 : this.anInt4194;
	}

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "(II)V")
	public synchronized void method3282(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method3262(arg0, arg1, this.method3256());
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "()I")
	@Override
	public int method3244() {
		return this.anInt4191 == 0 && this.anInt4195 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!wb", name = "g", descriptor = "(I)V")
	public synchronized void method3285(@OriginalArg(0) int arg0) {
		this.anInt4193 = arg0;
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "([IIIII)I")
	private int method3289(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt4195 <= 0) {
				if (this.anInt4194 == 256 && (this.anInt4184 & 0xFF) == 0) {
					if (Static150.aBoolean144) {
						return Static220.method3265(((Class3_Sub24_Sub1) super.aClass3_Sub24_5).aByteArray47, arg0, this.anInt4184, arg1, this.anInt4188, this.anInt4185, arg3, arg2, this);
					}
					return Static220.method3264(((Class3_Sub24_Sub1) super.aClass3_Sub24_5).aByteArray47, arg0, this.anInt4184, arg1, this.anInt4187, arg3, arg2, this);
				}
				if (Static150.aBoolean144) {
					return Static220.method3280(((Class3_Sub24_Sub1) super.aClass3_Sub24_5).aByteArray47, arg0, this.anInt4184, arg1, this.anInt4188, this.anInt4185, arg3, arg2, this, this.anInt4194, arg4);
				}
				return Static220.method3260(((Class3_Sub24_Sub1) super.aClass3_Sub24_5).aByteArray47, arg0, this.anInt4184, arg1, this.anInt4187, arg3, arg2, this, this.anInt4194, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt4195;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt4195 += arg1;
			if (this.anInt4194 == 256 && (this.anInt4184 & 0xFF) == 0) {
				if (Static150.aBoolean144) {
					arg1 = Static220.method3274(((Class3_Sub24_Sub1) super.aClass3_Sub24_5).aByteArray47, arg0, this.anInt4184, arg1, this.anInt4188, this.anInt4185, this.anInt4186, this.anInt4190, local5, arg2, this);
				} else {
					arg1 = Static220.method3263(((Class3_Sub24_Sub1) super.aClass3_Sub24_5).aByteArray47, arg0, this.anInt4184, arg1, this.anInt4187, this.anInt4189, local5, arg2, this);
				}
			} else if (Static150.aBoolean144) {
				arg1 = Static220.method3286(((Class3_Sub24_Sub1) super.aClass3_Sub24_5).aByteArray47, arg0, this.anInt4184, arg1, this.anInt4188, this.anInt4185, this.anInt4186, this.anInt4190, local5, arg2, this, this.anInt4194, arg4);
			} else {
				arg1 = Static220.method3281(((Class3_Sub24_Sub1) super.aClass3_Sub24_5).aByteArray47, arg0, this.anInt4184, arg1, this.anInt4187, this.anInt4189, local5, arg2, this, this.anInt4194, arg4);
			}
			this.anInt4195 -= arg1;
			if (this.anInt4195 != 0) {
				return arg1;
			}
		} while (!this.method3267());
		return arg3;
	}

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "()Lclient!pb;")
	@Override
	public Class3_Sub19 method3247() {
		return null;
	}

	@OriginalMember(owner = "client!wb", name = "l", descriptor = "()Z")
	public boolean method3290() {
		return this.anInt4184 < 0 || this.anInt4184 >= ((Class3_Sub24_Sub1) super.aClass3_Sub24_5).aByteArray47.length << 8;
	}
}
