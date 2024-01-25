import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uv")
public final class Class3_Sub33_Sub5 extends Class3_Sub33 {

	@OriginalMember(owner = "client!uv", name = "u", descriptor = "I")
	public int anInt10232;

	@OriginalMember(owner = "client!uv", name = "o", descriptor = "I")
	public int anInt10234;

	@OriginalMember(owner = "client!uv", name = "s", descriptor = "I")
	private int anInt10235;

	@OriginalMember(owner = "client!uv", name = "n", descriptor = "I")
	public int anInt10236;

	@OriginalMember(owner = "client!uv", name = "z", descriptor = "I")
	public int anInt10238;

	@OriginalMember(owner = "client!uv", name = "q", descriptor = "I")
	public int anInt10240;

	@OriginalMember(owner = "client!uv", name = "A", descriptor = "I")
	public int anInt10243;

	@OriginalMember(owner = "client!uv", name = "v", descriptor = "I")
	private int anInt10245;

	@OriginalMember(owner = "client!uv", name = "y", descriptor = "I")
	private final int anInt10237;

	@OriginalMember(owner = "client!uv", name = "x", descriptor = "I")
	private final int anInt10239;

	@OriginalMember(owner = "client!uv", name = "r", descriptor = "Z")
	private final boolean aBoolean682;

	@OriginalMember(owner = "client!uv", name = "m", descriptor = "I")
	private int anInt10244;

	@OriginalMember(owner = "client!uv", name = "t", descriptor = "I")
	private int anInt10242;

	@OriginalMember(owner = "client!uv", name = "p", descriptor = "I")
	private int anInt10233;

	@OriginalMember(owner = "client!uv", name = "w", descriptor = "I")
	public int anInt10241;

	@OriginalMember(owner = "client!uv", name = "<init>", descriptor = "(Lclient!wha;III)V")
	public Class3_Sub33_Sub5(@OriginalArg(0) Class3_Sub34_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass3_Sub34_6 = arg0;
		this.anInt10237 = arg0.anInt11126;
		this.anInt10239 = arg0.anInt11125;
		this.aBoolean682 = arg0.aBoolean753;
		this.anInt10244 = arg1;
		this.anInt10242 = arg2;
		this.anInt10233 = arg3;
		this.anInt10241 = 0;
		this.method8745();
	}

	@OriginalMember(owner = "client!uv", name = "f", descriptor = "()I")
	public synchronized int method8711() {
		return this.anInt10233 < 0 ? -1 : this.anInt10233;
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "([IIIII)I")
	private int method8712(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt10235 <= 0) {
				if (this.anInt10244 == -256 && (this.anInt10241 & 0xFF) == 0) {
					if (Static330.aBoolean659) {
						return Static737.method8728(((Class3_Sub34_Sub1) super.aClass3_Sub34_6).aByteArray109, arg0, this.anInt10241, arg1, this.anInt10240, this.anInt10238, arg3, arg2, this);
					}
					return Static737.method8718(((Class3_Sub34_Sub1) super.aClass3_Sub34_6).aByteArray109, arg0, this.anInt10241, arg1, this.anInt10232, arg3, arg2, this);
				}
				if (Static330.aBoolean659) {
					return Static737.method8724(((Class3_Sub34_Sub1) super.aClass3_Sub34_6).aByteArray109, arg0, this.anInt10241, arg1, this.anInt10240, this.anInt10238, arg3, arg2, this, this.anInt10244, arg4);
				}
				return Static737.method8743(((Class3_Sub34_Sub1) super.aClass3_Sub34_6).aByteArray109, arg0, this.anInt10241, arg1, this.anInt10232, arg3, arg2, this, this.anInt10244, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt10235;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt10235 += arg1;
			if (this.anInt10244 == -256 && (this.anInt10241 & 0xFF) == 0) {
				if (Static330.aBoolean659) {
					arg1 = Static737.method8750(((Class3_Sub34_Sub1) super.aClass3_Sub34_6).aByteArray109, arg0, this.anInt10241, arg1, this.anInt10240, this.anInt10238, this.anInt10236, this.anInt10243, local5, arg2, this);
				} else {
					arg1 = Static737.method8734(((Class3_Sub34_Sub1) super.aClass3_Sub34_6).aByteArray109, arg0, this.anInt10241, arg1, this.anInt10232, this.anInt10234, local5, arg2, this);
				}
			} else if (Static330.aBoolean659) {
				arg1 = Static737.method8720(((Class3_Sub34_Sub1) super.aClass3_Sub34_6).aByteArray109, arg0, this.anInt10241, arg1, this.anInt10240, this.anInt10238, this.anInt10236, this.anInt10243, local5, arg2, this, this.anInt10244, arg4);
			} else {
				arg1 = Static737.method8747(((Class3_Sub34_Sub1) super.aClass3_Sub34_6).aByteArray109, arg0, this.anInt10241, arg1, this.anInt10232, this.anInt10234, local5, arg2, this, this.anInt10244, arg4);
			}
			this.anInt10235 -= arg1;
			if (this.anInt10235 != 0) {
				return arg1;
			}
		} while (!this.method8715());
		return arg3;
	}

