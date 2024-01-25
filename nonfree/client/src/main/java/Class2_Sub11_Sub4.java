import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sj")
public final class Class2_Sub11_Sub4 extends Class2_Sub11 {

	@OriginalMember(owner = "client!sj", name = "s", descriptor = "I")
	public int anInt5879;

	@OriginalMember(owner = "client!sj", name = "t", descriptor = "I")
	private int anInt5880;

	@OriginalMember(owner = "client!sj", name = "u", descriptor = "I")
	private int anInt5881;

	@OriginalMember(owner = "client!sj", name = "v", descriptor = "I")
	public int anInt5882;

	@OriginalMember(owner = "client!sj", name = "w", descriptor = "I")
	public int anInt5883;

	@OriginalMember(owner = "client!sj", name = "A", descriptor = "I")
	public int anInt5887;

	@OriginalMember(owner = "client!sj", name = "B", descriptor = "I")
	public int anInt5888;

	@OriginalMember(owner = "client!sj", name = "C", descriptor = "I")
	public int anInt5889;

	@OriginalMember(owner = "client!sj", name = "E", descriptor = "I")
	private final int anInt5890;

	@OriginalMember(owner = "client!sj", name = "r", descriptor = "I")
	private final int anInt5878;

	@OriginalMember(owner = "client!sj", name = "F", descriptor = "Z")
	private final boolean aBoolean522;

	@OriginalMember(owner = "client!sj", name = "y", descriptor = "I")
	private int anInt5885;

	@OriginalMember(owner = "client!sj", name = "z", descriptor = "I")
	private int anInt5886;

	@OriginalMember(owner = "client!sj", name = "x", descriptor = "I")
	private int anInt5884;

	@OriginalMember(owner = "client!sj", name = "G", descriptor = "I")
	public int anInt5891;

	@OriginalMember(owner = "client!sj", name = "<init>", descriptor = "(Lclient!ar;II)V")
	public Class2_Sub11_Sub4(@OriginalArg(0) Class2_Sub5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass2_Sub5_5 = arg0;
		this.anInt5890 = arg0.anInt301;
		this.anInt5878 = arg0.anInt299;
		this.aBoolean522 = arg0.aBoolean23;
		this.anInt5885 = arg1;
		this.anInt5886 = arg2;
		this.anInt5884 = 8192;
		this.anInt5891 = 0;
		this.method4952();
	}

	@OriginalMember(owner = "client!sj", name = "<init>", descriptor = "(Lclient!ar;III)V")
	public Class2_Sub11_Sub4(@OriginalArg(0) Class2_Sub5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass2_Sub5_5 = arg0;
		this.anInt5890 = arg0.anInt301;
		this.anInt5878 = arg0.anInt299;
		this.aBoolean522 = arg0.aBoolean23;
		this.anInt5885 = arg1;
		this.anInt5886 = arg2;
		this.anInt5884 = arg3;
		this.anInt5891 = 0;
		this.method4952();
	}

