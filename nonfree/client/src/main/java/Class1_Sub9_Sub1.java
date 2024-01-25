import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ct")
public final class Class1_Sub9_Sub1 extends Class1_Sub9 {

	@OriginalMember(owner = "client!ct", name = "v", descriptor = "I")
	private int anInt1072;

	@OriginalMember(owner = "client!ct", name = "w", descriptor = "I")
	public int anInt1073;

	@OriginalMember(owner = "client!ct", name = "B", descriptor = "I")
	public int anInt1077;

	@OriginalMember(owner = "client!ct", name = "D", descriptor = "I")
	public int anInt1078;

	@OriginalMember(owner = "client!ct", name = "E", descriptor = "I")
	private int anInt1079;

	@OriginalMember(owner = "client!ct", name = "G", descriptor = "I")
	public int anInt1080;

	@OriginalMember(owner = "client!ct", name = "H", descriptor = "I")
	public int anInt1081;

	@OriginalMember(owner = "client!ct", name = "I", descriptor = "I")
	public int anInt1082;

	@OriginalMember(owner = "client!ct", name = "s", descriptor = "I")
	private final int anInt1069;

	@OriginalMember(owner = "client!ct", name = "t", descriptor = "I")
	private final int anInt1070;

	@OriginalMember(owner = "client!ct", name = "y", descriptor = "Z")
	private final boolean aBoolean89;

	@OriginalMember(owner = "client!ct", name = "u", descriptor = "I")
	private int anInt1071;

	@OriginalMember(owner = "client!ct", name = "x", descriptor = "I")
	private int anInt1074;

	@OriginalMember(owner = "client!ct", name = "A", descriptor = "I")
	private int anInt1076;

	@OriginalMember(owner = "client!ct", name = "z", descriptor = "I")
	public int anInt1075;

	@OriginalMember(owner = "client!ct", name = "<init>", descriptor = "(Lclient!nq;II)V")
	public Class1_Sub9_Sub1(@OriginalArg(0) Class1_Sub28_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass1_Sub28_5 = arg0;
		this.anInt1069 = arg0.anInt4315;
		this.anInt1070 = arg0.anInt4313;
		this.aBoolean89 = arg0.aBoolean341;
		this.anInt1071 = arg1;
		this.anInt1074 = arg2;
		this.anInt1076 = 8192;
		this.anInt1075 = 0;
		this.method928();
	}

	@OriginalMember(owner = "client!ct", name = "<init>", descriptor = "(Lclient!nq;III)V")
	public Class1_Sub9_Sub1(@OriginalArg(0) Class1_Sub28_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass1_Sub28_5 = arg0;
		this.anInt1069 = arg0.anInt4315;
		this.anInt1070 = arg0.anInt4313;
		this.aBoolean89 = arg0.aBoolean341;
		this.anInt1071 = arg1;
		this.anInt1074 = arg2;
		this.anInt1076 = arg3;
		this.anInt1075 = 0;
		this.method928();
	}

	@OriginalMember(owner = "client!ct", name = "e", descriptor = "(I)V")
	private synchronized void method912() {
		this.method916(0, this.method919());
	}