	@OriginalMember(owner = "client!uv", name = "c", descriptor = "(II)V")
	private synchronized void method8713(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt10242 = arg0;
		this.anInt10233 = arg1;
		this.anInt10235 = 0;
		this.method8745();
	}

	@OriginalMember(owner = "client!uv", name = "e", descriptor = "()Z")
	public boolean method8714() {
		return this.anInt10235 != 0;
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "()I")
	@Override
	public int method8705() {
		return this.anInt10242 == 0 && this.anInt10235 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!uv", name = "c", descriptor = "()Lclient!oga;")
	@Override
	public Class3_Sub33 method8706() {
		return null;
	}

	@OriginalMember(owner = "client!uv", name = "h", descriptor = "()Z")
	private boolean method8715() {
		@Pc(2) int local2 = this.anInt10242;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static737.method8749(local2, this.anInt10233);
			local8 = Static737.method8733(local2, this.anInt10233);
		}
		if (this.anInt10232 != local2 || this.anInt10240 != local10 || this.anInt10238 != local8) {
			if (this.anInt10232 < local2) {
				this.anInt10234 = 1;
				this.anInt10235 = local2 - this.anInt10232;
			} else if (this.anInt10232 > local2) {
				this.anInt10234 = -1;
				this.anInt10235 = this.anInt10232 - local2;
			} else {
				this.anInt10234 = 0;
			}
			if (this.anInt10240 < local10) {
				this.anInt10236 = 1;
				if (this.anInt10235 == 0 || this.anInt10235 > local10 - this.anInt10240) {
					this.anInt10235 = local10 - this.anInt10240;
				}
			} else if (this.anInt10240 > local10) {
				this.anInt10236 = -1;
				if (this.anInt10235 == 0 || this.anInt10235 > this.anInt10240 - local10) {
					this.anInt10235 = this.anInt10240 - local10;
				}
			} else {
				this.anInt10236 = 0;
			}
			if (this.anInt10238 < local8) {
				this.anInt10243 = 1;
				if (this.anInt10235 == 0 || this.anInt10235 > local8 - this.anInt10238) {
					this.anInt10235 = local8 - this.anInt10238;
				}
			} else if (this.anInt10238 > local8) {
				this.anInt10243 = -1;
				if (this.anInt10235 == 0 || this.anInt10235 > this.anInt10238 - local8) {
					this.anInt10235 = this.anInt10238 - local8;
				}
			} else {
				this.anInt10243 = 0;
			}
			return false;
		} else if (this.anInt10242 == Integer.MIN_VALUE) {
			this.anInt10242 = 0;
			this.anInt10232 = this.anInt10240 = this.anInt10238 = 0;
			this.method9596();
			return true;
		} else {
			this.method8745();
			return false;
		}
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(Z)V")
	public synchronized void method8716() {
		this.anInt10244 = (this.anInt10244 ^ this.anInt10244 >> 31) + (this.anInt10244 >>> 31);
		this.anInt10244 = -this.anInt10244;
	}

	@OriginalMember(owner = "client!uv", name = "b", descriptor = "([IIIII)I")
	private int method8721(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt10235 <= 0) {
				if (this.anInt10244 == 256 && (this.anInt10241 & 0xFF) == 0) {
					if (Static330.aBoolean659) {
						return Static737.method8741(((Class3_Sub34_Sub1) super.aClass3_Sub34_6).aByteArray109, arg0, this.anInt10241, arg1, this.anInt10240, this.anInt10238, arg3, arg2, this);
					}
					return Static737.method8723(((Class3_Sub34_Sub1) super.aClass3_Sub34_6).aByteArray109, arg0, this.anInt10241, arg1, this.anInt10232, arg3, arg2, this);
				}
				if (Static330.aBoolean659) {
					return Static737.method8717(((Class3_Sub34_Sub1) super.aClass3_Sub34_6).aByteArray109, arg0, this.anInt10241, arg1, this.anInt10240, this.anInt10238, arg3, arg2, this, this.anInt10244, arg4);
				}
				return Static737.method8748(((Class3_Sub34_Sub1) super.aClass3_Sub34_6).aByteArray109, arg0, this.anInt10241, arg1, this.anInt10232, arg3, arg2, this, this.anInt10244, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt10235;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt10235 += arg1;
			if (this.anInt10244 == 256 && (this.anInt10241 & 0xFF) == 0) {
				if (Static330.aBoolean659) {
					arg1 = Static737.method8744(((Class3_Sub34_Sub1) super.aClass3_Sub34_6).aByteArray109, arg0, this.anInt10241, arg1, this.anInt10240, this.anInt10238, this.anInt10236, this.anInt10243, local5, arg2, this);
				} else {
					arg1 = Static737.method8725(((Class3_Sub34_Sub1) super.aClass3_Sub34_6).aByteArray109, arg0, this.anInt10241, arg1, this.anInt10232, this.anInt10234, local5, arg2, this);
				}
			} else if (Static330.aBoolean659) {
				arg1 = Static737.method8719(((Class3_Sub34_Sub1) super.aClass3_Sub34_6).aByteArray109, arg0, this.anInt10241, arg1, this.anInt10240, this.anInt10238, this.anInt10236, this.anInt10243, local5, arg2, this, this.anInt10244, arg4);
			} else {
				arg1 = Static737.method8722(((Class3_Sub34_Sub1) super.aClass3_Sub34_6).aByteArray109, arg0, this.anInt10241, arg1, this.anInt10232, this.anInt10234, local5, arg2, this, this.anInt10244, arg4);
			}
			this.anInt10235 -= arg1;
			if (this.anInt10235 != 0) {
				return arg1;
			}
		} while (!this.method8715());
		return arg3;
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method8710(@OriginalArg(0) int arg0) {
		if (this.anInt10235 > 0) {
			if (arg0 >= this.anInt10235) {
				if (this.anInt10242 == Integer.MIN_VALUE) {
					this.anInt10242 = 0;
					this.anInt10232 = this.anInt10240 = this.anInt10238 = 0;
					this.method9596();
					arg0 = this.anInt10235;
				}
				this.anInt10235 = 0;
				this.method8745();
			} else {
				this.anInt10232 += this.anInt10234 * arg0;
				this.anInt10240 += this.anInt10236 * arg0;
				this.anInt10238 += this.anInt10243 * arg0;
				this.anInt10235 -= arg0;
			}
		}
		@Pc(71) Class3_Sub34_Sub1 local71 = (Class3_Sub34_Sub1) super.aClass3_Sub34_6;
		@Pc(76) int local76 = this.anInt10237 << 8;
		@Pc(81) int local81 = this.anInt10239 << 8;
		@Pc(87) int local87 = local71.aByteArray109.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt10245 = 0;
		}
		if (this.anInt10241 < 0) {
			if (this.anInt10244 <= 0) {
				this.method8726();
				this.method9596();
				return;
			}
			this.anInt10241 = 0;
		}
		if (this.anInt10241 >= local87) {
			if (this.anInt10244 >= 0) {
				this.method8726();
				this.method9596();
				return;
			}
			this.anInt10241 = local87 - 1;
		}
		this.anInt10241 += this.anInt10244 * arg0;
		if (this.anInt10245 >= 0) {
			if (this.anInt10245 > 0) {
				if (this.aBoolean682) {
					label125: {
						if (this.anInt10244 < 0) {
							if (this.anInt10241 >= local76) {
								return;
							}
							this.anInt10241 = local76 + local76 - this.anInt10241 - 1;
							this.anInt10244 = -this.anInt10244;
							if (--this.anInt10245 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt10241 < local81) {
								return;
							}
							this.anInt10241 = local81 + local81 - this.anInt10241 - 1;
							this.anInt10244 = -this.anInt10244;
							if (--this.anInt10245 == 0) {
								break;
							}
							if (this.anInt10241 >= local76) {
								return;
							}
							this.anInt10241 = local76 + local76 - this.anInt10241 - 1;
							this.anInt10244 = -this.anInt10244;
						} while (--this.anInt10245 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt10244 < 0) {
						if (this.anInt10241 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt10241 - 1) / local91;
						if (local361 < this.anInt10245) {
							this.anInt10241 += local91 * local361;
							this.anInt10245 -= local361;
							return;
						}
						this.anInt10241 += local91 * this.anInt10245;
						this.anInt10245 = 0;
					} else if (this.anInt10241 >= local81) {
						local361 = (this.anInt10241 - local76) / local91;
						if (local361 < this.anInt10245) {
							this.anInt10241 -= local91 * local361;
							this.anInt10245 -= local361;
							return;
						}
						this.anInt10241 -= local91 * this.anInt10245;
						this.anInt10245 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt10244 < 0) {
				if (this.anInt10241 < 0) {
					this.anInt10241 = -1;
					this.method8726();
					this.method9596();
					return;
				}
			} else if (this.anInt10241 >= local87) {
				this.anInt10241 = local87;
				this.method8726();
				this.method9596();
			}
		} else if (this.aBoolean682) {
			if (this.anInt10244 < 0) {
				if (this.anInt10241 >= local76) {
					return;
				}
				this.anInt10241 = local76 + local76 - this.anInt10241 - 1;
				this.anInt10244 = -this.anInt10244;
			}
			while (this.anInt10241 >= local81) {
				this.anInt10241 = local81 + local81 - this.anInt10241 - 1;
				this.anInt10244 = -this.anInt10244;
				if (this.anInt10241 >= local76) {
					return;
				}
				this.anInt10241 = local76 + local76 - this.anInt10241 - 1;
				this.anInt10244 = -this.anInt10244;
			}
		} else if (this.anInt10244 < 0) {
			if (this.anInt10241 < local76) {
				this.anInt10241 = local81 - (local81 - 1 - this.anInt10241) % local91 - 1;
			}
		} else if (this.anInt10241 >= local81) {
			this.anInt10241 = local76 + (this.anInt10241 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!uv", name = "g", descriptor = "()V")
	private void method8726() {
		if (this.anInt10235 == 0) {
			return;
		}
		if (this.anInt10242 == Integer.MIN_VALUE) {
			this.anInt10242 = 0;
		}
		this.anInt10235 = 0;
		this.method8745();
	}

	@OriginalMember(owner = "client!uv", name = "i", descriptor = "(I)V")
	public synchronized void method8727(@OriginalArg(0) int arg0) {
		if (this.anInt10244 < 0) {
			this.anInt10244 = -arg0;
		} else {
			this.anInt10244 = arg0;
		}
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(III)V")
	public synchronized void method8729(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method8713(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static737.method8749(arg1, arg2);
		@Pc(14) int local14 = Static737.method8733(arg1, arg2);
		if (this.anInt10240 == local10 && this.anInt10238 == local14) {
			this.anInt10235 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt10232;
		if (this.anInt10232 - arg1 > local31) {
			local31 = this.anInt10232 - arg1;
		}
		if (local10 - this.anInt10240 > local31) {
			local31 = local10 - this.anInt10240;
		}
		if (this.anInt10240 - local10 > local31) {
			local31 = this.anInt10240 - local10;
		}
		if (local14 - this.anInt10238 > local31) {
			local31 = local14 - this.anInt10238;
		}
		if (this.anInt10238 - local14 > local31) {
			local31 = this.anInt10238 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt10235 = arg0;
		this.anInt10242 = arg1;
		this.anInt10233 = arg2;
		this.anInt10234 = (arg1 - this.anInt10232) / arg0;
		this.anInt10236 = (local10 - this.anInt10240) / arg0;
		this.anInt10243 = (local14 - this.anInt10238) / arg0;
	}

	@OriginalMember(owner = "client!uv", name = "k", descriptor = "(I)V")
	public synchronized void method8730(@OriginalArg(0) int arg0) {
		this.anInt10245 = arg0;
	}

	@OriginalMember(owner = "client!uv", name = "b", descriptor = "(II)V")
	public synchronized void method8731(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method8729(arg0, arg1, this.method8711());
	}

	@OriginalMember(owner = "client!uv", name = "i", descriptor = "()Z")
	public boolean method8732() {
		return this.anInt10241 < 0 || this.anInt10241 >= ((Class3_Sub34_Sub1) super.aClass3_Sub34_6).aByteArray109.length << 8;
	}

	@OriginalMember(owner = "client!uv", name = "c", descriptor = "(I)V")
	public synchronized void method8735(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method8738();
			this.method9596();
		} else if (this.anInt10240 == 0 && this.anInt10238 == 0) {
			this.anInt10235 = 0;
			this.anInt10242 = 0;
			this.anInt10232 = 0;
			this.method9596();
		} else {
			@Pc(31) int local31 = -this.anInt10232;
			if (this.anInt10232 > local31) {
				local31 = this.anInt10232;
			}
			if (-this.anInt10240 > local31) {
				local31 = -this.anInt10240;
			}
			if (this.anInt10240 > local31) {
				local31 = this.anInt10240;
			}
			if (-this.anInt10238 > local31) {
				local31 = -this.anInt10238;
			}
			if (this.anInt10238 > local31) {
				local31 = this.anInt10238;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt10235 = arg0;
			this.anInt10242 = Integer.MIN_VALUE;
			this.anInt10234 = -this.anInt10232 / arg0;
			this.anInt10236 = -this.anInt10240 / arg0;
			this.anInt10243 = -this.anInt10238 / arg0;
		}
	}

	@OriginalMember(owner = "client!uv", name = "j", descriptor = "(I)V")
	public synchronized void method8736(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class3_Sub34_Sub1) super.aClass3_Sub34_6).aByteArray109.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt10241 = arg0;
	}

	@OriginalMember(owner = "client!uv", name = "l", descriptor = "()I")
	public synchronized int method8737() {
		return this.anInt10244 < 0 ? -this.anInt10244 : this.anInt10244;
	}

	@OriginalMember(owner = "client!uv", name = "h", descriptor = "(I)V")
	private synchronized void method8738() {
		this.method8713(0, this.method8711());
	}

	@OriginalMember(owner = "client!uv", name = "d", descriptor = "(I)V")
	public synchronized void method8740(@OriginalArg(0) int arg0) {
		this.method8713(this.method8746(), arg0);
	}

	@OriginalMember(owner = "client!uv", name = "b", descriptor = "(I)V")
	public synchronized void method8742(@OriginalArg(0) int arg0) {
		this.method8713(arg0 << 6, this.method8711());
	}

	@OriginalMember(owner = "client!uv", name = "d", descriptor = "()I")
	@Override
	public int method8707() {
		@Pc(6) int local6 = this.anInt10232 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt10245 == 0) {
			local6 -= local6 * this.anInt10241 / (((Class3_Sub34_Sub1) super.aClass3_Sub34_6).aByteArray109.length << 8);
		} else if (this.anInt10245 >= 0) {
			local6 -= local6 * this.anInt10237 / ((Class3_Sub34_Sub1) super.aClass3_Sub34_6).aByteArray109.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!uv", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method8709(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt10242 == 0 && this.anInt10235 == 0) {
			this.method8710(arg2);
			return;
		}
		@Pc(13) Class3_Sub34_Sub1 local13 = (Class3_Sub34_Sub1) super.aClass3_Sub34_6;
		@Pc(18) int local18 = this.anInt10237 << 8;
		@Pc(23) int local23 = this.anInt10239 << 8;
		@Pc(29) int local29 = local13.aByteArray109.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt10245 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt10241 < 0) {
			if (this.anInt10244 <= 0) {
				this.method8726();
				this.method9596();
				return;
			}
			this.anInt10241 = 0;
		}
		if (this.anInt10241 >= local29) {
			if (this.anInt10244 >= 0) {
				this.method8726();
				this.method9596();
				return;
			}
			this.anInt10241 = local29 - 1;
		}
		if (this.anInt10245 >= 0) {
			if (this.anInt10245 > 0) {
				if (this.aBoolean682) {
					label130: {
						if (this.anInt10244 < 0) {
							local40 = this.method8712(arg0, arg1, local18, local44, local13.aByteArray109[this.anInt10237]);
							if (this.anInt10241 >= local18) {
								return;
							}
							this.anInt10241 = local18 + local18 - this.anInt10241 - 1;
							this.anInt10244 = -this.anInt10244;
							if (--this.anInt10245 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method8721(arg0, local40, local23, local44, local13.aByteArray109[this.anInt10239 - 1]);
							if (this.anInt10241 < local23) {
								return;
							}
							this.anInt10241 = local23 + local23 - this.anInt10241 - 1;
							this.anInt10244 = -this.anInt10244;
							if (--this.anInt10245 == 0) {
								break;
							}
							local40 = this.method8712(arg0, local40, local18, local44, local13.aByteArray109[this.anInt10237]);
							if (this.anInt10241 >= local18) {
								return;
							}
							this.anInt10241 = local18 + local18 - this.anInt10241 - 1;
							this.anInt10244 = -this.anInt10244;
						} while (--this.anInt10245 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt10244 < 0) {
						while (true) {
							local40 = this.method8712(arg0, local40, local18, local44, local13.aByteArray109[this.anInt10239 - 1]);
							if (this.anInt10241 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt10241 - 1) / local33;
							if (local416 >= this.anInt10245) {
								this.anInt10241 += local33 * this.anInt10245;
								this.anInt10245 = 0;
								break;
							}
							this.anInt10241 += local33 * local416;
							this.anInt10245 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method8721(arg0, local40, local23, local44, local13.aByteArray109[this.anInt10237]);
							if (this.anInt10241 < local23) {
								return;
							}
							local416 = (this.anInt10241 - local18) / local33;
							if (local416 >= this.anInt10245) {
								this.anInt10241 -= local33 * this.anInt10245;
								this.anInt10245 = 0;
								break;
							}
							this.anInt10241 -= local33 * local416;
							this.anInt10245 -= local416;
						}
					}
				}
			}
			if (this.anInt10244 < 0) {
				this.method8712(arg0, local40, 0, local44, 0);
				if (this.anInt10241 < 0) {
					this.anInt10241 = -1;
					this.method8726();
					this.method9596();
					return;
				}
			} else {
				this.method8721(arg0, local40, local29, local44, 0);
				if (this.anInt10241 >= local29) {
					this.anInt10241 = local29;
					this.method8726();
					this.method9596();
				}
			}
		} else if (this.aBoolean682) {
			if (this.anInt10244 < 0) {
				local40 = this.method8712(arg0, arg1, local18, local44, local13.aByteArray109[this.anInt10237]);
				if (this.anInt10241 >= local18) {
					return;
				}
				this.anInt10241 = local18 + local18 - this.anInt10241 - 1;
				this.anInt10244 = -this.anInt10244;
			}
			while (true) {
				local40 = this.method8721(arg0, local40, local23, local44, local13.aByteArray109[this.anInt10239 - 1]);
				if (this.anInt10241 < local23) {
					return;
				}
				this.anInt10241 = local23 + local23 - this.anInt10241 - 1;
				this.anInt10244 = -this.anInt10244;
				local40 = this.method8712(arg0, local40, local18, local44, local13.aByteArray109[this.anInt10237]);
				if (this.anInt10241 >= local18) {
					return;
				}
				this.anInt10241 = local18 + local18 - this.anInt10241 - 1;
				this.anInt10244 = -this.anInt10244;
			}
		} else if (this.anInt10244 < 0) {
			while (true) {
				local40 = this.method8712(arg0, local40, local18, local44, local13.aByteArray109[this.anInt10239 - 1]);
				if (this.anInt10241 >= local18) {
					return;
				}
				this.anInt10241 = local23 - (local23 - 1 - this.anInt10241) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method8721(arg0, local40, local23, local44, local13.aByteArray109[this.anInt10237]);
				if (this.anInt10241 < local23) {
					return;
				}
				this.anInt10241 = local18 + (this.anInt10241 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!uv", name = "k", descriptor = "()V")
	private void method8745() {
		this.anInt10232 = this.anInt10242;
		this.anInt10240 = Static737.method8749(this.anInt10242, this.anInt10233);
		this.anInt10238 = Static737.method8733(this.anInt10242, this.anInt10233);
	}

	@OriginalMember(owner = "client!uv", name = "b", descriptor = "()Lclient!oga;")
	@Override
	public Class3_Sub33 method8708() {
		return null;
	}

	@OriginalMember(owner = "client!uv", name = "j", descriptor = "()I")
	public synchronized int method8746() {
		return this.anInt10242 == Integer.MIN_VALUE ? 0 : this.anInt10242;
	}
}
