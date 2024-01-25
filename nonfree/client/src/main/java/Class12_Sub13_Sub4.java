import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vn")
public final class Class12_Sub13_Sub4 extends Class12_Sub13 {

	@OriginalMember(owner = "client!vn", name = "r", descriptor = "I")
	public int anInt9312;

	@OriginalMember(owner = "client!vn", name = "s", descriptor = "I")
	public int anInt9313;

	@OriginalMember(owner = "client!vn", name = "v", descriptor = "I")
	public int anInt9316;

	@OriginalMember(owner = "client!vn", name = "w", descriptor = "I")
	public int anInt9317;

	@OriginalMember(owner = "client!vn", name = "y", descriptor = "I")
	public int anInt9318;

	@OriginalMember(owner = "client!vn", name = "A", descriptor = "I")
	private int anInt9320;

	@OriginalMember(owner = "client!vn", name = "C", descriptor = "I")
	public int anInt9322;

	@OriginalMember(owner = "client!vn", name = "E", descriptor = "I")
	private int anInt9324;

	@OriginalMember(owner = "client!vn", name = "z", descriptor = "I")
	private final int anInt9319;

	@OriginalMember(owner = "client!vn", name = "u", descriptor = "I")
	private final int anInt9315;

	@OriginalMember(owner = "client!vn", name = "x", descriptor = "Z")
	private final boolean aBoolean659;

	@OriginalMember(owner = "client!vn", name = "B", descriptor = "I")
	private int anInt9321;

	@OriginalMember(owner = "client!vn", name = "q", descriptor = "I")
	private int anInt9311;

	@OriginalMember(owner = "client!vn", name = "D", descriptor = "I")
	private int anInt9323;

	@OriginalMember(owner = "client!vn", name = "t", descriptor = "I")
	public int anInt9314;

	@OriginalMember(owner = "client!vn", name = "<init>", descriptor = "(Lclient!ke;II)V")
	public Class12_Sub13_Sub4(@OriginalArg(0) Class12_Sub29_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass12_Sub29_5 = arg0;
		this.anInt9319 = arg0.anInt5187;
		this.anInt9315 = arg0.anInt5185;
		this.aBoolean659 = arg0.aBoolean400;
		this.anInt9321 = arg1;
		this.anInt9311 = arg2;
		this.anInt9323 = 8192;
		this.anInt9314 = 0;
		this.method7680();
	}

	@OriginalMember(owner = "client!vn", name = "<init>", descriptor = "(Lclient!ke;III)V")
	public Class12_Sub13_Sub4(@OriginalArg(0) Class12_Sub29_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass12_Sub29_5 = arg0;
		this.anInt9319 = arg0.anInt5187;
		this.anInt9315 = arg0.anInt5185;
		this.aBoolean659 = arg0.aBoolean400;
		this.anInt9321 = arg1;
		this.anInt9311 = arg2;
		this.anInt9323 = arg3;
		this.anInt9314 = 0;
		this.method7680();
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "([IIIII)I")
	private int method7678(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt9320 <= 0) {
				if (this.anInt9321 == -256 && (this.anInt9314 & 0xFF) == 0) {
					if (Static140.aBoolean250) {
						return Static560.method7690(((Class12_Sub29_Sub1) super.aClass12_Sub29_5).aByteArray59, arg0, this.anInt9314, arg1, this.anInt9318, this.anInt9312, arg3, arg2, this);
					}
					return Static560.method7702(((Class12_Sub29_Sub1) super.aClass12_Sub29_5).aByteArray59, arg0, this.anInt9314, arg1, this.anInt9316, arg3, arg2, this);
				}
				if (Static140.aBoolean250) {
					return Static560.method7706(((Class12_Sub29_Sub1) super.aClass12_Sub29_5).aByteArray59, arg0, this.anInt9314, arg1, this.anInt9318, this.anInt9312, arg3, arg2, this, this.anInt9321, arg4);
				}
				return Static560.method7695(((Class12_Sub29_Sub1) super.aClass12_Sub29_5).aByteArray59, arg0, this.anInt9314, arg1, this.anInt9316, arg3, arg2, this, this.anInt9321, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt9320;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt9320 += arg1;
			if (this.anInt9321 == -256 && (this.anInt9314 & 0xFF) == 0) {
				if (Static140.aBoolean250) {
					arg1 = Static560.method7687(((Class12_Sub29_Sub1) super.aClass12_Sub29_5).aByteArray59, arg0, this.anInt9314, arg1, this.anInt9318, this.anInt9312, this.anInt9317, this.anInt9313, local5, arg2, this);
				} else {
					arg1 = Static560.method7704(((Class12_Sub29_Sub1) super.aClass12_Sub29_5).aByteArray59, arg0, this.anInt9314, arg1, this.anInt9316, this.anInt9322, local5, arg2, this);
				}
			} else if (Static140.aBoolean250) {
				arg1 = Static560.method7696(((Class12_Sub29_Sub1) super.aClass12_Sub29_5).aByteArray59, arg0, this.anInt9314, arg1, this.anInt9318, this.anInt9312, this.anInt9317, this.anInt9313, local5, arg2, this, this.anInt9321, arg4);
			} else {
				arg1 = Static560.method7715(((Class12_Sub29_Sub1) super.aClass12_Sub29_5).aByteArray59, arg0, this.anInt9314, arg1, this.anInt9316, this.anInt9322, local5, arg2, this, this.anInt9321, arg4);
			}
			this.anInt9320 -= arg1;
			if (this.anInt9320 != 0) {
				return arg1;
			}
		} while (!this.method7717());
		return arg3;
	}