	@OriginalMember(owner = "client!ct", name = "f", descriptor = "(I)V")
	public synchronized void method913(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class1_Sub28_Sub1) super.aClass1_Sub28_5).aByteArray48.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt1075 = arg0;
	}

	@OriginalMember(owner = "client!ct", name = "e", descriptor = "()Z")
	public boolean method914() {
		return this.anInt1079 != 0;
	}

	@OriginalMember(owner = "client!ct", name = "c", descriptor = "()Lclient!hf;")
	@Override
	public Class1_Sub9 method4595() {
		return null;
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(II)V")
	private synchronized void method916(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1074 = arg0;
		this.anInt1076 = arg1;
		this.anInt1079 = 0;
		this.method928();
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method4597(@OriginalArg(0) int arg0) {
		if (this.anInt1079 > 0) {
			if (arg0 >= this.anInt1079) {
				if (this.anInt1074 == Integer.MIN_VALUE) {
					this.anInt1074 = 0;
					this.anInt1078 = this.anInt1080 = this.anInt1081 = 0;
					this.method5617();
					arg0 = this.anInt1079;
				}
				this.anInt1079 = 0;
				this.method928();
			} else {
				this.anInt1078 += this.anInt1082 * arg0;
				this.anInt1080 += this.anInt1077 * arg0;
				this.anInt1081 += this.anInt1073 * arg0;
				this.anInt1079 -= arg0;
			}
		}
		@Pc(71) Class1_Sub28_Sub1 local71 = (Class1_Sub28_Sub1) super.aClass1_Sub28_5;
		@Pc(76) int local76 = this.anInt1069 << 8;
		@Pc(81) int local81 = this.anInt1070 << 8;
		@Pc(87) int local87 = local71.aByteArray48.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt1072 = 0;
		}
		if (this.anInt1075 < 0) {
			if (this.anInt1071 <= 0) {
				this.method930();
				this.method5617();
				return;
			}
			this.anInt1075 = 0;
		}
		if (this.anInt1075 >= local87) {
			if (this.anInt1071 >= 0) {
				this.method930();
				this.method5617();
				return;
			}
			this.anInt1075 = local87 - 1;
		}
		this.anInt1075 += this.anInt1071 * arg0;
		if (this.anInt1072 >= 0) {
			if (this.anInt1072 > 0) {
				if (this.aBoolean89) {
					label125: {
						if (this.anInt1071 < 0) {
							if (this.anInt1075 >= local76) {
								return;
							}
							this.anInt1075 = local76 + local76 - this.anInt1075 - 1;
							this.anInt1071 = -this.anInt1071;
							if (--this.anInt1072 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt1075 < local81) {
								return;
							}
							this.anInt1075 = local81 + local81 - this.anInt1075 - 1;
							this.anInt1071 = -this.anInt1071;
							if (--this.anInt1072 == 0) {
								break;
							}
							if (this.anInt1075 >= local76) {
								return;
							}
							this.anInt1075 = local76 + local76 - this.anInt1075 - 1;
							this.anInt1071 = -this.anInt1071;
						} while (--this.anInt1072 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt1071 < 0) {
						if (this.anInt1075 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt1075 - 1) / local91;
						if (local361 < this.anInt1072) {
							this.anInt1075 += local91 * local361;
							this.anInt1072 -= local361;
							return;
						}
						this.anInt1075 += local91 * this.anInt1072;
						this.anInt1072 = 0;
					} else if (this.anInt1075 >= local81) {
						local361 = (this.anInt1075 - local76) / local91;
						if (local361 < this.anInt1072) {
							this.anInt1075 -= local91 * local361;
							this.anInt1072 -= local361;
							return;
						}
						this.anInt1075 -= local91 * this.anInt1072;
						this.anInt1072 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt1071 < 0) {
				if (this.anInt1075 < 0) {
					this.anInt1075 = -1;
					this.method930();
					this.method5617();
					return;
				}
			} else if (this.anInt1075 >= local87) {
				this.anInt1075 = local87;
				this.method930();
				this.method5617();
			}
		} else if (this.aBoolean89) {
			if (this.anInt1071 < 0) {
				if (this.anInt1075 >= local76) {
					return;
				}
				this.anInt1075 = local76 + local76 - this.anInt1075 - 1;
				this.anInt1071 = -this.anInt1071;
			}
			while (this.anInt1075 >= local81) {
				this.anInt1075 = local81 + local81 - this.anInt1075 - 1;
				this.anInt1071 = -this.anInt1071;
				if (this.anInt1075 >= local76) {
					return;
				}
				this.anInt1075 = local76 + local76 - this.anInt1075 - 1;
				this.anInt1071 = -this.anInt1071;
			}
		} else if (this.anInt1071 < 0) {
			if (this.anInt1075 < local76) {
				this.anInt1075 = local81 - (local81 - 1 - this.anInt1075) % local91 - 1;
			}
		} else if (this.anInt1075 >= local81) {
			this.anInt1075 = local76 + (this.anInt1075 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!ct", name = "b", descriptor = "(II)V")
	public synchronized void method917(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method947(arg0, arg1, this.method919());
	}

	@OriginalMember(owner = "client!ct", name = "b", descriptor = "()I")
	@Override
	public int method4594() {
		@Pc(6) int local6 = this.anInt1078 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt1072 == 0) {
			local6 -= local6 * this.anInt1075 / (((Class1_Sub28_Sub1) super.aClass1_Sub28_5).aByteArray48.length << 8);
		} else if (this.anInt1072 >= 0) {
			local6 -= local6 * this.anInt1069 / ((Class1_Sub28_Sub1) super.aClass1_Sub28_5).aByteArray48.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "([IIIII)I")
	private int method918(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt1079 <= 0) {
				if (this.anInt1071 == 256 && (this.anInt1075 & 0xFF) == 0) {
					if (Static25.aBoolean39) {
						return Static457.method920(((Class1_Sub28_Sub1) super.aClass1_Sub28_5).aByteArray48, arg0, this.anInt1075, arg1, this.anInt1080, this.anInt1081, arg3, arg2, this);
					}
					return Static457.method926(((Class1_Sub28_Sub1) super.aClass1_Sub28_5).aByteArray48, arg0, this.anInt1075, arg1, this.anInt1078, arg3, arg2, this);
				}
				if (Static25.aBoolean39) {
					return Static457.method923(((Class1_Sub28_Sub1) super.aClass1_Sub28_5).aByteArray48, arg0, this.anInt1075, arg1, this.anInt1080, this.anInt1081, arg3, arg2, this, this.anInt1071, arg4);
				}
				return Static457.method946(((Class1_Sub28_Sub1) super.aClass1_Sub28_5).aByteArray48, arg0, this.anInt1075, arg1, this.anInt1078, arg3, arg2, this, this.anInt1071, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt1079;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt1079 += arg1;
			if (this.anInt1071 == 256 && (this.anInt1075 & 0xFF) == 0) {
				if (Static25.aBoolean39) {
					arg1 = Static457.method915(((Class1_Sub28_Sub1) super.aClass1_Sub28_5).aByteArray48, arg0, this.anInt1075, arg1, this.anInt1080, this.anInt1081, this.anInt1077, this.anInt1073, local5, arg2, this);
				} else {
					arg1 = Static457.method908(((Class1_Sub28_Sub1) super.aClass1_Sub28_5).aByteArray48, arg0, this.anInt1075, arg1, this.anInt1078, this.anInt1082, local5, arg2, this);
				}
			} else if (Static25.aBoolean39) {
				arg1 = Static457.method909(((Class1_Sub28_Sub1) super.aClass1_Sub28_5).aByteArray48, arg0, this.anInt1075, arg1, this.anInt1080, this.anInt1081, this.anInt1077, this.anInt1073, local5, arg2, this, this.anInt1071, arg4);
			} else {
				arg1 = Static457.method927(((Class1_Sub28_Sub1) super.aClass1_Sub28_5).aByteArray48, arg0, this.anInt1075, arg1, this.anInt1078, this.anInt1082, local5, arg2, this, this.anInt1071, arg4);
			}
			this.anInt1079 -= arg1;
			if (this.anInt1079 != 0) {
				return arg1;
			}
		} while (!this.method943());
		return arg3;
	}

	@OriginalMember(owner = "client!ct", name = "f", descriptor = "()I")
	public synchronized int method919() {
		return this.anInt1076 < 0 ? -1 : this.anInt1076;
	}

	@OriginalMember(owner = "client!ct", name = "g", descriptor = "()I")
	public synchronized int method921() {
		return this.anInt1071 < 0 ? -this.anInt1071 : this.anInt1071;
	}

	@OriginalMember(owner = "client!ct", name = "h", descriptor = "()Z")
	public boolean method922() {
		return this.anInt1075 < 0 || this.anInt1075 >= ((Class1_Sub28_Sub1) super.aClass1_Sub28_5).aByteArray48.length << 8;
	}

	@OriginalMember(owner = "client!ct", name = "g", descriptor = "(I)V")
	public synchronized void method924(@OriginalArg(0) int arg0) {
		if (this.anInt1071 < 0) {
			this.anInt1071 = -arg0;
		} else {
			this.anInt1071 = arg0;
		}
	}

	@OriginalMember(owner = "client!ct", name = "d", descriptor = "()I")
	@Override
	public int method4596() {
		return this.anInt1074 == 0 && this.anInt1079 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!ct", name = "i", descriptor = "()V")
	private void method928() {
		this.anInt1078 = this.anInt1074;
		this.anInt1080 = Static457.method936(this.anInt1074, this.anInt1076);
		this.anInt1081 = Static457.method933(this.anInt1074, this.anInt1076);
	}

	@OriginalMember(owner = "client!ct", name = "b", descriptor = "([IIIII)I")
	private int method929(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt1079 <= 0) {
				if (this.anInt1071 == -256 && (this.anInt1075 & 0xFF) == 0) {
					if (Static25.aBoolean39) {
						return Static457.method932(((Class1_Sub28_Sub1) super.aClass1_Sub28_5).aByteArray48, arg0, this.anInt1075, arg1, this.anInt1080, this.anInt1081, arg3, arg2, this);
					}
					return Static457.method939(((Class1_Sub28_Sub1) super.aClass1_Sub28_5).aByteArray48, arg0, this.anInt1075, arg1, this.anInt1078, arg3, arg2, this);
				}
				if (Static25.aBoolean39) {
					return Static457.method925(((Class1_Sub28_Sub1) super.aClass1_Sub28_5).aByteArray48, arg0, this.anInt1075, arg1, this.anInt1080, this.anInt1081, arg3, arg2, this, this.anInt1071, arg4);
				}
				return Static457.method940(((Class1_Sub28_Sub1) super.aClass1_Sub28_5).aByteArray48, arg0, this.anInt1075, arg1, this.anInt1078, arg3, arg2, this, this.anInt1071, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt1079;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt1079 += arg1;
			if (this.anInt1071 == -256 && (this.anInt1075 & 0xFF) == 0) {
				if (Static25.aBoolean39) {
					arg1 = Static457.method910(((Class1_Sub28_Sub1) super.aClass1_Sub28_5).aByteArray48, arg0, this.anInt1075, arg1, this.anInt1080, this.anInt1081, this.anInt1077, this.anInt1073, local5, arg2, this);
				} else {
					arg1 = Static457.method937(((Class1_Sub28_Sub1) super.aClass1_Sub28_5).aByteArray48, arg0, this.anInt1075, arg1, this.anInt1078, this.anInt1082, local5, arg2, this);
				}
			} else if (Static25.aBoolean39) {
				arg1 = Static457.method931(((Class1_Sub28_Sub1) super.aClass1_Sub28_5).aByteArray48, arg0, this.anInt1075, arg1, this.anInt1080, this.anInt1081, this.anInt1077, this.anInt1073, local5, arg2, this, this.anInt1071, arg4);
			} else {
				arg1 = Static457.method945(((Class1_Sub28_Sub1) super.aClass1_Sub28_5).aByteArray48, arg0, this.anInt1075, arg1, this.anInt1078, this.anInt1082, local5, arg2, this, this.anInt1071, arg4);
			}
			this.anInt1079 -= arg1;
			if (this.anInt1079 != 0) {
				return arg1;
			}
		} while (!this.method943());
		return arg3;
	}

	@OriginalMember(owner = "client!ct", name = "j", descriptor = "()V")
	private void method930() {
		if (this.anInt1079 == 0) {
			return;
		}
		if (this.anInt1074 == Integer.MIN_VALUE) {
			this.anInt1074 = 0;
		}
		this.anInt1079 = 0;
		this.method928();
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method4592(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt1074 == 0 && this.anInt1079 == 0) {
			this.method4597(arg2);
			return;
		}
		@Pc(13) Class1_Sub28_Sub1 local13 = (Class1_Sub28_Sub1) super.aClass1_Sub28_5;
		@Pc(18) int local18 = this.anInt1069 << 8;
		@Pc(23) int local23 = this.anInt1070 << 8;
		@Pc(29) int local29 = local13.aByteArray48.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt1072 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt1075 < 0) {
			if (this.anInt1071 <= 0) {
				this.method930();
				this.method5617();
				return;
			}
			this.anInt1075 = 0;
		}
		if (this.anInt1075 >= local29) {
			if (this.anInt1071 >= 0) {
				this.method930();
				this.method5617();
				return;
			}
			this.anInt1075 = local29 - 1;
		}
		if (this.anInt1072 >= 0) {
			if (this.anInt1072 > 0) {
				if (this.aBoolean89) {
					label130: {
						if (this.anInt1071 < 0) {
							local40 = this.method929(arg0, arg1, local18, local44, local13.aByteArray48[this.anInt1069]);
							if (this.anInt1075 >= local18) {
								return;
							}
							this.anInt1075 = local18 + local18 - this.anInt1075 - 1;
							this.anInt1071 = -this.anInt1071;
							if (--this.anInt1072 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method918(arg0, local40, local23, local44, local13.aByteArray48[this.anInt1070 - 1]);
							if (this.anInt1075 < local23) {
								return;
							}
							this.anInt1075 = local23 + local23 - this.anInt1075 - 1;
							this.anInt1071 = -this.anInt1071;
							if (--this.anInt1072 == 0) {
								break;
							}
							local40 = this.method929(arg0, local40, local18, local44, local13.aByteArray48[this.anInt1069]);
							if (this.anInt1075 >= local18) {
								return;
							}
							this.anInt1075 = local18 + local18 - this.anInt1075 - 1;
							this.anInt1071 = -this.anInt1071;
						} while (--this.anInt1072 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt1071 < 0) {
						while (true) {
							local40 = this.method929(arg0, local40, local18, local44, local13.aByteArray48[this.anInt1070 - 1]);
							if (this.anInt1075 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt1075 - 1) / local33;
							if (local416 >= this.anInt1072) {
								this.anInt1075 += local33 * this.anInt1072;
								this.anInt1072 = 0;
								break;
							}
							this.anInt1075 += local33 * local416;
							this.anInt1072 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method918(arg0, local40, local23, local44, local13.aByteArray48[this.anInt1069]);
							if (this.anInt1075 < local23) {
								return;
							}
							local416 = (this.anInt1075 - local18) / local33;
							if (local416 >= this.anInt1072) {
								this.anInt1075 -= local33 * this.anInt1072;
								this.anInt1072 = 0;
								break;
							}
							this.anInt1075 -= local33 * local416;
							this.anInt1072 -= local416;
						}
					}
				}
			}
			if (this.anInt1071 < 0) {
				this.method929(arg0, local40, 0, local44, 0);
				if (this.anInt1075 < 0) {
					this.anInt1075 = -1;
					this.method930();
					this.method5617();
					return;
				}
			} else {
				this.method918(arg0, local40, local29, local44, 0);
				if (this.anInt1075 >= local29) {
					this.anInt1075 = local29;
					this.method930();
					this.method5617();
				}
			}
		} else if (this.aBoolean89) {
			if (this.anInt1071 < 0) {
				local40 = this.method929(arg0, arg1, local18, local44, local13.aByteArray48[this.anInt1069]);
				if (this.anInt1075 >= local18) {
					return;
				}
				this.anInt1075 = local18 + local18 - this.anInt1075 - 1;
				this.anInt1071 = -this.anInt1071;
			}
			while (true) {
				local40 = this.method918(arg0, local40, local23, local44, local13.aByteArray48[this.anInt1070 - 1]);
				if (this.anInt1075 < local23) {
					return;
				}
				this.anInt1075 = local23 + local23 - this.anInt1075 - 1;
				this.anInt1071 = -this.anInt1071;
				local40 = this.method929(arg0, local40, local18, local44, local13.aByteArray48[this.anInt1069]);
				if (this.anInt1075 >= local18) {
					return;
				}
				this.anInt1075 = local18 + local18 - this.anInt1075 - 1;
				this.anInt1071 = -this.anInt1071;
			}
		} else if (this.anInt1071 < 0) {
			while (true) {
				local40 = this.method929(arg0, local40, local18, local44, local13.aByteArray48[this.anInt1070 - 1]);
				if (this.anInt1075 >= local18) {
					return;
				}
				this.anInt1075 = local23 - (local23 - 1 - this.anInt1075) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method918(arg0, local40, local23, local44, local13.aByteArray48[this.anInt1069]);
				if (this.anInt1075 < local23) {
					return;
				}
				this.anInt1075 = local18 + (this.anInt1075 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "()Lclient!hf;")
	@Override
	public Class1_Sub9 method4591() {
		return null;
	}

	@OriginalMember(owner = "client!ct", name = "h", descriptor = "(I)V")
	public synchronized void method934(@OriginalArg(0) int arg0) {
		this.anInt1072 = arg0;
	}

	@OriginalMember(owner = "client!ct", name = "k", descriptor = "()I")
	public synchronized int method935() {
		return this.anInt1074 == Integer.MIN_VALUE ? 0 : this.anInt1074;
	}

	@OriginalMember(owner = "client!ct", name = "i", descriptor = "(I)V")
	public synchronized void method938(@OriginalArg(0) int arg0) {
		this.method916(arg0 << 6, this.method919());
	}

	@OriginalMember(owner = "client!ct", name = "j", descriptor = "(I)V")
	public synchronized void method941(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method912();
			this.method5617();
		} else if (this.anInt1080 == 0 && this.anInt1081 == 0) {
			this.anInt1079 = 0;
			this.anInt1074 = 0;
			this.anInt1078 = 0;
			this.method5617();
		} else {
			@Pc(31) int local31 = -this.anInt1078;
			if (this.anInt1078 > local31) {
				local31 = this.anInt1078;
			}
			if (-this.anInt1080 > local31) {
				local31 = -this.anInt1080;
			}
			if (this.anInt1080 > local31) {
				local31 = this.anInt1080;
			}
			if (-this.anInt1081 > local31) {
				local31 = -this.anInt1081;
			}
			if (this.anInt1081 > local31) {
				local31 = this.anInt1081;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt1079 = arg0;
			this.anInt1074 = Integer.MIN_VALUE;
			this.anInt1082 = -this.anInt1078 / arg0;
			this.anInt1077 = -this.anInt1080 / arg0;
			this.anInt1073 = -this.anInt1081 / arg0;
		}
	}

	@OriginalMember(owner = "client!ct", name = "l", descriptor = "()Z")
	private boolean method943() {
		@Pc(2) int local2 = this.anInt1074;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static457.method936(local2, this.anInt1076);
			local8 = Static457.method933(local2, this.anInt1076);
		}
		if (this.anInt1078 != local2 || this.anInt1080 != local10 || this.anInt1081 != local8) {
			if (this.anInt1078 < local2) {
				this.anInt1082 = 1;
				this.anInt1079 = local2 - this.anInt1078;
			} else if (this.anInt1078 > local2) {
				this.anInt1082 = -1;
				this.anInt1079 = this.anInt1078 - local2;
			} else {
				this.anInt1082 = 0;
			}
			if (this.anInt1080 < local10) {
				this.anInt1077 = 1;
				if (this.anInt1079 == 0 || this.anInt1079 > local10 - this.anInt1080) {
					this.anInt1079 = local10 - this.anInt1080;
				}
			} else if (this.anInt1080 > local10) {
				this.anInt1077 = -1;
				if (this.anInt1079 == 0 || this.anInt1079 > this.anInt1080 - local10) {
					this.anInt1079 = this.anInt1080 - local10;
				}
			} else {
				this.anInt1077 = 0;
			}
			if (this.anInt1081 < local8) {
				this.anInt1073 = 1;
				if (this.anInt1079 == 0 || this.anInt1079 > local8 - this.anInt1081) {
					this.anInt1079 = local8 - this.anInt1081;
				}
			} else if (this.anInt1081 > local8) {
				this.anInt1073 = -1;
				if (this.anInt1079 == 0 || this.anInt1079 > this.anInt1081 - local8) {
					this.anInt1079 = this.anInt1081 - local8;
				}
			} else {
				this.anInt1073 = 0;
			}
			return false;
		} else if (this.anInt1074 == Integer.MIN_VALUE) {
			this.anInt1074 = 0;
			this.anInt1078 = this.anInt1080 = this.anInt1081 = 0;
			this.method5617();
			return true;
		} else {
			this.method928();
			return false;
		}
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(Z)V")
	public synchronized void method944() {
		this.anInt1071 = (this.anInt1071 ^ this.anInt1071 >> 31) + (this.anInt1071 >>> 31);
		this.anInt1071 = -this.anInt1071;
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(III)V")
	public synchronized void method947(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method916(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static457.method936(arg1, arg2);
		@Pc(14) int local14 = Static457.method933(arg1, arg2);
		if (this.anInt1080 == local10 && this.anInt1081 == local14) {
			this.anInt1079 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt1078;
		if (this.anInt1078 - arg1 > local31) {
			local31 = this.anInt1078 - arg1;
		}
		if (local10 - this.anInt1080 > local31) {
			local31 = local10 - this.anInt1080;
		}
		if (this.anInt1080 - local10 > local31) {
			local31 = this.anInt1080 - local10;
		}
		if (local14 - this.anInt1081 > local31) {
			local31 = local14 - this.anInt1081;
		}
		if (this.anInt1081 - local14 > local31) {
			local31 = this.anInt1081 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt1079 = arg0;
		this.anInt1074 = arg1;
		this.anInt1076 = arg2;
		this.anInt1082 = (arg1 - this.anInt1078) / arg0;
		this.anInt1077 = (local10 - this.anInt1080) / arg0;
		this.anInt1073 = (local14 - this.anInt1081) / arg0;
	}
}
