import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sv")
public final class Class2_Sub8_Sub4 extends Class2_Sub8 {

	@OriginalMember(owner = "client!sv", name = "p", descriptor = "I")
	private int anInt6639;

	@OriginalMember(owner = "client!sv", name = "q", descriptor = "I")
	public int anInt6640;

	@OriginalMember(owner = "client!sv", name = "t", descriptor = "I")
	private int anInt6643;

	@OriginalMember(owner = "client!sv", name = "v", descriptor = "I")
	public int anInt6645;

	@OriginalMember(owner = "client!sv", name = "w", descriptor = "I")
	public int anInt6646;

	@OriginalMember(owner = "client!sv", name = "y", descriptor = "I")
	public int anInt6647;

	@OriginalMember(owner = "client!sv", name = "z", descriptor = "I")
	public int anInt6648;

	@OriginalMember(owner = "client!sv", name = "B", descriptor = "I")
	public int anInt6649;

	@OriginalMember(owner = "client!sv", name = "r", descriptor = "I")
	private final int anInt6641;

	@OriginalMember(owner = "client!sv", name = "D", descriptor = "I")
	private final int anInt6651;

	@OriginalMember(owner = "client!sv", name = "x", descriptor = "Z")
	private final boolean aBoolean450;

	@OriginalMember(owner = "client!sv", name = "C", descriptor = "I")
	private int anInt6650;

	@OriginalMember(owner = "client!sv", name = "E", descriptor = "I")
	private int anInt6652;

	@OriginalMember(owner = "client!sv", name = "s", descriptor = "I")
	private int anInt6642;

	@OriginalMember(owner = "client!sv", name = "u", descriptor = "I")
	public int anInt6644;

	@OriginalMember(owner = "client!sv", name = "<init>", descriptor = "(Lclient!lf;II)V")
	public Class2_Sub8_Sub4(@OriginalArg(0) Class2_Sub14_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass2_Sub14_5 = arg0;
		this.anInt6641 = arg0.anInt3844;
		this.anInt6651 = arg0.anInt3843;
		this.aBoolean450 = arg0.aBoolean257;
		this.anInt6650 = arg1;
		this.anInt6652 = arg2;
		this.anInt6642 = 8192;
		this.anInt6644 = 0;
		this.method5310();
	}

	@OriginalMember(owner = "client!sv", name = "<init>", descriptor = "(Lclient!lf;III)V")
	public Class2_Sub8_Sub4(@OriginalArg(0) Class2_Sub14_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass2_Sub14_5 = arg0;
		this.anInt6641 = arg0.anInt3844;
		this.anInt6651 = arg0.anInt3843;
		this.aBoolean450 = arg0.aBoolean257;
		this.anInt6650 = arg1;
		this.anInt6652 = arg2;
		this.anInt6642 = arg3;
		this.anInt6644 = 0;
		this.method5310();
	}

	@OriginalMember(owner = "client!sv", name = "d", descriptor = "()Lclient!nu;")
	@Override
	public Class2_Sub8 method5287() {
		return null;
	}

	@OriginalMember(owner = "client!sv", name = "e", descriptor = "()V")
	private void method5291() {
		if (this.anInt6643 == 0) {
			return;
		}
		if (this.anInt6652 == Integer.MIN_VALUE) {
			this.anInt6652 = 0;
		}
		this.anInt6643 = 0;
		this.method5310();
	}

