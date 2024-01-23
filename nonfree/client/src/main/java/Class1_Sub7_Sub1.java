import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cn")
public final class Class1_Sub7_Sub1 extends Class1_Sub7 {

	@OriginalMember(owner = "client!cn", name = "r", descriptor = "I")
	public int anInt994;

	@OriginalMember(owner = "client!cn", name = "s", descriptor = "I")
	public int anInt995;

	@OriginalMember(owner = "client!cn", name = "t", descriptor = "I")
	public int anInt996;

	@OriginalMember(owner = "client!cn", name = "w", descriptor = "I")
	private int anInt998;

	@OriginalMember(owner = "client!cn", name = "x", descriptor = "I")
	public int anInt999;

	@OriginalMember(owner = "client!cn", name = "y", descriptor = "I")
	private int anInt1000;

	@OriginalMember(owner = "client!cn", name = "B", descriptor = "I")
	public int anInt1002;

	@OriginalMember(owner = "client!cn", name = "D", descriptor = "I")
	public int anInt1004;

	@OriginalMember(owner = "client!cn", name = "q", descriptor = "I")
	private int anInt993;

	@OriginalMember(owner = "client!cn", name = "z", descriptor = "I")
	private int anInt1001;

	@OriginalMember(owner = "client!cn", name = "v", descriptor = "Z")
	private boolean aBoolean93;

	@OriginalMember(owner = "client!cn", name = "u", descriptor = "I")
	private int anInt997;

	@OriginalMember(owner = "client!cn", name = "E", descriptor = "I")
	private int anInt1005;

	@OriginalMember(owner = "client!cn", name = "p", descriptor = "I")
	private int anInt992;

	@OriginalMember(owner = "client!cn", name = "C", descriptor = "I")
	public int anInt1003;

	@OriginalMember(owner = "client!cn", name = "<init>", descriptor = "(Lclient!pc;II)V")
	public Class1_Sub7_Sub1(@OriginalArg(0) Class1_Sub23_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass1_Sub23_5 = arg0;
		this.anInt993 = arg0.anInt4003;
		this.anInt1001 = arg0.anInt4001;
		this.aBoolean93 = arg0.aBoolean355;
		this.anInt997 = arg1;
		this.anInt1005 = arg2;
		this.anInt992 = 8192;
		this.anInt1003 = 0;
		this.method851();
	}

	@OriginalMember(owner = "client!cn", name = "<init>", descriptor = "(Lclient!pc;III)V")
	public Class1_Sub7_Sub1(@OriginalArg(0) Class1_Sub23_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass1_Sub23_5 = arg0;
		this.anInt993 = arg0.anInt4003;
		this.anInt1001 = arg0.anInt4001;
		this.aBoolean93 = arg0.aBoolean355;
		this.anInt997 = arg1;
		this.anInt1005 = arg2;
		this.anInt992 = arg3;
		this.anInt1003 = 0;
		this.method851();
	}

