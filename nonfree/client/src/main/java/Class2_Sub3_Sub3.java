import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lca")
public final class Class2_Sub3_Sub3 extends Class2_Sub3 {

	@OriginalMember(owner = "client!lca", name = "l", descriptor = "I")
	public int anInt4998;

	@OriginalMember(owner = "client!lca", name = "m", descriptor = "I")
	public int anInt4999;

	@OriginalMember(owner = "client!lca", name = "n", descriptor = "I")
	public int anInt5000;

	@OriginalMember(owner = "client!lca", name = "t", descriptor = "I")
	private int anInt5005;

	@OriginalMember(owner = "client!lca", name = "u", descriptor = "I")
	public int anInt5006;

	@OriginalMember(owner = "client!lca", name = "w", descriptor = "I")
	public int anInt5008;

	@OriginalMember(owner = "client!lca", name = "x", descriptor = "I")
	private int anInt5009;

	@OriginalMember(owner = "client!lca", name = "y", descriptor = "I")
	public int anInt5010;

	@OriginalMember(owner = "client!lca", name = "q", descriptor = "I")
	private final int anInt5002;

	@OriginalMember(owner = "client!lca", name = "o", descriptor = "I")
	private final int anInt5001;

	@OriginalMember(owner = "client!lca", name = "p", descriptor = "Z")
	private final boolean aBoolean396;

	@OriginalMember(owner = "client!lca", name = "s", descriptor = "I")
	private int anInt5004;

	@OriginalMember(owner = "client!lca", name = "v", descriptor = "I")
	private int anInt5007;

	@OriginalMember(owner = "client!lca", name = "z", descriptor = "I")
	private int anInt5011;

	@OriginalMember(owner = "client!lca", name = "r", descriptor = "I")
	public int anInt5003;

