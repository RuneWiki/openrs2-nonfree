import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!t")
public final class Class8_Sub8_Sub4 extends Class8_Sub8 {

	@OriginalMember(owner = "client!t", name = "r", descriptor = "I")
	public int anInt4942;

	@OriginalMember(owner = "client!t", name = "s", descriptor = "I")
	public int anInt4943;

	@OriginalMember(owner = "client!t", name = "t", descriptor = "I")
	public int anInt4944;

	@OriginalMember(owner = "client!t", name = "w", descriptor = "I")
	private int anInt4947;

	@OriginalMember(owner = "client!t", name = "A", descriptor = "I")
	private int anInt4950;

	@OriginalMember(owner = "client!t", name = "B", descriptor = "I")
	public int anInt4951;

	@OriginalMember(owner = "client!t", name = "C", descriptor = "I")
	public int anInt4952;

	@OriginalMember(owner = "client!t", name = "F", descriptor = "I")
	public int anInt4955;

	@OriginalMember(owner = "client!t", name = "D", descriptor = "I")
	private int anInt4953;

	@OriginalMember(owner = "client!t", name = "x", descriptor = "I")
	private int anInt4948;

	@OriginalMember(owner = "client!t", name = "y", descriptor = "Z")
	private boolean aBoolean398;

	@OriginalMember(owner = "client!t", name = "z", descriptor = "I")
	private int anInt4949;

	@OriginalMember(owner = "client!t", name = "u", descriptor = "I")
	private int anInt4945;

	@OriginalMember(owner = "client!t", name = "v", descriptor = "I")
	private int anInt4946;

	@OriginalMember(owner = "client!t", name = "E", descriptor = "I")
	public int anInt4954;

	@OriginalMember(owner = "client!t", name = "<init>", descriptor = "(Lclient!rk;II)V")
	public Class8_Sub8_Sub4(@OriginalArg(0) Class8_Sub20_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass8_Sub20_5 = arg0;
		this.anInt4953 = arg0.anInt4699;
		this.anInt4948 = arg0.anInt4700;
		this.aBoolean398 = arg0.aBoolean378;
		this.anInt4949 = arg1;
		this.anInt4945 = arg2;
		this.anInt4946 = 8192;
		this.anInt4954 = 0;
		this.method3719();
	}

	@OriginalMember(owner = "client!t", name = "<init>", descriptor = "(Lclient!rk;III)V")
	public Class8_Sub8_Sub4(@OriginalArg(0) Class8_Sub20_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass8_Sub20_5 = arg0;
		this.anInt4953 = arg0.anInt4699;
		this.anInt4948 = arg0.anInt4700;
		this.aBoolean398 = arg0.aBoolean378;
		this.anInt4949 = arg1;
		this.anInt4945 = arg2;
		this.anInt4946 = arg3;
		this.anInt4954 = 0;
		this.method3719();
	}

	@OriginalMember(owner = "client!t", name = "b", descriptor = "(I)V")
	public synchronized void method3710(@OriginalArg(0) int arg0) {
		if (this.anInt4949 < 0) {
			this.anInt4949 = -arg0;
		} else {
			this.anInt4949 = arg0;
		}
	}

	@OriginalMember(owner = "client!t", name = "e", descriptor = "()I")
	public synchronized int method3713() {
		return this.anInt4945 == Integer.MIN_VALUE ? 0 : this.anInt4945;
	}

	@OriginalMember(owner = "client!t", name = "f", descriptor = "()Z")
	public boolean method3715() {
		return this.anInt4954 < 0 || this.anInt4954 >= ((Class8_Sub20_Sub1) this.aClass8_Sub20_5).aByteArray47.length << 8;
	}

	@OriginalMember(owner = "client!t", name = "c", descriptor = "(I)V")
	public synchronized void method3716(@OriginalArg(0) int arg0) {
		this.anInt4950 = arg0;
	}

