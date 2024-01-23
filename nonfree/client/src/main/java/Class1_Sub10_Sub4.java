import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uk")
public final class Class1_Sub10_Sub4 extends Class1_Sub10 {

	@OriginalMember(owner = "client!uk", name = "s", descriptor = "I")
	public int anInt5718;

	@OriginalMember(owner = "client!uk", name = "u", descriptor = "I")
	public int anInt5720;

	@OriginalMember(owner = "client!uk", name = "v", descriptor = "I")
	public int anInt5721;

	@OriginalMember(owner = "client!uk", name = "x", descriptor = "I")
	public int anInt5723;

	@OriginalMember(owner = "client!uk", name = "A", descriptor = "I")
	public int anInt5726;

	@OriginalMember(owner = "client!uk", name = "B", descriptor = "I")
	private int anInt5727;

	@OriginalMember(owner = "client!uk", name = "E", descriptor = "I")
	private int anInt5729;

	@OriginalMember(owner = "client!uk", name = "G", descriptor = "I")
	public int anInt5731;

	@OriginalMember(owner = "client!uk", name = "F", descriptor = "I")
	private int anInt5730;

	@OriginalMember(owner = "client!uk", name = "t", descriptor = "I")
	private int anInt5719;

	@OriginalMember(owner = "client!uk", name = "D", descriptor = "Z")
	private boolean aBoolean361;

	@OriginalMember(owner = "client!uk", name = "z", descriptor = "I")
	private int anInt5725;

	@OriginalMember(owner = "client!uk", name = "w", descriptor = "I")
	private int anInt5722;

	@OriginalMember(owner = "client!uk", name = "C", descriptor = "I")
	private int anInt5728;

	@OriginalMember(owner = "client!uk", name = "y", descriptor = "I")
	public int anInt5724;

	@OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(Lclient!h;II)V")
	public Class1_Sub10_Sub4(@OriginalArg(0) Class1_Sub11_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass1_Sub11_5 = arg0;
		this.anInt5730 = arg0.anInt2188;
		this.anInt5719 = arg0.anInt2187;
		this.aBoolean361 = arg0.aBoolean144;
		this.anInt5725 = arg1;
		this.anInt5722 = arg2;
		this.anInt5728 = 8192;
		this.anInt5724 = 0;
		this.method4359();
	}

	@OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(Lclient!h;III)V")
	public Class1_Sub10_Sub4(@OriginalArg(0) Class1_Sub11_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass1_Sub11_5 = arg0;
		this.anInt5730 = arg0.anInt2188;
		this.anInt5719 = arg0.anInt2187;
		this.aBoolean361 = arg0.aBoolean144;
		this.anInt5725 = arg1;
		this.anInt5722 = arg2;
		this.anInt5728 = arg3;
		this.anInt5724 = 0;
		this.method4359();
	}

	@OriginalMember(owner = "client!uk", name = "c", descriptor = "(I)V")
	public synchronized void method4348(@OriginalArg(0) int arg0) {
		if (this.anInt5725 < 0) {
			this.anInt5725 = -arg0;
		} else {
			this.anInt5725 = arg0;
		}
	}

