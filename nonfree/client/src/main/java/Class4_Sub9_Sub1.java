import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!df")
public final class Class4_Sub9_Sub1 extends Class4_Sub9 {

	@OriginalMember(owner = "client!df", name = "o", descriptor = "I")
	public int anInt968;

	@OriginalMember(owner = "client!df", name = "s", descriptor = "I")
	public int anInt972;

	@OriginalMember(owner = "client!df", name = "w", descriptor = "I")
	public int anInt975;

	@OriginalMember(owner = "client!df", name = "x", descriptor = "I")
	public int anInt976;

	@OriginalMember(owner = "client!df", name = "y", descriptor = "I")
	private int anInt977;

	@OriginalMember(owner = "client!df", name = "z", descriptor = "I")
	public int anInt978;

	@OriginalMember(owner = "client!df", name = "A", descriptor = "I")
	private int anInt979;

	@OriginalMember(owner = "client!df", name = "B", descriptor = "I")
	public int anInt980;

	@OriginalMember(owner = "client!df", name = "q", descriptor = "I")
	private int anInt970;

	@OriginalMember(owner = "client!df", name = "r", descriptor = "I")
	private int anInt971;

	@OriginalMember(owner = "client!df", name = "t", descriptor = "Z")
	private boolean aBoolean72;

	@OriginalMember(owner = "client!df", name = "u", descriptor = "I")
	private int anInt973;

	@OriginalMember(owner = "client!df", name = "n", descriptor = "I")
	private int anInt967;

	@OriginalMember(owner = "client!df", name = "p", descriptor = "I")
	private int anInt969;

	@OriginalMember(owner = "client!df", name = "v", descriptor = "I")
	public int anInt974;

	@OriginalMember(owner = "client!df", name = "<init>", descriptor = "(Lclient!gl;II)V")
	public Class4_Sub9_Sub1(@OriginalArg(0) Class4_Sub15_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass4_Sub15_5 = arg0;
		this.anInt970 = arg0.anInt1906;
		this.anInt971 = arg0.anInt1905;
		this.aBoolean72 = arg0.aBoolean143;
		this.anInt973 = arg1;
		this.anInt967 = arg2;
		this.anInt969 = 8192;
		this.anInt974 = 0;
		this.method788();
	}

	@OriginalMember(owner = "client!df", name = "<init>", descriptor = "(Lclient!gl;III)V")
	public Class4_Sub9_Sub1(@OriginalArg(0) Class4_Sub15_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass4_Sub15_5 = arg0;
		this.anInt970 = arg0.anInt1906;
		this.anInt971 = arg0.anInt1905;
		this.aBoolean72 = arg0.aBoolean143;
		this.anInt973 = arg1;
		this.anInt967 = arg2;
		this.anInt969 = arg3;
		this.anInt974 = 0;
		this.method788();
	}

	@OriginalMember(owner = "client!df", name = "e", descriptor = "()Z")
	public boolean method775() {
		return this.anInt974 < 0 || this.anInt974 >= ((Class4_Sub15_Sub1) this.aClass4_Sub15_5).aByteArray26.length << 8;
	}

