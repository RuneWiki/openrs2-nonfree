import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rd")
public final class Class1_Sub6_Sub3 extends Class1_Sub6 {

	@OriginalMember(owner = "client!rd", name = "q", descriptor = "I")
	private int anInt5900;

	@OriginalMember(owner = "client!rd", name = "r", descriptor = "I")
	public int anInt5901;

	@OriginalMember(owner = "client!rd", name = "t", descriptor = "I")
	public int anInt5903;

	@OriginalMember(owner = "client!rd", name = "u", descriptor = "I")
	public int anInt5904;

	@OriginalMember(owner = "client!rd", name = "x", descriptor = "I")
	public int anInt5907;

	@OriginalMember(owner = "client!rd", name = "y", descriptor = "I")
	public int anInt5908;

	@OriginalMember(owner = "client!rd", name = "B", descriptor = "I")
	private int anInt5909;

	@OriginalMember(owner = "client!rd", name = "C", descriptor = "I")
	public int anInt5910;

	@OriginalMember(owner = "client!rd", name = "D", descriptor = "I")
	private final int anInt5911;

	@OriginalMember(owner = "client!rd", name = "E", descriptor = "I")
	private final int anInt5912;

	@OriginalMember(owner = "client!rd", name = "z", descriptor = "Z")
	private final boolean aBoolean674;

	@OriginalMember(owner = "client!rd", name = "w", descriptor = "I")
	private int anInt5906;

	@OriginalMember(owner = "client!rd", name = "v", descriptor = "I")
	private int anInt5905;

	@OriginalMember(owner = "client!rd", name = "p", descriptor = "I")
	private int anInt5899;

	@OriginalMember(owner = "client!rd", name = "s", descriptor = "I")
	public int anInt5902;

	@OriginalMember(owner = "client!rd", name = "<init>", descriptor = "(Lclient!jj;II)V")
	public Class1_Sub6_Sub3(@OriginalArg(0) Class1_Sub25_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass1_Sub25_5 = arg0;
		this.anInt5911 = arg0.anInt3340;
		this.anInt5912 = arg0.anInt3339;
		this.aBoolean674 = arg0.aBoolean384;
		this.anInt5906 = arg1;
		this.anInt5905 = arg2;
		this.anInt5899 = 8192;
		this.anInt5902 = 0;
		this.method4641();
	}

	@OriginalMember(owner = "client!rd", name = "<init>", descriptor = "(Lclient!jj;III)V")
	public Class1_Sub6_Sub3(@OriginalArg(0) Class1_Sub25_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass1_Sub25_5 = arg0;
		this.anInt5911 = arg0.anInt3340;
		this.anInt5912 = arg0.anInt3339;
		this.aBoolean674 = arg0.aBoolean384;
		this.anInt5906 = arg1;
		this.anInt5905 = arg2;
		this.anInt5899 = arg3;
		this.anInt5902 = 0;
		this.method4641();
	}