	@OriginalMember(owner = "client!sv", name = "b", descriptor = "(I)V")
	public synchronized void method5292(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class2_Sub14_Sub1) super.aClass2_Sub14_5).aByteArray50.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt6644 = arg0;
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(III)V")
	public synchronized void method5293(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method5302(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static473.method5312(arg1, arg2);
		@Pc(14) int local14 = Static473.method5306(arg1, arg2);
		if (this.anInt6645 == local10 && this.anInt6647 == local14) {
			this.anInt6643 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt6649;
		if (this.anInt6649 - arg1 > local31) {
			local31 = this.anInt6649 - arg1;
		}
		if (local10 - this.anInt6645 > local31) {
			local31 = local10 - this.anInt6645;
		}
		if (this.anInt6645 - local10 > local31) {
			local31 = this.anInt6645 - local10;
		}
		if (local14 - this.anInt6647 > local31) {
			local31 = local14 - this.anInt6647;
		}
		if (this.anInt6647 - local14 > local31) {
			local31 = this.anInt6647 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt6643 = arg0;
		this.anInt6652 = arg1;
		this.anInt6642 = arg2;
		this.anInt6646 = (arg1 - this.anInt6649) / arg0;
		this.anInt6640 = (local10 - this.anInt6645) / arg0;
		this.anInt6648 = (local14 - this.anInt6647) / arg0;
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "()I")
	@Override
	public int method5283() {
		@Pc(6) int local6 = this.anInt6649 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt6639 == 0) {
			local6 -= local6 * this.anInt6644 / (((Class2_Sub14_Sub1) super.aClass2_Sub14_5).aByteArray50.length << 8);
		} else if (this.anInt6639 >= 0) {
			local6 -= local6 * this.anInt6641 / ((Class2_Sub14_Sub1) super.aClass2_Sub14_5).aByteArray50.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "([IIIII)I")
	private int method5294(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt6643 <= 0) {
				if (this.anInt6650 == 256 && (this.anInt6644 & 0xFF) == 0) {
					if (Static240.aBoolean266) {
						return Static473.method5321(((Class2_Sub14_Sub1) super.aClass2_Sub14_5).aByteArray50, arg0, this.anInt6644, arg1, this.anInt6645, this.anInt6647, arg3, arg2, this);
					}
					return Static473.method5288(((Class2_Sub14_Sub1) super.aClass2_Sub14_5).aByteArray50, arg0, this.anInt6644, arg1, this.anInt6649, arg3, arg2, this);
				}
				if (Static240.aBoolean266) {
					return Static473.method5304(((Class2_Sub14_Sub1) super.aClass2_Sub14_5).aByteArray50, arg0, this.anInt6644, arg1, this.anInt6645, this.anInt6647, arg3, arg2, this, this.anInt6650, arg4);
				}
				return Static473.method5327(((Class2_Sub14_Sub1) super.aClass2_Sub14_5).aByteArray50, arg0, this.anInt6644, arg1, this.anInt6649, arg3, arg2, this, this.anInt6650, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt6643;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt6643 += arg1;
			if (this.anInt6650 == 256 && (this.anInt6644 & 0xFF) == 0) {
				if (Static240.aBoolean266) {
					arg1 = Static473.method5290(((Class2_Sub14_Sub1) super.aClass2_Sub14_5).aByteArray50, arg0, this.anInt6644, arg1, this.anInt6645, this.anInt6647, this.anInt6640, this.anInt6648, local5, arg2, this);
				} else {
					arg1 = Static473.method5305(((Class2_Sub14_Sub1) super.aClass2_Sub14_5).aByteArray50, arg0, this.anInt6644, arg1, this.anInt6649, this.anInt6646, local5, arg2, this);
				}
			} else if (Static240.aBoolean266) {
				arg1 = Static473.method5322(((Class2_Sub14_Sub1) super.aClass2_Sub14_5).aByteArray50, arg0, this.anInt6644, arg1, this.anInt6645, this.anInt6647, this.anInt6640, this.anInt6648, local5, arg2, this, this.anInt6650, arg4);
			} else {
				arg1 = Static473.method5297(((Class2_Sub14_Sub1) super.aClass2_Sub14_5).aByteArray50, arg0, this.anInt6644, arg1, this.anInt6649, this.anInt6646, local5, arg2, this, this.anInt6650, arg4);
			}
			this.anInt6643 -= arg1;
			if (this.anInt6643 != 0) {
				return arg1;
			}
		} while (!this.method5318());
		return arg3;
	}

	@OriginalMember(owner = "client!sv", name = "f", descriptor = "()I")
	public synchronized int method5296() {
		return this.anInt6650 < 0 ? -this.anInt6650 : this.anInt6650;
	}

	@OriginalMember(owner = "client!sv", name = "c", descriptor = "(I)V")
	public synchronized void method5298(@OriginalArg(0) int arg0) {
		this.anInt6639 = arg0;
	}

	@OriginalMember(owner = "client!sv", name = "c", descriptor = "()I")
	@Override
	public int method5286() {
		return this.anInt6652 == 0 && this.anInt6643 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method5284(@OriginalArg(0) int arg0) {
		if (this.anInt6643 > 0) {
			if (arg0 >= this.anInt6643) {
				if (this.anInt6652 == Integer.MIN_VALUE) {
					this.anInt6652 = 0;
					this.anInt6649 = this.anInt6645 = this.anInt6647 = 0;
					this.method6260();
					arg0 = this.anInt6643;
				}
				this.anInt6643 = 0;
				this.method5310();
			} else {
				this.anInt6649 += this.anInt6646 * arg0;
				this.anInt6645 += this.anInt6640 * arg0;
				this.anInt6647 += this.anInt6648 * arg0;
				this.anInt6643 -= arg0;
			}
		}
		@Pc(71) Class2_Sub14_Sub1 local71 = (Class2_Sub14_Sub1) super.aClass2_Sub14_5;
		@Pc(76) int local76 = this.anInt6641 << 8;
		@Pc(81) int local81 = this.anInt6651 << 8;
		@Pc(87) int local87 = local71.aByteArray50.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt6639 = 0;
		}
		if (this.anInt6644 < 0) {
			if (this.anInt6650 <= 0) {
				this.method5291();
				this.method6260();
				return;
			}
			this.anInt6644 = 0;
		}
		if (this.anInt6644 >= local87) {
			if (this.anInt6650 >= 0) {
				this.method5291();
				this.method6260();
				return;
			}
			this.anInt6644 = local87 - 1;
		}
		this.anInt6644 += this.anInt6650 * arg0;
		if (this.anInt6639 >= 0) {
			if (this.anInt6639 > 0) {
				if (this.aBoolean450) {
					label125: {
						if (this.anInt6650 < 0) {
							if (this.anInt6644 >= local76) {
								return;
							}
							this.anInt6644 = local76 + local76 - this.anInt6644 - 1;
							this.anInt6650 = -this.anInt6650;
							if (--this.anInt6639 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt6644 < local81) {
								return;
							}
							this.anInt6644 = local81 + local81 - this.anInt6644 - 1;
							this.anInt6650 = -this.anInt6650;
							if (--this.anInt6639 == 0) {
								break;
							}
							if (this.anInt6644 >= local76) {
								return;
							}
							this.anInt6644 = local76 + local76 - this.anInt6644 - 1;
							this.anInt6650 = -this.anInt6650;
						} while (--this.anInt6639 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt6650 < 0) {
						if (this.anInt6644 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt6644 - 1) / local91;
						if (local361 < this.anInt6639) {
							this.anInt6644 += local91 * local361;
							this.anInt6639 -= local361;
							return;
						}
						this.anInt6644 += local91 * this.anInt6639;
						this.anInt6639 = 0;
					} else if (this.anInt6644 >= local81) {
						local361 = (this.anInt6644 - local76) / local91;
						if (local361 < this.anInt6639) {
							this.anInt6644 -= local91 * local361;
							this.anInt6639 -= local361;
							return;
						}
						this.anInt6644 -= local91 * this.anInt6639;
						this.anInt6639 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt6650 < 0) {
				if (this.anInt6644 < 0) {
					this.anInt6644 = -1;
					this.method5291();
					this.method6260();
					return;
				}
			} else if (this.anInt6644 >= local87) {
				this.anInt6644 = local87;
				this.method5291();
				this.method6260();
			}
		} else if (this.aBoolean450) {
			if (this.anInt6650 < 0) {
				if (this.anInt6644 >= local76) {
					return;
				}
				this.anInt6644 = local76 + local76 - this.anInt6644 - 1;
				this.anInt6650 = -this.anInt6650;
			}
			while (this.anInt6644 >= local81) {
				this.anInt6644 = local81 + local81 - this.anInt6644 - 1;
				this.anInt6650 = -this.anInt6650;
				if (this.anInt6644 >= local76) {
					return;
				}
				this.anInt6644 = local76 + local76 - this.anInt6644 - 1;
				this.anInt6650 = -this.anInt6650;
			}
		} else if (this.anInt6650 < 0) {
			if (this.anInt6644 < local76) {
				this.anInt6644 = local81 - (local81 - 1 - this.anInt6644) % local91 - 1;
			}
		} else if (this.anInt6644 >= local81) {
			this.anInt6644 = local76 + (this.anInt6644 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(II)V")
	private synchronized void method5302(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6652 = arg0;
		this.anInt6642 = arg1;
		this.anInt6643 = 0;
		this.method5310();
	}

	@OriginalMember(owner = "client!sv", name = "b", descriptor = "([IIIII)I")
	private int method5303(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt6643 <= 0) {
				if (this.anInt6650 == -256 && (this.anInt6644 & 0xFF) == 0) {
					if (Static240.aBoolean266) {
						return Static473.method5323(((Class2_Sub14_Sub1) super.aClass2_Sub14_5).aByteArray50, arg0, this.anInt6644, arg1, this.anInt6645, this.anInt6647, arg3, arg2, this);
					}
					return Static473.method5300(((Class2_Sub14_Sub1) super.aClass2_Sub14_5).aByteArray50, arg0, this.anInt6644, arg1, this.anInt6649, arg3, arg2, this);
				}
				if (Static240.aBoolean266) {
					return Static473.method5299(((Class2_Sub14_Sub1) super.aClass2_Sub14_5).aByteArray50, arg0, this.anInt6644, arg1, this.anInt6645, this.anInt6647, arg3, arg2, this, this.anInt6650, arg4);
				}
				return Static473.method5320(((Class2_Sub14_Sub1) super.aClass2_Sub14_5).aByteArray50, arg0, this.anInt6644, arg1, this.anInt6649, arg3, arg2, this, this.anInt6650, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt6643;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt6643 += arg1;
			if (this.anInt6650 == -256 && (this.anInt6644 & 0xFF) == 0) {
				if (Static240.aBoolean266) {
					arg1 = Static473.method5314(((Class2_Sub14_Sub1) super.aClass2_Sub14_5).aByteArray50, arg0, this.anInt6644, arg1, this.anInt6645, this.anInt6647, this.anInt6640, this.anInt6648, local5, arg2, this);
				} else {
					arg1 = Static473.method5307(((Class2_Sub14_Sub1) super.aClass2_Sub14_5).aByteArray50, arg0, this.anInt6644, arg1, this.anInt6649, this.anInt6646, local5, arg2, this);
				}
			} else if (Static240.aBoolean266) {
				arg1 = Static473.method5295(((Class2_Sub14_Sub1) super.aClass2_Sub14_5).aByteArray50, arg0, this.anInt6644, arg1, this.anInt6645, this.anInt6647, this.anInt6640, this.anInt6648, local5, arg2, this, this.anInt6650, arg4);
			} else {
				arg1 = Static473.method5311(((Class2_Sub14_Sub1) super.aClass2_Sub14_5).aByteArray50, arg0, this.anInt6644, arg1, this.anInt6649, this.anInt6646, local5, arg2, this, this.anInt6650, arg4);
			}
			this.anInt6643 -= arg1;
			if (this.anInt6643 != 0) {
				return arg1;
			}
		} while (!this.method5318());
		return arg3;
	}

	@OriginalMember(owner = "client!sv", name = "g", descriptor = "(I)V")
	public synchronized void method5308(@OriginalArg(0) int arg0) {
		this.method5302(arg0 << 6, this.method5317());
	}

	@OriginalMember(owner = "client!sv", name = "g", descriptor = "()I")
	public synchronized int method5309() {
		return this.anInt6652 == Integer.MIN_VALUE ? 0 : this.anInt6652;
	}

	@OriginalMember(owner = "client!sv", name = "h", descriptor = "()V")
	private void method5310() {
		this.anInt6649 = this.anInt6652;
		this.anInt6645 = Static473.method5312(this.anInt6652, this.anInt6642);
		this.anInt6647 = Static473.method5306(this.anInt6652, this.anInt6642);
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(Z)V")
	public synchronized void method5313() {
		this.anInt6650 = (this.anInt6650 ^ this.anInt6650 >> 31) + (this.anInt6650 >>> 31);
		this.anInt6650 = -this.anInt6650;
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method5281(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt6652 == 0 && this.anInt6643 == 0) {
			this.method5284(arg2);
			return;
		}
		@Pc(13) Class2_Sub14_Sub1 local13 = (Class2_Sub14_Sub1) super.aClass2_Sub14_5;
		@Pc(18) int local18 = this.anInt6641 << 8;
		@Pc(23) int local23 = this.anInt6651 << 8;
		@Pc(29) int local29 = local13.aByteArray50.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt6639 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt6644 < 0) {
			if (this.anInt6650 <= 0) {
				this.method5291();
				this.method6260();
				return;
			}
			this.anInt6644 = 0;
		}
		if (this.anInt6644 >= local29) {
			if (this.anInt6650 >= 0) {
				this.method5291();
				this.method6260();
				return;
			}
			this.anInt6644 = local29 - 1;
		}
		if (this.anInt6639 >= 0) {
			if (this.anInt6639 > 0) {
				if (this.aBoolean450) {
					label130: {
						if (this.anInt6650 < 0) {
							local40 = this.method5303(arg0, arg1, local18, local44, local13.aByteArray50[this.anInt6641]);
							if (this.anInt6644 >= local18) {
								return;
							}
							this.anInt6644 = local18 + local18 - this.anInt6644 - 1;
							this.anInt6650 = -this.anInt6650;
							if (--this.anInt6639 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method5294(arg0, local40, local23, local44, local13.aByteArray50[this.anInt6651 - 1]);
							if (this.anInt6644 < local23) {
								return;
							}
							this.anInt6644 = local23 + local23 - this.anInt6644 - 1;
							this.anInt6650 = -this.anInt6650;
							if (--this.anInt6639 == 0) {
								break;
							}
							local40 = this.method5303(arg0, local40, local18, local44, local13.aByteArray50[this.anInt6641]);
							if (this.anInt6644 >= local18) {
								return;
							}
							this.anInt6644 = local18 + local18 - this.anInt6644 - 1;
							this.anInt6650 = -this.anInt6650;
						} while (--this.anInt6639 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt6650 < 0) {
						while (true) {
							local40 = this.method5303(arg0, local40, local18, local44, local13.aByteArray50[this.anInt6651 - 1]);
							if (this.anInt6644 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt6644 - 1) / local33;
							if (local416 >= this.anInt6639) {
								this.anInt6644 += local33 * this.anInt6639;
								this.anInt6639 = 0;
								break;
							}
							this.anInt6644 += local33 * local416;
							this.anInt6639 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method5294(arg0, local40, local23, local44, local13.aByteArray50[this.anInt6641]);
							if (this.anInt6644 < local23) {
								return;
							}
							local416 = (this.anInt6644 - local18) / local33;
							if (local416 >= this.anInt6639) {
								this.anInt6644 -= local33 * this.anInt6639;
								this.anInt6639 = 0;
								break;
							}
							this.anInt6644 -= local33 * local416;
							this.anInt6639 -= local416;
						}
					}
				}
			}
			if (this.anInt6650 < 0) {
				this.method5303(arg0, local40, 0, local44, 0);
				if (this.anInt6644 < 0) {
					this.anInt6644 = -1;
					this.method5291();
					this.method6260();
					return;
				}
			} else {
				this.method5294(arg0, local40, local29, local44, 0);
				if (this.anInt6644 >= local29) {
					this.anInt6644 = local29;
					this.method5291();
					this.method6260();
				}
			}
		} else if (this.aBoolean450) {
			if (this.anInt6650 < 0) {
				local40 = this.method5303(arg0, arg1, local18, local44, local13.aByteArray50[this.anInt6641]);
				if (this.anInt6644 >= local18) {
					return;
				}
				this.anInt6644 = local18 + local18 - this.anInt6644 - 1;
				this.anInt6650 = -this.anInt6650;
			}
			while (true) {
				local40 = this.method5294(arg0, local40, local23, local44, local13.aByteArray50[this.anInt6651 - 1]);
				if (this.anInt6644 < local23) {
					return;
				}
				this.anInt6644 = local23 + local23 - this.anInt6644 - 1;
				this.anInt6650 = -this.anInt6650;
				local40 = this.method5303(arg0, local40, local18, local44, local13.aByteArray50[this.anInt6641]);
				if (this.anInt6644 >= local18) {
					return;
				}
				this.anInt6644 = local18 + local18 - this.anInt6644 - 1;
				this.anInt6650 = -this.anInt6650;
			}
		} else if (this.anInt6650 < 0) {
			while (true) {
				local40 = this.method5303(arg0, local40, local18, local44, local13.aByteArray50[this.anInt6651 - 1]);
				if (this.anInt6644 >= local18) {
					return;
				}
				this.anInt6644 = local23 - (local23 - 1 - this.anInt6644) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method5294(arg0, local40, local23, local44, local13.aByteArray50[this.anInt6641]);
				if (this.anInt6644 < local23) {
					return;
				}
				this.anInt6644 = local18 + (this.anInt6644 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!sv", name = "i", descriptor = "()Z")
	public boolean method5315() {
		return this.anInt6643 != 0;
	}

	@OriginalMember(owner = "client!sv", name = "h", descriptor = "(I)V")
	public synchronized void method5316(@OriginalArg(0) int arg0) {
		if (this.anInt6650 < 0) {
			this.anInt6650 = -arg0;
		} else {
			this.anInt6650 = arg0;
		}
	}

	@OriginalMember(owner = "client!sv", name = "j", descriptor = "()I")
	public synchronized int method5317() {
		return this.anInt6642 < 0 ? -1 : this.anInt6642;
	}

	@OriginalMember(owner = "client!sv", name = "k", descriptor = "()Z")
	private boolean method5318() {
		@Pc(2) int local2 = this.anInt6652;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static473.method5312(local2, this.anInt6642);
			local8 = Static473.method5306(local2, this.anInt6642);
		}
		if (this.anInt6649 != local2 || this.anInt6645 != local10 || this.anInt6647 != local8) {
			if (this.anInt6649 < local2) {
				this.anInt6646 = 1;
				this.anInt6643 = local2 - this.anInt6649;
			} else if (this.anInt6649 > local2) {
				this.anInt6646 = -1;
				this.anInt6643 = this.anInt6649 - local2;
			} else {
				this.anInt6646 = 0;
			}
			if (this.anInt6645 < local10) {
				this.anInt6640 = 1;
				if (this.anInt6643 == 0 || this.anInt6643 > local10 - this.anInt6645) {
					this.anInt6643 = local10 - this.anInt6645;
				}
			} else if (this.anInt6645 > local10) {
				this.anInt6640 = -1;
				if (this.anInt6643 == 0 || this.anInt6643 > this.anInt6645 - local10) {
					this.anInt6643 = this.anInt6645 - local10;
				}
			} else {
				this.anInt6640 = 0;
			}
			if (this.anInt6647 < local8) {
				this.anInt6648 = 1;
				if (this.anInt6643 == 0 || this.anInt6643 > local8 - this.anInt6647) {
					this.anInt6643 = local8 - this.anInt6647;
				}
			} else if (this.anInt6647 > local8) {
				this.anInt6648 = -1;
				if (this.anInt6643 == 0 || this.anInt6643 > this.anInt6647 - local8) {
					this.anInt6643 = this.anInt6647 - local8;
				}
			} else {
				this.anInt6648 = 0;
			}
			return false;
		} else if (this.anInt6652 == Integer.MIN_VALUE) {
			this.anInt6652 = 0;
			this.anInt6649 = this.anInt6645 = this.anInt6647 = 0;
			this.method6260();
			return true;
		} else {
			this.method5310();
			return false;
		}
	}

	@OriginalMember(owner = "client!sv", name = "d", descriptor = "(II)V")
	public synchronized void method5319(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method5293(arg0, arg1, this.method5317());
	}

	@OriginalMember(owner = "client!sv", name = "b", descriptor = "()Lclient!nu;")
	@Override
	public Class2_Sub8 method5285() {
		return null;
	}

	@OriginalMember(owner = "client!sv", name = "i", descriptor = "(I)V")
	private synchronized void method5324() {
		this.method5302(0, this.method5317());
	}

	@OriginalMember(owner = "client!sv", name = "j", descriptor = "(I)V")
	public synchronized void method5325(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method5324();
			this.method6260();
		} else if (this.anInt6645 == 0 && this.anInt6647 == 0) {
			this.anInt6643 = 0;
			this.anInt6652 = 0;
			this.anInt6649 = 0;
			this.method6260();
		} else {
			@Pc(31) int local31 = -this.anInt6649;
			if (this.anInt6649 > local31) {
				local31 = this.anInt6649;
			}
			if (-this.anInt6645 > local31) {
				local31 = -this.anInt6645;
			}
			if (this.anInt6645 > local31) {
				local31 = this.anInt6645;
			}
			if (-this.anInt6647 > local31) {
				local31 = -this.anInt6647;
			}
			if (this.anInt6647 > local31) {
				local31 = this.anInt6647;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt6643 = arg0;
			this.anInt6652 = Integer.MIN_VALUE;
			this.anInt6646 = -this.anInt6649 / arg0;
			this.anInt6640 = -this.anInt6645 / arg0;
			this.anInt6648 = -this.anInt6647 / arg0;
		}
	}

	@OriginalMember(owner = "client!sv", name = "l", descriptor = "()Z")
	public boolean method5326() {
		return this.anInt6644 < 0 || this.anInt6644 >= ((Class2_Sub14_Sub1) super.aClass2_Sub14_5).aByteArray50.length << 8;
	}
}
