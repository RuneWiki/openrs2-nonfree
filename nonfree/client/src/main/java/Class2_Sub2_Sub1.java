import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ea")
public final class Class2_Sub2_Sub1 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ea", name = "z", descriptor = "I")
	public int anInt615;

	@OriginalMember(owner = "client!ea", name = "A", descriptor = "I")
	private int anInt616;

	@OriginalMember(owner = "client!ea", name = "F", descriptor = "I")
	public int anInt619;

	@OriginalMember(owner = "client!ea", name = "G", descriptor = "I")
	public int anInt620;

	@OriginalMember(owner = "client!ea", name = "I", descriptor = "I")
	private int anInt621;

	@OriginalMember(owner = "client!ea", name = "K", descriptor = "I")
	public int anInt623;

	@OriginalMember(owner = "client!ea", name = "L", descriptor = "I")
	public int anInt624;

	@OriginalMember(owner = "client!ea", name = "M", descriptor = "I")
	public int anInt625;

	@OriginalMember(owner = "client!ea", name = "N", descriptor = "I")
	private final int anInt626;

	@OriginalMember(owner = "client!ea", name = "x", descriptor = "I")
	private final int anInt613;

	@OriginalMember(owner = "client!ea", name = "w", descriptor = "Z")
	private final boolean aBoolean23;

	@OriginalMember(owner = "client!ea", name = "y", descriptor = "I")
	private int anInt614;

	@OriginalMember(owner = "client!ea", name = "B", descriptor = "I")
	private int anInt617;

	@OriginalMember(owner = "client!ea", name = "D", descriptor = "I")
	private int anInt618;

	@OriginalMember(owner = "client!ea", name = "J", descriptor = "I")
	public int anInt622;

	@OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(Lclient!hb;II)V")
	public Class2_Sub2_Sub1(@OriginalArg(0) Class2_Sub5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass2_Sub5_5 = arg0;
		this.anInt626 = arg0.anInt1044;
		this.anInt613 = arg0.anInt1043;
		this.aBoolean23 = arg0.aBoolean43;
		this.anInt614 = arg1;
		this.anInt617 = arg2;
		this.anInt618 = 8192;
		this.anInt622 = 0;
		this.method510();
	}

	@OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(Lclient!hb;III)V")
	public Class2_Sub2_Sub1(@OriginalArg(0) Class2_Sub5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass2_Sub5_5 = arg0;
		this.anInt626 = arg0.anInt1044;
		this.anInt613 = arg0.anInt1043;
		this.aBoolean23 = arg0.aBoolean43;
		this.anInt614 = arg1;
		this.anInt617 = arg2;
		this.anInt618 = arg3;
		this.anInt622 = 0;
		this.method510();
	}

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(III)V")
	public synchronized void method480(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method502(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static137.method485(arg1, arg2);
		@Pc(14) int local14 = Static137.method483(arg1, arg2);
		if (this.anInt615 == local10 && this.anInt620 == local14) {
			this.anInt621 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt624;
		if (this.anInt624 - arg1 > local31) {
			local31 = this.anInt624 - arg1;
		}
		if (local10 - this.anInt615 > local31) {
			local31 = local10 - this.anInt615;
		}
		if (this.anInt615 - local10 > local31) {
			local31 = this.anInt615 - local10;
		}
		if (local14 - this.anInt620 > local31) {
			local31 = local14 - this.anInt620;
		}
		if (this.anInt620 - local14 > local31) {
			local31 = this.anInt620 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt621 = arg0;
		this.anInt617 = arg1;
		this.anInt618 = arg2;
		this.anInt619 = (arg1 - this.anInt624) / arg0;
		this.anInt623 = (local10 - this.anInt615) / arg0;
		this.anInt625 = (local14 - this.anInt620) / arg0;
	}

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "(I)V")
	public synchronized void method484(@OriginalArg(0) int arg0) {
		if (this.anInt614 < 0) {
			this.anInt614 = -arg0;
		} else {
			this.anInt614 = arg0;
		}
	}

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "()I")
	@Override
	public int method1767() {
		@Pc(6) int local6 = this.anInt624 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt616 == 0) {
			local6 -= local6 * this.anInt622 / (((Class2_Sub5_Sub1) super.aClass2_Sub5_5).aByteArray18.length << 8);
		} else if (this.anInt616 >= 0) {
			local6 -= local6 * this.anInt626 / ((Class2_Sub5_Sub1) super.aClass2_Sub5_5).aByteArray18.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!ea", name = "e", descriptor = "()I")
	public synchronized int method488() {
		return this.anInt618 < 0 ? -1 : this.anInt618;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "()I")
	@Override
	public int method1763() {
		return this.anInt617 == 0 && this.anInt621 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!ea", name = "f", descriptor = "()V")
	private void method492() {
		if (this.anInt621 == 0) {
			return;
		}
		if (this.anInt617 == Integer.MIN_VALUE) {
			this.anInt617 = 0;
		}
		this.anInt621 = 0;
		this.method510();
	}

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "()Lclient!ad;")
	@Override
	public Class2_Sub2 method1766() {
		return null;
	}

	@OriginalMember(owner = "client!ea", name = "g", descriptor = "()I")
	public synchronized int method495() {
		return this.anInt617 == Integer.MIN_VALUE ? 0 : this.anInt617;
	}

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method1765(@OriginalArg(0) int arg0) {
		if (this.anInt621 > 0) {
			if (arg0 >= this.anInt621) {
				if (this.anInt617 == Integer.MIN_VALUE) {
					this.anInt617 = 0;
					this.anInt624 = this.anInt615 = this.anInt620 = 0;
					this.method2053();
					arg0 = this.anInt621;
				}
				this.anInt621 = 0;
				this.method510();
			} else {
				this.anInt624 += this.anInt619 * arg0;
				this.anInt615 += this.anInt623 * arg0;
				this.anInt620 += this.anInt625 * arg0;
				this.anInt621 -= arg0;
			}
		}
		@Pc(71) Class2_Sub5_Sub1 local71 = (Class2_Sub5_Sub1) super.aClass2_Sub5_5;
		@Pc(76) int local76 = this.anInt626 << 8;
		@Pc(81) int local81 = this.anInt613 << 8;
		@Pc(87) int local87 = local71.aByteArray18.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt616 = 0;
		}
		if (this.anInt622 < 0) {
			if (this.anInt614 <= 0) {
				this.method492();
				this.method2053();
				return;
			}
			this.anInt622 = 0;
		}
		if (this.anInt622 >= local87) {
			if (this.anInt614 >= 0) {
				this.method492();
				this.method2053();
				return;
			}
			this.anInt622 = local87 - 1;
		}
		this.anInt622 += this.anInt614 * arg0;
		if (this.anInt616 >= 0) {
			if (this.anInt616 > 0) {
				if (this.aBoolean23) {
					label125: {
						if (this.anInt614 < 0) {
							if (this.anInt622 >= local76) {
								return;
							}
							this.anInt622 = local76 + local76 - this.anInt622 - 1;
							this.anInt614 = -this.anInt614;
							if (--this.anInt616 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt622 < local81) {
								return;
							}
							this.anInt622 = local81 + local81 - this.anInt622 - 1;
							this.anInt614 = -this.anInt614;
							if (--this.anInt616 == 0) {
								break;
							}
							if (this.anInt622 >= local76) {
								return;
							}
							this.anInt622 = local76 + local76 - this.anInt622 - 1;
							this.anInt614 = -this.anInt614;
						} while (--this.anInt616 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt614 < 0) {
						if (this.anInt622 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt622 - 1) / local91;
						if (local361 < this.anInt616) {
							this.anInt622 += local91 * local361;
							this.anInt616 -= local361;
							return;
						}
						this.anInt622 += local91 * this.anInt616;
						this.anInt616 = 0;
					} else if (this.anInt622 >= local81) {
						local361 = (this.anInt622 - local76) / local91;
						if (local361 < this.anInt616) {
							this.anInt622 -= local91 * local361;
							this.anInt616 -= local361;
							return;
						}
						this.anInt622 -= local91 * this.anInt616;
						this.anInt616 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt614 < 0) {
				if (this.anInt622 < 0) {
					this.anInt622 = -1;
					this.method492();
					this.method2053();
					return;
				}
			} else if (this.anInt622 >= local87) {
				this.anInt622 = local87;
				this.method492();
				this.method2053();
			}
		} else if (this.aBoolean23) {
			if (this.anInt614 < 0) {
				if (this.anInt622 >= local76) {
					return;
				}
				this.anInt622 = local76 + local76 - this.anInt622 - 1;
				this.anInt614 = -this.anInt614;
			}
			while (this.anInt622 >= local81) {
				this.anInt622 = local81 + local81 - this.anInt622 - 1;
				this.anInt614 = -this.anInt614;
				if (this.anInt622 >= local76) {
					return;
				}
				this.anInt622 = local76 + local76 - this.anInt622 - 1;
				this.anInt614 = -this.anInt614;
			}
		} else if (this.anInt614 < 0) {
			if (this.anInt622 < local76) {
				this.anInt622 = local81 - (local81 - 1 - this.anInt622) % local91 - 1;
			}
		} else if (this.anInt622 >= local81) {
			this.anInt622 = local76 + (this.anInt622 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!ea", name = "h", descriptor = "()Z")
	private boolean method498() {
		@Pc(2) int local2 = this.anInt617;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static137.method485(local2, this.anInt618);
			local8 = Static137.method483(local2, this.anInt618);
		}
		if (this.anInt624 != local2 || this.anInt615 != local10 || this.anInt620 != local8) {
			if (this.anInt624 < local2) {
				this.anInt619 = 1;
				this.anInt621 = local2 - this.anInt624;
			} else if (this.anInt624 > local2) {
				this.anInt619 = -1;
				this.anInt621 = this.anInt624 - local2;
			} else {
				this.anInt619 = 0;
			}
			if (this.anInt615 < local10) {
				this.anInt623 = 1;
				if (this.anInt621 == 0 || this.anInt621 > local10 - this.anInt615) {
					this.anInt621 = local10 - this.anInt615;
				}
			} else if (this.anInt615 > local10) {
				this.anInt623 = -1;
				if (this.anInt621 == 0 || this.anInt621 > this.anInt615 - local10) {
					this.anInt621 = this.anInt615 - local10;
				}
			} else {
				this.anInt623 = 0;
			}
			if (this.anInt620 < local8) {
				this.anInt625 = 1;
				if (this.anInt621 == 0 || this.anInt621 > local8 - this.anInt620) {
					this.anInt621 = local8 - this.anInt620;
				}
			} else if (this.anInt620 > local8) {
				this.anInt625 = -1;
				if (this.anInt621 == 0 || this.anInt621 > this.anInt620 - local8) {
					this.anInt621 = this.anInt620 - local8;
				}
			} else {
				this.anInt625 = 0;
			}
			return false;
		} else if (this.anInt617 == Integer.MIN_VALUE) {
			this.anInt617 = 0;
			this.anInt624 = this.anInt615 = this.anInt620 = 0;
			this.method2053();
			return true;
		} else {
			this.method510();
			return false;
		}
	}

	@OriginalMember(owner = "client!ea", name = "d", descriptor = "()Lclient!ad;")
	@Override
	public Class2_Sub2 method1769() {
		return null;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "([IIIII)I")
	private int method499(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt621 <= 0) {
				if (this.anInt614 == -256 && (this.anInt622 & 0xFF) == 0) {
					if (Static28.aBoolean29) {
						return Static137.method486(((Class2_Sub5_Sub1) super.aClass2_Sub5_5).aByteArray18, arg0, this.anInt622, arg1, this.anInt615, this.anInt620, arg3, arg2, this);
					}
					return Static137.method490(((Class2_Sub5_Sub1) super.aClass2_Sub5_5).aByteArray18, arg0, this.anInt622, arg1, this.anInt624, arg3, arg2, this);
				}
				if (Static28.aBoolean29) {
					return Static137.method477(((Class2_Sub5_Sub1) super.aClass2_Sub5_5).aByteArray18, arg0, this.anInt622, arg1, this.anInt615, this.anInt620, arg3, arg2, this, this.anInt614, arg4);
				}
				return Static137.method494(((Class2_Sub5_Sub1) super.aClass2_Sub5_5).aByteArray18, arg0, this.anInt622, arg1, this.anInt624, arg3, arg2, this, this.anInt614, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt621;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt621 += arg1;
			if (this.anInt614 == -256 && (this.anInt622 & 0xFF) == 0) {
				if (Static28.aBoolean29) {
					arg1 = Static137.method489(((Class2_Sub5_Sub1) super.aClass2_Sub5_5).aByteArray18, arg0, this.anInt622, arg1, this.anInt615, this.anInt620, this.anInt623, this.anInt625, local5, arg2, this);
				} else {
					arg1 = Static137.method491(((Class2_Sub5_Sub1) super.aClass2_Sub5_5).aByteArray18, arg0, this.anInt622, arg1, this.anInt624, this.anInt619, local5, arg2, this);
				}
			} else if (Static28.aBoolean29) {
				arg1 = Static137.method478(((Class2_Sub5_Sub1) super.aClass2_Sub5_5).aByteArray18, arg0, this.anInt622, arg1, this.anInt615, this.anInt620, this.anInt623, this.anInt625, local5, arg2, this, this.anInt614, arg4);
			} else {
				arg1 = Static137.method487(((Class2_Sub5_Sub1) super.aClass2_Sub5_5).aByteArray18, arg0, this.anInt622, arg1, this.anInt624, this.anInt619, local5, arg2, this, this.anInt614, arg4);
			}
			this.anInt621 -= arg1;
			if (this.anInt621 != 0) {
				return arg1;
			}
		} while (!this.method498());
		return arg3;
	}

	@OriginalMember(owner = "client!ea", name = "i", descriptor = "()I")
	public synchronized int method500() {
		return this.anInt614 < 0 ? -this.anInt614 : this.anInt614;
	}

	@OriginalMember(owner = "client!ea", name = "d", descriptor = "(I)V")
	public synchronized void method501(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method514();
			this.method2053();
		} else if (this.anInt615 == 0 && this.anInt620 == 0) {
			this.anInt621 = 0;
			this.anInt617 = 0;
			this.anInt624 = 0;
			this.method2053();
		} else {
			@Pc(31) int local31 = -this.anInt624;
			if (this.anInt624 > local31) {
				local31 = this.anInt624;
			}
			if (-this.anInt615 > local31) {
				local31 = -this.anInt615;
			}
			if (this.anInt615 > local31) {
				local31 = this.anInt615;
			}
			if (-this.anInt620 > local31) {
				local31 = -this.anInt620;
			}
			if (this.anInt620 > local31) {
				local31 = this.anInt620;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt621 = arg0;
			this.anInt617 = Integer.MIN_VALUE;
			this.anInt619 = -this.anInt624 / arg0;
			this.anInt623 = -this.anInt615 / arg0;
			this.anInt625 = -this.anInt620 / arg0;
		}
	}

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "(II)V")
	private synchronized void method502(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt617 = arg0;
		this.anInt618 = arg1;
		this.anInt621 = 0;
		this.method510();
	}

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "([IIIII)I")
	private int method503(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt621 <= 0) {
				if (this.anInt614 == 256 && (this.anInt622 & 0xFF) == 0) {
					if (Static28.aBoolean29) {
						return Static137.method497(((Class2_Sub5_Sub1) super.aClass2_Sub5_5).aByteArray18, arg0, this.anInt622, arg1, this.anInt615, this.anInt620, arg3, arg2, this);
					}
					return Static137.method481(((Class2_Sub5_Sub1) super.aClass2_Sub5_5).aByteArray18, arg0, this.anInt622, arg1, this.anInt624, arg3, arg2, this);
				}
				if (Static28.aBoolean29) {
					return Static137.method506(((Class2_Sub5_Sub1) super.aClass2_Sub5_5).aByteArray18, arg0, this.anInt622, arg1, this.anInt615, this.anInt620, arg3, arg2, this, this.anInt614, arg4);
				}
				return Static137.method475(((Class2_Sub5_Sub1) super.aClass2_Sub5_5).aByteArray18, arg0, this.anInt622, arg1, this.anInt624, arg3, arg2, this, this.anInt614, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt621;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt621 += arg1;
			if (this.anInt614 == 256 && (this.anInt622 & 0xFF) == 0) {
				if (Static28.aBoolean29) {
					arg1 = Static137.method479(((Class2_Sub5_Sub1) super.aClass2_Sub5_5).aByteArray18, arg0, this.anInt622, arg1, this.anInt615, this.anInt620, this.anInt623, this.anInt625, local5, arg2, this);
				} else {
					arg1 = Static137.method476(((Class2_Sub5_Sub1) super.aClass2_Sub5_5).aByteArray18, arg0, this.anInt622, arg1, this.anInt624, this.anInt619, local5, arg2, this);
				}
			} else if (Static28.aBoolean29) {
				arg1 = Static137.method482(((Class2_Sub5_Sub1) super.aClass2_Sub5_5).aByteArray18, arg0, this.anInt622, arg1, this.anInt615, this.anInt620, this.anInt623, this.anInt625, local5, arg2, this, this.anInt614, arg4);
			} else {
				arg1 = Static137.method496(((Class2_Sub5_Sub1) super.aClass2_Sub5_5).aByteArray18, arg0, this.anInt622, arg1, this.anInt624, this.anInt619, local5, arg2, this, this.anInt614, arg4);
			}
			this.anInt621 -= arg1;
			if (this.anInt621 != 0) {
				return arg1;
			}
		} while (!this.method498());
		return arg3;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Z)V")
	public synchronized void method504() {
		this.anInt614 = (this.anInt614 ^ this.anInt614 >> 31) + (this.anInt614 >>> 31);
		this.anInt614 = -this.anInt614;
	}

	@OriginalMember(owner = "client!ea", name = "j", descriptor = "()Z")
	public boolean method505() {
		return this.anInt622 < 0 || this.anInt622 >= ((Class2_Sub5_Sub1) super.aClass2_Sub5_5).aByteArray18.length << 8;
	}

	@OriginalMember(owner = "client!ea", name = "k", descriptor = "()Z")
	public boolean method507() {
		return this.anInt621 != 0;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method1764(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt617 == 0 && this.anInt621 == 0) {
			this.method1765(arg2);
			return;
		}
		@Pc(13) Class2_Sub5_Sub1 local13 = (Class2_Sub5_Sub1) super.aClass2_Sub5_5;
		@Pc(18) int local18 = this.anInt626 << 8;
		@Pc(23) int local23 = this.anInt613 << 8;
		@Pc(29) int local29 = local13.aByteArray18.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt616 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt622 < 0) {
			if (this.anInt614 <= 0) {
				this.method492();
				this.method2053();
				return;
			}
			this.anInt622 = 0;
		}
		if (this.anInt622 >= local29) {
			if (this.anInt614 >= 0) {
				this.method492();
				this.method2053();
				return;
			}
			this.anInt622 = local29 - 1;
		}
		if (this.anInt616 >= 0) {
			if (this.anInt616 > 0) {
				if (this.aBoolean23) {
					label130: {
						if (this.anInt614 < 0) {
							local40 = this.method499(arg0, arg1, local18, local44, local13.aByteArray18[this.anInt626]);
							if (this.anInt622 >= local18) {
								return;
							}
							this.anInt622 = local18 + local18 - this.anInt622 - 1;
							this.anInt614 = -this.anInt614;
							if (--this.anInt616 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method503(arg0, local40, local23, local44, local13.aByteArray18[this.anInt613 - 1]);
							if (this.anInt622 < local23) {
								return;
							}
							this.anInt622 = local23 + local23 - this.anInt622 - 1;
							this.anInt614 = -this.anInt614;
							if (--this.anInt616 == 0) {
								break;
							}
							local40 = this.method499(arg0, local40, local18, local44, local13.aByteArray18[this.anInt626]);
							if (this.anInt622 >= local18) {
								return;
							}
							this.anInt622 = local18 + local18 - this.anInt622 - 1;
							this.anInt614 = -this.anInt614;
						} while (--this.anInt616 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt614 < 0) {
						while (true) {
							local40 = this.method499(arg0, local40, local18, local44, local13.aByteArray18[this.anInt613 - 1]);
							if (this.anInt622 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt622 - 1) / local33;
							if (local416 >= this.anInt616) {
								this.anInt622 += local33 * this.anInt616;
								this.anInt616 = 0;
								break;
							}
							this.anInt622 += local33 * local416;
							this.anInt616 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method503(arg0, local40, local23, local44, local13.aByteArray18[this.anInt626]);
							if (this.anInt622 < local23) {
								return;
							}
							local416 = (this.anInt622 - local18) / local33;
							if (local416 >= this.anInt616) {
								this.anInt622 -= local33 * this.anInt616;
								this.anInt616 = 0;
								break;
							}
							this.anInt622 -= local33 * local416;
							this.anInt616 -= local416;
						}
					}
				}
			}
			if (this.anInt614 < 0) {
				this.method499(arg0, local40, 0, local44, 0);
				if (this.anInt622 < 0) {
					this.anInt622 = -1;
					this.method492();
					this.method2053();
					return;
				}
			} else {
				this.method503(arg0, local40, local29, local44, 0);
				if (this.anInt622 >= local29) {
					this.anInt622 = local29;
					this.method492();
					this.method2053();
				}
			}
		} else if (this.aBoolean23) {
			if (this.anInt614 < 0) {
				local40 = this.method499(arg0, arg1, local18, local44, local13.aByteArray18[this.anInt626]);
				if (this.anInt622 >= local18) {
					return;
				}
				this.anInt622 = local18 + local18 - this.anInt622 - 1;
				this.anInt614 = -this.anInt614;
			}
			while (true) {
				local40 = this.method503(arg0, local40, local23, local44, local13.aByteArray18[this.anInt613 - 1]);
				if (this.anInt622 < local23) {
					return;
				}
				this.anInt622 = local23 + local23 - this.anInt622 - 1;
				this.anInt614 = -this.anInt614;
				local40 = this.method499(arg0, local40, local18, local44, local13.aByteArray18[this.anInt626]);
				if (this.anInt622 >= local18) {
					return;
				}
				this.anInt622 = local18 + local18 - this.anInt622 - 1;
				this.anInt614 = -this.anInt614;
			}
		} else if (this.anInt614 < 0) {
			while (true) {
				local40 = this.method499(arg0, local40, local18, local44, local13.aByteArray18[this.anInt613 - 1]);
				if (this.anInt622 >= local18) {
					return;
				}
				this.anInt622 = local23 - (local23 - 1 - this.anInt622) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method503(arg0, local40, local23, local44, local13.aByteArray18[this.anInt626]);
				if (this.anInt622 < local23) {
					return;
				}
				this.anInt622 = local18 + (this.anInt622 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!ea", name = "d", descriptor = "(II)V")
	public synchronized void method509(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method480(arg0, arg1, this.method488());
	}

	@OriginalMember(owner = "client!ea", name = "l", descriptor = "()V")
	private void method510() {
		this.anInt624 = this.anInt617;
		this.anInt615 = Static137.method485(this.anInt617, this.anInt618);
		this.anInt620 = Static137.method483(this.anInt617, this.anInt618);
	}

	@OriginalMember(owner = "client!ea", name = "e", descriptor = "(I)V")
	public synchronized void method511(@OriginalArg(0) int arg0) {
		this.anInt616 = arg0;
	}

	@OriginalMember(owner = "client!ea", name = "f", descriptor = "(I)V")
	public synchronized void method512(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class2_Sub5_Sub1) super.aClass2_Sub5_5).aByteArray18.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt622 = arg0;
	}

	@OriginalMember(owner = "client!ea", name = "g", descriptor = "(I)V")
	public synchronized void method513(@OriginalArg(0) int arg0) {
		this.method502(arg0 << 6, this.method488());
	}

	@OriginalMember(owner = "client!ea", name = "h", descriptor = "(I)V")
	private synchronized void method514() {
		this.method502(0, this.method488());
	}
}
