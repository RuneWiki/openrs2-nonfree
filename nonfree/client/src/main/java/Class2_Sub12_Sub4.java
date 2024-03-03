import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qn")
public final class Class2_Sub12_Sub4 extends Class2_Sub12 {

	@OriginalMember(owner = "client!qn", name = "A", descriptor = "I")
	public int anInt5468;

	@OriginalMember(owner = "client!qn", name = "B", descriptor = "I")
	public int anInt5469;

	@OriginalMember(owner = "client!qn", name = "C", descriptor = "I")
	public int anInt5470;

	@OriginalMember(owner = "client!qn", name = "D", descriptor = "I")
	private int anInt5471;

	@OriginalMember(owner = "client!qn", name = "E", descriptor = "I")
	public int anInt5472;

	@OriginalMember(owner = "client!qn", name = "F", descriptor = "I")
	public int anInt5473;

	@OriginalMember(owner = "client!qn", name = "G", descriptor = "I")
	private int anInt5474;

	@OriginalMember(owner = "client!qn", name = "I", descriptor = "I")
	public int anInt5476;

	@OriginalMember(owner = "client!qn", name = "x", descriptor = "I")
	private final int anInt5466;

	@OriginalMember(owner = "client!qn", name = "H", descriptor = "I")
	private final int anInt5475;

	@OriginalMember(owner = "client!qn", name = "z", descriptor = "Z")
	private final boolean aBoolean390;

	@OriginalMember(owner = "client!qn", name = "J", descriptor = "I")
	private int anInt5477;

	@OriginalMember(owner = "client!qn", name = "y", descriptor = "I")
	private int anInt5467;

	@OriginalMember(owner = "client!qn", name = "w", descriptor = "I")
	private int anInt5465;

	@OriginalMember(owner = "client!qn", name = "K", descriptor = "I")
	public int anInt5478;

	@OriginalMember(owner = "client!qn", name = "<init>", descriptor = "(Lclient!jn;II)V", line = 1458)
	public Class2_Sub12_Sub4(@OriginalArg(0) Class2_Sub21_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass2_Sub21_5 = arg0;
		this.anInt5466 = arg0.anInt3174;
		this.anInt5475 = arg0.anInt3173;
		this.aBoolean390 = arg0.aBoolean219;
		this.anInt5477 = arg1;
		this.anInt5467 = arg2;
		this.anInt5465 = 8192;
		this.anInt5478 = 0;
		this.method4986();
	}

	@OriginalMember(owner = "client!qn", name = "<init>", descriptor = "(Lclient!jn;III)V", line = 1469)
	public Class2_Sub12_Sub4(@OriginalArg(0) Class2_Sub21_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass2_Sub21_5 = arg0;
		this.anInt5466 = arg0.anInt3174;
		this.anInt5475 = arg0.anInt3173;
		this.aBoolean390 = arg0.aBoolean219;
		this.anInt5477 = arg1;
		this.anInt5467 = arg2;
		this.anInt5465 = arg3;
		this.anInt5478 = 0;
		this.method4986();
	}

