import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bd")
public final class Class1_Sub4_Sub1 extends Class1_Sub4 {

	@OriginalMember(owner = "client!bd", name = "p", descriptor = "I")
	private int anInt264;

	@OriginalMember(owner = "client!bd", name = "q", descriptor = "I")
	public int anInt265;

	@OriginalMember(owner = "client!bd", name = "r", descriptor = "I")
	private int anInt266;

	@OriginalMember(owner = "client!bd", name = "u", descriptor = "I")
	public int anInt269;

	@OriginalMember(owner = "client!bd", name = "v", descriptor = "I")
	public int anInt270;

	@OriginalMember(owner = "client!bd", name = "y", descriptor = "I")
	public int anInt272;

	@OriginalMember(owner = "client!bd", name = "B", descriptor = "I")
	public int anInt275;

	@OriginalMember(owner = "client!bd", name = "C", descriptor = "I")
	public int anInt276;

	@OriginalMember(owner = "client!bd", name = "t", descriptor = "I")
	private int anInt268;

	@OriginalMember(owner = "client!bd", name = "z", descriptor = "I")
	private int anInt273;

	@OriginalMember(owner = "client!bd", name = "x", descriptor = "Z")
	private boolean aBoolean16;

	@OriginalMember(owner = "client!bd", name = "A", descriptor = "I")
	private int anInt274;

	@OriginalMember(owner = "client!bd", name = "w", descriptor = "I")
	private int anInt271;

	@OriginalMember(owner = "client!bd", name = "s", descriptor = "I")
	private int anInt267;

	@OriginalMember(owner = "client!bd", name = "D", descriptor = "I")
	public int anInt277;

	@OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(Lclient!d;II)V")
	public Class1_Sub4_Sub1(@OriginalArg(0) Class1_Sub7_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass1_Sub7_5 = arg0;
		this.anInt268 = arg0.anInt810;
		this.anInt273 = arg0.anInt809;
		this.aBoolean16 = arg0.aBoolean65;
		this.anInt274 = arg1;
		this.anInt271 = arg2;
		this.anInt267 = 8192;
		this.anInt277 = 0;
		this.method273();
	}

	@OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(Lclient!d;III)V")
	public Class1_Sub4_Sub1(@OriginalArg(0) Class1_Sub7_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass1_Sub7_5 = arg0;
		this.anInt268 = arg0.anInt810;
		this.anInt273 = arg0.anInt809;
		this.aBoolean16 = arg0.aBoolean65;
		this.anInt274 = arg1;
		this.anInt271 = arg2;
		this.anInt267 = arg3;
		this.anInt277 = 0;
		this.method273();
	}

	@OriginalMember(owner = "client!bd", name = "e", descriptor = "(I)V")
	public synchronized void method241(@OriginalArg(0) int arg0) {
		this.anInt266 = arg0;
	}