	@OriginalMember(owner = "client!df", name = "d", descriptor = "(I)V")
	public synchronized void method776(@OriginalArg(0) int arg0) {
		this.method790(arg0 << 6, this.method786());
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(II)V")
	public synchronized void method778(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method783(arg0, arg1, this.method786());
	}

	@OriginalMember(owner = "client!df", name = "c", descriptor = "()I")
	@Override
	public int method1467() {
		return this.anInt967 == 0 && this.anInt979 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!df", name = "e", descriptor = "(I)V")
	public synchronized void method779(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method814();
			this.method4391();
		} else if (this.anInt968 == 0 && this.anInt976 == 0) {
			this.anInt979 = 0;
			this.anInt967 = 0;
			this.anInt978 = 0;
			this.method4391();
		} else {
			@Pc(31) int local31 = -this.anInt978;
			if (this.anInt978 > local31) {
				local31 = this.anInt978;
			}
			if (-this.anInt968 > local31) {
				local31 = -this.anInt968;
			}
			if (this.anInt968 > local31) {
				local31 = this.anInt968;
			}
			if (-this.anInt976 > local31) {
				local31 = -this.anInt976;
			}
			if (this.anInt976 > local31) {
				local31 = this.anInt976;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt979 = arg0;
			this.anInt967 = Integer.MIN_VALUE;
			this.anInt972 = -this.anInt978 / arg0;
			this.anInt975 = -this.anInt968 / arg0;
			this.anInt980 = -this.anInt976 / arg0;
		}
	}

	@OriginalMember(owner = "client!df", name = "f", descriptor = "()I")
	public synchronized int method780() {
		return this.anInt973 < 0 ? -this.anInt973 : this.anInt973;
	}

	@OriginalMember(owner = "client!df", name = "f", descriptor = "(I)V")
	public synchronized void method781(@OriginalArg(0) int arg0) {
		this.anInt977 = arg0;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "([IIIII)I")
	private int method782(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		while (true) {
			if (this.anInt979 > 0) {
				@Pc(7) int local7 = arg1 + this.anInt979;
				if (local7 > arg3) {
					local7 = arg3;
				}
				this.anInt979 += arg1;
				if (this.anInt973 == -256 && (this.anInt974 & 0xFF) == 0) {
					if (Static14.aBoolean153) {
						arg1 = Static302.method800(((Class4_Sub15_Sub1) this.aClass4_Sub15_5).aByteArray26, arg0, this.anInt974, arg1, this.anInt968, this.anInt976, this.anInt975, this.anInt980, local7, arg2, this);
					} else {
						arg1 = Static302.method803(((Class4_Sub15_Sub1) this.aClass4_Sub15_5).aByteArray26, arg0, this.anInt974, arg1, this.anInt978, this.anInt972, local7, arg2, this);
					}
				} else if (Static14.aBoolean153) {
					arg1 = Static302.method784(((Class4_Sub15_Sub1) this.aClass4_Sub15_5).aByteArray26, arg0, this.anInt974, arg1, this.anInt968, this.anInt976, this.anInt975, this.anInt980, local7, arg2, this, this.anInt973, arg4);
				} else {
					arg1 = Static302.method807(((Class4_Sub15_Sub1) this.aClass4_Sub15_5).aByteArray26, arg0, this.anInt974, arg1, this.anInt978, this.anInt972, local7, arg2, this, this.anInt973, arg4);
				}
				this.anInt979 -= arg1;
				if (this.anInt979 != 0) {
					return arg1;
				}
				if (!this.method789()) {
					continue;
				}
				return arg3;
			}
			if (this.anInt973 == -256 && (this.anInt974 & 0xFF) == 0) {
				if (Static14.aBoolean153) {
					return Static302.method813(((Class4_Sub15_Sub1) this.aClass4_Sub15_5).aByteArray26, arg0, this.anInt974, arg1, this.anInt968, this.anInt976, arg3, arg2, this);
				}
				return Static302.method777(((Class4_Sub15_Sub1) this.aClass4_Sub15_5).aByteArray26, arg0, this.anInt974, arg1, this.anInt978, arg3, arg2, this);
			}
			if (Static14.aBoolean153) {
				return Static302.method795(((Class4_Sub15_Sub1) this.aClass4_Sub15_5).aByteArray26, arg0, this.anInt974, arg1, this.anInt968, this.anInt976, arg3, arg2, this, this.anInt973, arg4);
			}
			return Static302.method794(((Class4_Sub15_Sub1) this.aClass4_Sub15_5).aByteArray26, arg0, this.anInt974, arg1, this.anInt978, arg3, arg2, this, this.anInt973, arg4);
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(III)V")
	public synchronized void method783(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method790(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static302.method810(arg1, arg2);
		@Pc(14) int local14 = Static302.method796(arg1, arg2);
		if (this.anInt968 == local10 && this.anInt976 == local14) {
			this.anInt979 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt978;
		if (this.anInt978 - arg1 > local31) {
			local31 = this.anInt978 - arg1;
		}
		if (local10 - this.anInt968 > local31) {
			local31 = local10 - this.anInt968;
		}
		if (this.anInt968 - local10 > local31) {
			local31 = this.anInt968 - local10;
		}
		if (local14 - this.anInt976 > local31) {
			local31 = local14 - this.anInt976;
		}
		if (this.anInt976 - local14 > local31) {
			local31 = this.anInt976 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt979 = arg0;
		this.anInt967 = arg1;
		this.anInt969 = arg2;
		this.anInt972 = (arg1 - this.anInt978) / arg0;
		this.anInt975 = (local10 - this.anInt968) / arg0;
		this.anInt980 = (local14 - this.anInt976) / arg0;
	}

	@OriginalMember(owner = "client!df", name = "d", descriptor = "()Lclient!fb;")
	@Override
	public Class4_Sub9 method1468() {
		return null;
	}

	@OriginalMember(owner = "client!df", name = "b", descriptor = "()I")
	@Override
	public int method1464() {
		@Pc(6) int local6 = this.anInt978 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt977 == 0) {
			local6 -= local6 * this.anInt974 / (((Class4_Sub15_Sub1) this.aClass4_Sub15_5).aByteArray26.length << 8);
		} else if (this.anInt977 >= 0) {
			local6 -= local6 * this.anInt970 / ((Class4_Sub15_Sub1) this.aClass4_Sub15_5).aByteArray26.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!df", name = "g", descriptor = "(I)V")
	public synchronized void method785(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class4_Sub15_Sub1) this.aClass4_Sub15_5).aByteArray26.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt974 = arg0;
	}

	@OriginalMember(owner = "client!df", name = "g", descriptor = "()I")
	public synchronized int method786() {
		return this.anInt969 < 0 ? -1 : this.anInt969;
	}

	@OriginalMember(owner = "client!df", name = "h", descriptor = "(I)V")
	public synchronized void method787(@OriginalArg(0) int arg0) {
		if (this.anInt973 < 0) {
			this.anInt973 = -arg0;
		} else {
			this.anInt973 = arg0;
		}
	}

	@OriginalMember(owner = "client!df", name = "h", descriptor = "()V")
	private void method788() {
		this.anInt978 = this.anInt967;
		this.anInt968 = Static302.method810(this.anInt967, this.anInt969);
		this.anInt976 = Static302.method796(this.anInt967, this.anInt969);
	}

	@OriginalMember(owner = "client!df", name = "i", descriptor = "()Z")
	private boolean method789() {
		@Pc(2) int local2 = this.anInt967;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static302.method810(local2, this.anInt969);
			local8 = Static302.method796(local2, this.anInt969);
		}
		if (this.anInt978 != local2 || this.anInt968 != local10 || this.anInt976 != local8) {
			if (this.anInt978 < local2) {
				this.anInt972 = 1;
				this.anInt979 = local2 - this.anInt978;
			} else if (this.anInt978 > local2) {
				this.anInt972 = -1;
				this.anInt979 = this.anInt978 - local2;
			} else {
				this.anInt972 = 0;
			}
			if (this.anInt968 < local10) {
				this.anInt975 = 1;
				if (this.anInt979 == 0 || this.anInt979 > local10 - this.anInt968) {
					this.anInt979 = local10 - this.anInt968;
				}
			} else if (this.anInt968 > local10) {
				this.anInt975 = -1;
				if (this.anInt979 == 0 || this.anInt979 > this.anInt968 - local10) {
					this.anInt979 = this.anInt968 - local10;
				}
			} else {
				this.anInt975 = 0;
			}
			if (this.anInt976 < local8) {
				this.anInt980 = 1;
				if (this.anInt979 == 0 || this.anInt979 > local8 - this.anInt976) {
					this.anInt979 = local8 - this.anInt976;
				}
			} else if (this.anInt976 > local8) {
				this.anInt980 = -1;
				if (this.anInt979 == 0 || this.anInt979 > this.anInt976 - local8) {
					this.anInt979 = this.anInt976 - local8;
				}
			} else {
				this.anInt980 = 0;
			}
			return false;
		} else if (this.anInt967 == Integer.MIN_VALUE) {
			this.anInt967 = 0;
			this.anInt978 = this.anInt968 = this.anInt976 = 0;
			this.method4391();
			return true;
		} else {
			this.method788();
			return false;
		}
	}

	@OriginalMember(owner = "client!df", name = "b", descriptor = "(II)V")
	private synchronized void method790(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt967 = arg0;
		this.anInt969 = arg1;
		this.anInt979 = 0;
		this.method788();
	}

	@OriginalMember(owner = "client!df", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method1465(@OriginalArg(0) int arg0) {
		if (this.anInt979 > 0) {
			if (arg0 >= this.anInt979) {
				if (this.anInt967 == Integer.MIN_VALUE) {
					this.anInt967 = 0;
					this.anInt978 = this.anInt968 = this.anInt976 = 0;
					this.method4391();
					arg0 = this.anInt979;
				}
				this.anInt979 = 0;
				this.method788();
			} else {
				this.anInt978 += this.anInt972 * arg0;
				this.anInt968 += this.anInt975 * arg0;
				this.anInt976 += this.anInt980 * arg0;
				this.anInt979 -= arg0;
			}
		}
		@Pc(71) Class4_Sub15_Sub1 local71 = (Class4_Sub15_Sub1) this.aClass4_Sub15_5;
		@Pc(76) int local76 = this.anInt970 << 8;
		@Pc(81) int local81 = this.anInt971 << 8;
		@Pc(87) int local87 = local71.aByteArray26.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt977 = 0;
		}
		if (this.anInt974 < 0) {
			if (this.anInt973 <= 0) {
				this.method808();
				this.method4391();
				return;
			}
			this.anInt974 = 0;
		}
		if (this.anInt974 >= local87) {
			if (this.anInt973 >= 0) {
				this.method808();
				this.method4391();
				return;
			}
			this.anInt974 = local87 - 1;
		}
		this.anInt974 += this.anInt973 * arg0;
		if (this.anInt977 >= 0) {
			if (this.anInt977 > 0) {
				if (this.aBoolean72) {
					label121: {
						if (this.anInt973 < 0) {
							if (this.anInt974 >= local76) {
								return;
							}
							this.anInt974 = local76 + local76 - this.anInt974 - 1;
							this.anInt973 = -this.anInt973;
							if (--this.anInt977 == 0) {
								break label121;
							}
						}
						do {
							if (this.anInt974 < local81) {
								return;
							}
							this.anInt974 = local81 + local81 - this.anInt974 - 1;
							this.anInt973 = -this.anInt973;
							if (--this.anInt977 == 0) {
								break;
							}
							if (this.anInt974 >= local76) {
								return;
							}
							this.anInt974 = local76 + local76 - this.anInt974 - 1;
							this.anInt973 = -this.anInt973;
						} while (--this.anInt977 != 0);
					}
				} else {
					label153: {
						@Pc(362) int local362;
						if (this.anInt973 < 0) {
							if (this.anInt974 >= local76) {
								return;
							}
							local362 = (local81 - this.anInt974 - 1) / local91;
							if (local362 >= this.anInt977) {
								this.anInt974 += local91 * this.anInt977;
								this.anInt977 = 0;
								break label153;
							}
							this.anInt974 += local91 * local362;
							this.anInt977 -= local362;
						} else if (this.anInt974 >= local81) {
							local362 = (this.anInt974 - local76) / local91;
							if (local362 >= this.anInt977) {
								this.anInt974 -= local91 * this.anInt977;
								this.anInt977 = 0;
								break label153;
							}
							this.anInt974 -= local91 * local362;
							this.anInt977 -= local362;
						} else {
							return;
						}
						return;
					}
				}
			}
			if (this.anInt973 < 0) {
				if (this.anInt974 < 0) {
					this.anInt974 = -1;
					this.method808();
					this.method4391();
				}
			} else if (this.anInt974 >= local87) {
				this.anInt974 = local87;
				this.method808();
				this.method4391();
			}
		} else if (this.aBoolean72) {
			if (this.anInt973 < 0) {
				if (this.anInt974 >= local76) {
					return;
				}
				this.anInt974 = local76 + local76 - this.anInt974 - 1;
				this.anInt973 = -this.anInt973;
			}
			while (this.anInt974 >= local81) {
				this.anInt974 = local81 + local81 - this.anInt974 - 1;
				this.anInt973 = -this.anInt973;
				if (this.anInt974 >= local76) {
					return;
				}
				this.anInt974 = local76 + local76 - this.anInt974 - 1;
				this.anInt973 = -this.anInt973;
			}
		} else if (this.anInt973 < 0) {
			if (this.anInt974 >= local76) {
				return;
			}
			this.anInt974 = local81 - (local81 - 1 - this.anInt974) % local91 - 1;
		} else if (this.anInt974 >= local81) {
			this.anInt974 = local76 + (this.anInt974 - local76) % local91;
		} else {
			return;
		}
	}

	@OriginalMember(owner = "client!df", name = "j", descriptor = "()I")
	public synchronized int method793() {
		return this.anInt967 == Integer.MIN_VALUE ? 0 : this.anInt967;
	}

	@OriginalMember(owner = "client!df", name = "b", descriptor = "(Z)V")
	public synchronized void method797() {
		this.anInt973 = (this.anInt973 ^ this.anInt973 >> 31) + (this.anInt973 >>> 31);
		this.anInt973 = -this.anInt973;
	}

	@OriginalMember(owner = "client!df", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method1469(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt967 == 0 && this.anInt979 == 0) {
			this.method1465(arg2);
			return;
		}
		@Pc(13) Class4_Sub15_Sub1 local13 = (Class4_Sub15_Sub1) this.aClass4_Sub15_5;
		@Pc(18) int local18 = this.anInt970 << 8;
		@Pc(23) int local23 = this.anInt971 << 8;
		@Pc(29) int local29 = local13.aByteArray26.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt977 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt974 < 0) {
			if (this.anInt973 <= 0) {
				this.method808();
				this.method4391();
				return;
			}
			this.anInt974 = 0;
		}
		if (this.anInt974 >= local29) {
			if (this.anInt973 >= 0) {
				this.method808();
				this.method4391();
				return;
			}
			this.anInt974 = local29 - 1;
		}
		if (this.anInt977 >= 0) {
			if (this.anInt977 > 0) {
				if (this.aBoolean72) {
					label131: {
						if (this.anInt973 < 0) {
							local40 = this.method782(arg0, arg1, local18, local44, local13.aByteArray26[this.anInt970]);
							if (this.anInt974 >= local18) {
								return;
							}
							this.anInt974 = local18 + local18 - this.anInt974 - 1;
							this.anInt973 = -this.anInt973;
							if (--this.anInt977 == 0) {
								break label131;
							}
						}
						do {
							local40 = this.method812(arg0, local40, local23, local44, local13.aByteArray26[this.anInt971 - 1]);
							if (this.anInt974 < local23) {
								return;
							}
							this.anInt974 = local23 + local23 - this.anInt974 - 1;
							this.anInt973 = -this.anInt973;
							if (--this.anInt977 == 0) {
								break;
							}
							local40 = this.method782(arg0, local40, local18, local44, local13.aByteArray26[this.anInt970]);
							if (this.anInt974 >= local18) {
								return;
							}
							this.anInt974 = local18 + local18 - this.anInt974 - 1;
							this.anInt973 = -this.anInt973;
						} while (--this.anInt977 != 0);
					}
				} else {
					@Pc(417) int local417;
					if (this.anInt973 < 0) {
						while (true) {
							local40 = this.method782(arg0, local40, local18, local44, local13.aByteArray26[this.anInt971 - 1]);
							if (this.anInt974 >= local18) {
								return;
							}
							local417 = (local23 - this.anInt974 - 1) / local33;
							if (local417 >= this.anInt977) {
								this.anInt974 += local33 * this.anInt977;
								this.anInt977 = 0;
								break;
							}
							this.anInt974 += local33 * local417;
							this.anInt977 -= local417;
						}
					} else {
						while (true) {
							local40 = this.method812(arg0, local40, local23, local44, local13.aByteArray26[this.anInt970]);
							if (this.anInt974 < local23) {
								return;
							}
							local417 = (this.anInt974 - local18) / local33;
							if (local417 >= this.anInt977) {
								this.anInt974 -= local33 * this.anInt977;
								this.anInt977 = 0;
								break;
							}
							this.anInt974 -= local33 * local417;
							this.anInt977 -= local417;
						}
					}
				}
			}
			if (this.anInt973 < 0) {
				this.method782(arg0, local40, 0, local44, 0);
				if (this.anInt974 < 0) {
					this.anInt974 = -1;
					this.method808();
					this.method4391();
				}
			} else {
				this.method812(arg0, local40, local29, local44, 0);
				if (this.anInt974 >= local29) {
					this.anInt974 = local29;
					this.method808();
					this.method4391();
				}
			}
		} else if (this.aBoolean72) {
			if (this.anInt973 < 0) {
				local40 = this.method782(arg0, arg1, local18, local44, local13.aByteArray26[this.anInt970]);
				if (this.anInt974 >= local18) {
					return;
				}
				this.anInt974 = local18 + local18 - this.anInt974 - 1;
				this.anInt973 = -this.anInt973;
			}
			while (true) {
				local40 = this.method812(arg0, local40, local23, local44, local13.aByteArray26[this.anInt971 - 1]);
				if (this.anInt974 < local23) {
					return;
				}
				this.anInt974 = local23 + local23 - this.anInt974 - 1;
				this.anInt973 = -this.anInt973;
				local40 = this.method782(arg0, local40, local18, local44, local13.aByteArray26[this.anInt970]);
				if (this.anInt974 >= local18) {
					return;
				}
				this.anInt974 = local18 + local18 - this.anInt974 - 1;
				this.anInt973 = -this.anInt973;
			}
		} else if (this.anInt973 < 0) {
			while (true) {
				local40 = this.method782(arg0, local40, local18, local44, local13.aByteArray26[this.anInt971 - 1]);
				if (this.anInt974 >= local18) {
					return;
				}
				this.anInt974 = local23 - (local23 - 1 - this.anInt974) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method812(arg0, local40, local23, local44, local13.aByteArray26[this.anInt970]);
				if (this.anInt974 < local23) {
					return;
				}
				this.anInt974 = local18 + (this.anInt974 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!df", name = "k", descriptor = "()Z")
	public boolean method798() {
		return this.anInt979 != 0;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "()Lclient!fb;")
	@Override
	public Class4_Sub9 method1463() {
		return null;
	}

	@OriginalMember(owner = "client!df", name = "l", descriptor = "()V")
	private void method808() {
		if (this.anInt979 == 0) {
			return;
		}
		if (this.anInt967 == Integer.MIN_VALUE) {
			this.anInt967 = 0;
		}
		this.anInt979 = 0;
		this.method788();
	}

	@OriginalMember(owner = "client!df", name = "b", descriptor = "([IIIII)I")
	private int method812(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		while (true) {
			if (this.anInt979 > 0) {
				@Pc(7) int local7 = arg1 + this.anInt979;
				if (local7 > arg3) {
					local7 = arg3;
				}
				this.anInt979 += arg1;
				if (this.anInt973 == 256 && (this.anInt974 & 0xFF) == 0) {
					if (Static14.aBoolean153) {
						arg1 = Static302.method801(((Class4_Sub15_Sub1) this.aClass4_Sub15_5).aByteArray26, arg0, this.anInt974, arg1, this.anInt968, this.anInt976, this.anInt975, this.anInt980, local7, arg2, this);
					} else {
						arg1 = Static302.method804(((Class4_Sub15_Sub1) this.aClass4_Sub15_5).aByteArray26, arg0, this.anInt974, arg1, this.anInt978, this.anInt972, local7, arg2, this);
					}
				} else if (Static14.aBoolean153) {
					arg1 = Static302.method791(((Class4_Sub15_Sub1) this.aClass4_Sub15_5).aByteArray26, arg0, this.anInt974, arg1, this.anInt968, this.anInt976, this.anInt975, this.anInt980, local7, arg2, this, this.anInt973, arg4);
				} else {
					arg1 = Static302.method805(((Class4_Sub15_Sub1) this.aClass4_Sub15_5).aByteArray26, arg0, this.anInt974, arg1, this.anInt978, this.anInt972, local7, arg2, this, this.anInt973, arg4);
				}
				this.anInt979 -= arg1;
				if (this.anInt979 != 0) {
					return arg1;
				}
				if (!this.method789()) {
					continue;
				}
				return arg3;
			}
			if (this.anInt973 == 256 && (this.anInt974 & 0xFF) == 0) {
				if (Static14.aBoolean153) {
					return Static302.method792(((Class4_Sub15_Sub1) this.aClass4_Sub15_5).aByteArray26, arg0, this.anInt974, arg1, this.anInt968, this.anInt976, arg3, arg2, this);
				}
				return Static302.method802(((Class4_Sub15_Sub1) this.aClass4_Sub15_5).aByteArray26, arg0, this.anInt974, arg1, this.anInt978, arg3, arg2, this);
			}
			if (Static14.aBoolean153) {
				return Static302.method799(((Class4_Sub15_Sub1) this.aClass4_Sub15_5).aByteArray26, arg0, this.anInt974, arg1, this.anInt968, this.anInt976, arg3, arg2, this, this.anInt973, arg4);
			}
			return Static302.method806(((Class4_Sub15_Sub1) this.aClass4_Sub15_5).aByteArray26, arg0, this.anInt974, arg1, this.anInt978, arg3, arg2, this, this.anInt973, arg4);
		}
	}

	@OriginalMember(owner = "client!df", name = "i", descriptor = "(I)V")
	private synchronized void method814() {
		this.method790(0, this.method786());
	}
}
