import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rb")
public final class Class4_Sub18_Sub2 extends Class4_Sub18 {

	@OriginalMember(owner = "client!rb", name = "t", descriptor = "I")
	public int anInt5885;

	@OriginalMember(owner = "client!rb", name = "u", descriptor = "I")
	public int anInt5886;

	@OriginalMember(owner = "client!rb", name = "v", descriptor = "I")
	private int anInt5887;

	@OriginalMember(owner = "client!rb", name = "A", descriptor = "I")
	public int anInt5891;

	@OriginalMember(owner = "client!rb", name = "B", descriptor = "I")
	private int anInt5892;

	@OriginalMember(owner = "client!rb", name = "C", descriptor = "I")
	public int anInt5893;

	@OriginalMember(owner = "client!rb", name = "E", descriptor = "I")
	public int anInt5895;

	@OriginalMember(owner = "client!rb", name = "F", descriptor = "I")
	public int anInt5896;

	@OriginalMember(owner = "client!rb", name = "s", descriptor = "I")
	private final int anInt5884;

	@OriginalMember(owner = "client!rb", name = "D", descriptor = "I")
	private final int anInt5894;

	@OriginalMember(owner = "client!rb", name = "z", descriptor = "Z")
	private final boolean aBoolean409;

	@OriginalMember(owner = "client!rb", name = "r", descriptor = "I")
	private int anInt5883;

	@OriginalMember(owner = "client!rb", name = "y", descriptor = "I")
	private int anInt5890;

	@OriginalMember(owner = "client!rb", name = "w", descriptor = "I")
	private int anInt5888;

	@OriginalMember(owner = "client!rb", name = "x", descriptor = "I")
	public int anInt5889;

	@OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(Lclient!uq;II)V")
	public Class4_Sub18_Sub2(@OriginalArg(0) Class4_Sub35_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass4_Sub35_5 = arg0;
		this.anInt5884 = arg0.anInt6960;
		this.anInt5894 = arg0.anInt6962;
		this.aBoolean409 = arg0.aBoolean468;
		this.anInt5883 = arg1;
		this.anInt5890 = arg2;
		this.anInt5888 = 8192;
		this.anInt5889 = 0;
		this.method4567();
	}