	@OriginalMember(owner = "client!rd", name = "d", descriptor = "(I)V")
	public synchronized void method4637(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class1_Sub25_Sub1) super.aClass1_Sub25_5).aByteArray37.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt5902 = arg0;
	}

	@OriginalMember(owner = "client!rd", name = "e", descriptor = "(I)V")
	public synchronized void method4638(@OriginalArg(0) int arg0) {
		this.anInt5900 = arg0;
	}

	@OriginalMember(owner = "client!rd", name = "e", descriptor = "()V")
	private void method4641() {
		this.anInt5908 = this.anInt5905;
		this.anInt5910 = Static466.method4668(this.anInt5905, this.anInt5899);
		this.anInt5904 = Static466.method4659(this.anInt5905, this.anInt5899);
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(Z)V")
	public synchronized void method4642() {
		this.anInt5906 = (this.anInt5906 ^ this.anInt5906 >> 31) + (this.anInt5906 >>> 31);
		this.anInt5906 = -this.anInt5906;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "([IIIII)I")
	private int method4643(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt5909 <= 0) {
				if (this.anInt5906 == 256 && (this.anInt5902 & 0xFF) == 0) {
					if (Static166.aBoolean323) {
						return Static466.method4662(((Class1_Sub25_Sub1) super.aClass1_Sub25_5).aByteArray37, arg0, this.anInt5902, arg1, this.anInt5910, this.anInt5904, arg3, arg2, this);
					}
					return Static466.method4639(((Class1_Sub25_Sub1) super.aClass1_Sub25_5).aByteArray37, arg0, this.anInt5902, arg1, this.anInt5908, arg3, arg2, this);
				}
				if (Static166.aBoolean323) {
					return Static466.method4663(((Class1_Sub25_Sub1) super.aClass1_Sub25_5).aByteArray37, arg0, this.anInt5902, arg1, this.anInt5910, this.anInt5904, arg3, arg2, this, this.anInt5906, arg4);
				}
				return Static466.method4676(((Class1_Sub25_Sub1) super.aClass1_Sub25_5).aByteArray37, arg0, this.anInt5902, arg1, this.anInt5908, arg3, arg2, this, this.anInt5906, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt5909;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt5909 += arg1;
			if (this.anInt5906 == 256 && (this.anInt5902 & 0xFF) == 0) {
				if (Static166.aBoolean323) {
					arg1 = Static466.method4656(((Class1_Sub25_Sub1) super.aClass1_Sub25_5).aByteArray37, arg0, this.anInt5902, arg1, this.anInt5910, this.anInt5904, this.anInt5903, this.anInt5907, local5, arg2, this);
				} else {
					arg1 = Static466.method4670(((Class1_Sub25_Sub1) super.aClass1_Sub25_5).aByteArray37, arg0, this.anInt5902, arg1, this.anInt5908, this.anInt5901, local5, arg2, this);
				}
			} else if (Static166.aBoolean323) {
				arg1 = Static466.method4652(((Class1_Sub25_Sub1) super.aClass1_Sub25_5).aByteArray37, arg0, this.anInt5902, arg1, this.anInt5910, this.anInt5904, this.anInt5903, this.anInt5907, local5, arg2, this, this.anInt5906, arg4);
			} else {
				arg1 = Static466.method4672(((Class1_Sub25_Sub1) super.aClass1_Sub25_5).aByteArray37, arg0, this.anInt5902, arg1, this.anInt5908, this.anInt5901, local5, arg2, this, this.anInt5906, arg4);
			}
			this.anInt5909 -= arg1;
			if (this.anInt5909 != 0) {
				return arg1;
			}
		} while (!this.method4657());
		return arg3;
	}

	@OriginalMember(owner = "client!rd", name = "f", descriptor = "()Z")
	public boolean method4644() {
		return this.anInt5902 < 0 || this.anInt5902 >= ((Class1_Sub25_Sub1) super.aClass1_Sub25_5).aByteArray37.length << 8;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(II)V")
	public synchronized void method4645(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method4660(arg0, arg1, this.method4673());
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "([IIIII)I")
	private int method4649(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt5909 <= 0) {
				if (this.anInt5906 == -256 && (this.anInt5902 & 0xFF) == 0) {
					if (Static166.aBoolean323) {
						return Static466.method4648(((Class1_Sub25_Sub1) super.aClass1_Sub25_5).aByteArray37, arg0, this.anInt5902, arg1, this.anInt5910, this.anInt5904, arg3, arg2, this);
					}
					return Static466.method4647(((Class1_Sub25_Sub1) super.aClass1_Sub25_5).aByteArray37, arg0, this.anInt5902, arg1, this.anInt5908, arg3, arg2, this);
				}
				if (Static166.aBoolean323) {
					return Static466.method4655(((Class1_Sub25_Sub1) super.aClass1_Sub25_5).aByteArray37, arg0, this.anInt5902, arg1, this.anInt5910, this.anInt5904, arg3, arg2, this, this.anInt5906, arg4);
				}
				return Static466.method4665(((Class1_Sub25_Sub1) super.aClass1_Sub25_5).aByteArray37, arg0, this.anInt5902, arg1, this.anInt5908, arg3, arg2, this, this.anInt5906, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt5909;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt5909 += arg1;
			if (this.anInt5906 == -256 && (this.anInt5902 & 0xFF) == 0) {
				if (Static166.aBoolean323) {
					arg1 = Static466.method4671(((Class1_Sub25_Sub1) super.aClass1_Sub25_5).aByteArray37, arg0, this.anInt5902, arg1, this.anInt5910, this.anInt5904, this.anInt5903, this.anInt5907, local5, arg2, this);
				} else {
					arg1 = Static466.method4658(((Class1_Sub25_Sub1) super.aClass1_Sub25_5).aByteArray37, arg0, this.anInt5902, arg1, this.anInt5908, this.anInt5901, local5, arg2, this);
				}
			} else if (Static166.aBoolean323) {
				arg1 = Static466.method4651(((Class1_Sub25_Sub1) super.aClass1_Sub25_5).aByteArray37, arg0, this.anInt5902, arg1, this.anInt5910, this.anInt5904, this.anInt5903, this.anInt5907, local5, arg2, this, this.anInt5906, arg4);
			} else {
				arg1 = Static466.method4646(((Class1_Sub25_Sub1) super.aClass1_Sub25_5).aByteArray37, arg0, this.anInt5902, arg1, this.anInt5908, this.anInt5901, local5, arg2, this, this.anInt5906, arg4);
			}
			this.anInt5909 -= arg1;
			if (this.anInt5909 != 0) {
				return arg1;
			}
		} while (!this.method4657());
		return arg3;
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(II)V")
	private synchronized void method4650(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5905 = arg0;
		this.anInt5899 = arg1;
		this.anInt5909 = 0;
		this.method4641();
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "()Lclient!vb;")
	@Override
	public Class1_Sub6 method5167() {
		return null;
	}

	@OriginalMember(owner = "client!rd", name = "f", descriptor = "(I)V")
	public synchronized void method4653(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method4666();
			this.method5915();
		} else if (this.anInt5910 == 0 && this.anInt5904 == 0) {
			this.anInt5909 = 0;
			this.anInt5905 = 0;
			this.anInt5908 = 0;
			this.method5915();
		} else {
			@Pc(31) int local31 = -this.anInt5908;
			if (this.anInt5908 > local31) {
				local31 = this.anInt5908;
			}
			if (-this.anInt5910 > local31) {
				local31 = -this.anInt5910;
			}
			if (this.anInt5910 > local31) {
				local31 = this.anInt5910;
			}
			if (-this.anInt5904 > local31) {
				local31 = -this.anInt5904;
			}
			if (this.anInt5904 > local31) {
				local31 = this.anInt5904;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt5909 = arg0;
			this.anInt5905 = Integer.MIN_VALUE;
			this.anInt5901 = -this.anInt5908 / arg0;
			this.anInt5903 = -this.anInt5910 / arg0;
			this.anInt5907 = -this.anInt5904 / arg0;
		}
	}

	@OriginalMember(owner = "client!rd", name = "g", descriptor = "()I")
	public synchronized int method4654() {
		return this.anInt5906 < 0 ? -this.anInt5906 : this.anInt5906;
	}

	@OriginalMember(owner = "client!rd", name = "d", descriptor = "()I")
	@Override
	public int method5169() {
		@Pc(6) int local6 = this.anInt5908 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt5900 == 0) {
			local6 -= local6 * this.anInt5902 / (((Class1_Sub25_Sub1) super.aClass1_Sub25_5).aByteArray37.length << 8);
		} else if (this.anInt5900 >= 0) {
			local6 -= local6 * this.anInt5911 / ((Class1_Sub25_Sub1) super.aClass1_Sub25_5).aByteArray37.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!rd", name = "h", descriptor = "()Z")
	private boolean method4657() {
		@Pc(2) int local2 = this.anInt5905;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static466.method4668(local2, this.anInt5899);
			local8 = Static466.method4659(local2, this.anInt5899);
		}
		if (this.anInt5908 != local2 || this.anInt5910 != local10 || this.anInt5904 != local8) {
			if (this.anInt5908 < local2) {
				this.anInt5901 = 1;
				this.anInt5909 = local2 - this.anInt5908;
			} else if (this.anInt5908 > local2) {
				this.anInt5901 = -1;
				this.anInt5909 = this.anInt5908 - local2;
			} else {
				this.anInt5901 = 0;
			}
			if (this.anInt5910 < local10) {
				this.anInt5903 = 1;
				if (this.anInt5909 == 0 || this.anInt5909 > local10 - this.anInt5910) {
					this.anInt5909 = local10 - this.anInt5910;
				}
			} else if (this.anInt5910 > local10) {
				this.anInt5903 = -1;
				if (this.anInt5909 == 0 || this.anInt5909 > this.anInt5910 - local10) {
					this.anInt5909 = this.anInt5910 - local10;
				}
			} else {
				this.anInt5903 = 0;
			}
			if (this.anInt5904 < local8) {
				this.anInt5907 = 1;
				if (this.anInt5909 == 0 || this.anInt5909 > local8 - this.anInt5904) {
					this.anInt5909 = local8 - this.anInt5904;
				}
			} else if (this.anInt5904 > local8) {
				this.anInt5907 = -1;
				if (this.anInt5909 == 0 || this.anInt5909 > this.anInt5904 - local8) {
					this.anInt5909 = this.anInt5904 - local8;
				}
			} else {
				this.anInt5907 = 0;
			}
			return false;
		} else if (this.anInt5905 == Integer.MIN_VALUE) {
			this.anInt5905 = 0;
			this.anInt5908 = this.anInt5910 = this.anInt5904 = 0;
			this.method5915();
			return true;
		} else {
			this.method4641();
			return false;
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "()I")
	@Override
	public int method5165() {
		return this.anInt5905 == 0 && this.anInt5909 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(III)V")
	public synchronized void method4660(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method4650(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static466.method4668(arg1, arg2);
		@Pc(14) int local14 = Static466.method4659(arg1, arg2);
		if (this.anInt5910 == local10 && this.anInt5904 == local14) {
			this.anInt5909 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt5908;
		if (this.anInt5908 - arg1 > local31) {
			local31 = this.anInt5908 - arg1;
		}
		if (local10 - this.anInt5910 > local31) {
			local31 = local10 - this.anInt5910;
		}
		if (this.anInt5910 - local10 > local31) {
			local31 = this.anInt5910 - local10;
		}
		if (local14 - this.anInt5904 > local31) {
			local31 = local14 - this.anInt5904;
		}
		if (this.anInt5904 - local14 > local31) {
			local31 = this.anInt5904 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt5909 = arg0;
		this.anInt5905 = arg1;
		this.anInt5899 = arg2;
		this.anInt5901 = (arg1 - this.anInt5908) / arg0;
		this.anInt5903 = (local10 - this.anInt5910) / arg0;
		this.anInt5907 = (local14 - this.anInt5904) / arg0;
	}

	@OriginalMember(owner = "client!rd", name = "i", descriptor = "()V")
	private void method4664() {
		if (this.anInt5909 == 0) {
			return;
		}
		if (this.anInt5905 == Integer.MIN_VALUE) {
			this.anInt5905 = 0;
		}
		this.anInt5909 = 0;
		this.method4641();
	}

	@OriginalMember(owner = "client!rd", name = "g", descriptor = "(I)V")
	private synchronized void method4666() {
		this.method4650(0, this.method4673());
	}

	@OriginalMember(owner = "client!rd", name = "h", descriptor = "(I)V")
	public synchronized void method4667(@OriginalArg(0) int arg0) {
		this.method4650(arg0 << 6, this.method4673());
	}

	@OriginalMember(owner = "client!rd", name = "j", descriptor = "()I")
	public synchronized int method4669() {
		return this.anInt5905 == Integer.MIN_VALUE ? 0 : this.anInt5905;
	}

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "()Lclient!vb;")
	@Override
	public Class1_Sub6 method5168() {
		return null;
	}

	@OriginalMember(owner = "client!rd", name = "k", descriptor = "()I")
	public synchronized int method4673() {
		return this.anInt5899 < 0 ? -1 : this.anInt5899;
	}

	@OriginalMember(owner = "client!rd", name = "i", descriptor = "(I)V")
	public synchronized void method4674(@OriginalArg(0) int arg0) {
		if (this.anInt5906 < 0) {
			this.anInt5906 = -arg0;
		} else {
			this.anInt5906 = arg0;
		}
	}

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method5166(@OriginalArg(0) int arg0) {
		if (this.anInt5909 > 0) {
			if (arg0 >= this.anInt5909) {
				if (this.anInt5905 == Integer.MIN_VALUE) {
					this.anInt5905 = 0;
					this.anInt5908 = this.anInt5910 = this.anInt5904 = 0;
					this.method5915();
					arg0 = this.anInt5909;
				}
				this.anInt5909 = 0;
				this.method4641();
			} else {
				this.anInt5908 += this.anInt5901 * arg0;
				this.anInt5910 += this.anInt5903 * arg0;
				this.anInt5904 += this.anInt5907 * arg0;
				this.anInt5909 -= arg0;
			}
		}
		@Pc(71) Class1_Sub25_Sub1 local71 = (Class1_Sub25_Sub1) super.aClass1_Sub25_5;
		@Pc(76) int local76 = this.anInt5911 << 8;
		@Pc(81) int local81 = this.anInt5912 << 8;
		@Pc(87) int local87 = local71.aByteArray37.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt5900 = 0;
		}
		if (this.anInt5902 < 0) {
			if (this.anInt5906 <= 0) {
				this.method4664();
				this.method5915();
				return;
			}
			this.anInt5902 = 0;
		}
		if (this.anInt5902 >= local87) {
			if (this.anInt5906 >= 0) {
				this.method4664();
				this.method5915();
				return;
			}
			this.anInt5902 = local87 - 1;
		}
		this.anInt5902 += this.anInt5906 * arg0;
		if (this.anInt5900 >= 0) {
			if (this.anInt5900 > 0) {
				if (this.aBoolean674) {
					label125: {
						if (this.anInt5906 < 0) {
							if (this.anInt5902 >= local76) {
								return;
							}
							this.anInt5902 = local76 + local76 - this.anInt5902 - 1;
							this.anInt5906 = -this.anInt5906;
							if (--this.anInt5900 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt5902 < local81) {
								return;
							}
							this.anInt5902 = local81 + local81 - this.anInt5902 - 1;
							this.anInt5906 = -this.anInt5906;
							if (--this.anInt5900 == 0) {
								break;
							}
							if (this.anInt5902 >= local76) {
								return;
							}
							this.anInt5902 = local76 + local76 - this.anInt5902 - 1;
							this.anInt5906 = -this.anInt5906;
						} while (--this.anInt5900 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt5906 < 0) {
						if (this.anInt5902 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt5902 - 1) / local91;
						if (local361 < this.anInt5900) {
							this.anInt5902 += local91 * local361;
							this.anInt5900 -= local361;
							return;
						}
						this.anInt5902 += local91 * this.anInt5900;
						this.anInt5900 = 0;
					} else if (this.anInt5902 >= local81) {
						local361 = (this.anInt5902 - local76) / local91;
						if (local361 < this.anInt5900) {
							this.anInt5902 -= local91 * local361;
							this.anInt5900 -= local361;
							return;
						}
						this.anInt5902 -= local91 * this.anInt5900;
						this.anInt5900 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt5906 < 0) {
				if (this.anInt5902 < 0) {
					this.anInt5902 = -1;
					this.method4664();
					this.method5915();
					return;
				}
			} else if (this.anInt5902 >= local87) {
				this.anInt5902 = local87;
				this.method4664();
				this.method5915();
			}
		} else if (this.aBoolean674) {
			if (this.anInt5906 < 0) {
				if (this.anInt5902 >= local76) {
					return;
				}
				this.anInt5902 = local76 + local76 - this.anInt5902 - 1;
				this.anInt5906 = -this.anInt5906;
			}
			while (this.anInt5902 >= local81) {
				this.anInt5902 = local81 + local81 - this.anInt5902 - 1;
				this.anInt5906 = -this.anInt5906;
				if (this.anInt5902 >= local76) {
					return;
				}
				this.anInt5902 = local76 + local76 - this.anInt5902 - 1;
				this.anInt5906 = -this.anInt5906;
			}
		} else if (this.anInt5906 < 0) {
			if (this.anInt5902 < local76) {
				this.anInt5902 = local81 - (local81 - 1 - this.anInt5902) % local91 - 1;
			}
		} else if (this.anInt5902 >= local81) {
			this.anInt5902 = local76 + (this.anInt5902 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!rd", name = "l", descriptor = "()Z")
	public boolean method4675() {
		return this.anInt5909 != 0;
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method5171(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt5905 == 0 && this.anInt5909 == 0) {
			this.method5166(arg2);
			return;
		}
		@Pc(13) Class1_Sub25_Sub1 local13 = (Class1_Sub25_Sub1) super.aClass1_Sub25_5;
		@Pc(18) int local18 = this.anInt5911 << 8;
		@Pc(23) int local23 = this.anInt5912 << 8;
		@Pc(29) int local29 = local13.aByteArray37.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt5900 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt5902 < 0) {
			if (this.anInt5906 <= 0) {
				this.method4664();
				this.method5915();
				return;
			}
			this.anInt5902 = 0;
		}
		if (this.anInt5902 >= local29) {
			if (this.anInt5906 >= 0) {
				this.method4664();
				this.method5915();
				return;
			}
			this.anInt5902 = local29 - 1;
		}
		if (this.anInt5900 >= 0) {
			if (this.anInt5900 > 0) {
				if (this.aBoolean674) {
					label130: {
						if (this.anInt5906 < 0) {
							local40 = this.method4649(arg0, arg1, local18, local44, local13.aByteArray37[this.anInt5911]);
							if (this.anInt5902 >= local18) {
								return;
							}
							this.anInt5902 = local18 + local18 - this.anInt5902 - 1;
							this.anInt5906 = -this.anInt5906;
							if (--this.anInt5900 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method4643(arg0, local40, local23, local44, local13.aByteArray37[this.anInt5912 - 1]);
							if (this.anInt5902 < local23) {
								return;
							}
							this.anInt5902 = local23 + local23 - this.anInt5902 - 1;
							this.anInt5906 = -this.anInt5906;
							if (--this.anInt5900 == 0) {
								break;
							}
							local40 = this.method4649(arg0, local40, local18, local44, local13.aByteArray37[this.anInt5911]);
							if (this.anInt5902 >= local18) {
								return;
							}
							this.anInt5902 = local18 + local18 - this.anInt5902 - 1;
							this.anInt5906 = -this.anInt5906;
						} while (--this.anInt5900 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt5906 < 0) {
						while (true) {
							local40 = this.method4649(arg0, local40, local18, local44, local13.aByteArray37[this.anInt5912 - 1]);
							if (this.anInt5902 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt5902 - 1) / local33;
							if (local416 >= this.anInt5900) {
								this.anInt5902 += local33 * this.anInt5900;
								this.anInt5900 = 0;
								break;
							}
							this.anInt5902 += local33 * local416;
							this.anInt5900 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method4643(arg0, local40, local23, local44, local13.aByteArray37[this.anInt5911]);
							if (this.anInt5902 < local23) {
								return;
							}
							local416 = (this.anInt5902 - local18) / local33;
							if (local416 >= this.anInt5900) {
								this.anInt5902 -= local33 * this.anInt5900;
								this.anInt5900 = 0;
								break;
							}
							this.anInt5902 -= local33 * local416;
							this.anInt5900 -= local416;
						}
					}
				}
			}
			if (this.anInt5906 < 0) {
				this.method4649(arg0, local40, 0, local44, 0);
				if (this.anInt5902 < 0) {
					this.anInt5902 = -1;
					this.method4664();
					this.method5915();
					return;
				}
			} else {
				this.method4643(arg0, local40, local29, local44, 0);
				if (this.anInt5902 >= local29) {
					this.anInt5902 = local29;
					this.method4664();
					this.method5915();
				}
			}
		} else if (this.aBoolean674) {
			if (this.anInt5906 < 0) {
				local40 = this.method4649(arg0, arg1, local18, local44, local13.aByteArray37[this.anInt5911]);
				if (this.anInt5902 >= local18) {
					return;
				}
				this.anInt5902 = local18 + local18 - this.anInt5902 - 1;
				this.anInt5906 = -this.anInt5906;
			}
			while (true) {
				local40 = this.method4643(arg0, local40, local23, local44, local13.aByteArray37[this.anInt5912 - 1]);
				if (this.anInt5902 < local23) {
					return;
				}
				this.anInt5902 = local23 + local23 - this.anInt5902 - 1;
				this.anInt5906 = -this.anInt5906;
				local40 = this.method4649(arg0, local40, local18, local44, local13.aByteArray37[this.anInt5911]);
				if (this.anInt5902 >= local18) {
					return;
				}
				this.anInt5902 = local18 + local18 - this.anInt5902 - 1;
				this.anInt5906 = -this.anInt5906;
			}
		} else if (this.anInt5906 < 0) {
			while (true) {
				local40 = this.method4649(arg0, local40, local18, local44, local13.aByteArray37[this.anInt5912 - 1]);
				if (this.anInt5902 >= local18) {
					return;
				}
				this.anInt5902 = local23 - (local23 - 1 - this.anInt5902) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method4643(arg0, local40, local23, local44, local13.aByteArray37[this.anInt5911]);
				if (this.anInt5902 < local23) {
					return;
				}
				this.anInt5902 = local18 + (this.anInt5902 - local18) % local33;
			}
		}
	}
}