	@OriginalMember(owner = "client!vn", name = "e", descriptor = "()V")
	private void method7680() {
		this.anInt9316 = this.anInt9311;
		this.anInt9318 = Static560.method7707(this.anInt9311, this.anInt9323);
		this.anInt9312 = Static560.method7699(this.anInt9311, this.anInt9323);
	}

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "([IIIII)I")
	private int method7681(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt9320 <= 0) {
				if (this.anInt9321 == 256 && (this.anInt9314 & 0xFF) == 0) {
					if (Static140.aBoolean250) {
						return Static560.method7679(((Class12_Sub29_Sub1) super.aClass12_Sub29_5).aByteArray59, arg0, this.anInt9314, arg1, this.anInt9318, this.anInt9312, arg3, arg2, this);
					}
					return Static560.method7685(((Class12_Sub29_Sub1) super.aClass12_Sub29_5).aByteArray59, arg0, this.anInt9314, arg1, this.anInt9316, arg3, arg2, this);
				}
				if (Static140.aBoolean250) {
					return Static560.method7713(((Class12_Sub29_Sub1) super.aClass12_Sub29_5).aByteArray59, arg0, this.anInt9314, arg1, this.anInt9318, this.anInt9312, arg3, arg2, this, this.anInt9321, arg4);
				}
				return Static560.method7692(((Class12_Sub29_Sub1) super.aClass12_Sub29_5).aByteArray59, arg0, this.anInt9314, arg1, this.anInt9316, arg3, arg2, this, this.anInt9321, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt9320;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt9320 += arg1;
			if (this.anInt9321 == 256 && (this.anInt9314 & 0xFF) == 0) {
				if (Static140.aBoolean250) {
					arg1 = Static560.method7700(((Class12_Sub29_Sub1) super.aClass12_Sub29_5).aByteArray59, arg0, this.anInt9314, arg1, this.anInt9318, this.anInt9312, this.anInt9317, this.anInt9313, local5, arg2, this);
				} else {
					arg1 = Static560.method7716(((Class12_Sub29_Sub1) super.aClass12_Sub29_5).aByteArray59, arg0, this.anInt9314, arg1, this.anInt9316, this.anInt9322, local5, arg2, this);
				}
			} else if (Static140.aBoolean250) {
				arg1 = Static560.method7708(((Class12_Sub29_Sub1) super.aClass12_Sub29_5).aByteArray59, arg0, this.anInt9314, arg1, this.anInt9318, this.anInt9312, this.anInt9317, this.anInt9313, local5, arg2, this, this.anInt9321, arg4);
			} else {
				arg1 = Static560.method7714(((Class12_Sub29_Sub1) super.aClass12_Sub29_5).aByteArray59, arg0, this.anInt9314, arg1, this.anInt9316, this.anInt9322, local5, arg2, this, this.anInt9321, arg4);
			}
			this.anInt9320 -= arg1;
			if (this.anInt9320 != 0) {
				return arg1;
			}
		} while (!this.method7717());
		return arg3;
	}

	@OriginalMember(owner = "client!vn", name = "f", descriptor = "()Z")
	public boolean method7682() {
		return this.anInt9320 != 0;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(II)V")
	public synchronized void method7683(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method7684(arg0, arg1, this.method7689());
	}

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "(III)V")
	public synchronized void method7684(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method7691(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static560.method7707(arg1, arg2);
		@Pc(14) int local14 = Static560.method7699(arg1, arg2);
		if (this.anInt9318 == local10 && this.anInt9312 == local14) {
			this.anInt9320 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt9316;
		if (this.anInt9316 - arg1 > local31) {
			local31 = this.anInt9316 - arg1;
		}
		if (local10 - this.anInt9318 > local31) {
			local31 = local10 - this.anInt9318;
		}
		if (this.anInt9318 - local10 > local31) {
			local31 = this.anInt9318 - local10;
		}
		if (local14 - this.anInt9312 > local31) {
			local31 = local14 - this.anInt9312;
		}
		if (this.anInt9312 - local14 > local31) {
			local31 = this.anInt9312 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt9320 = arg0;
		this.anInt9311 = arg1;
		this.anInt9323 = arg2;
		this.anInt9322 = (arg1 - this.anInt9316) / arg0;
		this.anInt9317 = (local10 - this.anInt9318) / arg0;
		this.anInt9313 = (local14 - this.anInt9312) / arg0;
	}

	@OriginalMember(owner = "client!vn", name = "g", descriptor = "()I")
	public synchronized int method7686() {
		return this.anInt9321 < 0 ? -this.anInt9321 : this.anInt9321;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "()I")
	@Override
	public int method7671() {
		@Pc(6) int local6 = this.anInt9316 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt9324 == 0) {
			local6 -= local6 * this.anInt9314 / (((Class12_Sub29_Sub1) super.aClass12_Sub29_5).aByteArray59.length << 8);
		} else if (this.anInt9324 >= 0) {
			local6 -= local6 * this.anInt9319 / ((Class12_Sub29_Sub1) super.aClass12_Sub29_5).aByteArray59.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(Z)V")
	public synchronized void method7688() {
		this.anInt9321 = (this.anInt9321 ^ this.anInt9321 >> 31) + (this.anInt9321 >>> 31);
		this.anInt9321 = -this.anInt9321;
	}

	@OriginalMember(owner = "client!vn", name = "h", descriptor = "()I")
	public synchronized int method7689() {
		return this.anInt9323 < 0 ? -1 : this.anInt9323;
	}

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "(II)V")
	private synchronized void method7691(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt9311 = arg0;
		this.anInt9323 = arg1;
		this.anInt9320 = 0;
		this.method7680();
	}

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "(I)V")
	public synchronized void method7693(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method7709();
			this.method7967();
		} else if (this.anInt9318 == 0 && this.anInt9312 == 0) {
			this.anInt9320 = 0;
			this.anInt9311 = 0;
			this.anInt9316 = 0;
			this.method7967();
		} else {
			@Pc(31) int local31 = -this.anInt9316;
			if (this.anInt9316 > local31) {
				local31 = this.anInt9316;
			}
			if (-this.anInt9318 > local31) {
				local31 = -this.anInt9318;
			}
			if (this.anInt9318 > local31) {
				local31 = this.anInt9318;
			}
			if (-this.anInt9312 > local31) {
				local31 = -this.anInt9312;
			}
			if (this.anInt9312 > local31) {
				local31 = this.anInt9312;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt9320 = arg0;
			this.anInt9311 = Integer.MIN_VALUE;
			this.anInt9322 = -this.anInt9316 / arg0;
			this.anInt9317 = -this.anInt9318 / arg0;
			this.anInt9313 = -this.anInt9312 / arg0;
		}
	}

	@OriginalMember(owner = "client!vn", name = "c", descriptor = "()Lclient!ff;")
	@Override
	public Class12_Sub13 method7673() {
		return null;
	}

	@OriginalMember(owner = "client!vn", name = "i", descriptor = "()I")
	public synchronized int method7694() {
		return this.anInt9311 == Integer.MIN_VALUE ? 0 : this.anInt9311;
	}

	@OriginalMember(owner = "client!vn", name = "c", descriptor = "(I)V")
	public synchronized void method7697(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class12_Sub29_Sub1) super.aClass12_Sub29_5).aByteArray59.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt9314 = arg0;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method7676(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt9311 == 0 && this.anInt9320 == 0) {
			this.method7675(arg2);
			return;
		}
		@Pc(13) Class12_Sub29_Sub1 local13 = (Class12_Sub29_Sub1) super.aClass12_Sub29_5;
		@Pc(18) int local18 = this.anInt9319 << 8;
		@Pc(23) int local23 = this.anInt9315 << 8;
		@Pc(29) int local29 = local13.aByteArray59.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt9324 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt9314 < 0) {
			if (this.anInt9321 <= 0) {
				this.method7705();
				this.method7967();
				return;
			}
			this.anInt9314 = 0;
		}
		if (this.anInt9314 >= local29) {
			if (this.anInt9321 >= 0) {
				this.method7705();
				this.method7967();
				return;
			}
			this.anInt9314 = local29 - 1;
		}
		if (this.anInt9324 >= 0) {
			if (this.anInt9324 > 0) {
				if (this.aBoolean659) {
					label130: {
						if (this.anInt9321 < 0) {
							local40 = this.method7678(arg0, arg1, local18, local44, local13.aByteArray59[this.anInt9319]);
							if (this.anInt9314 >= local18) {
								return;
							}
							this.anInt9314 = local18 + local18 - this.anInt9314 - 1;
							this.anInt9321 = -this.anInt9321;
							if (--this.anInt9324 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method7681(arg0, local40, local23, local44, local13.aByteArray59[this.anInt9315 - 1]);
							if (this.anInt9314 < local23) {
								return;
							}
							this.anInt9314 = local23 + local23 - this.anInt9314 - 1;
							this.anInt9321 = -this.anInt9321;
							if (--this.anInt9324 == 0) {
								break;
							}
							local40 = this.method7678(arg0, local40, local18, local44, local13.aByteArray59[this.anInt9319]);
							if (this.anInt9314 >= local18) {
								return;
							}
							this.anInt9314 = local18 + local18 - this.anInt9314 - 1;
							this.anInt9321 = -this.anInt9321;
						} while (--this.anInt9324 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt9321 < 0) {
						while (true) {
							local40 = this.method7678(arg0, local40, local18, local44, local13.aByteArray59[this.anInt9315 - 1]);
							if (this.anInt9314 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt9314 - 1) / local33;
							if (local416 >= this.anInt9324) {
								this.anInt9314 += local33 * this.anInt9324;
								this.anInt9324 = 0;
								break;
							}
							this.anInt9314 += local33 * local416;
							this.anInt9324 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method7681(arg0, local40, local23, local44, local13.aByteArray59[this.anInt9319]);
							if (this.anInt9314 < local23) {
								return;
							}
							local416 = (this.anInt9314 - local18) / local33;
							if (local416 >= this.anInt9324) {
								this.anInt9314 -= local33 * this.anInt9324;
								this.anInt9324 = 0;
								break;
							}
							this.anInt9314 -= local33 * local416;
							this.anInt9324 -= local416;
						}
					}
				}
			}
			if (this.anInt9321 < 0) {
				this.method7678(arg0, local40, 0, local44, 0);
				if (this.anInt9314 < 0) {
					this.anInt9314 = -1;
					this.method7705();
					this.method7967();
					return;
				}
			} else {
				this.method7681(arg0, local40, local29, local44, 0);
				if (this.anInt9314 >= local29) {
					this.anInt9314 = local29;
					this.method7705();
					this.method7967();
				}
			}
		} else if (this.aBoolean659) {
			if (this.anInt9321 < 0) {
				local40 = this.method7678(arg0, arg1, local18, local44, local13.aByteArray59[this.anInt9319]);
				if (this.anInt9314 >= local18) {
					return;
				}
				this.anInt9314 = local18 + local18 - this.anInt9314 - 1;
				this.anInt9321 = -this.anInt9321;
			}
			while (true) {
				local40 = this.method7681(arg0, local40, local23, local44, local13.aByteArray59[this.anInt9315 - 1]);
				if (this.anInt9314 < local23) {
					return;
				}
				this.anInt9314 = local23 + local23 - this.anInt9314 - 1;
				this.anInt9321 = -this.anInt9321;
				local40 = this.method7678(arg0, local40, local18, local44, local13.aByteArray59[this.anInt9319]);
				if (this.anInt9314 >= local18) {
					return;
				}
				this.anInt9314 = local18 + local18 - this.anInt9314 - 1;
				this.anInt9321 = -this.anInt9321;
			}
		} else if (this.anInt9321 < 0) {
			while (true) {
				local40 = this.method7678(arg0, local40, local18, local44, local13.aByteArray59[this.anInt9315 - 1]);
				if (this.anInt9314 >= local18) {
					return;
				}
				this.anInt9314 = local23 - (local23 - 1 - this.anInt9314) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method7681(arg0, local40, local23, local44, local13.aByteArray59[this.anInt9319]);
				if (this.anInt9314 < local23) {
					return;
				}
				this.anInt9314 = local18 + (this.anInt9314 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!vn", name = "d", descriptor = "(I)V")
	public synchronized void method7703(@OriginalArg(0) int arg0) {
		if (this.anInt9321 < 0) {
			this.anInt9321 = -arg0;
		} else {
			this.anInt9321 = arg0;
		}
	}

	@OriginalMember(owner = "client!vn", name = "j", descriptor = "()V")
	private void method7705() {
		if (this.anInt9320 == 0) {
			return;
		}
		if (this.anInt9311 == Integer.MIN_VALUE) {
			this.anInt9311 = 0;
		}
		this.anInt9320 = 0;
		this.method7680();
	}

	@OriginalMember(owner = "client!vn", name = "d", descriptor = "()Lclient!ff;")
	@Override
	public Class12_Sub13 method7674() {
		return null;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method7675(@OriginalArg(0) int arg0) {
		if (this.anInt9320 > 0) {
			if (arg0 >= this.anInt9320) {
				if (this.anInt9311 == Integer.MIN_VALUE) {
					this.anInt9311 = 0;
					this.anInt9316 = this.anInt9318 = this.anInt9312 = 0;
					this.method7967();
					arg0 = this.anInt9320;
				}
				this.anInt9320 = 0;
				this.method7680();
			} else {
				this.anInt9316 += this.anInt9322 * arg0;
				this.anInt9318 += this.anInt9317 * arg0;
				this.anInt9312 += this.anInt9313 * arg0;
				this.anInt9320 -= arg0;
			}
		}
		@Pc(71) Class12_Sub29_Sub1 local71 = (Class12_Sub29_Sub1) super.aClass12_Sub29_5;
		@Pc(76) int local76 = this.anInt9319 << 8;
		@Pc(81) int local81 = this.anInt9315 << 8;
		@Pc(87) int local87 = local71.aByteArray59.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt9324 = 0;
		}
		if (this.anInt9314 < 0) {
			if (this.anInt9321 <= 0) {
				this.method7705();
				this.method7967();
				return;
			}
			this.anInt9314 = 0;
		}
		if (this.anInt9314 >= local87) {
			if (this.anInt9321 >= 0) {
				this.method7705();
				this.method7967();
				return;
			}
			this.anInt9314 = local87 - 1;
		}
		this.anInt9314 += this.anInt9321 * arg0;
		if (this.anInt9324 >= 0) {
			if (this.anInt9324 > 0) {
				if (this.aBoolean659) {
					label125: {
						if (this.anInt9321 < 0) {
							if (this.anInt9314 >= local76) {
								return;
							}
							this.anInt9314 = local76 + local76 - this.anInt9314 - 1;
							this.anInt9321 = -this.anInt9321;
							if (--this.anInt9324 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt9314 < local81) {
								return;
							}
							this.anInt9314 = local81 + local81 - this.anInt9314 - 1;
							this.anInt9321 = -this.anInt9321;
							if (--this.anInt9324 == 0) {
								break;
							}
							if (this.anInt9314 >= local76) {
								return;
							}
							this.anInt9314 = local76 + local76 - this.anInt9314 - 1;
							this.anInt9321 = -this.anInt9321;
						} while (--this.anInt9324 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt9321 < 0) {
						if (this.anInt9314 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt9314 - 1) / local91;
						if (local361 < this.anInt9324) {
							this.anInt9314 += local91 * local361;
							this.anInt9324 -= local361;
							return;
						}
						this.anInt9314 += local91 * this.anInt9324;
						this.anInt9324 = 0;
					} else if (this.anInt9314 >= local81) {
						local361 = (this.anInt9314 - local76) / local91;
						if (local361 < this.anInt9324) {
							this.anInt9314 -= local91 * local361;
							this.anInt9324 -= local361;
							return;
						}
						this.anInt9314 -= local91 * this.anInt9324;
						this.anInt9324 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt9321 < 0) {
				if (this.anInt9314 < 0) {
					this.anInt9314 = -1;
					this.method7705();
					this.method7967();
					return;
				}
			} else if (this.anInt9314 >= local87) {
				this.anInt9314 = local87;
				this.method7705();
				this.method7967();
			}
		} else if (this.aBoolean659) {
			if (this.anInt9321 < 0) {
				if (this.anInt9314 >= local76) {
					return;
				}
				this.anInt9314 = local76 + local76 - this.anInt9314 - 1;
				this.anInt9321 = -this.anInt9321;
			}
			while (this.anInt9314 >= local81) {
				this.anInt9314 = local81 + local81 - this.anInt9314 - 1;
				this.anInt9321 = -this.anInt9321;
				if (this.anInt9314 >= local76) {
					return;
				}
				this.anInt9314 = local76 + local76 - this.anInt9314 - 1;
				this.anInt9321 = -this.anInt9321;
			}
		} else if (this.anInt9321 < 0) {
			if (this.anInt9314 < local76) {
				this.anInt9314 = local81 - (local81 - 1 - this.anInt9314) % local91 - 1;
			}
		} else if (this.anInt9314 >= local81) {
			this.anInt9314 = local76 + (this.anInt9314 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!vn", name = "i", descriptor = "(I)V")
	private synchronized void method7709() {
		this.method7691(0, this.method7689());
	}

	@OriginalMember(owner = "client!vn", name = "j", descriptor = "(I)V")
	public synchronized void method7710(@OriginalArg(0) int arg0) {
		this.method7691(arg0 << 6, this.method7689());
	}

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "()I")
	@Override
	public int method7672() {
		return this.anInt9311 == 0 && this.anInt9320 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!vn", name = "k", descriptor = "(I)V")
	public synchronized void method7711(@OriginalArg(0) int arg0) {
		this.anInt9324 = arg0;
	}

	@OriginalMember(owner = "client!vn", name = "k", descriptor = "()Z")
	public boolean method7712() {
		return this.anInt9314 < 0 || this.anInt9314 >= ((Class12_Sub29_Sub1) super.aClass12_Sub29_5).aByteArray59.length << 8;
	}

	@OriginalMember(owner = "client!vn", name = "l", descriptor = "()Z")
	private boolean method7717() {
		@Pc(2) int local2 = this.anInt9311;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static560.method7707(local2, this.anInt9323);
			local8 = Static560.method7699(local2, this.anInt9323);
		}
		if (this.anInt9316 != local2 || this.anInt9318 != local10 || this.anInt9312 != local8) {
			if (this.anInt9316 < local2) {
				this.anInt9322 = 1;
				this.anInt9320 = local2 - this.anInt9316;
			} else if (this.anInt9316 > local2) {
				this.anInt9322 = -1;
				this.anInt9320 = this.anInt9316 - local2;
			} else {
				this.anInt9322 = 0;
			}
			if (this.anInt9318 < local10) {
				this.anInt9317 = 1;
				if (this.anInt9320 == 0 || this.anInt9320 > local10 - this.anInt9318) {
					this.anInt9320 = local10 - this.anInt9318;
				}
			} else if (this.anInt9318 > local10) {
				this.anInt9317 = -1;
				if (this.anInt9320 == 0 || this.anInt9320 > this.anInt9318 - local10) {
					this.anInt9320 = this.anInt9318 - local10;
				}
			} else {
				this.anInt9317 = 0;
			}
			if (this.anInt9312 < local8) {
				this.anInt9313 = 1;
				if (this.anInt9320 == 0 || this.anInt9320 > local8 - this.anInt9312) {
					this.anInt9320 = local8 - this.anInt9312;
				}
			} else if (this.anInt9312 > local8) {
				this.anInt9313 = -1;
				if (this.anInt9320 == 0 || this.anInt9320 > this.anInt9312 - local8) {
					this.anInt9320 = this.anInt9312 - local8;
				}
			} else {
				this.anInt9313 = 0;
			}
			return false;
		} else if (this.anInt9311 == Integer.MIN_VALUE) {
			this.anInt9311 = 0;
			this.anInt9316 = this.anInt9318 = this.anInt9312 = 0;
			this.method7967();
			return true;
		} else {
			this.method7680();
			return false;
		}
	}
}