	@OriginalMember(owner = "client!qn", name = "c", descriptor = "(I)V", line = 3)
	public synchronized void method4980(@OriginalArg(0) int arg0) {
		this.method5011(arg0 << 6, this.method4987());
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(II)V", line = 47)
	public synchronized void method4982(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method4995(arg0, arg1, this.method4987());
	}

	@OriginalMember(owner = "client!qn", name = "e", descriptor = "()I", line = 51)
	public synchronized int method4983() {
		return this.anInt5477 < 0 ? -this.anInt5477 : this.anInt5477;
	}

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "()I", line = 55)
	@Override
	public int method4977() {
		@Pc(6) int local6 = this.anInt5476 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt5474 == 0) {
			local6 -= local6 * this.anInt5478 / (((Class2_Sub21_Sub1) super.aClass2_Sub21_5).aByteArray31.length << 8);
		} else if (this.anInt5474 >= 0) {
			local6 -= local6 * this.anInt5466 / ((Class2_Sub21_Sub1) super.aClass2_Sub21_5).aByteArray31.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!qn", name = "d", descriptor = "(I)V", line = 94)
	public synchronized void method4985(@OriginalArg(0) int arg0) {
		this.anInt5474 = arg0;
	}

	@OriginalMember(owner = "client!qn", name = "f", descriptor = "()V", line = 98)
	private void method4986() {
		this.anInt5476 = this.anInt5467;
		this.anInt5469 = Static392.method5001(this.anInt5467, this.anInt5465);
		this.anInt5470 = Static392.method5017(this.anInt5467, this.anInt5465);
	}

	@OriginalMember(owner = "client!qn", name = "g", descriptor = "()I", line = 103)
	public synchronized int method4987() {
		return this.anInt5465 < 0 ? -1 : this.anInt5465;
	}

	@OriginalMember(owner = "client!qn", name = "h", descriptor = "()Z", line = 163)
	private boolean method4989() {
		@Pc(2) int local2 = this.anInt5467;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static392.method5001(local2, this.anInt5465);
			local8 = Static392.method5017(local2, this.anInt5465);
		}
		if (this.anInt5476 != local2 || this.anInt5469 != local10 || this.anInt5470 != local8) {
			if (this.anInt5476 < local2) {
				this.anInt5468 = 1;
				this.anInt5471 = local2 - this.anInt5476;
			} else if (this.anInt5476 > local2) {
				this.anInt5468 = -1;
				this.anInt5471 = this.anInt5476 - local2;
			} else {
				this.anInt5468 = 0;
			}
			if (this.anInt5469 < local10) {
				this.anInt5472 = 1;
				if (this.anInt5471 == 0 || this.anInt5471 > local10 - this.anInt5469) {
					this.anInt5471 = local10 - this.anInt5469;
				}
			} else if (this.anInt5469 > local10) {
				this.anInt5472 = -1;
				if (this.anInt5471 == 0 || this.anInt5471 > this.anInt5469 - local10) {
					this.anInt5471 = this.anInt5469 - local10;
				}
			} else {
				this.anInt5472 = 0;
			}
			if (this.anInt5470 < local8) {
				this.anInt5473 = 1;
				if (this.anInt5471 == 0 || this.anInt5471 > local8 - this.anInt5470) {
					this.anInt5471 = local8 - this.anInt5470;
				}
			} else if (this.anInt5470 > local8) {
				this.anInt5473 = -1;
				if (this.anInt5471 == 0 || this.anInt5471 > this.anInt5470 - local8) {
					this.anInt5471 = this.anInt5470 - local8;
				}
			} else {
				this.anInt5473 = 0;
			}
			return false;
		} else if (this.anInt5467 == Integer.MIN_VALUE) {
			this.anInt5467 = 0;
			this.anInt5476 = this.anInt5469 = this.anInt5470 = 0;
			this.method6469();
			return true;
		} else {
			this.method4986();
			return false;
		}
	}

	@OriginalMember(owner = "client!qn", name = "i", descriptor = "()Z", line = 248)
	public boolean method4990() {
		return this.anInt5471 != 0;
	}

	@OriginalMember(owner = "client!qn", name = "e", descriptor = "(I)V", line = 251)
	public synchronized void method4991(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method5019();
			this.method6469();
		} else if (this.anInt5469 == 0 && this.anInt5470 == 0) {
			this.anInt5471 = 0;
			this.anInt5467 = 0;
			this.anInt5476 = 0;
			this.method6469();
		} else {
			@Pc(31) int local31 = -this.anInt5476;
			if (this.anInt5476 > local31) {
				local31 = this.anInt5476;
			}
			if (-this.anInt5469 > local31) {
				local31 = -this.anInt5469;
			}
			if (this.anInt5469 > local31) {
				local31 = this.anInt5469;
			}
			if (-this.anInt5470 > local31) {
				local31 = -this.anInt5470;
			}
			if (this.anInt5470 > local31) {
				local31 = this.anInt5470;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt5471 = arg0;
			this.anInt5467 = Integer.MIN_VALUE;
			this.anInt5468 = -this.anInt5476 / arg0;
			this.anInt5472 = -this.anInt5469 / arg0;
			this.anInt5473 = -this.anInt5470 / arg0;
		}
	}