	@OriginalMember(owner = "client!bd", name = "f", descriptor = "(I)V")
	public synchronized void method242(@OriginalArg(0) int arg0) {
		this.method245(arg0 << 6, this.method262());
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "()I")
	@Override
	public int method4188() {
		return this.anInt271 == 0 && this.anInt264 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!bd", name = "e", descriptor = "()I")
	public synchronized int method244() {
		return this.anInt274 < 0 ? -this.anInt274 : this.anInt274;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(II)V")
	private synchronized void method245(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt271 = arg0;
		this.anInt267 = arg1;
		this.anInt264 = 0;
		this.method273();
	}

	@OriginalMember(owner = "client!bd", name = "g", descriptor = "(I)V")
	public synchronized void method247(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class1_Sub7_Sub1) this.aClass1_Sub7_5).aByteArray5.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt277 = arg0;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "([IIIII)I")
	private int method248(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		while (true) {
			if (this.anInt264 > 0) {
				@Pc(7) int local7 = arg1 + this.anInt264;
				if (local7 > arg3) {
					local7 = arg3;
				}
				this.anInt264 += arg1;
				if (this.anInt274 == -256 && (this.anInt277 & 0xFF) == 0) {
					if (Static64.aBoolean221) {
						arg1 = Static317.method261(((Class1_Sub7_Sub1) this.aClass1_Sub7_5).aByteArray5, arg0, this.anInt277, arg1, this.anInt275, this.anInt272, this.anInt276, this.anInt265, local7, arg2, this);
					} else {
						arg1 = Static317.method276(((Class1_Sub7_Sub1) this.aClass1_Sub7_5).aByteArray5, arg0, this.anInt277, arg1, this.anInt269, this.anInt270, local7, arg2, this);
					}
				} else if (Static64.aBoolean221) {
					arg1 = Static317.method266(((Class1_Sub7_Sub1) this.aClass1_Sub7_5).aByteArray5, arg0, this.anInt277, arg1, this.anInt275, this.anInt272, this.anInt276, this.anInt265, local7, arg2, this, this.anInt274, arg4);
				} else {
					arg1 = Static317.method260(((Class1_Sub7_Sub1) this.aClass1_Sub7_5).aByteArray5, arg0, this.anInt277, arg1, this.anInt269, this.anInt270, local7, arg2, this, this.anInt274, arg4);
				}
				this.anInt264 -= arg1;
				if (this.anInt264 != 0) {
					return arg1;
				}
				if (!this.method278()) {
					continue;
				}
				return arg3;
			}
			if (this.anInt274 == -256 && (this.anInt277 & 0xFF) == 0) {
				if (Static64.aBoolean221) {
					return Static317.method257(((Class1_Sub7_Sub1) this.aClass1_Sub7_5).aByteArray5, arg0, this.anInt277, arg1, this.anInt275, this.anInt272, arg3, arg2, this);
				}
				return Static317.method268(((Class1_Sub7_Sub1) this.aClass1_Sub7_5).aByteArray5, arg0, this.anInt277, arg1, this.anInt269, arg3, arg2, this);
			}
			if (Static64.aBoolean221) {
				return Static317.method243(((Class1_Sub7_Sub1) this.aClass1_Sub7_5).aByteArray5, arg0, this.anInt277, arg1, this.anInt275, this.anInt272, arg3, arg2, this, this.anInt274, arg4);
			}
			return Static317.method277(((Class1_Sub7_Sub1) this.aClass1_Sub7_5).aByteArray5, arg0, this.anInt277, arg1, this.anInt269, arg3, arg2, this, this.anInt274, arg4);
		}
	}

	@OriginalMember(owner = "client!bd", name = "f", descriptor = "()Z")
	public boolean method250() {
		return this.anInt264 != 0;
	}

	@OriginalMember(owner = "client!bd", name = "g", descriptor = "()I")
	public synchronized int method251() {
		return this.anInt271 == Integer.MIN_VALUE ? 0 : this.anInt271;
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "(II)V")
	public synchronized void method254(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method267(arg0, arg1, this.method262());
	}

	@OriginalMember(owner = "client!bd", name = "h", descriptor = "()V")
	private void method255() {
		if (this.anInt264 == 0) {
			return;
		}
		if (this.anInt271 == Integer.MIN_VALUE) {
			this.anInt271 = 0;
		}
		this.anInt264 = 0;
		this.method273();
	}