	@OriginalMember(owner = "client!cn", name = "e", descriptor = "(I)V")
	public synchronized void method812(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class1_Sub23_Sub1) this.aClass1_Sub23_5).aByteArray133.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt1003 = arg0;
	}

	@OriginalMember(owner = "client!cn", name = "e", descriptor = "()Z")
	private boolean method813() {
		@Pc(2) int local2 = this.anInt1005;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static316.method835(local2, this.anInt992);
			local8 = Static316.method830(local2, this.anInt992);
		}
		if (this.anInt994 != local2 || this.anInt995 != local10 || this.anInt1002 != local8) {
			if (this.anInt994 < local2) {
				this.anInt996 = 1;
				this.anInt998 = local2 - this.anInt994;
			} else if (this.anInt994 > local2) {
				this.anInt996 = -1;
				this.anInt998 = this.anInt994 - local2;
			} else {
				this.anInt996 = 0;
			}
			if (this.anInt995 < local10) {
				this.anInt1004 = 1;
				if (this.anInt998 == 0 || this.anInt998 > local10 - this.anInt995) {
					this.anInt998 = local10 - this.anInt995;
				}
			} else if (this.anInt995 > local10) {
				this.anInt1004 = -1;
				if (this.anInt998 == 0 || this.anInt998 > this.anInt995 - local10) {
					this.anInt998 = this.anInt995 - local10;
				}
			} else {
				this.anInt1004 = 0;
			}
			if (this.anInt1002 < local8) {
				this.anInt999 = 1;
				if (this.anInt998 == 0 || this.anInt998 > local8 - this.anInt1002) {
					this.anInt998 = local8 - this.anInt1002;
				}
			} else if (this.anInt1002 > local8) {
				this.anInt999 = -1;
				if (this.anInt998 == 0 || this.anInt998 > this.anInt1002 - local8) {
					this.anInt998 = this.anInt1002 - local8;
				}
			} else {
				this.anInt999 = 0;
			}
			return false;
		} else if (this.anInt1005 == Integer.MIN_VALUE) {
			this.anInt1005 = 0;
			this.anInt994 = this.anInt995 = this.anInt1002 = 0;
			this.method4573();
			return true;
		} else {
			this.method851();
			return false;
		}
	}

	@OriginalMember(owner = "client!cn", name = "b", descriptor = "(III)V")
	public synchronized void method814(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method847(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static316.method835(arg1, arg2);
		@Pc(14) int local14 = Static316.method830(arg1, arg2);
		if (this.anInt995 == local10 && this.anInt1002 == local14) {
			this.anInt998 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt994;
		if (this.anInt994 - arg1 > local31) {
			local31 = this.anInt994 - arg1;
		}
		if (local10 - this.anInt995 > local31) {
			local31 = local10 - this.anInt995;
		}
		if (this.anInt995 - local10 > local31) {
			local31 = this.anInt995 - local10;
		}
		if (local14 - this.anInt1002 > local31) {
			local31 = local14 - this.anInt1002;
		}
		if (this.anInt1002 - local14 > local31) {
			local31 = this.anInt1002 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt998 = arg0;
		this.anInt1005 = arg1;
		this.anInt992 = arg2;
		this.anInt996 = (arg1 - this.anInt994) / arg0;
		this.anInt1004 = (local10 - this.anInt995) / arg0;
		this.anInt999 = (local14 - this.anInt1002) / arg0;
	}

	@OriginalMember(owner = "client!cn", name = "f", descriptor = "()I")
	public synchronized int method815() {
		return this.anInt992 < 0 ? -1 : this.anInt992;
	}

	@OriginalMember(owner = "client!cn", name = "d", descriptor = "(I)V")
	@Override
	public synchronized void method3726(@OriginalArg(0) int arg0) {
		if (this.anInt998 > 0) {
			if (arg0 >= this.anInt998) {
				if (this.anInt1005 == Integer.MIN_VALUE) {
					this.anInt1005 = 0;
					this.anInt994 = this.anInt995 = this.anInt1002 = 0;
					this.method4573();
					arg0 = this.anInt998;
				}
				this.anInt998 = 0;
				this.method851();
			} else {
				this.anInt994 += this.anInt996 * arg0;
				this.anInt995 += this.anInt1004 * arg0;
				this.anInt1002 += this.anInt999 * arg0;
				this.anInt998 -= arg0;
			}
		}
		@Pc(71) Class1_Sub23_Sub1 local71 = (Class1_Sub23_Sub1) this.aClass1_Sub23_5;
		@Pc(76) int local76 = this.anInt993 << 8;
		@Pc(81) int local81 = this.anInt1001 << 8;
		@Pc(87) int local87 = local71.aByteArray133.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt1000 = 0;
		}
		if (this.anInt1003 < 0) {
			if (this.anInt997 <= 0) {
				this.method838();
				this.method4573();
				return;
			}
			this.anInt1003 = 0;
		}
		if (this.anInt1003 >= local87) {
			if (this.anInt997 >= 0) {
				this.method838();
				this.method4573();
				return;
			}
			this.anInt1003 = local87 - 1;
		}
		this.anInt1003 += this.anInt997 * arg0;
		if (this.anInt1000 >= 0) {
			if (this.anInt1000 > 0) {
				if (this.aBoolean93) {
					label121: {
						if (this.anInt997 < 0) {
							if (this.anInt1003 >= local76) {
								return;
							}
							this.anInt1003 = local76 + local76 - this.anInt1003 - 1;
							this.anInt997 = -this.anInt997;
							if (--this.anInt1000 == 0) {
								break label121;
							}
						}
						do {
							if (this.anInt1003 < local81) {
								return;
							}
							this.anInt1003 = local81 + local81 - this.anInt1003 - 1;
							this.anInt997 = -this.anInt997;
							if (--this.anInt1000 == 0) {
								break;
							}
							if (this.anInt1003 >= local76) {
								return;
							}
							this.anInt1003 = local76 + local76 - this.anInt1003 - 1;
							this.anInt997 = -this.anInt997;
						} while (--this.anInt1000 != 0);
					}
				} else {
					label153: {
						@Pc(362) int local362;
						if (this.anInt997 < 0) {
							if (this.anInt1003 >= local76) {
								return;
							}
							local362 = (local81 - this.anInt1003 - 1) / local91;
							if (local362 >= this.anInt1000) {
								this.anInt1003 += local91 * this.anInt1000;
								this.anInt1000 = 0;
								break label153;
							}
							this.anInt1003 += local91 * local362;
							this.anInt1000 -= local362;
						} else if (this.anInt1003 >= local81) {
							local362 = (this.anInt1003 - local76) / local91;
							if (local362 >= this.anInt1000) {
								this.anInt1003 -= local91 * this.anInt1000;
								this.anInt1000 = 0;
								break label153;
							}
							this.anInt1003 -= local91 * local362;
							this.anInt1000 -= local362;
						} else {
							return;
						}
						return;
					}
				}
			}
			if (this.anInt997 < 0) {
				if (this.anInt1003 < 0) {
					this.anInt1003 = -1;
					this.method838();
					this.method4573();
				}
			} else if (this.anInt1003 >= local87) {
				this.anInt1003 = local87;
				this.method838();
				this.method4573();
			}
		} else if (this.aBoolean93) {
			if (this.anInt997 < 0) {
				if (this.anInt1003 >= local76) {
					return;
				}
				this.anInt1003 = local76 + local76 - this.anInt1003 - 1;
				this.anInt997 = -this.anInt997;
			}
			while (this.anInt1003 >= local81) {
				this.anInt1003 = local81 + local81 - this.anInt1003 - 1;
				this.anInt997 = -this.anInt997;
				if (this.anInt1003 >= local76) {
					return;
				}
				this.anInt1003 = local76 + local76 - this.anInt1003 - 1;
				this.anInt997 = -this.anInt997;
			}
		} else if (this.anInt997 < 0) {
			if (this.anInt1003 >= local76) {
				return;
			}
			this.anInt1003 = local81 - (local81 - 1 - this.anInt1003) % local91 - 1;
		} else if (this.anInt1003 >= local81) {
			this.anInt1003 = local76 + (this.anInt1003 - local76) % local91;
		} else {
			return;
		}
	}

	@OriginalMember(owner = "client!cn", name = "f", descriptor = "(I)V")
	public synchronized void method818(@OriginalArg(0) int arg0) {
		if (this.anInt997 < 0) {
			this.anInt997 = -arg0;
		} else {
			this.anInt997 = arg0;
		}
	}

	@OriginalMember(owner = "client!cn", name = "g", descriptor = "()Z")
	public boolean method819() {
		return this.anInt998 != 0;
	}

	@OriginalMember(owner = "client!cn", name = "g", descriptor = "(I)V")
	public synchronized void method822(@OriginalArg(0) int arg0) {
		this.method847(arg0 << 6, this.method815());
	}

	@OriginalMember(owner = "client!cn", name = "h", descriptor = "(I)V")
	public synchronized void method823(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method824();
			this.method4573();
		} else if (this.anInt995 == 0 && this.anInt1002 == 0) {
			this.anInt998 = 0;
			this.anInt1005 = 0;
			this.anInt994 = 0;
			this.method4573();
		} else {
			@Pc(31) int local31 = -this.anInt994;
			if (this.anInt994 > local31) {
				local31 = this.anInt994;
			}
			if (-this.anInt995 > local31) {
				local31 = -this.anInt995;
			}
			if (this.anInt995 > local31) {
				local31 = this.anInt995;
			}
			if (-this.anInt1002 > local31) {
				local31 = -this.anInt1002;
			}
			if (this.anInt1002 > local31) {
				local31 = this.anInt1002;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt998 = arg0;
			this.anInt1005 = Integer.MIN_VALUE;
			this.anInt996 = -this.anInt994 / arg0;
			this.anInt1004 = -this.anInt995 / arg0;
			this.anInt999 = -this.anInt1002 / arg0;
		}
	}

	@OriginalMember(owner = "client!cn", name = "i", descriptor = "(I)V")
	private synchronized void method824() {
		this.method847(0, this.method815());
	}

	@OriginalMember(owner = "client!cn", name = "j", descriptor = "(I)V")
	public synchronized void method825(@OriginalArg(0) int arg0) {
		this.anInt1000 = arg0;
	}

	@OriginalMember(owner = "client!cn", name = "h", descriptor = "()Z")
	public boolean method834() {
		return this.anInt1003 < 0 || this.anInt1003 >= ((Class1_Sub23_Sub1) this.aClass1_Sub23_5).aByteArray133.length << 8;
	}

	@OriginalMember(owner = "client!cn", name = "d", descriptor = "()I")
	@Override
	public int method3728() {
		return this.anInt1005 == 0 && this.anInt998 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!cn", name = "i", descriptor = "()I")
	public synchronized int method836() {
		return this.anInt1005 == Integer.MIN_VALUE ? 0 : this.anInt1005;
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "()Lclient!ro;")
	@Override
	public Class1_Sub7 method3722() {
		return null;
	}

	@OriginalMember(owner = "client!cn", name = "j", descriptor = "()V")
	private void method838() {
		if (this.anInt998 == 0) {
			return;
		}
		if (this.anInt1005 == Integer.MIN_VALUE) {
			this.anInt1005 = 0;
		}
		this.anInt998 = 0;
		this.method851();
	}

	@OriginalMember(owner = "client!cn", name = "c", descriptor = "()Lclient!ro;")
	@Override
	public Class1_Sub7 method3724() {
		return null;
	}

	@OriginalMember(owner = "client!cn", name = "b", descriptor = "()I")
	@Override
	public int method3723() {
		@Pc(6) int local6 = this.anInt994 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt1000 == 0) {
			local6 -= local6 * this.anInt1003 / (((Class1_Sub23_Sub1) this.aClass1_Sub23_5).aByteArray133.length << 8);
		} else if (this.anInt1000 >= 0) {
			local6 -= local6 * this.anInt993 / ((Class1_Sub23_Sub1) this.aClass1_Sub23_5).aByteArray133.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "([IIIII)I")
	private int method840(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		while (true) {
			if (this.anInt998 > 0) {
				@Pc(7) int local7 = arg1 + this.anInt998;
				if (local7 > arg3) {
					local7 = arg3;
				}
				this.anInt998 += arg1;
				if (this.anInt997 == -256 && (this.anInt1003 & 0xFF) == 0) {
					if (Static292.aBoolean497) {
						arg1 = Static316.method833(((Class1_Sub23_Sub1) this.aClass1_Sub23_5).aByteArray133, arg0, this.anInt1003, arg1, this.anInt995, this.anInt1002, this.anInt1004, this.anInt999, local7, arg2, this);
					} else {
						arg1 = Static316.method829(((Class1_Sub23_Sub1) this.aClass1_Sub23_5).aByteArray133, arg0, this.anInt1003, arg1, this.anInt994, this.anInt996, local7, arg2, this);
					}
				} else if (Static292.aBoolean497) {
					arg1 = Static316.method832(((Class1_Sub23_Sub1) this.aClass1_Sub23_5).aByteArray133, arg0, this.anInt1003, arg1, this.anInt995, this.anInt1002, this.anInt1004, this.anInt999, local7, arg2, this, this.anInt997, arg4);
				} else {
					arg1 = Static316.method839(((Class1_Sub23_Sub1) this.aClass1_Sub23_5).aByteArray133, arg0, this.anInt1003, arg1, this.anInt994, this.anInt996, local7, arg2, this, this.anInt997, arg4);
				}
				this.anInt998 -= arg1;
				if (this.anInt998 != 0) {
					return arg1;
				}
				if (!this.method813()) {
					continue;
				}
				return arg3;
			}
			if (this.anInt997 == -256 && (this.anInt1003 & 0xFF) == 0) {
				if (Static292.aBoolean497) {
					return Static316.method850(((Class1_Sub23_Sub1) this.aClass1_Sub23_5).aByteArray133, arg0, this.anInt1003, arg1, this.anInt995, this.anInt1002, arg3, arg2, this);
				}
				return Static316.method841(((Class1_Sub23_Sub1) this.aClass1_Sub23_5).aByteArray133, arg0, this.anInt1003, arg1, this.anInt994, arg3, arg2, this);
			}
			if (Static292.aBoolean497) {
				return Static316.method849(((Class1_Sub23_Sub1) this.aClass1_Sub23_5).aByteArray133, arg0, this.anInt1003, arg1, this.anInt995, this.anInt1002, arg3, arg2, this, this.anInt997, arg4);
			}
			return Static316.method827(((Class1_Sub23_Sub1) this.aClass1_Sub23_5).aByteArray133, arg0, this.anInt1003, arg1, this.anInt994, arg3, arg2, this, this.anInt997, arg4);
		}
	}

	@OriginalMember(owner = "client!cn", name = "c", descriptor = "(II)V")
	public synchronized void method842(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method814(arg0, arg1, this.method815());
	}

	@OriginalMember(owner = "client!cn", name = "b", descriptor = "([IIIII)I")
	private int method844(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		while (true) {
			if (this.anInt998 > 0) {
				@Pc(7) int local7 = arg1 + this.anInt998;
				if (local7 > arg3) {
					local7 = arg3;
				}
				this.anInt998 += arg1;
				if (this.anInt997 == 256 && (this.anInt1003 & 0xFF) == 0) {
					if (Static292.aBoolean497) {
						arg1 = Static316.method820(((Class1_Sub23_Sub1) this.aClass1_Sub23_5).aByteArray133, arg0, this.anInt1003, arg1, this.anInt995, this.anInt1002, this.anInt1004, this.anInt999, local7, arg2, this);
					} else {
						arg1 = Static316.method837(((Class1_Sub23_Sub1) this.aClass1_Sub23_5).aByteArray133, arg0, this.anInt1003, arg1, this.anInt994, this.anInt996, local7, arg2, this);
					}
				} else if (Static292.aBoolean497) {
					arg1 = Static316.method816(((Class1_Sub23_Sub1) this.aClass1_Sub23_5).aByteArray133, arg0, this.anInt1003, arg1, this.anInt995, this.anInt1002, this.anInt1004, this.anInt999, local7, arg2, this, this.anInt997, arg4);
				} else {
					arg1 = Static316.method843(((Class1_Sub23_Sub1) this.aClass1_Sub23_5).aByteArray133, arg0, this.anInt1003, arg1, this.anInt994, this.anInt996, local7, arg2, this, this.anInt997, arg4);
				}
				this.anInt998 -= arg1;
				if (this.anInt998 != 0) {
					return arg1;
				}
				if (!this.method813()) {
					continue;
				}
				return arg3;
			}
			if (this.anInt997 == 256 && (this.anInt1003 & 0xFF) == 0) {
				if (Static292.aBoolean497) {
					return Static316.method845(((Class1_Sub23_Sub1) this.aClass1_Sub23_5).aByteArray133, arg0, this.anInt1003, arg1, this.anInt995, this.anInt1002, arg3, arg2, this);
				}
				return Static316.method821(((Class1_Sub23_Sub1) this.aClass1_Sub23_5).aByteArray133, arg0, this.anInt1003, arg1, this.anInt994, arg3, arg2, this);
			}
			if (Static292.aBoolean497) {
				return Static316.method828(((Class1_Sub23_Sub1) this.aClass1_Sub23_5).aByteArray133, arg0, this.anInt1003, arg1, this.anInt995, this.anInt1002, arg3, arg2, this, this.anInt997, arg4);
			}
			return Static316.method826(((Class1_Sub23_Sub1) this.aClass1_Sub23_5).aByteArray133, arg0, this.anInt1003, arg1, this.anInt994, arg3, arg2, this, this.anInt997, arg4);
		}
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(Z)V")
	public synchronized void method846() {
		this.anInt997 = (this.anInt997 ^ this.anInt997 >> 31) + (this.anInt997 >>> 31);
		this.anInt997 = -this.anInt997;
	}

	@OriginalMember(owner = "client!cn", name = "d", descriptor = "(II)V")
	private synchronized void method847(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1005 = arg0;
		this.anInt992 = arg1;
		this.anInt998 = 0;
		this.method851();
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method3725(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt1005 == 0 && this.anInt998 == 0) {
			this.method3726(arg2);
			return;
		}
		@Pc(13) Class1_Sub23_Sub1 local13 = (Class1_Sub23_Sub1) this.aClass1_Sub23_5;
		@Pc(18) int local18 = this.anInt993 << 8;
		@Pc(23) int local23 = this.anInt1001 << 8;
		@Pc(29) int local29 = local13.aByteArray133.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt1000 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt1003 < 0) {
			if (this.anInt997 <= 0) {
				this.method838();
				this.method4573();
				return;
			}
			this.anInt1003 = 0;
		}
		if (this.anInt1003 >= local29) {
			if (this.anInt997 >= 0) {
				this.method838();
				this.method4573();
				return;
			}
			this.anInt1003 = local29 - 1;
		}
		if (this.anInt1000 >= 0) {
			if (this.anInt1000 > 0) {
				if (this.aBoolean93) {
					label131: {
						if (this.anInt997 < 0) {
							local40 = this.method840(arg0, arg1, local18, local44, local13.aByteArray133[this.anInt993]);
							if (this.anInt1003 >= local18) {
								return;
							}
							this.anInt1003 = local18 + local18 - this.anInt1003 - 1;
							this.anInt997 = -this.anInt997;
							if (--this.anInt1000 == 0) {
								break label131;
							}
						}
						do {
							local40 = this.method844(arg0, local40, local23, local44, local13.aByteArray133[this.anInt1001 - 1]);
							if (this.anInt1003 < local23) {
								return;
							}
							this.anInt1003 = local23 + local23 - this.anInt1003 - 1;
							this.anInt997 = -this.anInt997;
							if (--this.anInt1000 == 0) {
								break;
							}
							local40 = this.method840(arg0, local40, local18, local44, local13.aByteArray133[this.anInt993]);
							if (this.anInt1003 >= local18) {
								return;
							}
							this.anInt1003 = local18 + local18 - this.anInt1003 - 1;
							this.anInt997 = -this.anInt997;
						} while (--this.anInt1000 != 0);
					}
				} else {
					@Pc(417) int local417;
					if (this.anInt997 < 0) {
						while (true) {
							local40 = this.method840(arg0, local40, local18, local44, local13.aByteArray133[this.anInt1001 - 1]);
							if (this.anInt1003 >= local18) {
								return;
							}
							local417 = (local23 - this.anInt1003 - 1) / local33;
							if (local417 >= this.anInt1000) {
								this.anInt1003 += local33 * this.anInt1000;
								this.anInt1000 = 0;
								break;
							}
							this.anInt1003 += local33 * local417;
							this.anInt1000 -= local417;
						}
					} else {
						while (true) {
							local40 = this.method844(arg0, local40, local23, local44, local13.aByteArray133[this.anInt993]);
							if (this.anInt1003 < local23) {
								return;
							}
							local417 = (this.anInt1003 - local18) / local33;
							if (local417 >= this.anInt1000) {
								this.anInt1003 -= local33 * this.anInt1000;
								this.anInt1000 = 0;
								break;
							}
							this.anInt1003 -= local33 * local417;
							this.anInt1000 -= local417;
						}
					}
				}
			}
			if (this.anInt997 < 0) {
				this.method840(arg0, local40, 0, local44, 0);
				if (this.anInt1003 < 0) {
					this.anInt1003 = -1;
					this.method838();
					this.method4573();
				}
			} else {
				this.method844(arg0, local40, local29, local44, 0);
				if (this.anInt1003 >= local29) {
					this.anInt1003 = local29;
					this.method838();
					this.method4573();
				}
			}
		} else if (this.aBoolean93) {
			if (this.anInt997 < 0) {
				local40 = this.method840(arg0, arg1, local18, local44, local13.aByteArray133[this.anInt993]);
				if (this.anInt1003 >= local18) {
					return;
				}
				this.anInt1003 = local18 + local18 - this.anInt1003 - 1;
				this.anInt997 = -this.anInt997;
			}
			while (true) {
				local40 = this.method844(arg0, local40, local23, local44, local13.aByteArray133[this.anInt1001 - 1]);
				if (this.anInt1003 < local23) {
					return;
				}
				this.anInt1003 = local23 + local23 - this.anInt1003 - 1;
				this.anInt997 = -this.anInt997;
				local40 = this.method840(arg0, local40, local18, local44, local13.aByteArray133[this.anInt993]);
				if (this.anInt1003 >= local18) {
					return;
				}
				this.anInt1003 = local18 + local18 - this.anInt1003 - 1;
				this.anInt997 = -this.anInt997;
			}
		} else if (this.anInt997 < 0) {
			while (true) {
				local40 = this.method840(arg0, local40, local18, local44, local13.aByteArray133[this.anInt1001 - 1]);
				if (this.anInt1003 >= local18) {
					return;
				}
				this.anInt1003 = local23 - (local23 - 1 - this.anInt1003) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method844(arg0, local40, local23, local44, local13.aByteArray133[this.anInt993]);
				if (this.anInt1003 < local23) {
					return;
				}
				this.anInt1003 = local18 + (this.anInt1003 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!cn", name = "k", descriptor = "()I")
	public synchronized int method848() {
		return this.anInt997 < 0 ? -this.anInt997 : this.anInt997;
	}

	@OriginalMember(owner = "client!cn", name = "l", descriptor = "()V")
	private void method851() {
		this.anInt994 = this.anInt1005;
		this.anInt995 = Static316.method835(this.anInt1005, this.anInt992);
		this.anInt1002 = Static316.method830(this.anInt1005, this.anInt992);
	}
}