	@OriginalMember(owner = "client!uk", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method4341(@OriginalArg(0) int arg0) {
		if (this.anInt5727 > 0) {
			if (arg0 >= this.anInt5727) {
				if (this.anInt5722 == Integer.MIN_VALUE) {
					this.anInt5722 = 0;
					this.anInt5723 = this.anInt5718 = this.anInt5731 = 0;
					this.method4767();
					arg0 = this.anInt5727;
				}
				this.anInt5727 = 0;
				this.method4359();
			} else {
				this.anInt5723 += this.anInt5721 * arg0;
				this.anInt5718 += this.anInt5720 * arg0;
				this.anInt5731 += this.anInt5726 * arg0;
				this.anInt5727 -= arg0;
			}
		}
		@Pc(71) Class1_Sub11_Sub1 local71 = (Class1_Sub11_Sub1) this.aClass1_Sub11_5;
		@Pc(76) int local76 = this.anInt5730 << 8;
		@Pc(81) int local81 = this.anInt5719 << 8;
		@Pc(87) int local87 = local71.aByteArray51.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt5729 = 0;
		}
		if (this.anInt5724 < 0) {
			if (this.anInt5725 <= 0) {
				this.method4362();
				this.method4767();
				return;
			}
			this.anInt5724 = 0;
		}
		if (this.anInt5724 >= local87) {
			if (this.anInt5725 >= 0) {
				this.method4362();
				this.method4767();
				return;
			}
			this.anInt5724 = local87 - 1;
		}
		this.anInt5724 += this.anInt5725 * arg0;
		if (this.anInt5729 >= 0) {
			if (this.anInt5729 > 0) {
				if (this.aBoolean361) {
					label121: {
						if (this.anInt5725 < 0) {
							if (this.anInt5724 >= local76) {
								return;
							}
							this.anInt5724 = local76 + local76 - this.anInt5724 - 1;
							this.anInt5725 = -this.anInt5725;
							if (--this.anInt5729 == 0) {
								break label121;
							}
						}
						do {
							if (this.anInt5724 < local81) {
								return;
							}
							this.anInt5724 = local81 + local81 - this.anInt5724 - 1;
							this.anInt5725 = -this.anInt5725;
							if (--this.anInt5729 == 0) {
								break;
							}
							if (this.anInt5724 >= local76) {
								return;
							}
							this.anInt5724 = local76 + local76 - this.anInt5724 - 1;
							this.anInt5725 = -this.anInt5725;
						} while (--this.anInt5729 != 0);
					}
				} else {
					label153: {
						@Pc(362) int local362;
						if (this.anInt5725 < 0) {
							if (this.anInt5724 >= local76) {
								return;
							}
							local362 = (local81 - this.anInt5724 - 1) / local91;
							if (local362 >= this.anInt5729) {
								this.anInt5724 += local91 * this.anInt5729;
								this.anInt5729 = 0;
								break label153;
							}
							this.anInt5724 += local91 * local362;
							this.anInt5729 -= local362;
						} else if (this.anInt5724 >= local81) {
							local362 = (this.anInt5724 - local76) / local91;
							if (local362 >= this.anInt5729) {
								this.anInt5724 -= local91 * this.anInt5729;
								this.anInt5729 = 0;
								break label153;
							}
							this.anInt5724 -= local91 * local362;
							this.anInt5729 -= local362;
						} else {
							return;
						}
						return;
					}
				}
			}
			if (this.anInt5725 < 0) {
				if (this.anInt5724 < 0) {
					this.anInt5724 = -1;
					this.method4362();
					this.method4767();
				}
			} else if (this.anInt5724 >= local87) {
				this.anInt5724 = local87;
				this.method4362();
				this.method4767();
			}
		} else if (this.aBoolean361) {
			if (this.anInt5725 < 0) {
				if (this.anInt5724 >= local76) {
					return;
				}
				this.anInt5724 = local76 + local76 - this.anInt5724 - 1;
				this.anInt5725 = -this.anInt5725;
			}
			while (this.anInt5724 >= local81) {
				this.anInt5724 = local81 + local81 - this.anInt5724 - 1;
				this.anInt5725 = -this.anInt5725;
				if (this.anInt5724 >= local76) {
					return;
				}
				this.anInt5724 = local76 + local76 - this.anInt5724 - 1;
				this.anInt5725 = -this.anInt5725;
			}
		} else if (this.anInt5725 < 0) {
			if (this.anInt5724 >= local76) {
				return;
			}
			this.anInt5724 = local81 - (local81 - 1 - this.anInt5724) % local91 - 1;
		} else if (this.anInt5724 >= local81) {
			this.anInt5724 = local76 + (this.anInt5724 - local76) % local91;
		} else {
			return;
		}
	}