	@OriginalMember(owner = "client!qn", name = "f", descriptor = "(I)V", line = 297)
	public synchronized void method4992(@OriginalArg(0) int arg0) {
		if (this.anInt5477 < 0) {
			this.anInt5477 = -arg0;
		} else {
			this.anInt5477 = arg0;
		}
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "([III)V", line = 373)
	@Override
	public synchronized void method4974(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt5467 == 0 && this.anInt5471 == 0) {
			this.method4975(arg2);
			return;
		}
		@Pc(13) Class2_Sub21_Sub1 local13 = (Class2_Sub21_Sub1) super.aClass2_Sub21_5;
		@Pc(18) int local18 = this.anInt5466 << 8;
		@Pc(23) int local23 = this.anInt5475 << 8;
		@Pc(29) int local29 = local13.aByteArray31.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt5474 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt5478 < 0) {
			if (this.anInt5477 <= 0) {
				this.method5008();
				this.method6469();
				return;
			}
			this.anInt5478 = 0;
		}
		if (this.anInt5478 >= local29) {
			if (this.anInt5477 >= 0) {
				this.method5008();
				this.method6469();
				return;
			}
			this.anInt5478 = local29 - 1;
		}
		if (this.anInt5474 >= 0) {
			if (this.anInt5474 > 0) {
				if (this.aBoolean390) {
					label130: {
						if (this.anInt5477 < 0) {
							local40 = this.method4996(arg0, arg1, local18, local44, local13.aByteArray31[this.anInt5466]);
							if (this.anInt5478 >= local18) {
								return;
							}
							this.anInt5478 = local18 + local18 - this.anInt5478 - 1;
							this.anInt5477 = -this.anInt5477;
							if (--this.anInt5474 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method5015(arg0, local40, local23, local44, local13.aByteArray31[this.anInt5475 - 1]);
							if (this.anInt5478 < local23) {
								return;
							}
							this.anInt5478 = local23 + local23 - this.anInt5478 - 1;
							this.anInt5477 = -this.anInt5477;
							if (--this.anInt5474 == 0) {
								break;
							}
							local40 = this.method4996(arg0, local40, local18, local44, local13.aByteArray31[this.anInt5466]);
							if (this.anInt5478 >= local18) {
								return;
							}
							this.anInt5478 = local18 + local18 - this.anInt5478 - 1;
							this.anInt5477 = -this.anInt5477;
						} while (--this.anInt5474 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt5477 < 0) {
						while (true) {
							local40 = this.method4996(arg0, local40, local18, local44, local13.aByteArray31[this.anInt5475 - 1]);
							if (this.anInt5478 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt5478 - 1) / local33;
							if (local416 >= this.anInt5474) {
								this.anInt5478 += local33 * this.anInt5474;
								this.anInt5474 = 0;
								break;
							}
							this.anInt5478 += local33 * local416;
							this.anInt5474 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method5015(arg0, local40, local23, local44, local13.aByteArray31[this.anInt5466]);
							if (this.anInt5478 < local23) {
								return;
							}
							local416 = (this.anInt5478 - local18) / local33;
							if (local416 >= this.anInt5474) {
								this.anInt5478 -= local33 * this.anInt5474;
								this.anInt5474 = 0;
								break;
							}
							this.anInt5478 -= local33 * local416;
							this.anInt5474 -= local416;
						}
					}
				}
			}
			if (this.anInt5477 < 0) {
				this.method4996(arg0, local40, 0, local44, 0);
				if (this.anInt5478 < 0) {
					this.anInt5478 = -1;
					this.method5008();
					this.method6469();
					return;
				}
			} else {
				this.method5015(arg0, local40, local29, local44, 0);
				if (this.anInt5478 >= local29) {
					this.anInt5478 = local29;
					this.method5008();
					this.method6469();
				}
			}
		} else if (this.aBoolean390) {
			if (this.anInt5477 < 0) {
				local40 = this.method4996(arg0, arg1, local18, local44, local13.aByteArray31[this.anInt5466]);
				if (this.anInt5478 >= local18) {
					return;
				}
				this.anInt5478 = local18 + local18 - this.anInt5478 - 1;
				this.anInt5477 = -this.anInt5477;
			}
			while (true) {
				local40 = this.method5015(arg0, local40, local23, local44, local13.aByteArray31[this.anInt5475 - 1]);
				if (this.anInt5478 < local23) {
					return;
				}
				this.anInt5478 = local23 + local23 - this.anInt5478 - 1;
				this.anInt5477 = -this.anInt5477;
				local40 = this.method4996(arg0, local40, local18, local44, local13.aByteArray31[this.anInt5466]);
				if (this.anInt5478 >= local18) {
					return;
				}
				this.anInt5478 = local18 + local18 - this.anInt5478 - 1;
				this.anInt5477 = -this.anInt5477;
			}
		} else if (this.anInt5477 < 0) {
			while (true) {
				local40 = this.method4996(arg0, local40, local18, local44, local13.aByteArray31[this.anInt5475 - 1]);
				if (this.anInt5478 >= local18) {
					return;
				}
				this.anInt5478 = local23 - (local23 - 1 - this.anInt5478) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method5015(arg0, local40, local23, local44, local13.aByteArray31[this.anInt5466]);
				if (this.anInt5478 < local23) {
					return;
				}
				this.anInt5478 = local18 + (this.anInt5478 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "(III)V", line = 608)
	public synchronized void method4995(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method5011(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static392.method5001(arg1, arg2);
		@Pc(14) int local14 = Static392.method5017(arg1, arg2);
		if (this.anInt5469 == local10 && this.anInt5470 == local14) {
			this.anInt5471 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt5476;
		if (this.anInt5476 - arg1 > local31) {
			local31 = this.anInt5476 - arg1;
		}
		if (local10 - this.anInt5469 > local31) {
			local31 = local10 - this.anInt5469;
		}
		if (this.anInt5469 - local10 > local31) {
			local31 = this.anInt5469 - local10;
		}
		if (local14 - this.anInt5470 > local31) {
			local31 = local14 - this.anInt5470;
		}
		if (this.anInt5470 - local14 > local31) {
			local31 = this.anInt5470 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt5471 = arg0;
		this.anInt5467 = arg1;
		this.anInt5465 = arg2;
		this.anInt5468 = (arg1 - this.anInt5476) / arg0;
		this.anInt5472 = (local10 - this.anInt5469) / arg0;
		this.anInt5473 = (local14 - this.anInt5470) / arg0;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "([IIIII)I", line = 656)
	private int method4996(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt5471 <= 0) {
				if (this.anInt5477 == -256 && (this.anInt5478 & 0xFF) == 0) {
					if (Static329.aBoolean93) {
						return Static392.method5013(((Class2_Sub21_Sub1) super.aClass2_Sub21_5).aByteArray31, arg0, this.anInt5478, arg1, this.anInt5469, this.anInt5470, arg3, arg2, this);
					}
					return Static392.method4997(((Class2_Sub21_Sub1) super.aClass2_Sub21_5).aByteArray31, arg0, this.anInt5478, arg1, this.anInt5476, arg3, arg2, this);
				}
				if (Static329.aBoolean93) {
					return Static392.method5003(((Class2_Sub21_Sub1) super.aClass2_Sub21_5).aByteArray31, arg0, this.anInt5478, arg1, this.anInt5469, this.anInt5470, arg3, arg2, this, this.anInt5477, arg4);
				}
				return Static392.method4984(((Class2_Sub21_Sub1) super.aClass2_Sub21_5).aByteArray31, arg0, this.anInt5478, arg1, this.anInt5476, arg3, arg2, this, this.anInt5477, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt5471;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt5471 += arg1;
			if (this.anInt5477 == -256 && (this.anInt5478 & 0xFF) == 0) {
				if (Static329.aBoolean93) {
					arg1 = Static392.method5018(((Class2_Sub21_Sub1) super.aClass2_Sub21_5).aByteArray31, arg0, this.anInt5478, arg1, this.anInt5469, this.anInt5470, this.anInt5472, this.anInt5473, local5, arg2, this);
				} else {
					arg1 = Static392.method5006(((Class2_Sub21_Sub1) super.aClass2_Sub21_5).aByteArray31, arg0, this.anInt5478, arg1, this.anInt5476, this.anInt5468, local5, arg2, this);
				}
			} else if (Static329.aBoolean93) {
				arg1 = Static392.method5014(((Class2_Sub21_Sub1) super.aClass2_Sub21_5).aByteArray31, arg0, this.anInt5478, arg1, this.anInt5469, this.anInt5470, this.anInt5472, this.anInt5473, local5, arg2, this, this.anInt5477, arg4);
			} else {
				arg1 = Static392.method5000(((Class2_Sub21_Sub1) super.aClass2_Sub21_5).aByteArray31, arg0, this.anInt5478, arg1, this.anInt5476, this.anInt5468, local5, arg2, this, this.anInt5477, arg4);
			}
			this.anInt5471 -= arg1;
			if (this.anInt5471 != 0) {
				return arg1;
			}
		} while (!this.method4989());
		return arg3;
	}

	@OriginalMember(owner = "client!qn", name = "j", descriptor = "()I", line = 736)
	public synchronized int method4998() {
		return this.anInt5467 == Integer.MIN_VALUE ? 0 : this.anInt5467;
	}

	@OriginalMember(owner = "client!qn", name = "k", descriptor = "()Z", line = 784)
	public boolean method5002() {
		return this.anInt5478 < 0 || this.anInt5478 >= ((Class2_Sub21_Sub1) super.aClass2_Sub21_5).aByteArray31.length << 8;
	}

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "(Z)V", line = 854)
	public synchronized void method5005() {
		this.anInt5477 = (this.anInt5477 ^ this.anInt5477 >> 31) + (this.anInt5477 >>> 31);
		this.anInt5477 = -this.anInt5477;
	}

	@OriginalMember(owner = "client!qn", name = "l", descriptor = "()V", line = 900)
	private void method5008() {
		if (this.anInt5471 == 0) {
			return;
		}
		if (this.anInt5467 == Integer.MIN_VALUE) {
			this.anInt5467 = 0;
		}
		this.anInt5471 = 0;
		this.method4986();
	}

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "(I)V", line = 911)
	@Override
	public synchronized void method4975(@OriginalArg(0) int arg0) {
		if (this.anInt5471 > 0) {
			if (arg0 >= this.anInt5471) {
				if (this.anInt5467 == Integer.MIN_VALUE) {
					this.anInt5467 = 0;
					this.anInt5476 = this.anInt5469 = this.anInt5470 = 0;
					this.method6469();
					arg0 = this.anInt5471;
				}
				this.anInt5471 = 0;
				this.method4986();
			} else {
				this.anInt5476 += this.anInt5468 * arg0;
				this.anInt5469 += this.anInt5472 * arg0;
				this.anInt5470 += this.anInt5473 * arg0;
				this.anInt5471 -= arg0;
			}
		}
		@Pc(71) Class2_Sub21_Sub1 local71 = (Class2_Sub21_Sub1) super.aClass2_Sub21_5;
		@Pc(76) int local76 = this.anInt5466 << 8;
		@Pc(81) int local81 = this.anInt5475 << 8;
		@Pc(87) int local87 = local71.aByteArray31.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt5474 = 0;
		}
		if (this.anInt5478 < 0) {
			if (this.anInt5477 <= 0) {
				this.method5008();
				this.method6469();
				return;
			}
			this.anInt5478 = 0;
		}
		if (this.anInt5478 >= local87) {
			if (this.anInt5477 >= 0) {
				this.method5008();
				this.method6469();
				return;
			}
			this.anInt5478 = local87 - 1;
		}
		this.anInt5478 += this.anInt5477 * arg0;
		if (this.anInt5474 >= 0) {
			if (this.anInt5474 > 0) {
				if (this.aBoolean390) {
					label125: {
						if (this.anInt5477 < 0) {
							if (this.anInt5478 >= local76) {
								return;
							}
							this.anInt5478 = local76 + local76 - this.anInt5478 - 1;
							this.anInt5477 = -this.anInt5477;
							if (--this.anInt5474 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt5478 < local81) {
								return;
							}
							this.anInt5478 = local81 + local81 - this.anInt5478 - 1;
							this.anInt5477 = -this.anInt5477;
							if (--this.anInt5474 == 0) {
								break;
							}
							if (this.anInt5478 >= local76) {
								return;
							}
							this.anInt5478 = local76 + local76 - this.anInt5478 - 1;
							this.anInt5477 = -this.anInt5477;
						} while (--this.anInt5474 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt5477 < 0) {
						if (this.anInt5478 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt5478 - 1) / local91;
						if (local361 < this.anInt5474) {
							this.anInt5478 += local91 * local361;
							this.anInt5474 -= local361;
							return;
						}
						this.anInt5478 += local91 * this.anInt5474;
						this.anInt5474 = 0;
					} else if (this.anInt5478 >= local81) {
						local361 = (this.anInt5478 - local76) / local91;
						if (local361 < this.anInt5474) {
							this.anInt5478 -= local91 * local361;
							this.anInt5474 -= local361;
							return;
						}
						this.anInt5478 -= local91 * this.anInt5474;
						this.anInt5474 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt5477 < 0) {
				if (this.anInt5478 < 0) {
					this.anInt5478 = -1;
					this.method5008();
					this.method6469();
					return;
				}
			} else if (this.anInt5478 >= local87) {
				this.anInt5478 = local87;
				this.method5008();
				this.method6469();
			}
		} else if (this.aBoolean390) {
			if (this.anInt5477 < 0) {
				if (this.anInt5478 >= local76) {
					return;
				}
				this.anInt5478 = local76 + local76 - this.anInt5478 - 1;
				this.anInt5477 = -this.anInt5477;
			}
			while (this.anInt5478 >= local81) {
				this.anInt5478 = local81 + local81 - this.anInt5478 - 1;
				this.anInt5477 = -this.anInt5477;
				if (this.anInt5478 >= local76) {
					return;
				}
				this.anInt5478 = local76 + local76 - this.anInt5478 - 1;
				this.anInt5477 = -this.anInt5477;
			}
		} else if (this.anInt5477 < 0) {
			if (this.anInt5478 < local76) {
				this.anInt5478 = local81 - (local81 - 1 - this.anInt5478) % local91 - 1;
			}
		} else if (this.anInt5478 >= local81) {
			this.anInt5478 = local76 + (this.anInt5478 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!qn", name = "c", descriptor = "(II)V", line = 1191)
	private synchronized void method5011(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5467 = arg0;
		this.anInt5465 = arg1;
		this.anInt5471 = 0;
		this.method4986();
	}

	@OriginalMember(owner = "client!qn", name = "c", descriptor = "()I", line = 1230)
	@Override
	public int method4978() {
		return this.anInt5467 == 0 && this.anInt5471 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!qn", name = "d", descriptor = "()Lclient!ll;", line = 1237)
	@Override
	public Class2_Sub12 method4979() {
		return null;
	}

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "([IIIII)I", line = 1325)
	private int method5015(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt5471 <= 0) {
				if (this.anInt5477 == 256 && (this.anInt5478 & 0xFF) == 0) {
					if (Static329.aBoolean93) {
						return Static392.method4981(((Class2_Sub21_Sub1) super.aClass2_Sub21_5).aByteArray31, arg0, this.anInt5478, arg1, this.anInt5469, this.anInt5470, arg3, arg2, this);
					}
					return Static392.method4994(((Class2_Sub21_Sub1) super.aClass2_Sub21_5).aByteArray31, arg0, this.anInt5478, arg1, this.anInt5476, arg3, arg2, this);
				}
				if (Static329.aBoolean93) {
					return Static392.method5004(((Class2_Sub21_Sub1) super.aClass2_Sub21_5).aByteArray31, arg0, this.anInt5478, arg1, this.anInt5469, this.anInt5470, arg3, arg2, this, this.anInt5477, arg4);
				}
				return Static392.method5009(((Class2_Sub21_Sub1) super.aClass2_Sub21_5).aByteArray31, arg0, this.anInt5478, arg1, this.anInt5476, arg3, arg2, this, this.anInt5477, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt5471;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt5471 += arg1;
			if (this.anInt5477 == 256 && (this.anInt5478 & 0xFF) == 0) {
				if (Static329.aBoolean93) {
					arg1 = Static392.method4988(((Class2_Sub21_Sub1) super.aClass2_Sub21_5).aByteArray31, arg0, this.anInt5478, arg1, this.anInt5469, this.anInt5470, this.anInt5472, this.anInt5473, local5, arg2, this);
				} else {
					arg1 = Static392.method5010(((Class2_Sub21_Sub1) super.aClass2_Sub21_5).aByteArray31, arg0, this.anInt5478, arg1, this.anInt5476, this.anInt5468, local5, arg2, this);
				}
			} else if (Static329.aBoolean93) {
				arg1 = Static392.method4993(((Class2_Sub21_Sub1) super.aClass2_Sub21_5).aByteArray31, arg0, this.anInt5478, arg1, this.anInt5469, this.anInt5470, this.anInt5472, this.anInt5473, local5, arg2, this, this.anInt5477, arg4);
			} else {
				arg1 = Static392.method5012(((Class2_Sub21_Sub1) super.aClass2_Sub21_5).aByteArray31, arg0, this.anInt5478, arg1, this.anInt5476, this.anInt5468, local5, arg2, this, this.anInt5477, arg4);
			}
			this.anInt5471 -= arg1;
			if (this.anInt5471 != 0) {
				return arg1;
			}
		} while (!this.method4989());
		return arg3;
	}

	@OriginalMember(owner = "client!qn", name = "g", descriptor = "(I)V", line = 1382)
	public synchronized void method5016(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class2_Sub21_Sub1) super.aClass2_Sub21_5).aByteArray31.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt5478 = arg0;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "()Lclient!ll;", line = 1393)
	@Override
	public Class2_Sub12 method4973() {
		return null;
	}

	@OriginalMember(owner = "client!qn", name = "h", descriptor = "(I)V", line = 1454)
	private synchronized void method5019() {
		this.method5011(0, this.method4987());
	}
}