	@OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(Lclient!uq;III)V")
	public Class4_Sub18_Sub2(@OriginalArg(0) Class4_Sub35_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass4_Sub35_5 = arg0;
		this.anInt5884 = arg0.anInt6960;
		this.anInt5894 = arg0.anInt6962;
		this.aBoolean409 = arg0.aBoolean468;
		this.anInt5883 = arg1;
		this.anInt5890 = arg2;
		this.anInt5888 = arg3;
		this.anInt5889 = 0;
		this.method4567();
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(III)V")
	public synchronized void method4547(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method4579(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static463.method4573(arg1, arg2);
		@Pc(14) int local14 = Static463.method4576(arg1, arg2);
		if (this.anInt5886 == local10 && this.anInt5885 == local14) {
			this.anInt5892 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt5893;
		if (this.anInt5893 - arg1 > local31) {
			local31 = this.anInt5893 - arg1;
		}
		if (local10 - this.anInt5886 > local31) {
			local31 = local10 - this.anInt5886;
		}
		if (this.anInt5886 - local10 > local31) {
			local31 = this.anInt5886 - local10;
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
		this.anInt5892 = arg0;
		this.anInt5890 = arg1;
		this.anInt5888 = arg2;
		this.anInt5895 = (arg1 - this.anInt5893) / arg0;
		this.anInt5891 = (local10 - this.anInt5886) / arg0;
		this.anInt5896 = (local14 - this.anInt5885) / arg0;
	}

	@OriginalMember(owner = "client!rb", name = "c", descriptor = "(I)V")
	private synchronized void method4548() {
		this.method4579(0, this.method4555());
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Z)V")
	public synchronized void method4549() {
		this.anInt5883 = (this.anInt5883 ^ this.anInt5883 >> 31) + (this.anInt5883 >>> 31);
		this.anInt5883 = -this.anInt5883;
	}

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method5749(@OriginalArg(0) int arg0) {
		if (this.anInt5892 > 0) {
			if (arg0 >= this.anInt5892) {
				if (this.anInt5890 == Integer.MIN_VALUE) {
					this.anInt5890 = 0;
					this.anInt5893 = this.anInt5886 = this.anInt5885 = 0;
					this.method5854();
					arg0 = this.anInt5892;
				}
				this.anInt5892 = 0;
				this.method4567();
			} else {
				this.anInt5893 += this.anInt5895 * arg0;
				this.anInt5886 += this.anInt5891 * arg0;
				this.anInt5885 += this.anInt5896 * arg0;
				this.anInt5892 -= arg0;
			}
		}
		@Pc(71) Class4_Sub35_Sub1 local71 = (Class4_Sub35_Sub1) super.aClass4_Sub35_5;
		@Pc(76) int local76 = this.anInt5884 << 8;
		@Pc(81) int local81 = this.anInt5894 << 8;
		@Pc(87) int local87 = local71.aByteArray92.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt5887 = 0;
		}
		if (this.anInt5889 < 0) {
			if (this.anInt5883 <= 0) {
				this.method4566();
				this.method5854();
				return;
			}
			this.anInt5889 = 0;
		}
		if (this.anInt5889 >= local87) {
			if (this.anInt5883 >= 0) {
				this.method4566();
				this.method5854();
				return;
			}
			this.anInt5889 = local87 - 1;
		}
		this.anInt5889 += this.anInt5883 * arg0;
		if (this.anInt5887 >= 0) {
			if (this.anInt5887 > 0) {
				if (this.aBoolean409) {
					label125: {
						if (this.anInt5883 < 0) {
							if (this.anInt5889 >= local76) {
								return;
							}
							this.anInt5889 = local76 + local76 - this.anInt5889 - 1;
							this.anInt5883 = -this.anInt5883;
							if (--this.anInt5887 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt5889 < local81) {
								return;
							}
							this.anInt5889 = local81 + local81 - this.anInt5889 - 1;
							this.anInt5883 = -this.anInt5883;
							if (--this.anInt5887 == 0) {
								break;
							}
							if (this.anInt5889 >= local76) {
								return;
							}
							this.anInt5889 = local76 + local76 - this.anInt5889 - 1;
							this.anInt5883 = -this.anInt5883;
						} while (--this.anInt5887 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt5883 < 0) {
						if (this.anInt5889 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt5889 - 1) / local91;
						if (local361 < this.anInt5887) {
							this.anInt5889 += local91 * local361;
							this.anInt5887 -= local361;
							return;
						}
						this.anInt5889 += local91 * this.anInt5887;
						this.anInt5887 = 0;
					} else if (this.anInt5889 >= local81) {
						local361 = (this.anInt5889 - local76) / local91;
						if (local361 < this.anInt5887) {
							this.anInt5889 -= local91 * local361;
							this.anInt5887 -= local361;
							return;
						}
						this.anInt5889 -= local91 * this.anInt5887;
						this.anInt5887 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt5883 < 0) {
				if (this.anInt5889 < 0) {
					this.anInt5889 = -1;
					this.method4566();
					this.method5854();
					return;
				}
			} else if (this.anInt5889 >= local87) {
				this.anInt5889 = local87;
				this.method4566();
				this.method5854();
			}
		} else if (this.aBoolean409) {
			if (this.anInt5883 < 0) {
				if (this.anInt5889 >= local76) {
					return;
				}
				this.anInt5889 = local76 + local76 - this.anInt5889 - 1;
				this.anInt5883 = -this.anInt5883;
			}
			while (this.anInt5889 >= local81) {
				this.anInt5889 = local81 + local81 - this.anInt5889 - 1;
				this.anInt5883 = -this.anInt5883;
				if (this.anInt5889 >= local76) {
					return;
				}
				this.anInt5889 = local76 + local76 - this.anInt5889 - 1;
				this.anInt5883 = -this.anInt5883;
			}
		} else if (this.anInt5883 < 0) {
			if (this.anInt5889 < local76) {
				this.anInt5889 = local81 - (local81 - 1 - this.anInt5889) % local91 - 1;
			}
		} else if (this.anInt5889 >= local81) {
			this.anInt5889 = local76 + (this.anInt5889 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!rb", name = "d", descriptor = "(I)V")
	public synchronized void method4551(@OriginalArg(0) int arg0) {
		if (this.anInt5883 < 0) {
			this.anInt5883 = -arg0;
		} else {
			this.anInt5883 = arg0;
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(II)V")
	public synchronized void method4552(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method4547(arg0, arg1, this.method4555());
	}

	@OriginalMember(owner = "client!rb", name = "e", descriptor = "(I)V")
	public synchronized void method4553(@OriginalArg(0) int arg0) {
		this.method4579(arg0 << 6, this.method4555());
	}

	@OriginalMember(owner = "client!rb", name = "e", descriptor = "()I")
	public synchronized int method4555() {
		return this.anInt5888 < 0 ? -1 : this.anInt5888;
	}

	@OriginalMember(owner = "client!rb", name = "f", descriptor = "(I)V")
	public synchronized void method4558(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method4548();
			this.method5854();
		} else if (this.anInt5886 == 0 && this.anInt5885 == 0) {
			this.anInt5892 = 0;
			this.anInt5890 = 0;
			this.anInt5893 = 0;
			this.method5854();
		} else {
			@Pc(31) int local31 = -this.anInt5893;
			if (this.anInt5893 > local31) {
				local31 = this.anInt5893;
			}
			if (-this.anInt5886 > local31) {
				local31 = -this.anInt5886;
			}
			if (this.anInt5886 > local31) {
				local31 = this.anInt5886;
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
			this.anInt5892 = arg0;
			this.anInt5890 = Integer.MIN_VALUE;
			this.anInt5895 = -this.anInt5893 / arg0;
			this.anInt5891 = -this.anInt5886 / arg0;
			this.anInt5896 = -this.anInt5885 / arg0;
		}
	}

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method5755(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt5890 == 0 && this.anInt5892 == 0) {
			this.method5749(arg2);
			return;
		}
		@Pc(13) Class4_Sub35_Sub1 local13 = (Class4_Sub35_Sub1) super.aClass4_Sub35_5;
		@Pc(18) int local18 = this.anInt5884 << 8;
		@Pc(23) int local23 = this.anInt5894 << 8;
		@Pc(29) int local29 = local13.aByteArray92.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt5887 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt5889 < 0) {
			if (this.anInt5883 <= 0) {
				this.method4566();
				this.method5854();
				return;
			}
			this.anInt5889 = 0;
		}
		if (this.anInt5889 >= local29) {
			if (this.anInt5883 >= 0) {
				this.method4566();
				this.method5854();
				return;
			}
			this.anInt5889 = local29 - 1;
		}
		if (this.anInt5887 >= 0) {
			if (this.anInt5887 > 0) {
				if (this.aBoolean409) {
					label130: {
						if (this.anInt5883 < 0) {
							local40 = this.method4569(arg0, arg1, local18, local44, local13.aByteArray92[this.anInt5884]);
							if (this.anInt5889 >= local18) {
								return;
							}
							this.anInt5889 = local18 + local18 - this.anInt5889 - 1;
							this.anInt5883 = -this.anInt5883;
							if (--this.anInt5887 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method4583(arg0, local40, local23, local44, local13.aByteArray92[this.anInt5894 - 1]);
							if (this.anInt5889 < local23) {
								return;
							}
							this.anInt5889 = local23 + local23 - this.anInt5889 - 1;
							this.anInt5883 = -this.anInt5883;
							if (--this.anInt5887 == 0) {
								break;
							}
							local40 = this.method4569(arg0, local40, local18, local44, local13.aByteArray92[this.anInt5884]);
							if (this.anInt5889 >= local18) {
								return;
							}
							this.anInt5889 = local18 + local18 - this.anInt5889 - 1;
							this.anInt5883 = -this.anInt5883;
						} while (--this.anInt5887 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt5883 < 0) {
						while (true) {
							local40 = this.method4569(arg0, local40, local18, local44, local13.aByteArray92[this.anInt5894 - 1]);
							if (this.anInt5889 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt5889 - 1) / local33;
							if (local416 >= this.anInt5887) {
								this.anInt5889 += local33 * this.anInt5887;
								this.anInt5887 = 0;
								break;
							}
							this.anInt5889 += local33 * local416;
							this.anInt5887 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method4583(arg0, local40, local23, local44, local13.aByteArray92[this.anInt5884]);
							if (this.anInt5889 < local23) {
								return;
							}
							local416 = (this.anInt5889 - local18) / local33;
							if (local416 >= this.anInt5887) {
								this.anInt5889 -= local33 * this.anInt5887;
								this.anInt5887 = 0;
								break;
							}
							this.anInt5889 -= local33 * local416;
							this.anInt5887 -= local416;
						}
					}
				}
			}
			if (this.anInt5883 < 0) {
				this.method4569(arg0, local40, 0, local44, 0);
				if (this.anInt5889 < 0) {
					this.anInt5889 = -1;
					this.method4566();
					this.method5854();
					return;
				}
			} else {
				this.method4583(arg0, local40, local29, local44, 0);
				if (this.anInt5889 >= local29) {
					this.anInt5889 = local29;
					this.method4566();
					this.method5854();
				}
			}
		} else if (this.aBoolean409) {
			if (this.anInt5883 < 0) {
				local40 = this.method4569(arg0, arg1, local18, local44, local13.aByteArray92[this.anInt5884]);
				if (this.anInt5889 >= local18) {
					return;
				}
				this.anInt5889 = local18 + local18 - this.anInt5889 - 1;
				this.anInt5883 = -this.anInt5883;
			}
			while (true) {
				local40 = this.method4583(arg0, local40, local23, local44, local13.aByteArray92[this.anInt5894 - 1]);
				if (this.anInt5889 < local23) {
					return;
				}
				this.anInt5889 = local23 + local23 - this.anInt5889 - 1;
				this.anInt5883 = -this.anInt5883;
				local40 = this.method4569(arg0, local40, local18, local44, local13.aByteArray92[this.anInt5884]);
				if (this.anInt5889 >= local18) {
					return;
				}
				this.anInt5889 = local18 + local18 - this.anInt5889 - 1;
				this.anInt5883 = -this.anInt5883;
			}
		} else if (this.anInt5883 < 0) {
			while (true) {
				local40 = this.method4569(arg0, local40, local18, local44, local13.aByteArray92[this.anInt5894 - 1]);
				if (this.anInt5889 >= local18) {
					return;
				}
				this.anInt5889 = local23 - (local23 - 1 - this.anInt5889) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method4583(arg0, local40, local23, local44, local13.aByteArray92[this.anInt5884]);
				if (this.anInt5889 < local23) {
					return;
				}
				this.anInt5889 = local18 + (this.anInt5889 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!rb", name = "f", descriptor = "()Z")
	public boolean method4560() {
		return this.anInt5889 < 0 || this.anInt5889 >= ((Class4_Sub35_Sub1) super.aClass4_Sub35_5).aByteArray92.length << 8;
	}

	@OriginalMember(owner = "client!rb", name = "d", descriptor = "()I")
	@Override
	public int method5754() {
		return this.anInt5890 == 0 && this.anInt5892 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!rb", name = "g", descriptor = "()I")
	public synchronized int method4564() {
		return this.anInt5890 == Integer.MIN_VALUE ? 0 : this.anInt5890;
	}

	@OriginalMember(owner = "client!rb", name = "h", descriptor = "()V")
	private void method4566() {
		if (this.anInt5892 == 0) {
			return;
		}
		if (this.anInt5890 == Integer.MIN_VALUE) {
			this.anInt5890 = 0;
		}
		this.anInt5892 = 0;
		this.method4567();
	}

	@OriginalMember(owner = "client!rb", name = "i", descriptor = "()V")
	private void method4567() {
		this.anInt5893 = this.anInt5890;
		this.anInt5886 = Static463.method4573(this.anInt5890, this.anInt5888);
		this.anInt5885 = Static463.method4576(this.anInt5890, this.anInt5888);
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "([IIIII)I")
	private int method4569(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt5892 <= 0) {
				if (this.anInt5883 == -256 && (this.anInt5889 & 0xFF) == 0) {
					if (Static394.aBoolean454) {
						return Static463.method4570(((Class4_Sub35_Sub1) super.aClass4_Sub35_5).aByteArray92, arg0, this.anInt5889, arg1, this.anInt5886, this.anInt5885, arg3, arg2, this);
					}
					return Static463.method4571(((Class4_Sub35_Sub1) super.aClass4_Sub35_5).aByteArray92, arg0, this.anInt5889, arg1, this.anInt5893, arg3, arg2, this);
				}
				if (Static394.aBoolean454) {
					return Static463.method4556(((Class4_Sub35_Sub1) super.aClass4_Sub35_5).aByteArray92, arg0, this.anInt5889, arg1, this.anInt5886, this.anInt5885, arg3, arg2, this, this.anInt5883, arg4);
				}
				return Static463.method4550(((Class4_Sub35_Sub1) super.aClass4_Sub35_5).aByteArray92, arg0, this.anInt5889, arg1, this.anInt5893, arg3, arg2, this, this.anInt5883, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt5892;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt5892 += arg1;
			if (this.anInt5883 == -256 && (this.anInt5889 & 0xFF) == 0) {
				if (Static394.aBoolean454) {
					arg1 = Static463.method4585(((Class4_Sub35_Sub1) super.aClass4_Sub35_5).aByteArray92, arg0, this.anInt5889, arg1, this.anInt5886, this.anInt5885, this.anInt5891, this.anInt5896, local5, arg2, this);
				} else {
					arg1 = Static463.method4559(((Class4_Sub35_Sub1) super.aClass4_Sub35_5).aByteArray92, arg0, this.anInt5889, arg1, this.anInt5893, this.anInt5895, local5, arg2, this);
				}
			} else if (Static394.aBoolean454) {
				arg1 = Static463.method4586(((Class4_Sub35_Sub1) super.aClass4_Sub35_5).aByteArray92, arg0, this.anInt5889, arg1, this.anInt5886, this.anInt5885, this.anInt5891, this.anInt5896, local5, arg2, this, this.anInt5883, arg4);
			} else {
				arg1 = Static463.method4557(((Class4_Sub35_Sub1) super.aClass4_Sub35_5).aByteArray92, arg0, this.anInt5889, arg1, this.anInt5893, this.anInt5895, local5, arg2, this, this.anInt5883, arg4);
			}
			this.anInt5892 -= arg1;
			if (this.anInt5892 != 0) {
				return arg1;
			}
		} while (!this.method4584());
		return arg3;
	}

	@OriginalMember(owner = "client!rb", name = "c", descriptor = "()I")
	@Override
	public int method5753() {
		@Pc(6) int local6 = this.anInt5893 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt5887 == 0) {
			local6 -= local6 * this.anInt5889 / (((Class4_Sub35_Sub1) super.aClass4_Sub35_5).aByteArray92.length << 8);
		} else if (this.anInt5887 >= 0) {
			local6 -= local6 * this.anInt5884 / ((Class4_Sub35_Sub1) super.aClass4_Sub35_5).aByteArray92.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!rb", name = "j", descriptor = "()Z")
	public boolean method4572() {
		return this.anInt5892 != 0;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "()Lclient!ho;")
	@Override
	public Class4_Sub18 method5751() {
		return null;
	}

	@OriginalMember(owner = "client!rb", name = "k", descriptor = "()I")
	public synchronized int method4574() {
		return this.anInt5883 < 0 ? -this.anInt5883 : this.anInt5883;
	}

	@OriginalMember(owner = "client!rb", name = "g", descriptor = "(I)V")
	public synchronized void method4578(@OriginalArg(0) int arg0) {
		this.anInt5887 = arg0;
	}

	@OriginalMember(owner = "client!rb", name = "d", descriptor = "(II)V")
	private synchronized void method4579(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5890 = arg0;
		this.anInt5888 = arg1;
		this.anInt5892 = 0;
		this.method4567();
	}

	@OriginalMember(owner = "client!rb", name = "h", descriptor = "(I)V")
	public synchronized void method4580(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class4_Sub35_Sub1) super.aClass4_Sub35_5).aByteArray92.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt5889 = arg0;
	}

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "()Lclient!ho;")
	@Override
	public Class4_Sub18 method5752() {
		return null;
	}

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "([IIIII)I")
	private int method4583(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt5892 <= 0) {
				if (this.anInt5883 == 256 && (this.anInt5889 & 0xFF) == 0) {
					if (Static394.aBoolean454) {
						return Static463.method4581(((Class4_Sub35_Sub1) super.aClass4_Sub35_5).aByteArray92, arg0, this.anInt5889, arg1, this.anInt5886, this.anInt5885, arg3, arg2, this);
					}
					return Static463.method4561(((Class4_Sub35_Sub1) super.aClass4_Sub35_5).aByteArray92, arg0, this.anInt5889, arg1, this.anInt5893, arg3, arg2, this);
				}
				if (Static394.aBoolean454) {
					return Static463.method4562(((Class4_Sub35_Sub1) super.aClass4_Sub35_5).aByteArray92, arg0, this.anInt5889, arg1, this.anInt5886, this.anInt5885, arg3, arg2, this, this.anInt5883, arg4);
				}
				return Static463.method4575(((Class4_Sub35_Sub1) super.aClass4_Sub35_5).aByteArray92, arg0, this.anInt5889, arg1, this.anInt5893, arg3, arg2, this, this.anInt5883, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt5892;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt5892 += arg1;
			if (this.anInt5883 == 256 && (this.anInt5889 & 0xFF) == 0) {
				if (Static394.aBoolean454) {
					arg1 = Static463.method4565(((Class4_Sub35_Sub1) super.aClass4_Sub35_5).aByteArray92, arg0, this.anInt5889, arg1, this.anInt5886, this.anInt5885, this.anInt5891, this.anInt5896, local5, arg2, this);
				} else {
					arg1 = Static463.method4554(((Class4_Sub35_Sub1) super.aClass4_Sub35_5).aByteArray92, arg0, this.anInt5889, arg1, this.anInt5893, this.anInt5895, local5, arg2, this);
				}
			} else if (Static394.aBoolean454) {
				arg1 = Static463.method4568(((Class4_Sub35_Sub1) super.aClass4_Sub35_5).aByteArray92, arg0, this.anInt5889, arg1, this.anInt5886, this.anInt5885, this.anInt5891, this.anInt5896, local5, arg2, this, this.anInt5883, arg4);
			} else {
				arg1 = Static463.method4582(((Class4_Sub35_Sub1) super.aClass4_Sub35_5).aByteArray92, arg0, this.anInt5889, arg1, this.anInt5893, this.anInt5895, local5, arg2, this, this.anInt5883, arg4);
			}
			this.anInt5892 -= arg1;
			if (this.anInt5892 != 0) {
				return arg1;
			}
		} while (!this.method4584());
		return arg3;
	}

	@OriginalMember(owner = "client!rb", name = "l", descriptor = "()Z")
	private boolean method4584() {
		@Pc(2) int local2 = this.anInt5890;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static463.method4573(local2, this.anInt5888);
			local8 = Static463.method4576(local2, this.anInt5888);
		}
		if (this.anInt5893 != local2 || this.anInt5886 != local10 || this.anInt5885 != local8) {
			if (this.anInt5893 < local2) {
				this.anInt5895 = 1;
				this.anInt5892 = local2 - this.anInt5893;
			} else if (this.anInt5893 > local2) {
				this.anInt5895 = -1;
				this.anInt5892 = this.anInt5893 - local2;
			} else {
				this.anInt5895 = 0;
			}
			if (this.anInt5886 < local10) {
				this.anInt5891 = 1;
				if (this.anInt5892 == 0 || this.anInt5892 > local10 - this.anInt5886) {
					this.anInt5892 = local10 - this.anInt5886;
				}
			} else if (this.anInt5886 > local10) {
				this.anInt5891 = -1;
				if (this.anInt5892 == 0 || this.anInt5892 > this.anInt5886 - local10) {
					this.anInt5892 = this.anInt5886 - local10;
				}
			} else {
				this.anInt5891 = 0;
			}
			if (this.anInt5885 < local8) {
				this.anInt5896 = 1;
				if (this.anInt5892 == 0 || this.anInt5892 > local8 - this.anInt5885) {
					this.anInt5892 = local8 - this.anInt5885;
				}
			} else if (this.anInt5885 > local8) {
				this.anInt5896 = -1;
				if (this.anInt5892 == 0 || this.anInt5892 > this.anInt5885 - local8) {
					this.anInt5892 = this.anInt5885 - local8;
				}
			} else {
				this.anInt5896 = 0;
			}
			return false;
		} else if (this.anInt5890 == Integer.MIN_VALUE) {
			this.anInt5890 = 0;
			this.anInt5893 = this.anInt5886 = this.anInt5885 = 0;
			this.method5854();
			return true;
		} else {
			this.method4567();
			return false;
		}
	}
}
