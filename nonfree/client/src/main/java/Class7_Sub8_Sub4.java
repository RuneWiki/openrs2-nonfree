import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tk")
public final class Class7_Sub8_Sub4 extends Class7_Sub8 {

	@OriginalMember(owner = "client!tk", name = "p", descriptor = "I")
	public int anInt5851;

	@OriginalMember(owner = "client!tk", name = "q", descriptor = "I")
	public int anInt5852;

	@OriginalMember(owner = "client!tk", name = "s", descriptor = "I")
	public int anInt5854;

	@OriginalMember(owner = "client!tk", name = "t", descriptor = "I")
	public int anInt5855;

	@OriginalMember(owner = "client!tk", name = "u", descriptor = "I")
	private int anInt5856;

	@OriginalMember(owner = "client!tk", name = "v", descriptor = "I")
	private int anInt5857;

	@OriginalMember(owner = "client!tk", name = "B", descriptor = "I")
	public int anInt5861;

	@OriginalMember(owner = "client!tk", name = "D", descriptor = "I")
	public int anInt5863;

	@OriginalMember(owner = "client!tk", name = "y", descriptor = "I")
	private final int anInt5859;

	@OriginalMember(owner = "client!tk", name = "C", descriptor = "I")
	private final int anInt5862;

	@OriginalMember(owner = "client!tk", name = "x", descriptor = "Z")
	private final boolean aBoolean428;

	@OriginalMember(owner = "client!tk", name = "r", descriptor = "I")
	private int anInt5853;

	@OriginalMember(owner = "client!tk", name = "E", descriptor = "I")
	private int anInt5864;

	@OriginalMember(owner = "client!tk", name = "w", descriptor = "I")
	private int anInt5858;

	@OriginalMember(owner = "client!tk", name = "z", descriptor = "I")
	public int anInt5860;

	@OriginalMember(owner = "client!tk", name = "<init>", descriptor = "(Lclient!kf;II)V")
	public Class7_Sub8_Sub4(@OriginalArg(0) Class7_Sub20_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass7_Sub20_5 = arg0;
		this.anInt5859 = arg0.anInt3466;
		this.anInt5862 = arg0.anInt3467;
		this.aBoolean428 = arg0.aBoolean256;
		this.anInt5853 = arg1;
		this.anInt5864 = arg2;
		this.anInt5858 = 8192;
		this.anInt5860 = 0;
		this.method4953();
	}

	@OriginalMember(owner = "client!tk", name = "<init>", descriptor = "(Lclient!kf;III)V")
	public Class7_Sub8_Sub4(@OriginalArg(0) Class7_Sub20_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass7_Sub20_5 = arg0;
		this.anInt5859 = arg0.anInt3466;
		this.anInt5862 = arg0.anInt3467;
		this.aBoolean428 = arg0.aBoolean256;
		this.anInt5853 = arg1;
		this.anInt5864 = arg2;
		this.anInt5858 = arg3;
		this.anInt5860 = 0;
		this.method4953();
	}

	@OriginalMember(owner = "client!tk", name = "e", descriptor = "()Z")
	public boolean method4939() {
		return this.anInt5860 < 0 || this.anInt5860 >= ((Class7_Sub20_Sub1) super.aClass7_Sub20_5).aByteArray50.length << 8;
	}

	@OriginalMember(owner = "client!tk", name = "d", descriptor = "(I)V")
	public synchronized void method4942(@OriginalArg(0) int arg0) {
		if (this.anInt5853 < 0) {
			this.anInt5853 = -arg0;
		} else {
			this.anInt5853 = arg0;
		}
	}

	@OriginalMember(owner = "client!tk", name = "f", descriptor = "()I")
	public synchronized int method4944() {
		return this.anInt5858 < 0 ? -1 : this.anInt5858;
	}