	@OriginalMember(owner = "client!bd", name = "d", descriptor = "()I")
	@Override
	public int method4191() {
		@Pc(6) int local6 = this.anInt269 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt266 == 0) {
			local6 -= local6 * this.anInt277 / (((Class1_Sub7_Sub1) this.aClass1_Sub7_5).aByteArray5.length << 8);
		} else if (this.anInt266 >= 0) {
			local6 -= local6 * this.anInt268 / ((Class1_Sub7_Sub1) this.aClass1_Sub7_5).aByteArray5.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!bd", name = "h", descriptor = "(I)V")
	private synchronized void method256() {
		this.method245(0, this.method262());
	}

	@OriginalMember(owner = "client!bd", name = "i", descriptor = "()Z")
	public boolean method258() {
		return this.anInt277 < 0 || this.anInt277 >= ((Class1_Sub7_Sub1) this.aClass1_Sub7_5).aByteArray5.length << 8;
	}

	@OriginalMember(owner = "client!bd", name = "i", descriptor = "(I)V")
	public synchronized void method259(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method256();
			this.method4616();
		} else if (this.anInt275 == 0 && this.anInt272 == 0) {
			this.anInt264 = 0;
			this.anInt271 = 0;
			this.anInt269 = 0;
			this.method4616();
		} else {
			@Pc(31) int local31 = -this.anInt269;
			if (this.anInt269 > local31) {
				local31 = this.anInt269;
			}
			if (-this.anInt275 > local31) {
				local31 = -this.anInt275;
			}
			if (this.anInt275 > local31) {
				local31 = this.anInt275;
			}
			if (-this.anInt272 > local31) {
				local31 = -this.anInt272;
			}
			if (this.anInt272 > local31) {
				local31 = this.anInt272;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt264 = arg0;
			this.anInt271 = Integer.MIN_VALUE;
			this.anInt270 = -this.anInt269 / arg0;
			this.anInt276 = -this.anInt275 / arg0;
			this.anInt265 = -this.anInt272 / arg0;
		}
	}

	@OriginalMember(owner = "client!bd", name = "j", descriptor = "()I")
	public synchronized int method262() {
		return this.anInt267 < 0 ? -1 : this.anInt267;
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "([IIIII)I")
	private int method264(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		while (true) {
			if (this.anInt264 > 0) {
				@Pc(7) int local7 = arg1 + this.anInt264;
				if (local7 > arg3) {
					local7 = arg3;
				}
				this.anInt264 += arg1;
				if (this.anInt274 == 256 && (this.anInt277 & 0xFF) == 0) {
					if (Static64.aBoolean221) {
						arg1 = Static317.method274(((Class1_Sub7_Sub1) this.aClass1_Sub7_5).aByteArray5, arg0, this.anInt277, arg1, this.anInt275, this.anInt272, this.anInt276, this.anInt265, local7, arg2, this);
					} else {
						arg1 = Static317.method249(((Class1_Sub7_Sub1) this.aClass1_Sub7_5).aByteArray5, arg0, this.anInt277, arg1, this.anInt269, this.anInt270, local7, arg2, this);
					}
				} else if (Static64.aBoolean221) {
					arg1 = Static317.method246(((Class1_Sub7_Sub1) this.aClass1_Sub7_5).aByteArray5, arg0, this.anInt277, arg1, this.anInt275, this.anInt272, this.anInt276, this.anInt265, local7, arg2, this, this.anInt274, arg4);
				} else {
					arg1 = Static317.method272(((Class1_Sub7_Sub1) this.aClass1_Sub7_5).aByteArray5, arg0, this.anInt277, arg1, this.anInt269, this.anInt270, local7, arg2, this, this.anInt274, arg4);
				}
				this.anInt264 -= arg1;
				if (this.anInt264 != 0) {
					return arg1;
				}
				if (!this.method278()) {
					continue;
				}
				return arg3;
			}
			if (this.anInt274 == 256 && (this.anInt277 & 0xFF) == 0) {
				if (Static64.aBoolean221) {
					return Static317.method279(((Class1_Sub7_Sub1) this.aClass1_Sub7_5).aByteArray5, arg0, this.anInt277, arg1, this.anInt275, this.anInt272, arg3, arg2, this);
				}
				return Static317.method253(((Class1_Sub7_Sub1) this.aClass1_Sub7_5).aByteArray5, arg0, this.anInt277, arg1, this.anInt269, arg3, arg2, this);
			}
			if (Static64.aBoolean221) {
				return Static317.method280(((Class1_Sub7_Sub1) this.aClass1_Sub7_5).aByteArray5, arg0, this.anInt277, arg1, this.anInt275, this.anInt272, arg3, arg2, this, this.anInt274, arg4);
			}
			return Static317.method270(((Class1_Sub7_Sub1) this.aClass1_Sub7_5).aByteArray5, arg0, this.anInt277, arg1, this.anInt269, arg3, arg2, this, this.anInt274, arg4);
		}
	}

	@OriginalMember(owner = "client!bd", name = "c", descriptor = "()Lclient!vc;")
	@Override
	public Class1_Sub4 method4189() {
		return null;
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method4190(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt271 == 0 && this.anInt264 == 0) {
			this.method4192(arg2);
			return;
		}
		@Pc(13) Class1_Sub7_Sub1 local13 = (Class1_Sub7_Sub1) this.aClass1_Sub7_5;
		@Pc(18) int local18 = this.anInt268 << 8;
		@Pc(23) int local23 = this.anInt273 << 8;
		@Pc(29) int local29 = local13.aByteArray5.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt266 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt277 < 0) {
			if (this.anInt274 <= 0) {
				this.method255();
				this.method4616();
				return;
			}
			this.anInt277 = 0;
		}
		if (this.anInt277 >= local29) {
			if (this.anInt274 >= 0) {
				this.method255();
				this.method4616();
				return;
			}
			this.anInt277 = local29 - 1;
		}
		if (this.anInt266 >= 0) {
			if (this.anInt266 > 0) {
				if (this.aBoolean16) {
					label131: {
						if (this.anInt274 < 0) {
							local40 = this.method248(arg0, arg1, local18, local44, local13.aByteArray5[this.anInt268]);
							if (this.anInt277 >= local18) {
								return;
							}
							this.anInt277 = local18 + local18 - this.anInt277 - 1;
							this.anInt274 = -this.anInt274;
							if (--this.anInt266 == 0) {
								break label131;
							}
						}
						do {
							local40 = this.method264(arg0, local40, local23, local44, local13.aByteArray5[this.anInt273 - 1]);
							if (this.anInt277 < local23) {
								return;
							}
							this.anInt277 = local23 + local23 - this.anInt277 - 1;
							this.anInt274 = -this.anInt274;
							if (--this.anInt266 == 0) {
								break;
							}
							local40 = this.method248(arg0, local40, local18, local44, local13.aByteArray5[this.anInt268]);
							if (this.anInt277 >= local18) {
								return;
							}
							this.anInt277 = local18 + local18 - this.anInt277 - 1;
							this.anInt274 = -this.anInt274;
						} while (--this.anInt266 != 0);
					}
				} else {
					@Pc(417) int local417;
					if (this.anInt274 < 0) {
						while (true) {
							local40 = this.method248(arg0, local40, local18, local44, local13.aByteArray5[this.anInt273 - 1]);
							if (this.anInt277 >= local18) {
								return;
							}
							local417 = (local23 - this.anInt277 - 1) / local33;
							if (local417 >= this.anInt266) {
								this.anInt277 += local33 * this.anInt266;
								this.anInt266 = 0;
								break;
							}
							this.anInt277 += local33 * local417;
							this.anInt266 -= local417;
						}
					} else {
						while (true) {
							local40 = this.method264(arg0, local40, local23, local44, local13.aByteArray5[this.anInt268]);
							if (this.anInt277 < local23) {
								return;
							}
							local417 = (this.anInt277 - local18) / local33;
							if (local417 >= this.anInt266) {
								this.anInt277 -= local33 * this.anInt266;
								this.anInt266 = 0;
								break;
							}
							this.anInt277 -= local33 * local417;
							this.anInt266 -= local417;
						}
					}
				}
			}
			if (this.anInt274 < 0) {
				this.method248(arg0, local40, 0, local44, 0);
				if (this.anInt277 < 0) {
					this.anInt277 = -1;
					this.method255();
					this.method4616();
				}
			} else {
				this.method264(arg0, local40, local29, local44, 0);
				if (this.anInt277 >= local29) {
					this.anInt277 = local29;
					this.method255();
					this.method4616();
				}
			}
		} else if (this.aBoolean16) {
			if (this.anInt274 < 0) {
				local40 = this.method248(arg0, arg1, local18, local44, local13.aByteArray5[this.anInt268]);
				if (this.anInt277 >= local18) {
					return;
				}
				this.anInt277 = local18 + local18 - this.anInt277 - 1;
				this.anInt274 = -this.anInt274;
			}
			while (true) {
				local40 = this.method264(arg0, local40, local23, local44, local13.aByteArray5[this.anInt273 - 1]);
				if (this.anInt277 < local23) {
					return;
				}
				this.anInt277 = local23 + local23 - this.anInt277 - 1;
				this.anInt274 = -this.anInt274;
				local40 = this.method248(arg0, local40, local18, local44, local13.aByteArray5[this.anInt268]);
				if (this.anInt277 >= local18) {
					return;
				}
				this.anInt277 = local18 + local18 - this.anInt277 - 1;
				this.anInt274 = -this.anInt274;
			}
		} else if (this.anInt274 < 0) {
			while (true) {
				local40 = this.method248(arg0, local40, local18, local44, local13.aByteArray5[this.anInt273 - 1]);
				if (this.anInt277 >= local18) {
					return;
				}
				this.anInt277 = local23 - (local23 - 1 - this.anInt277) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method264(arg0, local40, local23, local44, local13.aByteArray5[this.anInt268]);
				if (this.anInt277 < local23) {
					return;
				}
				this.anInt277 = local18 + (this.anInt277 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(III)V")
	public synchronized void method267(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method245(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static317.method275(arg1, arg2);
		@Pc(14) int local14 = Static317.method265(arg1, arg2);
		if (this.anInt275 == local10 && this.anInt272 == local14) {
			this.anInt264 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt269;
		if (this.anInt269 - arg1 > local31) {
			local31 = this.anInt269 - arg1;
		}
		if (local10 - this.anInt275 > local31) {
			local31 = local10 - this.anInt275;
		}
		if (this.anInt275 - local10 > local31) {
			local31 = this.anInt275 - local10;
		}
		if (local14 - this.anInt272 > local31) {
			local31 = local14 - this.anInt272;
		}
		if (this.anInt272 - local14 > local31) {
			local31 = this.anInt272 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt264 = arg0;
		this.anInt271 = arg1;
		this.anInt267 = arg2;
		this.anInt270 = (arg1 - this.anInt269) / arg0;
		this.anInt276 = (local10 - this.anInt275) / arg0;
		this.anInt265 = (local14 - this.anInt272) / arg0;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "()Lclient!vc;")
	@Override
	public Class1_Sub4 method4186() {
		return null;
	}

	@OriginalMember(owner = "client!bd", name = "d", descriptor = "(I)V")
	@Override
	public synchronized void method4192(@OriginalArg(0) int arg0) {
		if (this.anInt264 > 0) {
			if (arg0 >= this.anInt264) {
				if (this.anInt271 == Integer.MIN_VALUE) {
					this.anInt271 = 0;
					this.anInt269 = this.anInt275 = this.anInt272 = 0;
					this.method4616();
					arg0 = this.anInt264;
				}
				this.anInt264 = 0;
				this.method273();
			} else {
				this.anInt269 += this.anInt270 * arg0;
				this.anInt275 += this.anInt276 * arg0;
				this.anInt272 += this.anInt265 * arg0;
				this.anInt264 -= arg0;
			}
		}
		@Pc(71) Class1_Sub7_Sub1 local71 = (Class1_Sub7_Sub1) this.aClass1_Sub7_5;
		@Pc(76) int local76 = this.anInt268 << 8;
		@Pc(81) int local81 = this.anInt273 << 8;
		@Pc(87) int local87 = local71.aByteArray5.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt266 = 0;
		}
		if (this.anInt277 < 0) {
			if (this.anInt274 <= 0) {
				this.method255();
				this.method4616();
				return;
			}
			this.anInt277 = 0;
		}
		if (this.anInt277 >= local87) {
			if (this.anInt274 >= 0) {
				this.method255();
				this.method4616();
				return;
			}
			this.anInt277 = local87 - 1;
		}
		this.anInt277 += this.anInt274 * arg0;
		if (this.anInt266 >= 0) {
			if (this.anInt266 > 0) {
				if (this.aBoolean16) {
					label121: {
						if (this.anInt274 < 0) {
							if (this.anInt277 >= local76) {
								return;
							}
							this.anInt277 = local76 + local76 - this.anInt277 - 1;
							this.anInt274 = -this.anInt274;
							if (--this.anInt266 == 0) {
								break label121;
							}
						}
						do {
							if (this.anInt277 < local81) {
								return;
							}
							this.anInt277 = local81 + local81 - this.anInt277 - 1;
							this.anInt274 = -this.anInt274;
							if (--this.anInt266 == 0) {
								break;
							}
							if (this.anInt277 >= local76) {
								return;
							}
							this.anInt277 = local76 + local76 - this.anInt277 - 1;
							this.anInt274 = -this.anInt274;
						} while (--this.anInt266 != 0);
					}
				} else {
					label153: {
						@Pc(362) int local362;
						if (this.anInt274 < 0) {
							if (this.anInt277 >= local76) {
								return;
							}
							local362 = (local81 - this.anInt277 - 1) / local91;
							if (local362 >= this.anInt266) {
								this.anInt277 += local91 * this.anInt266;
								this.anInt266 = 0;
								break label153;
							}
							this.anInt277 += local91 * local362;
							this.anInt266 -= local362;
						} else if (this.anInt277 >= local81) {
							local362 = (this.anInt277 - local76) / local91;
							if (local362 >= this.anInt266) {
								this.anInt277 -= local91 * this.anInt266;
								this.anInt266 = 0;
								break label153;
							}
							this.anInt277 -= local91 * local362;
							this.anInt266 -= local362;
						} else {
							return;
						}
						return;
					}
				}
			}
			if (this.anInt274 < 0) {
				if (this.anInt277 < 0) {
					this.anInt277 = -1;
					this.method255();
					this.method4616();
				}
			} else if (this.anInt277 >= local87) {
				this.anInt277 = local87;
				this.method255();
				this.method4616();
			}
		} else if (this.aBoolean16) {
			if (this.anInt274 < 0) {
				if (this.anInt277 >= local76) {
					return;
				}
				this.anInt277 = local76 + local76 - this.anInt277 - 1;
				this.anInt274 = -this.anInt274;
			}
			while (this.anInt277 >= local81) {
				this.anInt277 = local81 + local81 - this.anInt277 - 1;
				this.anInt274 = -this.anInt274;
				if (this.anInt277 >= local76) {
					return;
				}
				this.anInt277 = local76 + local76 - this.anInt277 - 1;
				this.anInt274 = -this.anInt274;
			}
		} else if (this.anInt274 < 0) {
			if (this.anInt277 >= local76) {
				return;
			}
			this.anInt277 = local81 - (local81 - 1 - this.anInt277) % local91 - 1;
		} else if (this.anInt277 >= local81) {
			this.anInt277 = local76 + (this.anInt277 - local76) % local91;
		} else {
			return;
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Z)V")
	public synchronized void method269() {
		this.anInt274 = (this.anInt274 ^ this.anInt274 >> 31) + (this.anInt274 >>> 31);
		this.anInt274 = -this.anInt274;
	}

	@OriginalMember(owner = "client!bd", name = "j", descriptor = "(I)V")
	public synchronized void method271(@OriginalArg(0) int arg0) {
		if (this.anInt274 < 0) {
			this.anInt274 = -arg0;
		} else {
			this.anInt274 = arg0;
		}
	}

	@OriginalMember(owner = "client!bd", name = "k", descriptor = "()V")
	private void method273() {
		this.anInt269 = this.anInt271;
		this.anInt275 = Static317.method275(this.anInt271, this.anInt267);
		this.anInt272 = Static317.method265(this.anInt271, this.anInt267);
	}

	@OriginalMember(owner = "client!bd", name = "l", descriptor = "()Z")
	private boolean method278() {
		@Pc(2) int local2 = this.anInt271;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static317.method275(local2, this.anInt267);
			local8 = Static317.method265(local2, this.anInt267);
		}
		if (this.anInt269 != local2 || this.anInt275 != local10 || this.anInt272 != local8) {
			if (this.anInt269 < local2) {
				this.anInt270 = 1;
				this.anInt264 = local2 - this.anInt269;
			} else if (this.anInt269 > local2) {
				this.anInt270 = -1;
				this.anInt264 = this.anInt269 - local2;
			} else {
				this.anInt270 = 0;
			}
			if (this.anInt275 < local10) {
				this.anInt276 = 1;
				if (this.anInt264 == 0 || this.anInt264 > local10 - this.anInt275) {
					this.anInt264 = local10 - this.anInt275;
				}
			} else if (this.anInt275 > local10) {
				this.anInt276 = -1;
				if (this.anInt264 == 0 || this.anInt264 > this.anInt275 - local10) {
					this.anInt264 = this.anInt275 - local10;
				}
			} else {
				this.anInt276 = 0;
			}
			if (this.anInt272 < local8) {
				this.anInt265 = 1;
				if (this.anInt264 == 0 || this.anInt264 > local8 - this.anInt272) {
					this.anInt264 = local8 - this.anInt272;
				}
			} else if (this.anInt272 > local8) {
				this.anInt265 = -1;
				if (this.anInt264 == 0 || this.anInt264 > this.anInt272 - local8) {
					this.anInt264 = this.anInt272 - local8;
				}
			} else {
				this.anInt265 = 0;
			}
			return false;
		} else if (this.anInt271 == Integer.MIN_VALUE) {
			this.anInt271 = 0;
			this.anInt269 = this.anInt275 = this.anInt272 = 0;
			this.method4616();
			return true;
		} else {
			this.method273();
			return false;
		}
	}
}
