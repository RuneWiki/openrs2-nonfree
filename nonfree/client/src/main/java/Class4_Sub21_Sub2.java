import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lc")
public final class Class4_Sub21_Sub2 extends Class4_Sub21 {

	@OriginalMember(owner = "client!lc", name = "u", descriptor = "I")
	private int anInt5884;

	@OriginalMember(owner = "client!lc", name = "w", descriptor = "I")
	public int anInt5885;

	@OriginalMember(owner = "client!lc", name = "x", descriptor = "I")
	public int anInt5886;

	@OriginalMember(owner = "client!lc", name = "B", descriptor = "I")
	public int anInt5890;

	@OriginalMember(owner = "client!lc", name = "D", descriptor = "I")
	private int anInt5892;

	@OriginalMember(owner = "client!lc", name = "E", descriptor = "I")
	public int anInt5893;

	@OriginalMember(owner = "client!lc", name = "H", descriptor = "I")
	public int anInt5896;

	@OriginalMember(owner = "client!lc", name = "I", descriptor = "I")
	public int anInt5897;

	@OriginalMember(owner = "client!lc", name = "A", descriptor = "I")
	private final int anInt5889;

	@OriginalMember(owner = "client!lc", name = "C", descriptor = "I")
	private final int anInt5891;

	@OriginalMember(owner = "client!lc", name = "v", descriptor = "Z")
	private final boolean aBoolean420;

	@OriginalMember(owner = "client!lc", name = "y", descriptor = "I")
	private int anInt5887;

	@OriginalMember(owner = "client!lc", name = "F", descriptor = "I")
	private int anInt5894;

	@OriginalMember(owner = "client!lc", name = "G", descriptor = "I")
	private int anInt5895;

	@OriginalMember(owner = "client!lc", name = "z", descriptor = "I")
	public int anInt5888;