	@OriginalMember(owner = "client!t", name = "d", descriptor = "(I)V")
	public synchronized void method3717(@OriginalArg(0) int arg0) {
		this.method3737(arg0 << 6, this.method3730());
	}

	@OriginalMember(owner = "client!t", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method3707(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt4945 == 0 && this.anInt4947 == 0) {
			this.method3705(arg2);
			return;
		}
		@Pc(13) Class8_Sub20_Sub1 local13 = (Class8_Sub20_Sub1) this.aClass8_Sub20_5;
		@Pc(18) int local18 = this.anInt4953 << 8;
		@Pc(23) int local23 = this.anInt4948 << 8;
		@Pc(29) int local29 = local13.aByteArray47.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt4950 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt4954 < 0) {
			if (this.anInt4949 <= 0) {
				this.method3738();
				this.method4273();
				return;
			}
			this.anInt4954 = 0;
		}
		if (this.anInt4954 >= local29) {
			if (this.anInt4949 >= 0) {
				this.method3738();
				this.method4273();
				return;
			}
			this.anInt4954 = local29 - 1;
		}
		if (this.anInt4950 >= 0) {
			if (this.anInt4950 > 0) {
				if (this.aBoolean398) {
					label131: {
						if (this.anInt4949 < 0) {
							local40 = this.method3732(arg0, arg1, local18, local44, local13.aByteArray47[this.anInt4953]);
							if (this.anInt4954 >= local18) {
								return;
							}
							this.anInt4954 = local18 + local18 - this.anInt4954 - 1;
							this.anInt4949 = -this.anInt4949;
							if (--this.anInt4950 == 0) {
								break label131;
							}
						}
						do {
							local40 = this.method3748(arg0, local40, local23, local44, local13.aByteArray47[this.anInt4948 - 1]);
							if (this.anInt4954 < local23) {
								return;
							}
							this.anInt4954 = local23 + local23 - this.anInt4954 - 1;
							this.anInt4949 = -this.anInt4949;
							if (--this.anInt4950 == 0) {
								break;
							}
							local40 = this.method3732(arg0, local40, local18, local44, local13.aByteArray47[this.anInt4953]);
							if (this.anInt4954 >= local18) {
								return;
							}
							this.anInt4954 = local18 + local18 - this.anInt4954 - 1;
							this.anInt4949 = -this.anInt4949;
						} while (--this.anInt4950 != 0);
					}
				} else {
					@Pc(417) int local417;
					if (this.anInt4949 < 0) {
						while (true) {
							local40 = this.method3732(arg0, local40, local18, local44, local13.aByteArray47[this.anInt4948 - 1]);
							if (this.anInt4954 >= local18) {
								return;
							}
							local417 = (local23 - this.anInt4954 - 1) / local33;
							if (local417 >= this.anInt4950) {
								this.anInt4954 += local33 * this.anInt4950;
								this.anInt4950 = 0;
								break;
							}
							this.anInt4954 += local33 * local417;
							this.anInt4950 -= local417;
						}
					} else {
						while (true) {
							local40 = this.method3748(arg0, local40, local23, local44, local13.aByteArray47[this.anInt4953]);
							if (this.anInt4954 < local23) {
								return;
							}
							local417 = (this.anInt4954 - local18) / local33;
							if (local417 >= this.anInt4950) {
								this.anInt4954 -= local33 * this.anInt4950;
								this.anInt4950 = 0;
								break;
							}
							this.anInt4954 -= local33 * local417;
							this.anInt4950 -= local417;
						}
					}
				}
			}
			if (this.anInt4949 < 0) {
				this.method3732(arg0, local40, 0, local44, 0);
				if (this.anInt4954 < 0) {
					this.anInt4954 = -1;
					this.method3738();
					this.method4273();
				}
			} else {
				this.method3748(arg0, local40, local29, local44, 0);
				if (this.anInt4954 >= local29) {
					this.anInt4954 = local29;
					this.method3738();
					this.method4273();
				}
			}
		} else if (this.aBoolean398) {
			if (this.anInt4949 < 0) {
				local40 = this.method3732(arg0, arg1, local18, local44, local13.aByteArray47[this.anInt4953]);
				if (this.anInt4954 >= local18) {
					return;
				}
				this.anInt4954 = local18 + local18 - this.anInt4954 - 1;
				this.anInt4949 = -this.anInt4949;
			}
			while (true) {
				local40 = this.method3748(arg0, local40, local23, local44, local13.aByteArray47[this.anInt4948 - 1]);
				if (this.anInt4954 < local23) {
					return;
				}
				this.anInt4954 = local23 + local23 - this.anInt4954 - 1;
				this.anInt4949 = -this.anInt4949;
				local40 = this.method3732(arg0, local40, local18, local44, local13.aByteArray47[this.anInt4953]);
				if (this.anInt4954 >= local18) {
					return;
				}
				this.anInt4954 = local18 + local18 - this.anInt4954 - 1;
				this.anInt4949 = -this.anInt4949;
			}
		} else if (this.anInt4949 < 0) {
			while (true) {
				local40 = this.method3732(arg0, local40, local18, local44, local13.aByteArray47[this.anInt4948 - 1]);
				if (this.anInt4954 >= local18) {
					return;
				}
				this.anInt4954 = local23 - (local23 - 1 - this.anInt4954) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method3748(arg0, local40, local23, local44, local13.aByteArray47[this.anInt4953]);
				if (this.anInt4954 < local23) {
					return;
				}
				this.anInt4954 = local18 + (this.anInt4954 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!t", name = "c", descriptor = "(Z)V")
	public synchronized void method3718() {
		this.anInt4949 = (this.anInt4949 ^ this.anInt4949 >> 31) + (this.anInt4949 >>> 31);
		this.anInt4949 = -this.anInt4949;
	}

	@OriginalMember(owner = "client!t", name = "g", descriptor = "()V")
	private void method3719() {
		this.anInt4951 = this.anInt4945;
		this.anInt4944 = Static309.method3712(this.anInt4945, this.anInt4946);
		this.anInt4942 = Static309.method3722(this.anInt4945, this.anInt4946);
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method3705(@OriginalArg(0) int arg0) {
		if (this.anInt4947 > 0) {
			if (arg0 >= this.anInt4947) {
				if (this.anInt4945 == Integer.MIN_VALUE) {
					this.anInt4945 = 0;
					this.anInt4951 = this.anInt4944 = this.anInt4942 = 0;
					this.method4273();
					arg0 = this.anInt4947;
				}
				this.anInt4947 = 0;
				this.method3719();
			} else {
				this.anInt4951 += this.anInt4952 * arg0;
				this.anInt4944 += this.anInt4943 * arg0;
				this.anInt4942 += this.anInt4955 * arg0;
				this.anInt4947 -= arg0;
			}
		}
		@Pc(71) Class8_Sub20_Sub1 local71 = (Class8_Sub20_Sub1) this.aClass8_Sub20_5;
		@Pc(76) int local76 = this.anInt4953 << 8;
		@Pc(81) int local81 = this.anInt4948 << 8;
		@Pc(87) int local87 = local71.aByteArray47.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt4950 = 0;
		}
		if (this.anInt4954 < 0) {
			if (this.anInt4949 <= 0) {
				this.method3738();
				this.method4273();
				return;
			}
			this.anInt4954 = 0;
		}
		if (this.anInt4954 >= local87) {
			if (this.anInt4949 >= 0) {
				this.method3738();
				this.method4273();
				return;
			}
			this.anInt4954 = local87 - 1;
		}
		this.anInt4954 += this.anInt4949 * arg0;
		if (this.anInt4950 >= 0) {
			if (this.anInt4950 > 0) {
				if (this.aBoolean398) {
					label121: {
						if (this.anInt4949 < 0) {
							if (this.anInt4954 >= local76) {
								return;
							}
							this.anInt4954 = local76 + local76 - this.anInt4954 - 1;
							this.anInt4949 = -this.anInt4949;
							if (--this.anInt4950 == 0) {
								break label121;
							}
						}
						do {
							if (this.anInt4954 < local81) {
								return;
							}
							this.anInt4954 = local81 + local81 - this.anInt4954 - 1;
							this.anInt4949 = -this.anInt4949;
							if (--this.anInt4950 == 0) {
								break;
							}
							if (this.anInt4954 >= local76) {
								return;
							}
							this.anInt4954 = local76 + local76 - this.anInt4954 - 1;
							this.anInt4949 = -this.anInt4949;
						} while (--this.anInt4950 != 0);
					}
				} else {
					label153: {
						@Pc(362) int local362;
						if (this.anInt4949 < 0) {
							if (this.anInt4954 >= local76) {
								return;
							}
							local362 = (local81 - this.anInt4954 - 1) / local91;
							if (local362 >= this.anInt4950) {
								this.anInt4954 += local91 * this.anInt4950;
								this.anInt4950 = 0;
								break label153;
							}
							this.anInt4954 += local91 * local362;
							this.anInt4950 -= local362;
						} else if (this.anInt4954 >= local81) {
							local362 = (this.anInt4954 - local76) / local91;
							if (local362 >= this.anInt4950) {
								this.anInt4954 -= local91 * this.anInt4950;
								this.anInt4950 = 0;
								break label153;
							}
							this.anInt4954 -= local91 * local362;
							this.anInt4950 -= local362;
						} else {
							return;
						}
						return;
					}
				}
			}
			if (this.anInt4949 < 0) {
				if (this.anInt4954 < 0) {
					this.anInt4954 = -1;
					this.method3738();
					this.method4273();
				}
			} else if (this.anInt4954 >= local87) {
				this.anInt4954 = local87;
				this.method3738();
				this.method4273();
			}
		} else if (this.aBoolean398) {
			if (this.anInt4949 < 0) {
				if (this.anInt4954 >= local76) {
					return;
				}
				this.anInt4954 = local76 + local76 - this.anInt4954 - 1;
				this.anInt4949 = -this.anInt4949;
			}
			while (this.anInt4954 >= local81) {
				this.anInt4954 = local81 + local81 - this.anInt4954 - 1;
				this.anInt4949 = -this.anInt4949;
				if (this.anInt4954 >= local76) {
					return;
				}
				this.anInt4954 = local76 + local76 - this.anInt4954 - 1;
				this.anInt4949 = -this.anInt4949;
			}
		} else if (this.anInt4949 < 0) {
			if (this.anInt4954 >= local76) {
				return;
			}
			this.anInt4954 = local81 - (local81 - 1 - this.anInt4954) % local91 - 1;
		} else if (this.anInt4954 >= local81) {
			this.anInt4954 = local76 + (this.anInt4954 - local76) % local91;
		} else {
			return;
		}
	}

	@OriginalMember(owner = "client!t", name = "h", descriptor = "()I")
	public synchronized int method3721() {
		return this.anInt4949 < 0 ? -this.anInt4949 : this.anInt4949;
	}

	@OriginalMember(owner = "client!t", name = "e", descriptor = "(I)V")
	public synchronized void method3725(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method3727();
			this.method4273();
		} else if (this.anInt4944 == 0 && this.anInt4942 == 0) {
			this.anInt4947 = 0;
			this.anInt4945 = 0;
			this.anInt4951 = 0;
			this.method4273();
		} else {
			@Pc(31) int local31 = -this.anInt4951;
			if (this.anInt4951 > local31) {
				local31 = this.anInt4951;
			}
			if (-this.anInt4944 > local31) {
				local31 = -this.anInt4944;
			}
			if (this.anInt4944 > local31) {
				local31 = this.anInt4944;
			}
			if (-this.anInt4942 > local31) {
				local31 = -this.anInt4942;
			}
			if (this.anInt4942 > local31) {
				local31 = this.anInt4942;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt4947 = arg0;
			this.anInt4945 = Integer.MIN_VALUE;
			this.anInt4952 = -this.anInt4951 / arg0;
			this.anInt4943 = -this.anInt4944 / arg0;
			this.anInt4955 = -this.anInt4942 / arg0;
		}
	}

	@OriginalMember(owner = "client!t", name = "f", descriptor = "(I)V")
	private synchronized void method3727() {
		this.method3737(0, this.method3730());
	}

	@OriginalMember(owner = "client!t", name = "c", descriptor = "(II)V")
	public synchronized void method3728(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method3731(arg0, arg1, this.method3730());
	}

	@OriginalMember(owner = "client!t", name = "d", descriptor = "()I")
	@Override
	public int method3709() {
		return this.anInt4945 == 0 && this.anInt4947 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!t", name = "i", descriptor = "()I")
	public synchronized int method3730() {
		return this.anInt4946 < 0 ? -1 : this.anInt4946;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(III)V")
	public synchronized void method3731(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method3737(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static309.method3712(arg1, arg2);
		@Pc(14) int local14 = Static309.method3722(arg1, arg2);
		if (this.anInt4944 == local10 && this.anInt4942 == local14) {
			this.anInt4947 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt4951;
		if (this.anInt4951 - arg1 > local31) {
			local31 = this.anInt4951 - arg1;
		}
		if (local10 - this.anInt4944 > local31) {
			local31 = local10 - this.anInt4944;
		}
		if (this.anInt4944 - local10 > local31) {
			local31 = this.anInt4944 - local10;
		}
		if (local14 - this.anInt4942 > local31) {
			local31 = local14 - this.anInt4942;
		}
		if (this.anInt4942 - local14 > local31) {
			local31 = this.anInt4942 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt4947 = arg0;
		this.anInt4945 = arg1;
		this.anInt4946 = arg2;
		this.anInt4952 = (arg1 - this.anInt4951) / arg0;
		this.anInt4943 = (local10 - this.anInt4944) / arg0;
		this.anInt4955 = (local14 - this.anInt4942) / arg0;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "([IIIII)I")
	private int method3732(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		while (true) {
			if (this.anInt4947 > 0) {
				@Pc(7) int local7 = arg1 + this.anInt4947;
				if (local7 > arg3) {
					local7 = arg3;
				}
				this.anInt4947 += arg1;
				if (this.anInt4949 == -256 && (this.anInt4954 & 0xFF) == 0) {
					if (Static81.aBoolean130) {
						arg1 = Static309.method3735(((Class8_Sub20_Sub1) this.aClass8_Sub20_5).aByteArray47, arg0, this.anInt4954, arg1, this.anInt4944, this.anInt4942, this.anInt4943, this.anInt4955, local7, arg2, this);
					} else {
						arg1 = Static309.method3733(((Class8_Sub20_Sub1) this.aClass8_Sub20_5).aByteArray47, arg0, this.anInt4954, arg1, this.anInt4951, this.anInt4952, local7, arg2, this);
					}
				} else if (Static81.aBoolean130) {
					arg1 = Static309.method3741(((Class8_Sub20_Sub1) this.aClass8_Sub20_5).aByteArray47, arg0, this.anInt4954, arg1, this.anInt4944, this.anInt4942, this.anInt4943, this.anInt4955, local7, arg2, this, this.anInt4949, arg4);
				} else {
					arg1 = Static309.method3747(((Class8_Sub20_Sub1) this.aClass8_Sub20_5).aByteArray47, arg0, this.anInt4954, arg1, this.anInt4951, this.anInt4952, local7, arg2, this, this.anInt4949, arg4);
				}
				this.anInt4947 -= arg1;
				if (this.anInt4947 != 0) {
					return arg1;
				}
				if (!this.method3746()) {
					continue;
				}
				return arg3;
			}
			if (this.anInt4949 == -256 && (this.anInt4954 & 0xFF) == 0) {
				if (Static81.aBoolean130) {
					return Static309.method3742(((Class8_Sub20_Sub1) this.aClass8_Sub20_5).aByteArray47, arg0, this.anInt4954, arg1, this.anInt4944, this.anInt4942, arg3, arg2, this);
				}
				return Static309.method3724(((Class8_Sub20_Sub1) this.aClass8_Sub20_5).aByteArray47, arg0, this.anInt4954, arg1, this.anInt4951, arg3, arg2, this);
			}
			if (Static81.aBoolean130) {
				return Static309.method3723(((Class8_Sub20_Sub1) this.aClass8_Sub20_5).aByteArray47, arg0, this.anInt4954, arg1, this.anInt4944, this.anInt4942, arg3, arg2, this, this.anInt4949, arg4);
			}
			return Static309.method3743(((Class8_Sub20_Sub1) this.aClass8_Sub20_5).aByteArray47, arg0, this.anInt4954, arg1, this.anInt4951, arg3, arg2, this, this.anInt4949, arg4);
		}
	}

	@OriginalMember(owner = "client!t", name = "j", descriptor = "()Z")
	public boolean method3734() {
		return this.anInt4947 != 0;
	}

	@OriginalMember(owner = "client!t", name = "d", descriptor = "(II)V")
	private synchronized void method3737(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4945 = arg0;
		this.anInt4946 = arg1;
		this.anInt4947 = 0;
		this.method3719();
	}

	@OriginalMember(owner = "client!t", name = "k", descriptor = "()V")
	private void method3738() {
		if (this.anInt4947 == 0) {
			return;
		}
		if (this.anInt4945 == Integer.MIN_VALUE) {
			this.anInt4945 = 0;
		}
		this.anInt4947 = 0;
		this.method3719();
	}

	@OriginalMember(owner = "client!t", name = "g", descriptor = "(I)V")
	public synchronized void method3739(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class8_Sub20_Sub1) this.aClass8_Sub20_5).aByteArray47.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt4954 = arg0;
	}

	@OriginalMember(owner = "client!t", name = "b", descriptor = "()Lclient!kn;")
	@Override
	public Class8_Sub8 method3706() {
		return null;
	}

	@OriginalMember(owner = "client!t", name = "l", descriptor = "()Z")
	private boolean method3746() {
		@Pc(2) int local2 = this.anInt4945;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static309.method3712(local2, this.anInt4946);
			local8 = Static309.method3722(local2, this.anInt4946);
		}
		if (this.anInt4951 != local2 || this.anInt4944 != local10 || this.anInt4942 != local8) {
			if (this.anInt4951 < local2) {
				this.anInt4952 = 1;
				this.anInt4947 = local2 - this.anInt4951;
			} else if (this.anInt4951 > local2) {
				this.anInt4952 = -1;
				this.anInt4947 = this.anInt4951 - local2;
			} else {
				this.anInt4952 = 0;
			}
			if (this.anInt4944 < local10) {
				this.anInt4943 = 1;
				if (this.anInt4947 == 0 || this.anInt4947 > local10 - this.anInt4944) {
					this.anInt4947 = local10 - this.anInt4944;
				}
			} else if (this.anInt4944 > local10) {
				this.anInt4943 = -1;
				if (this.anInt4947 == 0 || this.anInt4947 > this.anInt4944 - local10) {
					this.anInt4947 = this.anInt4944 - local10;
				}
			} else {
				this.anInt4943 = 0;
			}
			if (this.anInt4942 < local8) {
				this.anInt4955 = 1;
				if (this.anInt4947 == 0 || this.anInt4947 > local8 - this.anInt4942) {
					this.anInt4947 = local8 - this.anInt4942;
				}
			} else if (this.anInt4942 > local8) {
				this.anInt4955 = -1;
				if (this.anInt4947 == 0 || this.anInt4947 > this.anInt4942 - local8) {
					this.anInt4947 = this.anInt4942 - local8;
				}
			} else {
				this.anInt4955 = 0;
			}
			return false;
		} else if (this.anInt4945 == Integer.MIN_VALUE) {
			this.anInt4945 = 0;
			this.anInt4951 = this.anInt4944 = this.anInt4942 = 0;
			this.method4273();
			return true;
		} else {
			this.method3719();
			return false;
		}
	}

	@OriginalMember(owner = "client!t", name = "c", descriptor = "()I")
	@Override
	public int method3708() {
		@Pc(6) int local6 = this.anInt4951 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt4950 == 0) {
			local6 -= local6 * this.anInt4954 / (((Class8_Sub20_Sub1) this.aClass8_Sub20_5).aByteArray47.length << 8);
		} else if (this.anInt4950 >= 0) {
			local6 -= local6 * this.anInt4953 / ((Class8_Sub20_Sub1) this.aClass8_Sub20_5).aByteArray47.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "()Lclient!kn;")
	@Override
	public Class8_Sub8 method3704() {
		return null;
	}

	@OriginalMember(owner = "client!t", name = "b", descriptor = "([IIIII)I")
	private int method3748(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		while (true) {
			if (this.anInt4947 > 0) {
				@Pc(7) int local7 = arg1 + this.anInt4947;
				if (local7 > arg3) {
					local7 = arg3;
				}
				this.anInt4947 += arg1;
				if (this.anInt4949 == 256 && (this.anInt4954 & 0xFF) == 0) {
					if (Static81.aBoolean130) {
						arg1 = Static309.method3736(((Class8_Sub20_Sub1) this.aClass8_Sub20_5).aByteArray47, arg0, this.anInt4954, arg1, this.anInt4944, this.anInt4942, this.anInt4943, this.anInt4955, local7, arg2, this);
					} else {
						arg1 = Static309.method3720(((Class8_Sub20_Sub1) this.aClass8_Sub20_5).aByteArray47, arg0, this.anInt4954, arg1, this.anInt4951, this.anInt4952, local7, arg2, this);
					}
				} else if (Static81.aBoolean130) {
					arg1 = Static309.method3744(((Class8_Sub20_Sub1) this.aClass8_Sub20_5).aByteArray47, arg0, this.anInt4954, arg1, this.anInt4944, this.anInt4942, this.anInt4943, this.anInt4955, local7, arg2, this, this.anInt4949, arg4);
				} else {
					arg1 = Static309.method3726(((Class8_Sub20_Sub1) this.aClass8_Sub20_5).aByteArray47, arg0, this.anInt4954, arg1, this.anInt4951, this.anInt4952, local7, arg2, this, this.anInt4949, arg4);
				}
				this.anInt4947 -= arg1;
				if (this.anInt4947 != 0) {
					return arg1;
				}
				if (!this.method3746()) {
					continue;
				}
				return arg3;
			}
			if (this.anInt4949 == 256 && (this.anInt4954 & 0xFF) == 0) {
				if (Static81.aBoolean130) {
					return Static309.method3711(((Class8_Sub20_Sub1) this.aClass8_Sub20_5).aByteArray47, arg0, this.anInt4954, arg1, this.anInt4944, this.anInt4942, arg3, arg2, this);
				}
				return Static309.method3749(((Class8_Sub20_Sub1) this.aClass8_Sub20_5).aByteArray47, arg0, this.anInt4954, arg1, this.anInt4951, arg3, arg2, this);
			}
			if (Static81.aBoolean130) {
				return Static309.method3714(((Class8_Sub20_Sub1) this.aClass8_Sub20_5).aByteArray47, arg0, this.anInt4954, arg1, this.anInt4944, this.anInt4942, arg3, arg2, this, this.anInt4949, arg4);
			}
			return Static309.method3745(((Class8_Sub20_Sub1) this.aClass8_Sub20_5).aByteArray47, arg0, this.anInt4954, arg1, this.anInt4951, arg3, arg2, this, this.anInt4949, arg4);
		}
	}
}