	@OriginalMember(owner = "client!lca", name = "<init>", descriptor = "(Lclient!wm;III)V")
	public Class2_Sub3_Sub3(@OriginalArg(0) Class2_Sub13_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass2_Sub13_5 = arg0;
		this.anInt5002 = arg0.anInt9544;
		this.anInt5001 = arg0.anInt9546;
		this.aBoolean396 = arg0.aBoolean801;
		this.anInt5004 = arg1;
		this.anInt5007 = arg2;
		this.anInt5011 = arg3;
		this.anInt5003 = 0;
		this.method4318();
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(III)V")
	public synchronized void method4292(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method4308(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static599.method4309(arg1, arg2);
		@Pc(14) int local14 = Static599.method4297(arg1, arg2);
		if (this.anInt4998 == local10 && this.anInt5008 == local14) {
			this.anInt5009 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt4999;
		if (this.anInt4999 - arg1 > local31) {
			local31 = this.anInt4999 - arg1;
		}
		if (local10 - this.anInt4998 > local31) {
			local31 = local10 - this.anInt4998;
		}
		if (this.anInt4998 - local10 > local31) {
			local31 = this.anInt4998 - local10;
		}
		if (local14 - this.anInt5008 > local31) {
			local31 = local14 - this.anInt5008;
		}
		if (this.anInt5008 - local14 > local31) {
			local31 = this.anInt5008 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt5009 = arg0;
		this.anInt5007 = arg1;
		this.anInt5011 = arg2;
		this.anInt5006 = (arg1 - this.anInt4999) / arg0;
		this.anInt5010 = (local10 - this.anInt4998) / arg0;
		this.anInt5000 = (local14 - this.anInt5008) / arg0;
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "([IIIII)I")
	private int method4295(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt5009 <= 0) {
				if (this.anInt5004 == 256 && (this.anInt5003 & 0xFF) == 0) {
					if (Static517.aBoolean697) {
						return Static599.method4320(((Class2_Sub13_Sub1) super.aClass2_Sub13_5).aByteArray101, arg0, this.anInt5003, arg1, this.anInt4998, this.anInt5008, arg3, arg2, this);
					}
					return Static599.method4310(((Class2_Sub13_Sub1) super.aClass2_Sub13_5).aByteArray101, arg0, this.anInt5003, arg1, this.anInt4999, arg3, arg2, this);
				}
				if (Static517.aBoolean697) {
					return Static599.method4321(((Class2_Sub13_Sub1) super.aClass2_Sub13_5).aByteArray101, arg0, this.anInt5003, arg1, this.anInt4998, this.anInt5008, arg3, arg2, this, this.anInt5004, arg4);
				}
				return Static599.method4305(((Class2_Sub13_Sub1) super.aClass2_Sub13_5).aByteArray101, arg0, this.anInt5003, arg1, this.anInt4999, arg3, arg2, this, this.anInt5004, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt5009;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt5009 += arg1;
			if (this.anInt5004 == 256 && (this.anInt5003 & 0xFF) == 0) {
				if (Static517.aBoolean697) {
					arg1 = Static599.method4326(((Class2_Sub13_Sub1) super.aClass2_Sub13_5).aByteArray101, arg0, this.anInt5003, arg1, this.anInt4998, this.anInt5008, this.anInt5010, this.anInt5000, local5, arg2, this);
				} else {
					arg1 = Static599.method4328(((Class2_Sub13_Sub1) super.aClass2_Sub13_5).aByteArray101, arg0, this.anInt5003, arg1, this.anInt4999, this.anInt5006, local5, arg2, this);
				}
			} else if (Static517.aBoolean697) {
				arg1 = Static599.method4293(((Class2_Sub13_Sub1) super.aClass2_Sub13_5).aByteArray101, arg0, this.anInt5003, arg1, this.anInt4998, this.anInt5008, this.anInt5010, this.anInt5000, local5, arg2, this, this.anInt5004, arg4);
			} else {
				arg1 = Static599.method4303(((Class2_Sub13_Sub1) super.aClass2_Sub13_5).aByteArray101, arg0, this.anInt5003, arg1, this.anInt4999, this.anInt5006, local5, arg2, this, this.anInt5004, arg4);
			}
			this.anInt5009 -= arg1;
			if (this.anInt5009 != 0) {
				return arg1;
			}
		} while (!this.method4301());
		return arg3;
	}

	@OriginalMember(owner = "client!lca", name = "b", descriptor = "(I)V")
	public synchronized void method4296(@OriginalArg(0) int arg0) {
		if (this.anInt5004 < 0) {
			this.anInt5004 = -arg0;
		} else {
			this.anInt5004 = arg0;
		}
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(Z)V")
	public synchronized void method4298() {
		this.anInt5004 = (this.anInt5004 ^ this.anInt5004 >> 31) + (this.anInt5004 >>> 31);
		this.anInt5004 = -this.anInt5004;
	}

	@OriginalMember(owner = "client!lca", name = "e", descriptor = "()Z")
	public boolean method4300() {
		return this.anInt5009 != 0;
	}

	@OriginalMember(owner = "client!lca", name = "f", descriptor = "()Z")
	private boolean method4301() {
		@Pc(2) int local2 = this.anInt5007;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static599.method4309(local2, this.anInt5011);
			local8 = Static599.method4297(local2, this.anInt5011);
		}
		if (this.anInt4999 != local2 || this.anInt4998 != local10 || this.anInt5008 != local8) {
			if (this.anInt4999 < local2) {
				this.anInt5006 = 1;
				this.anInt5009 = local2 - this.anInt4999;
			} else if (this.anInt4999 > local2) {
				this.anInt5006 = -1;
				this.anInt5009 = this.anInt4999 - local2;
			} else {
				this.anInt5006 = 0;
			}
			if (this.anInt4998 < local10) {
				this.anInt5010 = 1;
				if (this.anInt5009 == 0 || this.anInt5009 > local10 - this.anInt4998) {
					this.anInt5009 = local10 - this.anInt4998;
				}
			} else if (this.anInt4998 > local10) {
				this.anInt5010 = -1;
				if (this.anInt5009 == 0 || this.anInt5009 > this.anInt4998 - local10) {
					this.anInt5009 = this.anInt4998 - local10;
				}
			} else {
				this.anInt5010 = 0;
			}
			if (this.anInt5008 < local8) {
				this.anInt5000 = 1;
				if (this.anInt5009 == 0 || this.anInt5009 > local8 - this.anInt5008) {
					this.anInt5009 = local8 - this.anInt5008;
				}
			} else if (this.anInt5008 > local8) {
				this.anInt5000 = -1;
				if (this.anInt5009 == 0 || this.anInt5009 > this.anInt5008 - local8) {
					this.anInt5009 = this.anInt5008 - local8;
				}
			} else {
				this.anInt5000 = 0;
			}
			return false;
		} else if (this.anInt5007 == Integer.MIN_VALUE) {
			this.anInt5007 = 0;
			this.anInt4999 = this.anInt4998 = this.anInt5008 = 0;
			this.method7657();
			return true;
		} else {
			this.method4318();
			return false;
		}
	}

	@OriginalMember(owner = "client!lca", name = "g", descriptor = "()I")
	public synchronized int method4302() {
		return this.anInt5004 < 0 ? -this.anInt5004 : this.anInt5004;
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method6700(@OriginalArg(0) int arg0) {
		if (this.anInt5009 > 0) {
			if (arg0 >= this.anInt5009) {
				if (this.anInt5007 == Integer.MIN_VALUE) {
					this.anInt5007 = 0;
					this.anInt4999 = this.anInt4998 = this.anInt5008 = 0;
					this.method7657();
					arg0 = this.anInt5009;
				}
				this.anInt5009 = 0;
				this.method4318();
			} else {
				this.anInt4999 += this.anInt5006 * arg0;
				this.anInt4998 += this.anInt5010 * arg0;
				this.anInt5008 += this.anInt5000 * arg0;
				this.anInt5009 -= arg0;
			}
		}
		@Pc(71) Class2_Sub13_Sub1 local71 = (Class2_Sub13_Sub1) super.aClass2_Sub13_5;
		@Pc(76) int local76 = this.anInt5002 << 8;
		@Pc(81) int local81 = this.anInt5001 << 8;
		@Pc(87) int local87 = local71.aByteArray101.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt5005 = 0;
		}
		if (this.anInt5003 < 0) {
			if (this.anInt5004 <= 0) {
				this.method4325();
				this.method7657();
				return;
			}
			this.anInt5003 = 0;
		}
		if (this.anInt5003 >= local87) {
			if (this.anInt5004 >= 0) {
				this.method4325();
				this.method7657();
				return;
			}
			this.anInt5003 = local87 - 1;
		}
		this.anInt5003 += this.anInt5004 * arg0;
		if (this.anInt5005 >= 0) {
			if (this.anInt5005 > 0) {
				if (this.aBoolean396) {
					label125: {
						if (this.anInt5004 < 0) {
							if (this.anInt5003 >= local76) {
								return;
							}
							this.anInt5003 = local76 + local76 - this.anInt5003 - 1;
							this.anInt5004 = -this.anInt5004;
							if (--this.anInt5005 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt5003 < local81) {
								return;
							}
							this.anInt5003 = local81 + local81 - this.anInt5003 - 1;
							this.anInt5004 = -this.anInt5004;
							if (--this.anInt5005 == 0) {
								break;
							}
							if (this.anInt5003 >= local76) {
								return;
							}
							this.anInt5003 = local76 + local76 - this.anInt5003 - 1;
							this.anInt5004 = -this.anInt5004;
						} while (--this.anInt5005 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt5004 < 0) {
						if (this.anInt5003 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt5003 - 1) / local91;
						if (local361 < this.anInt5005) {
							this.anInt5003 += local91 * local361;
							this.anInt5005 -= local361;
							return;
						}
						this.anInt5003 += local91 * this.anInt5005;
						this.anInt5005 = 0;
					} else if (this.anInt5003 >= local81) {
						local361 = (this.anInt5003 - local76) / local91;
						if (local361 < this.anInt5005) {
							this.anInt5003 -= local91 * local361;
							this.anInt5005 -= local361;
							return;
						}
						this.anInt5003 -= local91 * this.anInt5005;
						this.anInt5005 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt5004 < 0) {
				if (this.anInt5003 < 0) {
					this.anInt5003 = -1;
					this.method4325();
					this.method7657();
					return;
				}
			} else if (this.anInt5003 >= local87) {
				this.anInt5003 = local87;
				this.method4325();
				this.method7657();
			}
		} else if (this.aBoolean396) {
			if (this.anInt5004 < 0) {
				if (this.anInt5003 >= local76) {
					return;
				}
				this.anInt5003 = local76 + local76 - this.anInt5003 - 1;
				this.anInt5004 = -this.anInt5004;
			}
			while (this.anInt5003 >= local81) {
				this.anInt5003 = local81 + local81 - this.anInt5003 - 1;
				this.anInt5004 = -this.anInt5004;
				if (this.anInt5003 >= local76) {
					return;
				}
				this.anInt5003 = local76 + local76 - this.anInt5003 - 1;
				this.anInt5004 = -this.anInt5004;
			}
		} else if (this.anInt5004 < 0) {
			if (this.anInt5003 < local76) {
				this.anInt5003 = local81 - (local81 - 1 - this.anInt5003) % local91 - 1;
			}
		} else if (this.anInt5003 >= local81) {
			this.anInt5003 = local76 + (this.anInt5003 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!lca", name = "d", descriptor = "(I)V")
	public synchronized void method4306(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method4316();
			this.method7657();
		} else if (this.anInt4998 == 0 && this.anInt5008 == 0) {
			this.anInt5009 = 0;
			this.anInt5007 = 0;
			this.anInt4999 = 0;
			this.method7657();
		} else {
			@Pc(31) int local31 = -this.anInt4999;
			if (this.anInt4999 > local31) {
				local31 = this.anInt4999;
			}
			if (-this.anInt4998 > local31) {
				local31 = -this.anInt4998;
			}
			if (this.anInt4998 > local31) {
				local31 = this.anInt4998;
			}
			if (-this.anInt5008 > local31) {
				local31 = -this.anInt5008;
			}
			if (this.anInt5008 > local31) {
				local31 = this.anInt5008;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt5009 = arg0;
			this.anInt5007 = Integer.MIN_VALUE;
			this.anInt5006 = -this.anInt4999 / arg0;
			this.anInt5010 = -this.anInt4998 / arg0;
			this.anInt5000 = -this.anInt5008 / arg0;
		}
	}

	@OriginalMember(owner = "client!lca", name = "b", descriptor = "([IIIII)I")
	private int method4307(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt5009 <= 0) {
				if (this.anInt5004 == -256 && (this.anInt5003 & 0xFF) == 0) {
					if (Static517.aBoolean697) {
						return Static599.method4299(((Class2_Sub13_Sub1) super.aClass2_Sub13_5).aByteArray101, arg0, this.anInt5003, arg1, this.anInt4998, this.anInt5008, arg3, arg2, this);
					}
					return Static599.method4327(((Class2_Sub13_Sub1) super.aClass2_Sub13_5).aByteArray101, arg0, this.anInt5003, arg1, this.anInt4999, arg3, arg2, this);
				}
				if (Static517.aBoolean697) {
					return Static599.method4294(((Class2_Sub13_Sub1) super.aClass2_Sub13_5).aByteArray101, arg0, this.anInt5003, arg1, this.anInt4998, this.anInt5008, arg3, arg2, this, this.anInt5004, arg4);
				}
				return Static599.method4304(((Class2_Sub13_Sub1) super.aClass2_Sub13_5).aByteArray101, arg0, this.anInt5003, arg1, this.anInt4999, arg3, arg2, this, this.anInt5004, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt5009;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt5009 += arg1;
			if (this.anInt5004 == -256 && (this.anInt5003 & 0xFF) == 0) {
				if (Static517.aBoolean697) {
					arg1 = Static599.method4329(((Class2_Sub13_Sub1) super.aClass2_Sub13_5).aByteArray101, arg0, this.anInt5003, arg1, this.anInt4998, this.anInt5008, this.anInt5010, this.anInt5000, local5, arg2, this);
				} else {
					arg1 = Static599.method4323(((Class2_Sub13_Sub1) super.aClass2_Sub13_5).aByteArray101, arg0, this.anInt5003, arg1, this.anInt4999, this.anInt5006, local5, arg2, this);
				}
			} else if (Static517.aBoolean697) {
				arg1 = Static599.method4312(((Class2_Sub13_Sub1) super.aClass2_Sub13_5).aByteArray101, arg0, this.anInt5003, arg1, this.anInt4998, this.anInt5008, this.anInt5010, this.anInt5000, local5, arg2, this, this.anInt5004, arg4);
			} else {
				arg1 = Static599.method4315(((Class2_Sub13_Sub1) super.aClass2_Sub13_5).aByteArray101, arg0, this.anInt5003, arg1, this.anInt4999, this.anInt5006, local5, arg2, this, this.anInt5004, arg4);
			}
			this.anInt5009 -= arg1;
			if (this.anInt5009 != 0) {
				return arg1;
			}
		} while (!this.method4301());
		return arg3;
	}

	@OriginalMember(owner = "client!lca", name = "b", descriptor = "(II)V")
	private synchronized void method4308(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5007 = arg0;
		this.anInt5011 = arg1;
		this.anInt5009 = 0;
		this.method4318();
	}

	@OriginalMember(owner = "client!lca", name = "c", descriptor = "()Lclient!ac;")
	@Override
	public Class2_Sub3 method6701() {
		return null;
	}

	@OriginalMember(owner = "client!lca", name = "d", descriptor = "()Lclient!ac;")
	@Override
	public Class2_Sub3 method6703() {
		return null;
	}

	@OriginalMember(owner = "client!lca", name = "h", descriptor = "()I")
	public synchronized int method4311() {
		return this.anInt5011 < 0 ? -1 : this.anInt5011;
	}

	@OriginalMember(owner = "client!lca", name = "e", descriptor = "(I)V")
	public synchronized void method4314(@OriginalArg(0) int arg0) {
		this.method4308(arg0 << 6, this.method4311());
	}

	@OriginalMember(owner = "client!lca", name = "f", descriptor = "(I)V")
	private synchronized void method4316() {
		this.method4308(0, this.method4311());
	}

	@OriginalMember(owner = "client!lca", name = "g", descriptor = "(I)V")
	public synchronized void method4317(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class2_Sub13_Sub1) super.aClass2_Sub13_5).aByteArray101.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt5003 = arg0;
	}

	@OriginalMember(owner = "client!lca", name = "i", descriptor = "()V")
	private void method4318() {
		this.anInt4999 = this.anInt5007;
		this.anInt4998 = Static599.method4309(this.anInt5007, this.anInt5011);
		this.anInt5008 = Static599.method4297(this.anInt5007, this.anInt5011);
	}

	@OriginalMember(owner = "client!lca", name = "h", descriptor = "(I)V")
	public synchronized void method4319(@OriginalArg(0) int arg0) {
		this.method4308(this.method4330(), arg0);
	}

	@OriginalMember(owner = "client!lca", name = "b", descriptor = "()I")
	@Override
	public int method6699() {
		return this.anInt5007 == 0 && this.anInt5009 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!lca", name = "j", descriptor = "()Z")
	public boolean method4322() {
		return this.anInt5003 < 0 || this.anInt5003 >= ((Class2_Sub13_Sub1) super.aClass2_Sub13_5).aByteArray101.length << 8;
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method6697(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt5007 == 0 && this.anInt5009 == 0) {
			this.method6700(arg2);
			return;
		}
		@Pc(13) Class2_Sub13_Sub1 local13 = (Class2_Sub13_Sub1) super.aClass2_Sub13_5;
		@Pc(18) int local18 = this.anInt5002 << 8;
		@Pc(23) int local23 = this.anInt5001 << 8;
		@Pc(29) int local29 = local13.aByteArray101.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt5005 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt5003 < 0) {
			if (this.anInt5004 <= 0) {
				this.method4325();
				this.method7657();
				return;
			}
			this.anInt5003 = 0;
		}
		if (this.anInt5003 >= local29) {
			if (this.anInt5004 >= 0) {
				this.method4325();
				this.method7657();
				return;
			}
			this.anInt5003 = local29 - 1;
		}
		if (this.anInt5005 >= 0) {
			if (this.anInt5005 > 0) {
				if (this.aBoolean396) {
					label130: {
						if (this.anInt5004 < 0) {
							local40 = this.method4307(arg0, arg1, local18, local44, local13.aByteArray101[this.anInt5002]);
							if (this.anInt5003 >= local18) {
								return;
							}
							this.anInt5003 = local18 + local18 - this.anInt5003 - 1;
							this.anInt5004 = -this.anInt5004;
							if (--this.anInt5005 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method4295(arg0, local40, local23, local44, local13.aByteArray101[this.anInt5001 - 1]);
							if (this.anInt5003 < local23) {
								return;
							}
							this.anInt5003 = local23 + local23 - this.anInt5003 - 1;
							this.anInt5004 = -this.anInt5004;
							if (--this.anInt5005 == 0) {
								break;
							}
							local40 = this.method4307(arg0, local40, local18, local44, local13.aByteArray101[this.anInt5002]);
							if (this.anInt5003 >= local18) {
								return;
							}
							this.anInt5003 = local18 + local18 - this.anInt5003 - 1;
							this.anInt5004 = -this.anInt5004;
						} while (--this.anInt5005 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt5004 < 0) {
						while (true) {
							local40 = this.method4307(arg0, local40, local18, local44, local13.aByteArray101[this.anInt5001 - 1]);
							if (this.anInt5003 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt5003 - 1) / local33;
							if (local416 >= this.anInt5005) {
								this.anInt5003 += local33 * this.anInt5005;
								this.anInt5005 = 0;
								break;
							}
							this.anInt5003 += local33 * local416;
							this.anInt5005 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method4295(arg0, local40, local23, local44, local13.aByteArray101[this.anInt5002]);
							if (this.anInt5003 < local23) {
								return;
							}
							local416 = (this.anInt5003 - local18) / local33;
							if (local416 >= this.anInt5005) {
								this.anInt5003 -= local33 * this.anInt5005;
								this.anInt5005 = 0;
								break;
							}
							this.anInt5003 -= local33 * local416;
							this.anInt5005 -= local416;
						}
					}
				}
			}
			if (this.anInt5004 < 0) {
				this.method4307(arg0, local40, 0, local44, 0);
				if (this.anInt5003 < 0) {
					this.anInt5003 = -1;
					this.method4325();
					this.method7657();
					return;
				}
			} else {
				this.method4295(arg0, local40, local29, local44, 0);
				if (this.anInt5003 >= local29) {
					this.anInt5003 = local29;
					this.method4325();
					this.method7657();
				}
			}
		} else if (this.aBoolean396) {
			if (this.anInt5004 < 0) {
				local40 = this.method4307(arg0, arg1, local18, local44, local13.aByteArray101[this.anInt5002]);
				if (this.anInt5003 >= local18) {
					return;
				}
				this.anInt5003 = local18 + local18 - this.anInt5003 - 1;
				this.anInt5004 = -this.anInt5004;
			}
			while (true) {
				local40 = this.method4295(arg0, local40, local23, local44, local13.aByteArray101[this.anInt5001 - 1]);
				if (this.anInt5003 < local23) {
					return;
				}
				this.anInt5003 = local23 + local23 - this.anInt5003 - 1;
				this.anInt5004 = -this.anInt5004;
				local40 = this.method4307(arg0, local40, local18, local44, local13.aByteArray101[this.anInt5002]);
				if (this.anInt5003 >= local18) {
					return;
				}
				this.anInt5003 = local18 + local18 - this.anInt5003 - 1;
				this.anInt5004 = -this.anInt5004;
			}
		} else if (this.anInt5004 < 0) {
			while (true) {
				local40 = this.method4307(arg0, local40, local18, local44, local13.aByteArray101[this.anInt5001 - 1]);
				if (this.anInt5003 >= local18) {
					return;
				}
				this.anInt5003 = local23 - (local23 - 1 - this.anInt5003) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method4295(arg0, local40, local23, local44, local13.aByteArray101[this.anInt5002]);
				if (this.anInt5003 < local23) {
					return;
				}
				this.anInt5003 = local18 + (this.anInt5003 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!lca", name = "d", descriptor = "(II)V")
	public synchronized void method4324(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method4292(arg0, arg1, this.method4311());
	}

	@OriginalMember(owner = "client!lca", name = "k", descriptor = "()V")
	private void method4325() {
		if (this.anInt5009 == 0) {
			return;
		}
		if (this.anInt5007 == Integer.MIN_VALUE) {
			this.anInt5007 = 0;
		}
		this.anInt5009 = 0;
		this.method4318();
	}

	@OriginalMember(owner = "client!lca", name = "l", descriptor = "()I")
	public synchronized int method4330() {
		return this.anInt5007 == Integer.MIN_VALUE ? 0 : this.anInt5007;
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "()I")
	@Override
	public int method6698() {
		@Pc(6) int local6 = this.anInt4999 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt5005 == 0) {
			local6 -= local6 * this.anInt5003 / (((Class2_Sub13_Sub1) super.aClass2_Sub13_5).aByteArray101.length << 8);
		} else if (this.anInt5005 >= 0) {
			local6 -= local6 * this.anInt5002 / ((Class2_Sub13_Sub1) super.aClass2_Sub13_5).aByteArray101.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!lca", name = "i", descriptor = "(I)V")
	public synchronized void method4331(@OriginalArg(0) int arg0) {
		this.anInt5005 = arg0;
	}
}