	@OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(Lclient!tk;III)V")
	public Class4_Sub21_Sub2(@OriginalArg(0) Class4_Sub42_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass4_Sub42_5 = arg0;
		this.anInt5889 = arg0.anInt9493;
		this.anInt5891 = arg0.anInt9492;
		this.aBoolean420 = arg0.aBoolean646;
		this.anInt5887 = arg1;
		this.anInt5894 = arg2;
		this.anInt5895 = arg3;
		this.anInt5888 = 0;
		this.method4622();
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(I)V")
	public synchronized void method4620(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method4625();
			this.method8193();
		} else if (this.anInt5890 == 0 && this.anInt5885 == 0) {
			this.anInt5884 = 0;
			this.anInt5894 = 0;
			this.anInt5897 = 0;
			this.method8193();
		} else {
			@Pc(31) int local31 = -this.anInt5897;
			if (this.anInt5897 > local31) {
				local31 = this.anInt5897;
			}
			if (-this.anInt5890 > local31) {
				local31 = -this.anInt5890;
			}
			if (this.anInt5890 > local31) {
				local31 = this.anInt5890;
			}
			if (-this.anInt5885 > local31) {
				local31 = -this.anInt5885;
			}
			if (this.anInt5885 > local31) {
				local31 = this.anInt5885;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt5884 = arg0;
			this.anInt5894 = Integer.MIN_VALUE;
			this.anInt5886 = -this.anInt5897 / arg0;
			this.anInt5893 = -this.anInt5890 / arg0;
			this.anInt5896 = -this.anInt5885 / arg0;
		}
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "()I")
	@Override
	public int method6160() {
		return this.anInt5894 == 0 && this.anInt5884 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method6156(@OriginalArg(0) int arg0) {
		if (this.anInt5884 > 0) {
			if (arg0 >= this.anInt5884) {
				if (this.anInt5894 == Integer.MIN_VALUE) {
					this.anInt5894 = 0;
					this.anInt5897 = this.anInt5890 = this.anInt5885 = 0;
					this.method8193();
					arg0 = this.anInt5884;
				}
				this.anInt5884 = 0;
				this.method4622();
			} else {
				this.anInt5897 += this.anInt5886 * arg0;
				this.anInt5890 += this.anInt5893 * arg0;
				this.anInt5885 += this.anInt5896 * arg0;
				this.anInt5884 -= arg0;
			}
		}
		@Pc(71) Class4_Sub42_Sub1 local71 = (Class4_Sub42_Sub1) super.aClass4_Sub42_5;
		@Pc(76) int local76 = this.anInt5889 << 8;
		@Pc(81) int local81 = this.anInt5891 << 8;
		@Pc(87) int local87 = local71.aByteArray90.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt5892 = 0;
		}
		if (this.anInt5888 < 0) {
			if (this.anInt5887 <= 0) {
				this.method4659();
				this.method8193();
				return;
			}
			this.anInt5888 = 0;
		}
		if (this.anInt5888 >= local87) {
			if (this.anInt5887 >= 0) {
				this.method4659();
				this.method8193();
				return;
			}
			this.anInt5888 = local87 - 1;
		}
		this.anInt5888 += this.anInt5887 * arg0;
		if (this.anInt5892 >= 0) {
			if (this.anInt5892 > 0) {
				if (this.aBoolean420) {
					label125: {
						if (this.anInt5887 < 0) {
							if (this.anInt5888 >= local76) {
								return;
							}
							this.anInt5888 = local76 + local76 - this.anInt5888 - 1;
							this.anInt5887 = -this.anInt5887;
							if (--this.anInt5892 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt5888 < local81) {
								return;
							}
							this.anInt5888 = local81 + local81 - this.anInt5888 - 1;
							this.anInt5887 = -this.anInt5887;
							if (--this.anInt5892 == 0) {
								break;
							}
							if (this.anInt5888 >= local76) {
								return;
							}
							this.anInt5888 = local76 + local76 - this.anInt5888 - 1;
							this.anInt5887 = -this.anInt5887;
						} while (--this.anInt5892 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt5887 < 0) {
						if (this.anInt5888 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt5888 - 1) / local91;
						if (local361 < this.anInt5892) {
							this.anInt5888 += local91 * local361;
							this.anInt5892 -= local361;
							return;
						}
						this.anInt5888 += local91 * this.anInt5892;
						this.anInt5892 = 0;
					} else if (this.anInt5888 >= local81) {
						local361 = (this.anInt5888 - local76) / local91;
						if (local361 < this.anInt5892) {
							this.anInt5888 -= local91 * local361;
							this.anInt5892 -= local361;
							return;
						}
						this.anInt5888 -= local91 * this.anInt5892;
						this.anInt5892 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt5887 < 0) {
				if (this.anInt5888 < 0) {
					this.anInt5888 = -1;
					this.method4659();
					this.method8193();
					return;
				}
			} else if (this.anInt5888 >= local87) {
				this.anInt5888 = local87;
				this.method4659();
				this.method8193();
			}
		} else if (this.aBoolean420) {
			if (this.anInt5887 < 0) {
				if (this.anInt5888 >= local76) {
					return;
				}
				this.anInt5888 = local76 + local76 - this.anInt5888 - 1;
				this.anInt5887 = -this.anInt5887;
			}
			while (this.anInt5888 >= local81) {
				this.anInt5888 = local81 + local81 - this.anInt5888 - 1;
				this.anInt5887 = -this.anInt5887;
				if (this.anInt5888 >= local76) {
					return;
				}
				this.anInt5888 = local76 + local76 - this.anInt5888 - 1;
				this.anInt5887 = -this.anInt5887;
			}
		} else if (this.anInt5887 < 0) {
			if (this.anInt5888 < local76) {
				this.anInt5888 = local81 - (local81 - 1 - this.anInt5888) % local91 - 1;
			}
		} else if (this.anInt5888 >= local81) {
			this.anInt5888 = local76 + (this.anInt5888 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!lc", name = "e", descriptor = "()I")
	public synchronized int method4621() {
		return this.anInt5887 < 0 ? -this.anInt5887 : this.anInt5887;
	}

	@OriginalMember(owner = "client!lc", name = "f", descriptor = "()V")
	private void method4622() {
		this.anInt5897 = this.anInt5894;
		this.anInt5890 = Static601.method4640(this.anInt5894, this.anInt5895);
		this.anInt5885 = Static601.method4647(this.anInt5894, this.anInt5895);
	}

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "()I")
	@Override
	public int method6161() {
		@Pc(6) int local6 = this.anInt5897 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt5892 == 0) {
			local6 -= local6 * this.anInt5888 / (((Class4_Sub42_Sub1) super.aClass4_Sub42_5).aByteArray90.length << 8);
		} else if (this.anInt5892 >= 0) {
			local6 -= local6 * this.anInt5889 / ((Class4_Sub42_Sub1) super.aClass4_Sub42_5).aByteArray90.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "(I)V")
	public synchronized void method4624(@OriginalArg(0) int arg0) {
		this.anInt5892 = arg0;
	}

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "(I)V")
	private synchronized void method4625() {
		this.method4634(0, this.method4648());
	}

	@OriginalMember(owner = "client!lc", name = "f", descriptor = "(I)V")
	public synchronized void method4626(@OriginalArg(0) int arg0) {
		if (this.anInt5887 < 0) {
			this.anInt5887 = -arg0;
		} else {
			this.anInt5887 = arg0;
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "([IIIII)I")
	private int method4627(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt5884 <= 0) {
				if (this.anInt5887 == -256 && (this.anInt5888 & 0xFF) == 0) {
					if (Static455.aBoolean611) {
						return Static601.method4635(((Class4_Sub42_Sub1) super.aClass4_Sub42_5).aByteArray90, arg0, this.anInt5888, arg1, this.anInt5890, this.anInt5885, arg3, arg2, this);
					}
					return Static601.method4642(((Class4_Sub42_Sub1) super.aClass4_Sub42_5).aByteArray90, arg0, this.anInt5888, arg1, this.anInt5897, arg3, arg2, this);
				}
				if (Static455.aBoolean611) {
					return Static601.method4656(((Class4_Sub42_Sub1) super.aClass4_Sub42_5).aByteArray90, arg0, this.anInt5888, arg1, this.anInt5890, this.anInt5885, arg3, arg2, this, this.anInt5887, arg4);
				}
				return Static601.method4654(((Class4_Sub42_Sub1) super.aClass4_Sub42_5).aByteArray90, arg0, this.anInt5888, arg1, this.anInt5897, arg3, arg2, this, this.anInt5887, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt5884;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt5884 += arg1;
			if (this.anInt5887 == -256 && (this.anInt5888 & 0xFF) == 0) {
				if (Static455.aBoolean611) {
					arg1 = Static601.method4646(((Class4_Sub42_Sub1) super.aClass4_Sub42_5).aByteArray90, arg0, this.anInt5888, arg1, this.anInt5890, this.anInt5885, this.anInt5893, this.anInt5896, local5, arg2, this);
				} else {
					arg1 = Static601.method4628(((Class4_Sub42_Sub1) super.aClass4_Sub42_5).aByteArray90, arg0, this.anInt5888, arg1, this.anInt5897, this.anInt5886, local5, arg2, this);
				}
			} else if (Static455.aBoolean611) {
				arg1 = Static601.method4629(((Class4_Sub42_Sub1) super.aClass4_Sub42_5).aByteArray90, arg0, this.anInt5888, arg1, this.anInt5890, this.anInt5885, this.anInt5893, this.anInt5896, local5, arg2, this, this.anInt5887, arg4);
			} else {
				arg1 = Static601.method4623(((Class4_Sub42_Sub1) super.aClass4_Sub42_5).aByteArray90, arg0, this.anInt5888, arg1, this.anInt5897, this.anInt5886, local5, arg2, this, this.anInt5887, arg4);
			}
			this.anInt5884 -= arg1;
			if (this.anInt5884 != 0) {
				return arg1;
			}
		} while (!this.method4655());
		return arg3;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method6158(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt5894 == 0 && this.anInt5884 == 0) {
			this.method6156(arg2);
			return;
		}
		@Pc(13) Class4_Sub42_Sub1 local13 = (Class4_Sub42_Sub1) super.aClass4_Sub42_5;
		@Pc(18) int local18 = this.anInt5889 << 8;
		@Pc(23) int local23 = this.anInt5891 << 8;
		@Pc(29) int local29 = local13.aByteArray90.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt5892 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt5888 < 0) {
			if (this.anInt5887 <= 0) {
				this.method4659();
				this.method8193();
				return;
			}
			this.anInt5888 = 0;
		}
		if (this.anInt5888 >= local29) {
			if (this.anInt5887 >= 0) {
				this.method4659();
				this.method8193();
				return;
			}
			this.anInt5888 = local29 - 1;
		}
		if (this.anInt5892 >= 0) {
			if (this.anInt5892 > 0) {
				if (this.aBoolean420) {
					label130: {
						if (this.anInt5887 < 0) {
							local40 = this.method4627(arg0, arg1, local18, local44, local13.aByteArray90[this.anInt5889]);
							if (this.anInt5888 >= local18) {
								return;
							}
							this.anInt5888 = local18 + local18 - this.anInt5888 - 1;
							this.anInt5887 = -this.anInt5887;
							if (--this.anInt5892 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method4636(arg0, local40, local23, local44, local13.aByteArray90[this.anInt5891 - 1]);
							if (this.anInt5888 < local23) {
								return;
							}
							this.anInt5888 = local23 + local23 - this.anInt5888 - 1;
							this.anInt5887 = -this.anInt5887;
							if (--this.anInt5892 == 0) {
								break;
							}
							local40 = this.method4627(arg0, local40, local18, local44, local13.aByteArray90[this.anInt5889]);
							if (this.anInt5888 >= local18) {
								return;
							}
							this.anInt5888 = local18 + local18 - this.anInt5888 - 1;
							this.anInt5887 = -this.anInt5887;
						} while (--this.anInt5892 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt5887 < 0) {
						while (true) {
							local40 = this.method4627(arg0, local40, local18, local44, local13.aByteArray90[this.anInt5891 - 1]);
							if (this.anInt5888 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt5888 - 1) / local33;
							if (local416 >= this.anInt5892) {
								this.anInt5888 += local33 * this.anInt5892;
								this.anInt5892 = 0;
								break;
							}
							this.anInt5888 += local33 * local416;
							this.anInt5892 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method4636(arg0, local40, local23, local44, local13.aByteArray90[this.anInt5889]);
							if (this.anInt5888 < local23) {
								return;
							}
							local416 = (this.anInt5888 - local18) / local33;
							if (local416 >= this.anInt5892) {
								this.anInt5888 -= local33 * this.anInt5892;
								this.anInt5892 = 0;
								break;
							}
							this.anInt5888 -= local33 * local416;
							this.anInt5892 -= local416;
						}
					}
				}
			}
			if (this.anInt5887 < 0) {
				this.method4627(arg0, local40, 0, local44, 0);
				if (this.anInt5888 < 0) {
					this.anInt5888 = -1;
					this.method4659();
					this.method8193();
					return;
				}
			} else {
				this.method4636(arg0, local40, local29, local44, 0);
				if (this.anInt5888 >= local29) {
					this.anInt5888 = local29;
					this.method4659();
					this.method8193();
				}
			}
		} else if (this.aBoolean420) {
			if (this.anInt5887 < 0) {
				local40 = this.method4627(arg0, arg1, local18, local44, local13.aByteArray90[this.anInt5889]);
				if (this.anInt5888 >= local18) {
					return;
				}
				this.anInt5888 = local18 + local18 - this.anInt5888 - 1;
				this.anInt5887 = -this.anInt5887;
			}
			while (true) {
				local40 = this.method4636(arg0, local40, local23, local44, local13.aByteArray90[this.anInt5891 - 1]);
				if (this.anInt5888 < local23) {
					return;
				}
				this.anInt5888 = local23 + local23 - this.anInt5888 - 1;
				this.anInt5887 = -this.anInt5887;
				local40 = this.method4627(arg0, local40, local18, local44, local13.aByteArray90[this.anInt5889]);
				if (this.anInt5888 >= local18) {
					return;
				}
				this.anInt5888 = local18 + local18 - this.anInt5888 - 1;
				this.anInt5887 = -this.anInt5887;
			}
		} else if (this.anInt5887 < 0) {
			while (true) {
				local40 = this.method4627(arg0, local40, local18, local44, local13.aByteArray90[this.anInt5891 - 1]);
				if (this.anInt5888 >= local18) {
					return;
				}
				this.anInt5888 = local23 - (local23 - 1 - this.anInt5888) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method4636(arg0, local40, local23, local44, local13.aByteArray90[this.anInt5889]);
				if (this.anInt5888 < local23) {
					return;
				}
				this.anInt5888 = local18 + (this.anInt5888 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!lc", name = "g", descriptor = "(I)V")
	public synchronized void method4630(@OriginalArg(0) int arg0) {
		this.method4634(arg0 << 6, this.method4648());
	}

	@OriginalMember(owner = "client!lc", name = "g", descriptor = "()Z")
	public boolean method4631() {
		return this.anInt5888 < 0 || this.anInt5888 >= ((Class4_Sub42_Sub1) super.aClass4_Sub42_5).aByteArray90.length << 8;
	}

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "()Lclient!nr;")
	@Override
	public Class4_Sub21 method6162() {
		return null;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(II)V")
	private synchronized void method4634(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5894 = arg0;
		this.anInt5895 = arg1;
		this.anInt5884 = 0;
		this.method4622();
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "([IIIII)I")
	private int method4636(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt5884 <= 0) {
				if (this.anInt5887 == 256 && (this.anInt5888 & 0xFF) == 0) {
					if (Static455.aBoolean611) {
						return Static601.method4657(((Class4_Sub42_Sub1) super.aClass4_Sub42_5).aByteArray90, arg0, this.anInt5888, arg1, this.anInt5890, this.anInt5885, arg3, arg2, this);
					}
					return Static601.method4645(((Class4_Sub42_Sub1) super.aClass4_Sub42_5).aByteArray90, arg0, this.anInt5888, arg1, this.anInt5897, arg3, arg2, this);
				}
				if (Static455.aBoolean611) {
					return Static601.method4651(((Class4_Sub42_Sub1) super.aClass4_Sub42_5).aByteArray90, arg0, this.anInt5888, arg1, this.anInt5890, this.anInt5885, arg3, arg2, this, this.anInt5887, arg4);
				}
				return Static601.method4633(((Class4_Sub42_Sub1) super.aClass4_Sub42_5).aByteArray90, arg0, this.anInt5888, arg1, this.anInt5897, arg3, arg2, this, this.anInt5887, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt5884;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt5884 += arg1;
			if (this.anInt5887 == 256 && (this.anInt5888 & 0xFF) == 0) {
				if (Static455.aBoolean611) {
					arg1 = Static601.method4649(((Class4_Sub42_Sub1) super.aClass4_Sub42_5).aByteArray90, arg0, this.anInt5888, arg1, this.anInt5890, this.anInt5885, this.anInt5893, this.anInt5896, local5, arg2, this);
				} else {
					arg1 = Static601.method4639(((Class4_Sub42_Sub1) super.aClass4_Sub42_5).aByteArray90, arg0, this.anInt5888, arg1, this.anInt5897, this.anInt5886, local5, arg2, this);
				}
			} else if (Static455.aBoolean611) {
				arg1 = Static601.method4658(((Class4_Sub42_Sub1) super.aClass4_Sub42_5).aByteArray90, arg0, this.anInt5888, arg1, this.anInt5890, this.anInt5885, this.anInt5893, this.anInt5896, local5, arg2, this, this.anInt5887, arg4);
			} else {
				arg1 = Static601.method4632(((Class4_Sub42_Sub1) super.aClass4_Sub42_5).aByteArray90, arg0, this.anInt5888, arg1, this.anInt5897, this.anInt5886, local5, arg2, this, this.anInt5887, arg4);
			}
			this.anInt5884 -= arg1;
			if (this.anInt5884 != 0) {
				return arg1;
			}
		} while (!this.method4655());
		return arg3;
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(II)V")
	public synchronized void method4637(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method4653(arg0, arg1, this.method4648());
	}

	@OriginalMember(owner = "client!lc", name = "h", descriptor = "(I)V")
	public synchronized void method4638(@OriginalArg(0) int arg0) {
		this.method4634(this.method4652(), arg0);
	}

	@OriginalMember(owner = "client!lc", name = "i", descriptor = "(I)V")
	public synchronized void method4641(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class4_Sub42_Sub1) super.aClass4_Sub42_5).aByteArray90.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt5888 = arg0;
	}

	@OriginalMember(owner = "client!lc", name = "h", descriptor = "()Z")
	public boolean method4644() {
		return this.anInt5884 != 0;
	}

	@OriginalMember(owner = "client!lc", name = "i", descriptor = "()I")
	public synchronized int method4648() {
		return this.anInt5895 < 0 ? -1 : this.anInt5895;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Z)V")
	public synchronized void method4650() {
		this.anInt5887 = (this.anInt5887 ^ this.anInt5887 >> 31) + (this.anInt5887 >>> 31);
		this.anInt5887 = -this.anInt5887;
	}

	@OriginalMember(owner = "client!lc", name = "j", descriptor = "()I")
	public synchronized int method4652() {
		return this.anInt5894 == Integer.MIN_VALUE ? 0 : this.anInt5894;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(III)V")
	public synchronized void method4653(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method4634(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static601.method4640(arg1, arg2);
		@Pc(14) int local14 = Static601.method4647(arg1, arg2);
		if (this.anInt5890 == local10 && this.anInt5885 == local14) {
			this.anInt5884 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt5897;
		if (this.anInt5897 - arg1 > local31) {
			local31 = this.anInt5897 - arg1;
		}
		if (local10 - this.anInt5890 > local31) {
			local31 = local10 - this.anInt5890;
		}
		if (this.anInt5890 - local10 > local31) {
			local31 = this.anInt5890 - local10;
		}
		if (local14 - this.anInt5885 > local31) {
			local31 = local14 - this.anInt5885;
		}
		if (this.anInt5885 - local14 > local31) {
			local31 = this.anInt5885 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt5884 = arg0;
		this.anInt5894 = arg1;
		this.anInt5895 = arg2;
		this.anInt5886 = (arg1 - this.anInt5897) / arg0;
		this.anInt5893 = (local10 - this.anInt5890) / arg0;
		this.anInt5896 = (local14 - this.anInt5885) / arg0;
	}

	@OriginalMember(owner = "client!lc", name = "k", descriptor = "()Z")
	private boolean method4655() {
		@Pc(2) int local2 = this.anInt5894;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static601.method4640(local2, this.anInt5895);
			local8 = Static601.method4647(local2, this.anInt5895);
		}
		if (this.anInt5897 != local2 || this.anInt5890 != local10 || this.anInt5885 != local8) {
			if (this.anInt5897 < local2) {
				this.anInt5886 = 1;
				this.anInt5884 = local2 - this.anInt5897;
			} else if (this.anInt5897 > local2) {
				this.anInt5886 = -1;
				this.anInt5884 = this.anInt5897 - local2;
			} else {
				this.anInt5886 = 0;
			}
			if (this.anInt5890 < local10) {
				this.anInt5893 = 1;
				if (this.anInt5884 == 0 || this.anInt5884 > local10 - this.anInt5890) {
					this.anInt5884 = local10 - this.anInt5890;
				}
			} else if (this.anInt5890 > local10) {
				this.anInt5893 = -1;
				if (this.anInt5884 == 0 || this.anInt5884 > this.anInt5890 - local10) {
					this.anInt5884 = this.anInt5890 - local10;
				}
			} else {
				this.anInt5893 = 0;
			}
			if (this.anInt5885 < local8) {
				this.anInt5896 = 1;
				if (this.anInt5884 == 0 || this.anInt5884 > local8 - this.anInt5885) {
					this.anInt5884 = local8 - this.anInt5885;
				}
			} else if (this.anInt5885 > local8) {
				this.anInt5896 = -1;
				if (this.anInt5884 == 0 || this.anInt5884 > this.anInt5885 - local8) {
					this.anInt5884 = this.anInt5885 - local8;
				}
			} else {
				this.anInt5896 = 0;
			}
			return false;
		} else if (this.anInt5894 == Integer.MIN_VALUE) {
			this.anInt5894 = 0;
			this.anInt5897 = this.anInt5890 = this.anInt5885 = 0;
			this.method8193();
			return true;
		} else {
			this.method4622();
			return false;
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "()Lclient!nr;")
	@Override
	public Class4_Sub21 method6157() {
		return null;
	}

	@OriginalMember(owner = "client!lc", name = "l", descriptor = "()V")
	private void method4659() {
		if (this.anInt5884 == 0) {
			return;
		}
		if (this.anInt5894 == Integer.MIN_VALUE) {
			this.anInt5894 = 0;
		}
		this.anInt5884 = 0;
		this.method4622();
	}
}