	@OriginalMember(owner = "client!tk", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method4936(@OriginalArg(0) int arg0) {
		if (this.anInt5856 > 0) {
			if (arg0 >= this.anInt5856) {
				if (this.anInt5864 == Integer.MIN_VALUE) {
					this.anInt5864 = 0;
					this.anInt5863 = this.anInt5852 = this.anInt5855 = 0;
					this.method5648();
					arg0 = this.anInt5856;
				}
				this.anInt5856 = 0;
				this.method4953();
			} else {
				this.anInt5863 += this.anInt5854 * arg0;
				this.anInt5852 += this.anInt5851 * arg0;
				this.anInt5855 += this.anInt5861 * arg0;
				this.anInt5856 -= arg0;
			}
		}
		@Pc(71) Class7_Sub20_Sub1 local71 = (Class7_Sub20_Sub1) super.aClass7_Sub20_5;
		@Pc(76) int local76 = this.anInt5859 << 8;
		@Pc(81) int local81 = this.anInt5862 << 8;
		@Pc(87) int local87 = local71.aByteArray50.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt5857 = 0;
		}
		if (this.anInt5860 < 0) {
			if (this.anInt5853 <= 0) {
				this.method4962();
				this.method5648();
				return;
			}
			this.anInt5860 = 0;
		}
		if (this.anInt5860 >= local87) {
			if (this.anInt5853 >= 0) {
				this.method4962();
				this.method5648();
				return;
			}
			this.anInt5860 = local87 - 1;
		}
		this.anInt5860 += this.anInt5853 * arg0;
		if (this.anInt5857 >= 0) {
			if (this.anInt5857 > 0) {
				if (this.aBoolean428) {
					label125: {
						if (this.anInt5853 < 0) {
							if (this.anInt5860 >= local76) {
								return;
							}
							this.anInt5860 = local76 + local76 - this.anInt5860 - 1;
							this.anInt5853 = -this.anInt5853;
							if (--this.anInt5857 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt5860 < local81) {
								return;
							}
							this.anInt5860 = local81 + local81 - this.anInt5860 - 1;
							this.anInt5853 = -this.anInt5853;
							if (--this.anInt5857 == 0) {
								break;
							}
							if (this.anInt5860 >= local76) {
								return;
							}
							this.anInt5860 = local76 + local76 - this.anInt5860 - 1;
							this.anInt5853 = -this.anInt5853;
						} while (--this.anInt5857 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt5853 < 0) {
						if (this.anInt5860 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt5860 - 1) / local91;
						if (local361 < this.anInt5857) {
							this.anInt5860 += local91 * local361;
							this.anInt5857 -= local361;
							return;
						}
						this.anInt5860 += local91 * this.anInt5857;
						this.anInt5857 = 0;
					} else if (this.anInt5860 >= local81) {
						local361 = (this.anInt5860 - local76) / local91;
						if (local361 < this.anInt5857) {
							this.anInt5860 -= local91 * local361;
							this.anInt5857 -= local361;
							return;
						}
						this.anInt5860 -= local91 * this.anInt5857;
						this.anInt5857 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt5853 < 0) {
				if (this.anInt5860 < 0) {
					this.anInt5860 = -1;
					this.method4962();
					this.method5648();
					return;
				}
			} else if (this.anInt5860 >= local87) {
				this.anInt5860 = local87;
				this.method4962();
				this.method5648();
			}
		} else if (this.aBoolean428) {
			if (this.anInt5853 < 0) {
				if (this.anInt5860 >= local76) {
					return;
				}
				this.anInt5860 = local76 + local76 - this.anInt5860 - 1;
				this.anInt5853 = -this.anInt5853;
			}
			while (this.anInt5860 >= local81) {
				this.anInt5860 = local81 + local81 - this.anInt5860 - 1;
				this.anInt5853 = -this.anInt5853;
				if (this.anInt5860 >= local76) {
					return;
				}
				this.anInt5860 = local76 + local76 - this.anInt5860 - 1;
				this.anInt5853 = -this.anInt5853;
			}
		} else if (this.anInt5853 < 0) {
			if (this.anInt5860 < local76) {
				this.anInt5860 = local81 - (local81 - 1 - this.anInt5860) % local91 - 1;
			}
		} else if (this.anInt5860 >= local81) {
			this.anInt5860 = local76 + (this.anInt5860 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!tk", name = "e", descriptor = "(I)V")
	public synchronized void method4945(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class7_Sub20_Sub1) super.aClass7_Sub20_5).aByteArray50.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt5860 = arg0;
	}

	@OriginalMember(owner = "client!tk", name = "f", descriptor = "(I)V")
	public synchronized void method4947(@OriginalArg(0) int arg0) {
		this.anInt5857 = arg0;
	}

	@OriginalMember(owner = "client!tk", name = "d", descriptor = "()I")
	@Override
	public int method4935() {
		return this.anInt5864 == 0 && this.anInt5856 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "()Lclient!mi;")
	@Override
	public Class7_Sub8 method4930() {
		return null;
	}

	@OriginalMember(owner = "client!tk", name = "g", descriptor = "(I)V")
	public synchronized void method4950(@OriginalArg(0) int arg0) {
		this.method4959(arg0 << 6, this.method4944());
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "([IIIII)I")
	private int method4952(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt5856 <= 0) {
				if (this.anInt5853 == 256 && (this.anInt5860 & 0xFF) == 0) {
					if (Static103.aBoolean170) {
						return Static367.method4948(((Class7_Sub20_Sub1) super.aClass7_Sub20_5).aByteArray50, arg0, this.anInt5860, arg1, this.anInt5852, this.anInt5855, arg3, arg2, this);
					}
					return Static367.method4967(((Class7_Sub20_Sub1) super.aClass7_Sub20_5).aByteArray50, arg0, this.anInt5860, arg1, this.anInt5863, arg3, arg2, this);
				}
				if (Static103.aBoolean170) {
					return Static367.method4943(((Class7_Sub20_Sub1) super.aClass7_Sub20_5).aByteArray50, arg0, this.anInt5860, arg1, this.anInt5852, this.anInt5855, arg3, arg2, this, this.anInt5853, arg4);
				}
				return Static367.method4938(((Class7_Sub20_Sub1) super.aClass7_Sub20_5).aByteArray50, arg0, this.anInt5860, arg1, this.anInt5863, arg3, arg2, this, this.anInt5853, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt5856;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt5856 += arg1;
			if (this.anInt5853 == 256 && (this.anInt5860 & 0xFF) == 0) {
				if (Static103.aBoolean170) {
					arg1 = Static367.method4957(((Class7_Sub20_Sub1) super.aClass7_Sub20_5).aByteArray50, arg0, this.anInt5860, arg1, this.anInt5852, this.anInt5855, this.anInt5851, this.anInt5861, local5, arg2, this);
				} else {
					arg1 = Static367.method4975(((Class7_Sub20_Sub1) super.aClass7_Sub20_5).aByteArray50, arg0, this.anInt5860, arg1, this.anInt5863, this.anInt5854, local5, arg2, this);
				}
			} else if (Static103.aBoolean170) {
				arg1 = Static367.method4974(((Class7_Sub20_Sub1) super.aClass7_Sub20_5).aByteArray50, arg0, this.anInt5860, arg1, this.anInt5852, this.anInt5855, this.anInt5851, this.anInt5861, local5, arg2, this, this.anInt5853, arg4);
			} else {
				arg1 = Static367.method4941(((Class7_Sub20_Sub1) super.aClass7_Sub20_5).aByteArray50, arg0, this.anInt5860, arg1, this.anInt5863, this.anInt5854, local5, arg2, this, this.anInt5853, arg4);
			}
			this.anInt5856 -= arg1;
			if (this.anInt5856 != 0) {
				return arg1;
			}
		} while (!this.method4970());
		return arg3;
	}

	@OriginalMember(owner = "client!tk", name = "g", descriptor = "()V")
	private void method4953() {
		this.anInt5863 = this.anInt5864;
		this.anInt5852 = Static367.method4961(this.anInt5864, this.anInt5858);
		this.anInt5855 = Static367.method4956(this.anInt5864, this.anInt5858);
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(Z)V")
	public synchronized void method4954() {
		this.anInt5853 = (this.anInt5853 ^ this.anInt5853 >> 31) + (this.anInt5853 >>> 31);
		this.anInt5853 = -this.anInt5853;
	}

	@OriginalMember(owner = "client!tk", name = "b", descriptor = "([IIIII)I")
	private int method4958(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt5856 <= 0) {
				if (this.anInt5853 == -256 && (this.anInt5860 & 0xFF) == 0) {
					if (Static103.aBoolean170) {
						return Static367.method4951(((Class7_Sub20_Sub1) super.aClass7_Sub20_5).aByteArray50, arg0, this.anInt5860, arg1, this.anInt5852, this.anInt5855, arg3, arg2, this);
					}
					return Static367.method4966(((Class7_Sub20_Sub1) super.aClass7_Sub20_5).aByteArray50, arg0, this.anInt5860, arg1, this.anInt5863, arg3, arg2, this);
				}
				if (Static103.aBoolean170) {
					return Static367.method4940(((Class7_Sub20_Sub1) super.aClass7_Sub20_5).aByteArray50, arg0, this.anInt5860, arg1, this.anInt5852, this.anInt5855, arg3, arg2, this, this.anInt5853, arg4);
				}
				return Static367.method4937(((Class7_Sub20_Sub1) super.aClass7_Sub20_5).aByteArray50, arg0, this.anInt5860, arg1, this.anInt5863, arg3, arg2, this, this.anInt5853, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt5856;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt5856 += arg1;
			if (this.anInt5853 == -256 && (this.anInt5860 & 0xFF) == 0) {
				if (Static103.aBoolean170) {
					arg1 = Static367.method4968(((Class7_Sub20_Sub1) super.aClass7_Sub20_5).aByteArray50, arg0, this.anInt5860, arg1, this.anInt5852, this.anInt5855, this.anInt5851, this.anInt5861, local5, arg2, this);
				} else {
					arg1 = Static367.method4969(((Class7_Sub20_Sub1) super.aClass7_Sub20_5).aByteArray50, arg0, this.anInt5860, arg1, this.anInt5863, this.anInt5854, local5, arg2, this);
				}
			} else if (Static103.aBoolean170) {
				arg1 = Static367.method4949(((Class7_Sub20_Sub1) super.aClass7_Sub20_5).aByteArray50, arg0, this.anInt5860, arg1, this.anInt5852, this.anInt5855, this.anInt5851, this.anInt5861, local5, arg2, this, this.anInt5853, arg4);
			} else {
				arg1 = Static367.method4946(((Class7_Sub20_Sub1) super.aClass7_Sub20_5).aByteArray50, arg0, this.anInt5860, arg1, this.anInt5863, this.anInt5854, local5, arg2, this, this.anInt5853, arg4);
			}
			this.anInt5856 -= arg1;
			if (this.anInt5856 != 0) {
				return arg1;
			}
		} while (!this.method4970());
		return arg3;
	}

	@OriginalMember(owner = "client!tk", name = "b", descriptor = "(II)V")
	private synchronized void method4959(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5864 = arg0;
		this.anInt5858 = arg1;
		this.anInt5856 = 0;
		this.method4953();
	}

	@OriginalMember(owner = "client!tk", name = "h", descriptor = "()V")
	private void method4962() {
		if (this.anInt5856 == 0) {
			return;
		}
		if (this.anInt5864 == Integer.MIN_VALUE) {
			this.anInt5864 = 0;
		}
		this.anInt5856 = 0;
		this.method4953();
	}

	@OriginalMember(owner = "client!tk", name = "i", descriptor = "()Z")
	public boolean method4963() {
		return this.anInt5856 != 0;
	}

	@OriginalMember(owner = "client!tk", name = "j", descriptor = "()I")
	public synchronized int method4964() {
		return this.anInt5853 < 0 ? -this.anInt5853 : this.anInt5853;
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(III)V")
	public synchronized void method4965(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method4959(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static367.method4961(arg1, arg2);
		@Pc(14) int local14 = Static367.method4956(arg1, arg2);
		if (this.anInt5852 == local10 && this.anInt5855 == local14) {
			this.anInt5856 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt5863;
		if (this.anInt5863 - arg1 > local31) {
			local31 = this.anInt5863 - arg1;
		}
		if (local10 - this.anInt5852 > local31) {
			local31 = local10 - this.anInt5852;
		}
		if (this.anInt5852 - local10 > local31) {
			local31 = this.anInt5852 - local10;
		}
		if (local14 - this.anInt5855 > local31) {
			local31 = local14 - this.anInt5855;
		}
		if (this.anInt5855 - local14 > local31) {
			local31 = this.anInt5855 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt5856 = arg0;
		this.anInt5864 = arg1;
		this.anInt5858 = arg2;
		this.anInt5854 = (arg1 - this.anInt5863) / arg0;
		this.anInt5851 = (local10 - this.anInt5852) / arg0;
		this.anInt5861 = (local14 - this.anInt5855) / arg0;
	}

	@OriginalMember(owner = "client!tk", name = "c", descriptor = "()Lclient!mi;")
	@Override
	public Class7_Sub8 method4932() {
		return null;
	}

	@OriginalMember(owner = "client!tk", name = "b", descriptor = "()I")
	@Override
	public int method4931() {
		@Pc(6) int local6 = this.anInt5863 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt5857 == 0) {
			local6 -= local6 * this.anInt5860 / (((Class7_Sub20_Sub1) super.aClass7_Sub20_5).aByteArray50.length << 8);
		} else if (this.anInt5857 >= 0) {
			local6 -= local6 * this.anInt5859 / ((Class7_Sub20_Sub1) super.aClass7_Sub20_5).aByteArray50.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!tk", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method4934(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt5864 == 0 && this.anInt5856 == 0) {
			this.method4936(arg2);
			return;
		}
		@Pc(13) Class7_Sub20_Sub1 local13 = (Class7_Sub20_Sub1) super.aClass7_Sub20_5;
		@Pc(18) int local18 = this.anInt5859 << 8;
		@Pc(23) int local23 = this.anInt5862 << 8;
		@Pc(29) int local29 = local13.aByteArray50.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt5857 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt5860 < 0) {
			if (this.anInt5853 <= 0) {
				this.method4962();
				this.method5648();
				return;
			}
			this.anInt5860 = 0;
		}
		if (this.anInt5860 >= local29) {
			if (this.anInt5853 >= 0) {
				this.method4962();
				this.method5648();
				return;
			}
			this.anInt5860 = local29 - 1;
		}
		if (this.anInt5857 >= 0) {
			if (this.anInt5857 > 0) {
				if (this.aBoolean428) {
					label130: {
						if (this.anInt5853 < 0) {
							local40 = this.method4958(arg0, arg1, local18, local44, local13.aByteArray50[this.anInt5859]);
							if (this.anInt5860 >= local18) {
								return;
							}
							this.anInt5860 = local18 + local18 - this.anInt5860 - 1;
							this.anInt5853 = -this.anInt5853;
							if (--this.anInt5857 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method4952(arg0, local40, local23, local44, local13.aByteArray50[this.anInt5862 - 1]);
							if (this.anInt5860 < local23) {
								return;
							}
							this.anInt5860 = local23 + local23 - this.anInt5860 - 1;
							this.anInt5853 = -this.anInt5853;
							if (--this.anInt5857 == 0) {
								break;
							}
							local40 = this.method4958(arg0, local40, local18, local44, local13.aByteArray50[this.anInt5859]);
							if (this.anInt5860 >= local18) {
								return;
							}
							this.anInt5860 = local18 + local18 - this.anInt5860 - 1;
							this.anInt5853 = -this.anInt5853;
						} while (--this.anInt5857 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt5853 < 0) {
						while (true) {
							local40 = this.method4958(arg0, local40, local18, local44, local13.aByteArray50[this.anInt5862 - 1]);
							if (this.anInt5860 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt5860 - 1) / local33;
							if (local416 >= this.anInt5857) {
								this.anInt5860 += local33 * this.anInt5857;
								this.anInt5857 = 0;
								break;
							}
							this.anInt5860 += local33 * local416;
							this.anInt5857 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method4952(arg0, local40, local23, local44, local13.aByteArray50[this.anInt5859]);
							if (this.anInt5860 < local23) {
								return;
							}
							local416 = (this.anInt5860 - local18) / local33;
							if (local416 >= this.anInt5857) {
								this.anInt5860 -= local33 * this.anInt5857;
								this.anInt5857 = 0;
								break;
							}
							this.anInt5860 -= local33 * local416;
							this.anInt5857 -= local416;
						}
					}
				}
			}
			if (this.anInt5853 < 0) {
				this.method4958(arg0, local40, 0, local44, 0);
				if (this.anInt5860 < 0) {
					this.anInt5860 = -1;
					this.method4962();
					this.method5648();
					return;
				}
			} else {
				this.method4952(arg0, local40, local29, local44, 0);
				if (this.anInt5860 >= local29) {
					this.anInt5860 = local29;
					this.method4962();
					this.method5648();
				}
			}
		} else if (this.aBoolean428) {
			if (this.anInt5853 < 0) {
				local40 = this.method4958(arg0, arg1, local18, local44, local13.aByteArray50[this.anInt5859]);
				if (this.anInt5860 >= local18) {
					return;
				}
				this.anInt5860 = local18 + local18 - this.anInt5860 - 1;
				this.anInt5853 = -this.anInt5853;
			}
			while (true) {
				local40 = this.method4952(arg0, local40, local23, local44, local13.aByteArray50[this.anInt5862 - 1]);
				if (this.anInt5860 < local23) {
					return;
				}
				this.anInt5860 = local23 + local23 - this.anInt5860 - 1;
				this.anInt5853 = -this.anInt5853;
				local40 = this.method4958(arg0, local40, local18, local44, local13.aByteArray50[this.anInt5859]);
				if (this.anInt5860 >= local18) {
					return;
				}
				this.anInt5860 = local18 + local18 - this.anInt5860 - 1;
				this.anInt5853 = -this.anInt5853;
			}
		} else if (this.anInt5853 < 0) {
			while (true) {
				local40 = this.method4958(arg0, local40, local18, local44, local13.aByteArray50[this.anInt5862 - 1]);
				if (this.anInt5860 >= local18) {
					return;
				}
				this.anInt5860 = local23 - (local23 - 1 - this.anInt5860) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method4952(arg0, local40, local23, local44, local13.aByteArray50[this.anInt5859]);
				if (this.anInt5860 < local23) {
					return;
				}
				this.anInt5860 = local18 + (this.anInt5860 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!tk", name = "k", descriptor = "()Z")
	private boolean method4970() {
		@Pc(2) int local2 = this.anInt5864;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static367.method4961(local2, this.anInt5858);
			local8 = Static367.method4956(local2, this.anInt5858);
		}
		if (this.anInt5863 != local2 || this.anInt5852 != local10 || this.anInt5855 != local8) {
			if (this.anInt5863 < local2) {
				this.anInt5854 = 1;
				this.anInt5856 = local2 - this.anInt5863;
			} else if (this.anInt5863 > local2) {
				this.anInt5854 = -1;
				this.anInt5856 = this.anInt5863 - local2;
			} else {
				this.anInt5854 = 0;
			}
			if (this.anInt5852 < local10) {
				this.anInt5851 = 1;
				if (this.anInt5856 == 0 || this.anInt5856 > local10 - this.anInt5852) {
					this.anInt5856 = local10 - this.anInt5852;
				}
			} else if (this.anInt5852 > local10) {
				this.anInt5851 = -1;
				if (this.anInt5856 == 0 || this.anInt5856 > this.anInt5852 - local10) {
					this.anInt5856 = this.anInt5852 - local10;
				}
			} else {
				this.anInt5851 = 0;
			}
			if (this.anInt5855 < local8) {
				this.anInt5861 = 1;
				if (this.anInt5856 == 0 || this.anInt5856 > local8 - this.anInt5855) {
					this.anInt5856 = local8 - this.anInt5855;
				}
			} else if (this.anInt5855 > local8) {
				this.anInt5861 = -1;
				if (this.anInt5856 == 0 || this.anInt5856 > this.anInt5855 - local8) {
					this.anInt5856 = this.anInt5855 - local8;
				}
			} else {
				this.anInt5861 = 0;
			}
			return false;
		} else if (this.anInt5864 == Integer.MIN_VALUE) {
			this.anInt5864 = 0;
			this.anInt5863 = this.anInt5852 = this.anInt5855 = 0;
			this.method5648();
			return true;
		} else {
			this.method4953();
			return false;
		}
	}

	@OriginalMember(owner = "client!tk", name = "l", descriptor = "()I")
	public synchronized int method4971() {
		return this.anInt5864 == Integer.MIN_VALUE ? 0 : this.anInt5864;
	}

	@OriginalMember(owner = "client!tk", name = "d", descriptor = "(II)V")
	public synchronized void method4972(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method4965(arg0, arg1, this.method4944());
	}

	@OriginalMember(owner = "client!tk", name = "h", descriptor = "(I)V")
	public synchronized void method4973(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method4976();
			this.method5648();
		} else if (this.anInt5852 == 0 && this.anInt5855 == 0) {
			this.anInt5856 = 0;
			this.anInt5864 = 0;
			this.anInt5863 = 0;
			this.method5648();
		} else {
			@Pc(31) int local31 = -this.anInt5863;
			if (this.anInt5863 > local31) {
				local31 = this.anInt5863;
			}
			if (-this.anInt5852 > local31) {
				local31 = -this.anInt5852;
			}
			if (this.anInt5852 > local31) {
				local31 = this.anInt5852;
			}
			if (-this.anInt5855 > local31) {
				local31 = -this.anInt5855;
			}
			if (this.anInt5855 > local31) {
				local31 = this.anInt5855;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt5856 = arg0;
			this.anInt5864 = Integer.MIN_VALUE;
			this.anInt5854 = -this.anInt5863 / arg0;
			this.anInt5851 = -this.anInt5852 / arg0;
			this.anInt5861 = -this.anInt5855 / arg0;
		}
	}

	@OriginalMember(owner = "client!tk", name = "i", descriptor = "(I)V")
	private synchronized void method4976() {
		this.method4959(0, this.method4944());
	}
}