	@OriginalMember(owner = "client!sj", name = "e", descriptor = "()V")
	private void method4952() {
		this.anInt5879 = this.anInt5886;
		this.anInt5888 = Static377.method4972(this.anInt5886, this.anInt5884);
		this.anInt5882 = Static377.method4982(this.anInt5886, this.anInt5884);
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method4945(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt5886 == 0 && this.anInt5880 == 0) {
			this.method4946(arg2);
			return;
		}
		@Pc(13) Class2_Sub5_Sub1 local13 = (Class2_Sub5_Sub1) super.aClass2_Sub5_5;
		@Pc(18) int local18 = this.anInt5890 << 8;
		@Pc(23) int local23 = this.anInt5878 << 8;
		@Pc(29) int local29 = local13.aByteArray4.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt5881 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt5891 < 0) {
			if (this.anInt5885 <= 0) {
				this.method4987();
				this.method5723();
				return;
			}
			this.anInt5891 = 0;
		}
		if (this.anInt5891 >= local29) {
			if (this.anInt5885 >= 0) {
				this.method4987();
				this.method5723();
				return;
			}
			this.anInt5891 = local29 - 1;
		}
		if (this.anInt5881 >= 0) {
			if (this.anInt5881 > 0) {
				if (this.aBoolean522) {
					label130: {
						if (this.anInt5885 < 0) {
							local40 = this.method4968(arg0, arg1, local18, local44, local13.aByteArray4[this.anInt5890]);
							if (this.anInt5891 >= local18) {
								return;
							}
							this.anInt5891 = local18 + local18 - this.anInt5891 - 1;
							this.anInt5885 = -this.anInt5885;
							if (--this.anInt5881 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method4983(arg0, local40, local23, local44, local13.aByteArray4[this.anInt5878 - 1]);
							if (this.anInt5891 < local23) {
								return;
							}
							this.anInt5891 = local23 + local23 - this.anInt5891 - 1;
							this.anInt5885 = -this.anInt5885;
							if (--this.anInt5881 == 0) {
								break;
							}
							local40 = this.method4968(arg0, local40, local18, local44, local13.aByteArray4[this.anInt5890]);
							if (this.anInt5891 >= local18) {
								return;
							}
							this.anInt5891 = local18 + local18 - this.anInt5891 - 1;
							this.anInt5885 = -this.anInt5885;
						} while (--this.anInt5881 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt5885 < 0) {
						while (true) {
							local40 = this.method4968(arg0, local40, local18, local44, local13.aByteArray4[this.anInt5878 - 1]);
							if (this.anInt5891 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt5891 - 1) / local33;
							if (local416 >= this.anInt5881) {
								this.anInt5891 += local33 * this.anInt5881;
								this.anInt5881 = 0;
								break;
							}
							this.anInt5891 += local33 * local416;
							this.anInt5881 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method4983(arg0, local40, local23, local44, local13.aByteArray4[this.anInt5890]);
							if (this.anInt5891 < local23) {
								return;
							}
							local416 = (this.anInt5891 - local18) / local33;
							if (local416 >= this.anInt5881) {
								this.anInt5891 -= local33 * this.anInt5881;
								this.anInt5881 = 0;
								break;
							}
							this.anInt5891 -= local33 * local416;
							this.anInt5881 -= local416;
						}
					}
				}
			}
			if (this.anInt5885 < 0) {
				this.method4968(arg0, local40, 0, local44, 0);
				if (this.anInt5891 < 0) {
					this.anInt5891 = -1;
					this.method4987();
					this.method5723();
					return;
				}
			} else {
				this.method4983(arg0, local40, local29, local44, 0);
				if (this.anInt5891 >= local29) {
					this.anInt5891 = local29;
					this.method4987();
					this.method5723();
				}
			}
		} else if (this.aBoolean522) {
			if (this.anInt5885 < 0) {
				local40 = this.method4968(arg0, arg1, local18, local44, local13.aByteArray4[this.anInt5890]);
				if (this.anInt5891 >= local18) {
					return;
				}
				this.anInt5891 = local18 + local18 - this.anInt5891 - 1;
				this.anInt5885 = -this.anInt5885;
			}
			while (true) {
				local40 = this.method4983(arg0, local40, local23, local44, local13.aByteArray4[this.anInt5878 - 1]);
				if (this.anInt5891 < local23) {
					return;
				}
				this.anInt5891 = local23 + local23 - this.anInt5891 - 1;
				this.anInt5885 = -this.anInt5885;
				local40 = this.method4968(arg0, local40, local18, local44, local13.aByteArray4[this.anInt5890]);
				if (this.anInt5891 >= local18) {
					return;
				}
				this.anInt5891 = local18 + local18 - this.anInt5891 - 1;
				this.anInt5885 = -this.anInt5885;
			}
		} else if (this.anInt5885 < 0) {
			while (true) {
				local40 = this.method4968(arg0, local40, local18, local44, local13.aByteArray4[this.anInt5878 - 1]);
				if (this.anInt5891 >= local18) {
					return;
				}
				this.anInt5891 = local23 - (local23 - 1 - this.anInt5891) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method4983(arg0, local40, local23, local44, local13.aByteArray4[this.anInt5890]);
				if (this.anInt5891 < local23) {
					return;
				}
				this.anInt5891 = local18 + (this.anInt5891 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!sj", name = "d", descriptor = "()Lclient!wf;")
	@Override
	public Class2_Sub11 method4948() {
		return null;
	}

	@OriginalMember(owner = "client!sj", name = "f", descriptor = "()I")
	public synchronized int method4953() {
		return this.anInt5884 < 0 ? -1 : this.anInt5884;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "()I")
	@Override
	public int method4943() {
		@Pc(6) int local6 = this.anInt5879 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt5881 == 0) {
			local6 -= local6 * this.anInt5891 / (((Class2_Sub5_Sub1) super.aClass2_Sub5_5).aByteArray4.length << 8);
		} else if (this.anInt5881 >= 0) {
			local6 -= local6 * this.anInt5890 / ((Class2_Sub5_Sub1) super.aClass2_Sub5_5).aByteArray4.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!sj", name = "b", descriptor = "()I")
	@Override
	public int method4944() {
		return this.anInt5886 == 0 && this.anInt5880 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(Z)V")
	public synchronized void method4955() {
		this.anInt5885 = (this.anInt5885 ^ this.anInt5885 >> 31) + (this.anInt5885 >>> 31);
		this.anInt5885 = -this.anInt5885;
	}

	@OriginalMember(owner = "client!sj", name = "d", descriptor = "(I)V")
	public synchronized void method4956(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class2_Sub5_Sub1) super.aClass2_Sub5_5).aByteArray4.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt5891 = arg0;
	}

	@OriginalMember(owner = "client!sj", name = "e", descriptor = "(I)V")
	private synchronized void method4960() {
		this.method4969(0, this.method4953());
	}

	@OriginalMember(owner = "client!sj", name = "f", descriptor = "(I)V")
	public synchronized void method4961(@OriginalArg(0) int arg0) {
		this.method4969(arg0 << 6, this.method4953());
	}

	@OriginalMember(owner = "client!sj", name = "g", descriptor = "(I)V")
	public synchronized void method4962(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method4960();
			this.method5723();
		} else if (this.anInt5888 == 0 && this.anInt5882 == 0) {
			this.anInt5880 = 0;
			this.anInt5886 = 0;
			this.anInt5879 = 0;
			this.method5723();
		} else {
			@Pc(31) int local31 = -this.anInt5879;
			if (this.anInt5879 > local31) {
				local31 = this.anInt5879;
			}
			if (-this.anInt5888 > local31) {
				local31 = -this.anInt5888;
			}
			if (this.anInt5888 > local31) {
				local31 = this.anInt5888;
			}
			if (-this.anInt5882 > local31) {
				local31 = -this.anInt5882;
			}
			if (this.anInt5882 > local31) {
				local31 = this.anInt5882;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt5880 = arg0;
			this.anInt5886 = Integer.MIN_VALUE;
			this.anInt5883 = -this.anInt5879 / arg0;
			this.anInt5889 = -this.anInt5888 / arg0;
			this.anInt5887 = -this.anInt5882 / arg0;
		}
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(III)V")
	public synchronized void method4963(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method4969(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static377.method4972(arg1, arg2);
		@Pc(14) int local14 = Static377.method4982(arg1, arg2);
		if (this.anInt5888 == local10 && this.anInt5882 == local14) {
			this.anInt5880 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt5879;
		if (this.anInt5879 - arg1 > local31) {
			local31 = this.anInt5879 - arg1;
		}
		if (local10 - this.anInt5888 > local31) {
			local31 = local10 - this.anInt5888;
		}
		if (this.anInt5888 - local10 > local31) {
			local31 = this.anInt5888 - local10;
		}
		if (local14 - this.anInt5882 > local31) {
			local31 = local14 - this.anInt5882;
		}
		if (this.anInt5882 - local14 > local31) {
			local31 = this.anInt5882 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt5880 = arg0;
		this.anInt5886 = arg1;
		this.anInt5884 = arg2;
		this.anInt5883 = (arg1 - this.anInt5879) / arg0;
		this.anInt5889 = (local10 - this.anInt5888) / arg0;
		this.anInt5887 = (local14 - this.anInt5882) / arg0;
	}

	@OriginalMember(owner = "client!sj", name = "h", descriptor = "(I)V")
	public synchronized void method4967(@OriginalArg(0) int arg0) {
		if (this.anInt5885 < 0) {
			this.anInt5885 = -arg0;
		} else {
			this.anInt5885 = arg0;
		}
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "([IIIII)I")
	private int method4968(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt5880 <= 0) {
				if (this.anInt5885 == -256 && (this.anInt5891 & 0xFF) == 0) {
					if (Static226.aBoolean429) {
						return Static377.method4975(((Class2_Sub5_Sub1) super.aClass2_Sub5_5).aByteArray4, arg0, this.anInt5891, arg1, this.anInt5888, this.anInt5882, arg3, arg2, this);
					}
					return Static377.method4957(((Class2_Sub5_Sub1) super.aClass2_Sub5_5).aByteArray4, arg0, this.anInt5891, arg1, this.anInt5879, arg3, arg2, this);
				}
				if (Static226.aBoolean429) {
					return Static377.method4958(((Class2_Sub5_Sub1) super.aClass2_Sub5_5).aByteArray4, arg0, this.anInt5891, arg1, this.anInt5888, this.anInt5882, arg3, arg2, this, this.anInt5885, arg4);
				}
				return Static377.method4970(((Class2_Sub5_Sub1) super.aClass2_Sub5_5).aByteArray4, arg0, this.anInt5891, arg1, this.anInt5879, arg3, arg2, this, this.anInt5885, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt5880;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt5880 += arg1;
			if (this.anInt5885 == -256 && (this.anInt5891 & 0xFF) == 0) {
				if (Static226.aBoolean429) {
					arg1 = Static377.method4971(((Class2_Sub5_Sub1) super.aClass2_Sub5_5).aByteArray4, arg0, this.anInt5891, arg1, this.anInt5888, this.anInt5882, this.anInt5889, this.anInt5887, local5, arg2, this);
				} else {
					arg1 = Static377.method4964(((Class2_Sub5_Sub1) super.aClass2_Sub5_5).aByteArray4, arg0, this.anInt5891, arg1, this.anInt5879, this.anInt5883, local5, arg2, this);
				}
			} else if (Static226.aBoolean429) {
				arg1 = Static377.method4981(((Class2_Sub5_Sub1) super.aClass2_Sub5_5).aByteArray4, arg0, this.anInt5891, arg1, this.anInt5888, this.anInt5882, this.anInt5889, this.anInt5887, local5, arg2, this, this.anInt5885, arg4);
			} else {
				arg1 = Static377.method4951(((Class2_Sub5_Sub1) super.aClass2_Sub5_5).aByteArray4, arg0, this.anInt5891, arg1, this.anInt5879, this.anInt5883, local5, arg2, this, this.anInt5885, arg4);
			}
			this.anInt5880 -= arg1;
			if (this.anInt5880 != 0) {
				return arg1;
			}
		} while (!this.method4989());
		return arg3;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(II)V")
	private synchronized void method4969(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5886 = arg0;
		this.anInt5884 = arg1;
		this.anInt5880 = 0;
		this.method4952();
	}

	@OriginalMember(owner = "client!sj", name = "c", descriptor = "(II)V")
	public synchronized void method4973(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method4963(arg0, arg1, this.method4953());
	}

	@OriginalMember(owner = "client!sj", name = "i", descriptor = "(I)V")
	public synchronized void method4977(@OriginalArg(0) int arg0) {
		this.anInt5881 = arg0;
	}

	@OriginalMember(owner = "client!sj", name = "g", descriptor = "()Z")
	public boolean method4978() {
		return this.anInt5891 < 0 || this.anInt5891 >= ((Class2_Sub5_Sub1) super.aClass2_Sub5_5).aByteArray4.length << 8;
	}

	@OriginalMember(owner = "client!sj", name = "h", descriptor = "()I")
	public synchronized int method4979() {
		return this.anInt5885 < 0 ? -this.anInt5885 : this.anInt5885;
	}

	@OriginalMember(owner = "client!sj", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method4946(@OriginalArg(0) int arg0) {
		if (this.anInt5880 > 0) {
			if (arg0 >= this.anInt5880) {
				if (this.anInt5886 == Integer.MIN_VALUE) {
					this.anInt5886 = 0;
					this.anInt5879 = this.anInt5888 = this.anInt5882 = 0;
					this.method5723();
					arg0 = this.anInt5880;
				}
				this.anInt5880 = 0;
				this.method4952();
			} else {
				this.anInt5879 += this.anInt5883 * arg0;
				this.anInt5888 += this.anInt5889 * arg0;
				this.anInt5882 += this.anInt5887 * arg0;
				this.anInt5880 -= arg0;
			}
		}
		@Pc(71) Class2_Sub5_Sub1 local71 = (Class2_Sub5_Sub1) super.aClass2_Sub5_5;
		@Pc(76) int local76 = this.anInt5890 << 8;
		@Pc(81) int local81 = this.anInt5878 << 8;
		@Pc(87) int local87 = local71.aByteArray4.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt5881 = 0;
		}
		if (this.anInt5891 < 0) {
			if (this.anInt5885 <= 0) {
				this.method4987();
				this.method5723();
				return;
			}
			this.anInt5891 = 0;
		}
		if (this.anInt5891 >= local87) {
			if (this.anInt5885 >= 0) {
				this.method4987();
				this.method5723();
				return;
			}
			this.anInt5891 = local87 - 1;
		}
		this.anInt5891 += this.anInt5885 * arg0;
		if (this.anInt5881 >= 0) {
			if (this.anInt5881 > 0) {
				if (this.aBoolean522) {
					label125: {
						if (this.anInt5885 < 0) {
							if (this.anInt5891 >= local76) {
								return;
							}
							this.anInt5891 = local76 + local76 - this.anInt5891 - 1;
							this.anInt5885 = -this.anInt5885;
							if (--this.anInt5881 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt5891 < local81) {
								return;
							}
							this.anInt5891 = local81 + local81 - this.anInt5891 - 1;
							this.anInt5885 = -this.anInt5885;
							if (--this.anInt5881 == 0) {
								break;
							}
							if (this.anInt5891 >= local76) {
								return;
							}
							this.anInt5891 = local76 + local76 - this.anInt5891 - 1;
							this.anInt5885 = -this.anInt5885;
						} while (--this.anInt5881 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt5885 < 0) {
						if (this.anInt5891 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt5891 - 1) / local91;
						if (local361 < this.anInt5881) {
							this.anInt5891 += local91 * local361;
							this.anInt5881 -= local361;
							return;
						}
						this.anInt5891 += local91 * this.anInt5881;
						this.anInt5881 = 0;
					} else if (this.anInt5891 >= local81) {
						local361 = (this.anInt5891 - local76) / local91;
						if (local361 < this.anInt5881) {
							this.anInt5891 -= local91 * local361;
							this.anInt5881 -= local361;
							return;
						}
						this.anInt5891 -= local91 * this.anInt5881;
						this.anInt5881 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt5885 < 0) {
				if (this.anInt5891 < 0) {
					this.anInt5891 = -1;
					this.method4987();
					this.method5723();
					return;
				}
			} else if (this.anInt5891 >= local87) {
				this.anInt5891 = local87;
				this.method4987();
				this.method5723();
			}
		} else if (this.aBoolean522) {
			if (this.anInt5885 < 0) {
				if (this.anInt5891 >= local76) {
					return;
				}
				this.anInt5891 = local76 + local76 - this.anInt5891 - 1;
				this.anInt5885 = -this.anInt5885;
			}
			while (this.anInt5891 >= local81) {
				this.anInt5891 = local81 + local81 - this.anInt5891 - 1;
				this.anInt5885 = -this.anInt5885;
				if (this.anInt5891 >= local76) {
					return;
				}
				this.anInt5891 = local76 + local76 - this.anInt5891 - 1;
				this.anInt5885 = -this.anInt5885;
			}
		} else if (this.anInt5885 < 0) {
			if (this.anInt5891 < local76) {
				this.anInt5891 = local81 - (local81 - 1 - this.anInt5891) % local91 - 1;
			}
		} else if (this.anInt5891 >= local81) {
			this.anInt5891 = local76 + (this.anInt5891 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!sj", name = "b", descriptor = "([IIIII)I")
	private int method4983(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt5880 <= 0) {
				if (this.anInt5885 == 256 && (this.anInt5891 & 0xFF) == 0) {
					if (Static226.aBoolean429) {
						return Static377.method4974(((Class2_Sub5_Sub1) super.aClass2_Sub5_5).aByteArray4, arg0, this.anInt5891, arg1, this.anInt5888, this.anInt5882, arg3, arg2, this);
					}
					return Static377.method4965(((Class2_Sub5_Sub1) super.aClass2_Sub5_5).aByteArray4, arg0, this.anInt5891, arg1, this.anInt5879, arg3, arg2, this);
				}
				if (Static226.aBoolean429) {
					return Static377.method4959(((Class2_Sub5_Sub1) super.aClass2_Sub5_5).aByteArray4, arg0, this.anInt5891, arg1, this.anInt5888, this.anInt5882, arg3, arg2, this, this.anInt5885, arg4);
				}
				return Static377.method4950(((Class2_Sub5_Sub1) super.aClass2_Sub5_5).aByteArray4, arg0, this.anInt5891, arg1, this.anInt5879, arg3, arg2, this, this.anInt5885, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt5880;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt5880 += arg1;
			if (this.anInt5885 == 256 && (this.anInt5891 & 0xFF) == 0) {
				if (Static226.aBoolean429) {
					arg1 = Static377.method4966(((Class2_Sub5_Sub1) super.aClass2_Sub5_5).aByteArray4, arg0, this.anInt5891, arg1, this.anInt5888, this.anInt5882, this.anInt5889, this.anInt5887, local5, arg2, this);
				} else {
					arg1 = Static377.method4976(((Class2_Sub5_Sub1) super.aClass2_Sub5_5).aByteArray4, arg0, this.anInt5891, arg1, this.anInt5879, this.anInt5883, local5, arg2, this);
				}
			} else if (Static226.aBoolean429) {
				arg1 = Static377.method4984(((Class2_Sub5_Sub1) super.aClass2_Sub5_5).aByteArray4, arg0, this.anInt5891, arg1, this.anInt5888, this.anInt5882, this.anInt5889, this.anInt5887, local5, arg2, this, this.anInt5885, arg4);
			} else {
				arg1 = Static377.method4954(((Class2_Sub5_Sub1) super.aClass2_Sub5_5).aByteArray4, arg0, this.anInt5891, arg1, this.anInt5879, this.anInt5883, local5, arg2, this, this.anInt5885, arg4);
			}
			this.anInt5880 -= arg1;
			if (this.anInt5880 != 0) {
				return arg1;
			}
		} while (!this.method4989());
		return arg3;
	}

	@OriginalMember(owner = "client!sj", name = "i", descriptor = "()I")
	public synchronized int method4986() {
		return this.anInt5886 == Integer.MIN_VALUE ? 0 : this.anInt5886;
	}

	@OriginalMember(owner = "client!sj", name = "c", descriptor = "()Lclient!wf;")
	@Override
	public Class2_Sub11 method4947() {
		return null;
	}

	@OriginalMember(owner = "client!sj", name = "j", descriptor = "()V")
	private void method4987() {
		if (this.anInt5880 == 0) {
			return;
		}
		if (this.anInt5886 == Integer.MIN_VALUE) {
			this.anInt5886 = 0;
		}
		this.anInt5880 = 0;
		this.method4952();
	}

	@OriginalMember(owner = "client!sj", name = "k", descriptor = "()Z")
	public boolean method4988() {
		return this.anInt5880 != 0;
	}

	@OriginalMember(owner = "client!sj", name = "l", descriptor = "()Z")
	private boolean method4989() {
		@Pc(2) int local2 = this.anInt5886;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static377.method4972(local2, this.anInt5884);
			local8 = Static377.method4982(local2, this.anInt5884);
		}
		if (this.anInt5879 != local2 || this.anInt5888 != local10 || this.anInt5882 != local8) {
			if (this.anInt5879 < local2) {
				this.anInt5883 = 1;
				this.anInt5880 = local2 - this.anInt5879;
			} else if (this.anInt5879 > local2) {
				this.anInt5883 = -1;
				this.anInt5880 = this.anInt5879 - local2;
			} else {
				this.anInt5883 = 0;
			}
			if (this.anInt5888 < local10) {
				this.anInt5889 = 1;
				if (this.anInt5880 == 0 || this.anInt5880 > local10 - this.anInt5888) {
					this.anInt5880 = local10 - this.anInt5888;
				}
			} else if (this.anInt5888 > local10) {
				this.anInt5889 = -1;
				if (this.anInt5880 == 0 || this.anInt5880 > this.anInt5888 - local10) {
					this.anInt5880 = this.anInt5888 - local10;
				}
			} else {
				this.anInt5889 = 0;
			}
			if (this.anInt5882 < local8) {
				this.anInt5887 = 1;
				if (this.anInt5880 == 0 || this.anInt5880 > local8 - this.anInt5882) {
					this.anInt5880 = local8 - this.anInt5882;
				}
			} else if (this.anInt5882 > local8) {
				this.anInt5887 = -1;
				if (this.anInt5880 == 0 || this.anInt5880 > this.anInt5882 - local8) {
					this.anInt5880 = this.anInt5882 - local8;
				}
			} else {
				this.anInt5887 = 0;
			}
			return false;
		} else if (this.anInt5886 == Integer.MIN_VALUE) {
			this.anInt5886 = 0;
			this.anInt5879 = this.anInt5888 = this.anInt5882 = 0;
			this.method5723();
			return true;
		} else {
			this.method4952();
			return false;
		}
	}
}