	@OriginalMember(owner = "client!uk", name = "e", descriptor = "()Z")
	public boolean method4350() {
		return this.anInt5724 < 0 || this.anInt5724 >= ((Class1_Sub11_Sub1) this.aClass1_Sub11_5).aByteArray51.length << 8;
	}

	@OriginalMember(owner = "client!uk", name = "f", descriptor = "()I")
	public synchronized int method4351() {
		return this.anInt5725 < 0 ? -this.anInt5725 : this.anInt5725;
	}

	@OriginalMember(owner = "client!uk", name = "b", descriptor = "(II)V")
	public synchronized void method4353(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method4354(arg0, arg1, this.method4361());
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(III)V")
	public synchronized void method4354(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method4372(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static327.method4349(arg1, arg2);
		@Pc(14) int local14 = Static327.method4377(arg1, arg2);
		if (this.anInt5718 == local10 && this.anInt5731 == local14) {
			this.anInt5727 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt5723;
		if (this.anInt5723 - arg1 > local31) {
			local31 = this.anInt5723 - arg1;
		}
		if (local10 - this.anInt5718 > local31) {
			local31 = local10 - this.anInt5718;
		}
		if (this.anInt5718 - local10 > local31) {
			local31 = this.anInt5718 - local10;
		}
		if (local14 - this.anInt5731 > local31) {
			local31 = local14 - this.anInt5731;
		}
		if (this.anInt5731 - local14 > local31) {
			local31 = this.anInt5731 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt5727 = arg0;
		this.anInt5722 = arg1;
		this.anInt5728 = arg2;
		this.anInt5721 = (arg1 - this.anInt5723) / arg0;
		this.anInt5720 = (local10 - this.anInt5718) / arg0;
		this.anInt5726 = (local14 - this.anInt5731) / arg0;
	}

	@OriginalMember(owner = "client!uk", name = "d", descriptor = "()I")
	@Override
	public int method4344() {
		@Pc(6) int local6 = this.anInt5723 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt5729 == 0) {
			local6 -= local6 * this.anInt5724 / (((Class1_Sub11_Sub1) this.aClass1_Sub11_5).aByteArray51.length << 8);
		} else if (this.anInt5729 >= 0) {
			local6 -= local6 * this.anInt5730 / ((Class1_Sub11_Sub1) this.aClass1_Sub11_5).aByteArray51.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!uk", name = "g", descriptor = "()I")
	public synchronized int method4357() {
		return this.anInt5722 == Integer.MIN_VALUE ? 0 : this.anInt5722;
	}

	@OriginalMember(owner = "client!uk", name = "b", descriptor = "()Lclient!jk;")
	@Override
	public Class1_Sub10 method4342() {
		return null;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "()Lclient!jk;")
	@Override
	public Class1_Sub10 method4339() {
		return null;
	}

	@OriginalMember(owner = "client!uk", name = "h", descriptor = "()V")
	private void method4359() {
		this.anInt5723 = this.anInt5722;
		this.anInt5718 = Static327.method4349(this.anInt5722, this.anInt5728);
		this.anInt5731 = Static327.method4377(this.anInt5722, this.anInt5728);
	}

	@OriginalMember(owner = "client!uk", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method4345(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt5722 == 0 && this.anInt5727 == 0) {
			this.method4341(arg2);
			return;
		}
		@Pc(13) Class1_Sub11_Sub1 local13 = (Class1_Sub11_Sub1) this.aClass1_Sub11_5;
		@Pc(18) int local18 = this.anInt5730 << 8;
		@Pc(23) int local23 = this.anInt5719 << 8;
		@Pc(29) int local29 = local13.aByteArray51.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt5729 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt5724 < 0) {
			if (this.anInt5725 <= 0) {
				this.method4362();
				this.method4767();
				return;
			}
			this.anInt5724 = 0;
		}
		if (this.anInt5724 >= local29) {
			if (this.anInt5725 >= 0) {
				this.method4362();
				this.method4767();
				return;
			}
			this.anInt5724 = local29 - 1;
		}
		if (this.anInt5729 >= 0) {
			if (this.anInt5729 > 0) {
				if (this.aBoolean361) {
					label131: {
						if (this.anInt5725 < 0) {
							local40 = this.method4381(arg0, arg1, local18, local44, local13.aByteArray51[this.anInt5730]);
							if (this.anInt5724 >= local18) {
								return;
							}
							this.anInt5724 = local18 + local18 - this.anInt5724 - 1;
							this.anInt5725 = -this.anInt5725;
							if (--this.anInt5729 == 0) {
								break label131;
							}
						}
						do {
							local40 = this.method4384(arg0, local40, local23, local44, local13.aByteArray51[this.anInt5719 - 1]);
							if (this.anInt5724 < local23) {
								return;
							}
							this.anInt5724 = local23 + local23 - this.anInt5724 - 1;
							this.anInt5725 = -this.anInt5725;
							if (--this.anInt5729 == 0) {
								break;
							}
							local40 = this.method4381(arg0, local40, local18, local44, local13.aByteArray51[this.anInt5730]);
							if (this.anInt5724 >= local18) {
								return;
							}
							this.anInt5724 = local18 + local18 - this.anInt5724 - 1;
							this.anInt5725 = -this.anInt5725;
						} while (--this.anInt5729 != 0);
					}
				} else {
					@Pc(417) int local417;
					if (this.anInt5725 < 0) {
						while (true) {
							local40 = this.method4381(arg0, local40, local18, local44, local13.aByteArray51[this.anInt5719 - 1]);
							if (this.anInt5724 >= local18) {
								return;
							}
							local417 = (local23 - this.anInt5724 - 1) / local33;
							if (local417 >= this.anInt5729) {
								this.anInt5724 += local33 * this.anInt5729;
								this.anInt5729 = 0;
								break;
							}
							this.anInt5724 += local33 * local417;
							this.anInt5729 -= local417;
						}
					} else {
						while (true) {
							local40 = this.method4384(arg0, local40, local23, local44, local13.aByteArray51[this.anInt5730]);
							if (this.anInt5724 < local23) {
								return;
							}
							local417 = (this.anInt5724 - local18) / local33;
							if (local417 >= this.anInt5729) {
								this.anInt5724 -= local33 * this.anInt5729;
								this.anInt5729 = 0;
								break;
							}
							this.anInt5724 -= local33 * local417;
							this.anInt5729 -= local417;
						}
					}
				}
			}
			if (this.anInt5725 < 0) {
				this.method4381(arg0, local40, 0, local44, 0);
				if (this.anInt5724 < 0) {
					this.anInt5724 = -1;
					this.method4362();
					this.method4767();
				}
			} else {
				this.method4384(arg0, local40, local29, local44, 0);
				if (this.anInt5724 >= local29) {
					this.anInt5724 = local29;
					this.method4362();
					this.method4767();
				}
			}
		} else if (this.aBoolean361) {
			if (this.anInt5725 < 0) {
				local40 = this.method4381(arg0, arg1, local18, local44, local13.aByteArray51[this.anInt5730]);
				if (this.anInt5724 >= local18) {
					return;
				}
				this.anInt5724 = local18 + local18 - this.anInt5724 - 1;
				this.anInt5725 = -this.anInt5725;
			}
			while (true) {
				local40 = this.method4384(arg0, local40, local23, local44, local13.aByteArray51[this.anInt5719 - 1]);
				if (this.anInt5724 < local23) {
					return;
				}
				this.anInt5724 = local23 + local23 - this.anInt5724 - 1;
				this.anInt5725 = -this.anInt5725;
				local40 = this.method4381(arg0, local40, local18, local44, local13.aByteArray51[this.anInt5730]);
				if (this.anInt5724 >= local18) {
					return;
				}
				this.anInt5724 = local18 + local18 - this.anInt5724 - 1;
				this.anInt5725 = -this.anInt5725;
			}
		} else if (this.anInt5725 < 0) {
			while (true) {
				local40 = this.method4381(arg0, local40, local18, local44, local13.aByteArray51[this.anInt5719 - 1]);
				if (this.anInt5724 >= local18) {
					return;
				}
				this.anInt5724 = local23 - (local23 - 1 - this.anInt5724) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method4384(arg0, local40, local23, local44, local13.aByteArray51[this.anInt5730]);
				if (this.anInt5724 < local23) {
					return;
				}
				this.anInt5724 = local18 + (this.anInt5724 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!uk", name = "i", descriptor = "()I")
	public synchronized int method4361() {
		return this.anInt5728 < 0 ? -1 : this.anInt5728;
	}

	@OriginalMember(owner = "client!uk", name = "j", descriptor = "()V")
	private void method4362() {
		if (this.anInt5727 == 0) {
			return;
		}
		if (this.anInt5722 == Integer.MIN_VALUE) {
			this.anInt5722 = 0;
		}
		this.anInt5727 = 0;
		this.method4359();
	}

	@OriginalMember(owner = "client!uk", name = "k", descriptor = "()Z")
	private boolean method4364() {
		@Pc(2) int local2 = this.anInt5722;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static327.method4349(local2, this.anInt5728);
			local8 = Static327.method4377(local2, this.anInt5728);
		}
		if (this.anInt5723 != local2 || this.anInt5718 != local10 || this.anInt5731 != local8) {
			if (this.anInt5723 < local2) {
				this.anInt5721 = 1;
				this.anInt5727 = local2 - this.anInt5723;
			} else if (this.anInt5723 > local2) {
				this.anInt5721 = -1;
				this.anInt5727 = this.anInt5723 - local2;
			} else {
				this.anInt5721 = 0;
			}
			if (this.anInt5718 < local10) {
				this.anInt5720 = 1;
				if (this.anInt5727 == 0 || this.anInt5727 > local10 - this.anInt5718) {
					this.anInt5727 = local10 - this.anInt5718;
				}
			} else if (this.anInt5718 > local10) {
				this.anInt5720 = -1;
				if (this.anInt5727 == 0 || this.anInt5727 > this.anInt5718 - local10) {
					this.anInt5727 = this.anInt5718 - local10;
				}
			} else {
				this.anInt5720 = 0;
			}
			if (this.anInt5731 < local8) {
				this.anInt5726 = 1;
				if (this.anInt5727 == 0 || this.anInt5727 > local8 - this.anInt5731) {
					this.anInt5727 = local8 - this.anInt5731;
				}
			} else if (this.anInt5731 > local8) {
				this.anInt5726 = -1;
				if (this.anInt5727 == 0 || this.anInt5727 > this.anInt5731 - local8) {
					this.anInt5727 = this.anInt5731 - local8;
				}
			} else {
				this.anInt5726 = 0;
			}
			return false;
		} else if (this.anInt5722 == Integer.MIN_VALUE) {
			this.anInt5722 = 0;
			this.anInt5723 = this.anInt5718 = this.anInt5731 = 0;
			this.method4767();
			return true;
		} else {
			this.method4359();
			return false;
		}
	}

	@OriginalMember(owner = "client!uk", name = "d", descriptor = "(I)V")
	public synchronized void method4367(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method4385();
			this.method4767();
		} else if (this.anInt5718 == 0 && this.anInt5731 == 0) {
			this.anInt5727 = 0;
			this.anInt5722 = 0;
			this.anInt5723 = 0;
			this.method4767();
		} else {
			@Pc(31) int local31 = -this.anInt5723;
			if (this.anInt5723 > local31) {
				local31 = this.anInt5723;
			}
			if (-this.anInt5718 > local31) {
				local31 = -this.anInt5718;
			}
			if (this.anInt5718 > local31) {
				local31 = this.anInt5718;
			}
			if (-this.anInt5731 > local31) {
				local31 = -this.anInt5731;
			}
			if (this.anInt5731 > local31) {
				local31 = this.anInt5731;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt5727 = arg0;
			this.anInt5722 = Integer.MIN_VALUE;
			this.anInt5721 = -this.anInt5723 / arg0;
			this.anInt5720 = -this.anInt5718 / arg0;
			this.anInt5726 = -this.anInt5731 / arg0;
		}
	}

	@OriginalMember(owner = "client!uk", name = "e", descriptor = "(I)V")
	public synchronized void method4369(@OriginalArg(0) int arg0) {
		this.method4372(arg0 << 6, this.method4361());
	}

	@OriginalMember(owner = "client!uk", name = "f", descriptor = "(I)V")
	public synchronized void method4370(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class1_Sub11_Sub1) this.aClass1_Sub11_5).aByteArray51.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt5724 = arg0;
	}

	@OriginalMember(owner = "client!uk", name = "c", descriptor = "(II)V")
	private synchronized void method4372(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5722 = arg0;
		this.anInt5728 = arg1;
		this.anInt5727 = 0;
		this.method4359();
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(Z)V")
	public synchronized void method4378() {
		this.anInt5725 = (this.anInt5725 ^ this.anInt5725 >> 31) + (this.anInt5725 >>> 31);
		this.anInt5725 = -this.anInt5725;
	}

	@OriginalMember(owner = "client!uk", name = "l", descriptor = "()Z")
	public boolean method4380() {
		return this.anInt5727 != 0;
	}

	@OriginalMember(owner = "client!uk", name = "c", descriptor = "()I")
	@Override
	public int method4343() {
		return this.anInt5722 == 0 && this.anInt5727 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "([IIIII)I")
	private int method4381(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		while (true) {
			if (this.anInt5727 > 0) {
				@Pc(7) int local7 = arg1 + this.anInt5727;
				if (local7 > arg3) {
					local7 = arg3;
				}
				this.anInt5727 += arg1;
				if (this.anInt5725 == -256 && (this.anInt5724 & 0xFF) == 0) {
					if (Static263.aBoolean329) {
						arg1 = Static327.method4376(((Class1_Sub11_Sub1) this.aClass1_Sub11_5).aByteArray51, arg0, this.anInt5724, arg1, this.anInt5718, this.anInt5731, this.anInt5720, this.anInt5726, local7, arg2, this);
					} else {
						arg1 = Static327.method4360(((Class1_Sub11_Sub1) this.aClass1_Sub11_5).aByteArray51, arg0, this.anInt5724, arg1, this.anInt5723, this.anInt5721, local7, arg2, this);
					}
				} else if (Static263.aBoolean329) {
					arg1 = Static327.method4352(((Class1_Sub11_Sub1) this.aClass1_Sub11_5).aByteArray51, arg0, this.anInt5724, arg1, this.anInt5718, this.anInt5731, this.anInt5720, this.anInt5726, local7, arg2, this, this.anInt5725, arg4);
				} else {
					arg1 = Static327.method4358(((Class1_Sub11_Sub1) this.aClass1_Sub11_5).aByteArray51, arg0, this.anInt5724, arg1, this.anInt5723, this.anInt5721, local7, arg2, this, this.anInt5725, arg4);
				}
				this.anInt5727 -= arg1;
				if (this.anInt5727 != 0) {
					return arg1;
				}
				if (!this.method4364()) {
					continue;
				}
				return arg3;
			}
			if (this.anInt5725 == -256 && (this.anInt5724 & 0xFF) == 0) {
				if (Static263.aBoolean329) {
					return Static327.method4368(((Class1_Sub11_Sub1) this.aClass1_Sub11_5).aByteArray51, arg0, this.anInt5724, arg1, this.anInt5718, this.anInt5731, arg3, arg2, this);
				}
				return Static327.method4371(((Class1_Sub11_Sub1) this.aClass1_Sub11_5).aByteArray51, arg0, this.anInt5724, arg1, this.anInt5723, arg3, arg2, this);
			}
			if (Static263.aBoolean329) {
				return Static327.method4347(((Class1_Sub11_Sub1) this.aClass1_Sub11_5).aByteArray51, arg0, this.anInt5724, arg1, this.anInt5718, this.anInt5731, arg3, arg2, this, this.anInt5725, arg4);
			}
			return Static327.method4383(((Class1_Sub11_Sub1) this.aClass1_Sub11_5).aByteArray51, arg0, this.anInt5724, arg1, this.anInt5723, arg3, arg2, this, this.anInt5725, arg4);
		}
	}

	@OriginalMember(owner = "client!uk", name = "g", descriptor = "(I)V")
	public synchronized void method4382(@OriginalArg(0) int arg0) {
		this.anInt5729 = arg0;
	}

	@OriginalMember(owner = "client!uk", name = "b", descriptor = "([IIIII)I")
	private int method4384(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		while (true) {
			if (this.anInt5727 > 0) {
				@Pc(7) int local7 = arg1 + this.anInt5727;
				if (local7 > arg3) {
					local7 = arg3;
				}
				this.anInt5727 += arg1;
				if (this.anInt5725 == 256 && (this.anInt5724 & 0xFF) == 0) {
					if (Static263.aBoolean329) {
						arg1 = Static327.method4346(((Class1_Sub11_Sub1) this.aClass1_Sub11_5).aByteArray51, arg0, this.anInt5724, arg1, this.anInt5718, this.anInt5731, this.anInt5720, this.anInt5726, local7, arg2, this);
					} else {
						arg1 = Static327.method4373(((Class1_Sub11_Sub1) this.aClass1_Sub11_5).aByteArray51, arg0, this.anInt5724, arg1, this.anInt5723, this.anInt5721, local7, arg2, this);
					}
				} else if (Static263.aBoolean329) {
					arg1 = Static327.method4379(((Class1_Sub11_Sub1) this.aClass1_Sub11_5).aByteArray51, arg0, this.anInt5724, arg1, this.anInt5718, this.anInt5731, this.anInt5720, this.anInt5726, local7, arg2, this, this.anInt5725, arg4);
				} else {
					arg1 = Static327.method4363(((Class1_Sub11_Sub1) this.aClass1_Sub11_5).aByteArray51, arg0, this.anInt5724, arg1, this.anInt5723, this.anInt5721, local7, arg2, this, this.anInt5725, arg4);
				}
				this.anInt5727 -= arg1;
				if (this.anInt5727 != 0) {
					return arg1;
				}
				if (!this.method4364()) {
					continue;
				}
				return arg3;
			}
			if (this.anInt5725 == 256 && (this.anInt5724 & 0xFF) == 0) {
				if (Static263.aBoolean329) {
					return Static327.method4356(((Class1_Sub11_Sub1) this.aClass1_Sub11_5).aByteArray51, arg0, this.anInt5724, arg1, this.anInt5718, this.anInt5731, arg3, arg2, this);
				}
				return Static327.method4355(((Class1_Sub11_Sub1) this.aClass1_Sub11_5).aByteArray51, arg0, this.anInt5724, arg1, this.anInt5723, arg3, arg2, this);
			}
			if (Static263.aBoolean329) {
				return Static327.method4365(((Class1_Sub11_Sub1) this.aClass1_Sub11_5).aByteArray51, arg0, this.anInt5724, arg1, this.anInt5718, this.anInt5731, arg3, arg2, this, this.anInt5725, arg4);
			}
			return Static327.method4366(((Class1_Sub11_Sub1) this.aClass1_Sub11_5).aByteArray51, arg0, this.anInt5724, arg1, this.anInt5723, arg3, arg2, this, this.anInt5725, arg4);
		}
	}

	@OriginalMember(owner = "client!uk", name = "h", descriptor = "(I)V")
	private synchronized void method4385() {
		this.method4372(0, this.method4361());
	}
}
