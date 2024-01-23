import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bh")
public final class Class4_Sub6_Sub1 extends Class4_Sub6 {

	@OriginalMember(owner = "client!bh", name = "p", descriptor = "I")
	public int anInt501;

	@OriginalMember(owner = "client!bh", name = "t", descriptor = "I")
	private int anInt504;

	@OriginalMember(owner = "client!bh", name = "u", descriptor = "I")
	public int anInt505;

	@OriginalMember(owner = "client!bh", name = "v", descriptor = "I")
	public int anInt506;

	@OriginalMember(owner = "client!bh", name = "w", descriptor = "I")
	private int anInt507;

	@OriginalMember(owner = "client!bh", name = "x", descriptor = "I")
	public int anInt508;

	@OriginalMember(owner = "client!bh", name = "B", descriptor = "I")
	public int anInt512;

	@OriginalMember(owner = "client!bh", name = "C", descriptor = "I")
	public int anInt513;

	@OriginalMember(owner = "client!bh", name = "z", descriptor = "I")
	private int anInt510;

	@OriginalMember(owner = "client!bh", name = "y", descriptor = "I")
	private int anInt509;

	@OriginalMember(owner = "client!bh", name = "q", descriptor = "Z")
	private boolean aBoolean37;

	@OriginalMember(owner = "client!bh", name = "s", descriptor = "I")
	private int anInt503;

	@OriginalMember(owner = "client!bh", name = "r", descriptor = "I")
	private int anInt502;

	@OriginalMember(owner = "client!bh", name = "A", descriptor = "I")
	private int anInt511;

	@OriginalMember(owner = "client!bh", name = "D", descriptor = "I")
	public int anInt514;

	@OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(Lclient!ri;II)V")
	public Class4_Sub6_Sub1(@OriginalArg(0) Class4_Sub5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass4_Sub5_5 = arg0;
		this.anInt510 = arg0.anInt4735;
		this.anInt509 = arg0.anInt4736;
		this.aBoolean37 = arg0.aBoolean295;
		this.anInt503 = arg1;
		this.anInt502 = arg2;
		this.anInt511 = 8192;
		this.anInt514 = 0;
		this.method517();
	}

	@OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(Lclient!ri;III)V")
	public Class4_Sub6_Sub1(@OriginalArg(0) Class4_Sub5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass4_Sub5_5 = arg0;
		this.anInt510 = arg0.anInt4735;
		this.anInt509 = arg0.anInt4736;
		this.aBoolean37 = arg0.aBoolean295;
		this.anInt503 = arg1;
		this.anInt502 = arg2;
		this.anInt511 = arg3;
		this.anInt514 = 0;
		this.method517();
	}

	@OriginalMember(owner = "client!bh", name = "e", descriptor = "()Z")
	private boolean method487() {
		@Pc(2) int local2 = this.anInt502;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static310.method510(local2, this.anInt511);
			local8 = Static310.method503(local2, this.anInt511);
		}
		if (this.anInt506 != local2 || this.anInt505 != local10 || this.anInt513 != local8) {
			if (this.anInt506 < local2) {
				this.anInt508 = 1;
				this.anInt504 = local2 - this.anInt506;
			} else if (this.anInt506 > local2) {
				this.anInt508 = -1;
				this.anInt504 = this.anInt506 - local2;
			} else {
				this.anInt508 = 0;
			}
			if (this.anInt505 < local10) {
				this.anInt501 = 1;
				if (this.anInt504 == 0 || this.anInt504 > local10 - this.anInt505) {
					this.anInt504 = local10 - this.anInt505;
				}
			} else if (this.anInt505 > local10) {
				this.anInt501 = -1;
				if (this.anInt504 == 0 || this.anInt504 > this.anInt505 - local10) {
					this.anInt504 = this.anInt505 - local10;
				}
			} else {
				this.anInt501 = 0;
			}
			if (this.anInt513 < local8) {
				this.anInt512 = 1;
				if (this.anInt504 == 0 || this.anInt504 > local8 - this.anInt513) {
					this.anInt504 = local8 - this.anInt513;
				}
			} else if (this.anInt513 > local8) {
				this.anInt512 = -1;
				if (this.anInt504 == 0 || this.anInt504 > this.anInt513 - local8) {
					this.anInt504 = this.anInt513 - local8;
				}
			} else {
				this.anInt512 = 0;
			}
			return false;
		} else if (this.anInt502 == Integer.MIN_VALUE) {
			this.anInt502 = 0;
			this.anInt506 = this.anInt505 = this.anInt513 = 0;
			this.method4690();
			return true;
		} else {
			this.method517();
			return false;
		}
	}

	@OriginalMember(owner = "client!bh", name = "d", descriptor = "(I)V")
	public synchronized void method488(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class4_Sub5_Sub1) this.aClass4_Sub5_5).aByteArray57.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt514 = arg0;
	}

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "()I")
	@Override
	public int method3724() {
		return this.anInt502 == 0 && this.anInt504 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!bh", name = "e", descriptor = "(I)V")
	public synchronized void method491(@OriginalArg(0) int arg0) {
		this.method516(arg0 << 6, this.method498());
	}

	@OriginalMember(owner = "client!bh", name = "f", descriptor = "(I)V")
	public synchronized void method492(@OriginalArg(0) int arg0) {
		this.anInt507 = arg0;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "([IIIII)I")
	private int method494(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		while (true) {
			if (this.anInt504 > 0) {
				@Pc(7) int local7 = arg1 + this.anInt504;
				if (local7 > arg3) {
					local7 = arg3;
				}
				this.anInt504 += arg1;
				if (this.anInt503 == 256 && (this.anInt514 & 0xFF) == 0) {
					if (Static155.aBoolean207) {
						arg1 = Static310.method523(((Class4_Sub5_Sub1) this.aClass4_Sub5_5).aByteArray57, arg0, this.anInt514, arg1, this.anInt505, this.anInt513, this.anInt501, this.anInt512, local7, arg2, this);
					} else {
						arg1 = Static310.method511(((Class4_Sub5_Sub1) this.aClass4_Sub5_5).aByteArray57, arg0, this.anInt514, arg1, this.anInt506, this.anInt508, local7, arg2, this);
					}
				} else if (Static155.aBoolean207) {
					arg1 = Static310.method509(((Class4_Sub5_Sub1) this.aClass4_Sub5_5).aByteArray57, arg0, this.anInt514, arg1, this.anInt505, this.anInt513, this.anInt501, this.anInt512, local7, arg2, this, this.anInt503, arg4);
				} else {
					arg1 = Static310.method505(((Class4_Sub5_Sub1) this.aClass4_Sub5_5).aByteArray57, arg0, this.anInt514, arg1, this.anInt506, this.anInt508, local7, arg2, this, this.anInt503, arg4);
				}
				this.anInt504 -= arg1;
				if (this.anInt504 != 0) {
					return arg1;
				}
				if (!this.method487()) {
					continue;
				}
				return arg3;
			}
			if (this.anInt503 == 256 && (this.anInt514 & 0xFF) == 0) {
				if (Static155.aBoolean207) {
					return Static310.method519(((Class4_Sub5_Sub1) this.aClass4_Sub5_5).aByteArray57, arg0, this.anInt514, arg1, this.anInt505, this.anInt513, arg3, arg2, this);
				}
				return Static310.method490(((Class4_Sub5_Sub1) this.aClass4_Sub5_5).aByteArray57, arg0, this.anInt514, arg1, this.anInt506, arg3, arg2, this);
			}
			if (Static155.aBoolean207) {
				return Static310.method515(((Class4_Sub5_Sub1) this.aClass4_Sub5_5).aByteArray57, arg0, this.anInt514, arg1, this.anInt505, this.anInt513, arg3, arg2, this, this.anInt503, arg4);
			}
			return Static310.method489(((Class4_Sub5_Sub1) this.aClass4_Sub5_5).aByteArray57, arg0, this.anInt514, arg1, this.anInt506, arg3, arg2, this, this.anInt503, arg4);
		}
	}

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "(Z)V")
	public synchronized void method496() {
		this.anInt503 = (this.anInt503 ^ this.anInt503 >> 31) + (this.anInt503 >>> 31);
		this.anInt503 = -this.anInt503;
	}

	@OriginalMember(owner = "client!bh", name = "f", descriptor = "()Z")
	public boolean method497() {
		return this.anInt514 < 0 || this.anInt514 >= ((Class4_Sub5_Sub1) this.aClass4_Sub5_5).aByteArray57.length << 8;
	}

	@OriginalMember(owner = "client!bh", name = "g", descriptor = "()I")
	public synchronized int method498() {
		return this.anInt511 < 0 ? -1 : this.anInt511;
	}

	@OriginalMember(owner = "client!bh", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method3728(@OriginalArg(0) int arg0) {
		if (this.anInt504 > 0) {
			if (arg0 >= this.anInt504) {
				if (this.anInt502 == Integer.MIN_VALUE) {
					this.anInt502 = 0;
					this.anInt506 = this.anInt505 = this.anInt513 = 0;
					this.method4690();
					arg0 = this.anInt504;
				}
				this.anInt504 = 0;
				this.method517();
			} else {
				this.anInt506 += this.anInt508 * arg0;
				this.anInt505 += this.anInt501 * arg0;
				this.anInt513 += this.anInt512 * arg0;
				this.anInt504 -= arg0;
			}
		}
		@Pc(71) Class4_Sub5_Sub1 local71 = (Class4_Sub5_Sub1) this.aClass4_Sub5_5;
		@Pc(76) int local76 = this.anInt510 << 8;
		@Pc(81) int local81 = this.anInt509 << 8;
		@Pc(87) int local87 = local71.aByteArray57.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt507 = 0;
		}
		if (this.anInt514 < 0) {
			if (this.anInt503 <= 0) {
				this.method518();
				this.method4690();
				return;
			}
			this.anInt514 = 0;
		}
		if (this.anInt514 >= local87) {
			if (this.anInt503 >= 0) {
				this.method518();
				this.method4690();
				return;
			}
			this.anInt514 = local87 - 1;
		}
		this.anInt514 += this.anInt503 * arg0;
		if (this.anInt507 >= 0) {
			if (this.anInt507 > 0) {
				if (this.aBoolean37) {
					label121: {
						if (this.anInt503 < 0) {
							if (this.anInt514 >= local76) {
								return;
							}
							this.anInt514 = local76 + local76 - this.anInt514 - 1;
							this.anInt503 = -this.anInt503;
							if (--this.anInt507 == 0) {
								break label121;
							}
						}
						do {
							if (this.anInt514 < local81) {
								return;
							}
							this.anInt514 = local81 + local81 - this.anInt514 - 1;
							this.anInt503 = -this.anInt503;
							if (--this.anInt507 == 0) {
								break;
							}
							if (this.anInt514 >= local76) {
								return;
							}
							this.anInt514 = local76 + local76 - this.anInt514 - 1;
							this.anInt503 = -this.anInt503;
						} while (--this.anInt507 != 0);
					}
				} else {
					label153: {
						@Pc(362) int local362;
						if (this.anInt503 < 0) {
							if (this.anInt514 >= local76) {
								return;
							}
							local362 = (local81 - this.anInt514 - 1) / local91;
							if (local362 >= this.anInt507) {
								this.anInt514 += local91 * this.anInt507;
								this.anInt507 = 0;
								break label153;
							}
							this.anInt514 += local91 * local362;
							this.anInt507 -= local362;
						} else if (this.anInt514 >= local81) {
							local362 = (this.anInt514 - local76) / local91;
							if (local362 >= this.anInt507) {
								this.anInt514 -= local91 * this.anInt507;
								this.anInt507 = 0;
								break label153;
							}
							this.anInt514 -= local91 * local362;
							this.anInt507 -= local362;
						} else {
							return;
						}
						return;
					}
				}
			}
			if (this.anInt503 < 0) {
				if (this.anInt514 < 0) {
					this.anInt514 = -1;
					this.method518();
					this.method4690();
				}
			} else if (this.anInt514 >= local87) {
				this.anInt514 = local87;
				this.method518();
				this.method4690();
			}
		} else if (this.aBoolean37) {
			if (this.anInt503 < 0) {
				if (this.anInt514 >= local76) {
					return;
				}
				this.anInt514 = local76 + local76 - this.anInt514 - 1;
				this.anInt503 = -this.anInt503;
			}
			while (this.anInt514 >= local81) {
				this.anInt514 = local81 + local81 - this.anInt514 - 1;
				this.anInt503 = -this.anInt503;
				if (this.anInt514 >= local76) {
					return;
				}
				this.anInt514 = local76 + local76 - this.anInt514 - 1;
				this.anInt503 = -this.anInt503;
			}
		} else if (this.anInt503 < 0) {
			if (this.anInt514 >= local76) {
				return;
			}
			this.anInt514 = local81 - (local81 - 1 - this.anInt514) % local91 - 1;
		} else if (this.anInt514 >= local81) {
			this.anInt514 = local76 + (this.anInt514 - local76) % local91;
		} else {
			return;
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(II)V")
	public synchronized void method499(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method504(arg0, arg1, this.method498());
	}

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "([IIIII)I")
	private int method500(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		while (true) {
			if (this.anInt504 > 0) {
				@Pc(7) int local7 = arg1 + this.anInt504;
				if (local7 > arg3) {
					local7 = arg3;
				}
				this.anInt504 += arg1;
				if (this.anInt503 == -256 && (this.anInt514 & 0xFF) == 0) {
					if (Static155.aBoolean207) {
						arg1 = Static310.method495(((Class4_Sub5_Sub1) this.aClass4_Sub5_5).aByteArray57, arg0, this.anInt514, arg1, this.anInt505, this.anInt513, this.anInt501, this.anInt512, local7, arg2, this);
					} else {
						arg1 = Static310.method493(((Class4_Sub5_Sub1) this.aClass4_Sub5_5).aByteArray57, arg0, this.anInt514, arg1, this.anInt506, this.anInt508, local7, arg2, this);
					}
				} else if (Static155.aBoolean207) {
					arg1 = Static310.method522(((Class4_Sub5_Sub1) this.aClass4_Sub5_5).aByteArray57, arg0, this.anInt514, arg1, this.anInt505, this.anInt513, this.anInt501, this.anInt512, local7, arg2, this, this.anInt503, arg4);
				} else {
					arg1 = Static310.method507(((Class4_Sub5_Sub1) this.aClass4_Sub5_5).aByteArray57, arg0, this.anInt514, arg1, this.anInt506, this.anInt508, local7, arg2, this, this.anInt503, arg4);
				}
				this.anInt504 -= arg1;
				if (this.anInt504 != 0) {
					return arg1;
				}
				if (!this.method487()) {
					continue;
				}
				return arg3;
			}
			if (this.anInt503 == -256 && (this.anInt514 & 0xFF) == 0) {
				if (Static155.aBoolean207) {
					return Static310.method521(((Class4_Sub5_Sub1) this.aClass4_Sub5_5).aByteArray57, arg0, this.anInt514, arg1, this.anInt505, this.anInt513, arg3, arg2, this);
				}
				return Static310.method484(((Class4_Sub5_Sub1) this.aClass4_Sub5_5).aByteArray57, arg0, this.anInt514, arg1, this.anInt506, arg3, arg2, this);
			}
			if (Static155.aBoolean207) {
				return Static310.method485(((Class4_Sub5_Sub1) this.aClass4_Sub5_5).aByteArray57, arg0, this.anInt514, arg1, this.anInt505, this.anInt513, arg3, arg2, this, this.anInt503, arg4);
			}
			return Static310.method506(((Class4_Sub5_Sub1) this.aClass4_Sub5_5).aByteArray57, arg0, this.anInt514, arg1, this.anInt506, arg3, arg2, this, this.anInt503, arg4);
		}
	}

	@OriginalMember(owner = "client!bh", name = "g", descriptor = "(I)V")
	private synchronized void method501() {
		this.method516(0, this.method498());
	}

	@OriginalMember(owner = "client!bh", name = "h", descriptor = "()Z")
	public boolean method502() {
		return this.anInt504 != 0;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(III)V")
	public synchronized void method504(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method516(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static310.method510(arg1, arg2);
		@Pc(14) int local14 = Static310.method503(arg1, arg2);
		if (this.anInt505 == local10 && this.anInt513 == local14) {
			this.anInt504 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt506;
		if (this.anInt506 - arg1 > local31) {
			local31 = this.anInt506 - arg1;
		}
		if (local10 - this.anInt505 > local31) {
			local31 = local10 - this.anInt505;
		}
		if (this.anInt505 - local10 > local31) {
			local31 = this.anInt505 - local10;
		}
		if (local14 - this.anInt513 > local31) {
			local31 = local14 - this.anInt513;
		}
		if (this.anInt513 - local14 > local31) {
			local31 = this.anInt513 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt504 = arg0;
		this.anInt502 = arg1;
		this.anInt511 = arg2;
		this.anInt508 = (arg1 - this.anInt506) / arg0;
		this.anInt501 = (local10 - this.anInt505) / arg0;
		this.anInt512 = (local14 - this.anInt513) / arg0;
	}

	@OriginalMember(owner = "client!bh", name = "c", descriptor = "()Lclient!mj;")
	@Override
	public Class4_Sub6 method3725() {
		return null;
	}

	@OriginalMember(owner = "client!bh", name = "i", descriptor = "()I")
	public synchronized int method508() {
		return this.anInt502 == Integer.MIN_VALUE ? 0 : this.anInt502;
	}

	@OriginalMember(owner = "client!bh", name = "d", descriptor = "()Lclient!mj;")
	@Override
	public Class4_Sub6 method3727() {
		return null;
	}

	@OriginalMember(owner = "client!bh", name = "h", descriptor = "(I)V")
	public synchronized void method512(@OriginalArg(0) int arg0) {
		if (this.anInt503 < 0) {
			this.anInt503 = -arg0;
		} else {
			this.anInt503 = arg0;
		}
	}

	@OriginalMember(owner = "client!bh", name = "j", descriptor = "()I")
	public synchronized int method513() {
		return this.anInt503 < 0 ? -this.anInt503 : this.anInt503;
	}

	@OriginalMember(owner = "client!bh", name = "i", descriptor = "(I)V")
	public synchronized void method514(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method501();
			this.method4690();
		} else if (this.anInt505 == 0 && this.anInt513 == 0) {
			this.anInt504 = 0;
			this.anInt502 = 0;
			this.anInt506 = 0;
			this.method4690();
		} else {
			@Pc(31) int local31 = -this.anInt506;
			if (this.anInt506 > local31) {
				local31 = this.anInt506;
			}
			if (-this.anInt505 > local31) {
				local31 = -this.anInt505;
			}
			if (this.anInt505 > local31) {
				local31 = this.anInt505;
			}
			if (-this.anInt513 > local31) {
				local31 = -this.anInt513;
			}
			if (this.anInt513 > local31) {
				local31 = this.anInt513;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt504 = arg0;
			this.anInt502 = Integer.MIN_VALUE;
			this.anInt508 = -this.anInt506 / arg0;
			this.anInt501 = -this.anInt505 / arg0;
			this.anInt512 = -this.anInt513 / arg0;
		}
	}

	@OriginalMember(owner = "client!bh", name = "d", descriptor = "(II)V")
	private synchronized void method516(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt502 = arg0;
		this.anInt511 = arg1;
		this.anInt504 = 0;
		this.method517();
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method3723(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt502 == 0 && this.anInt504 == 0) {
			this.method3728(arg2);
			return;
		}
		@Pc(13) Class4_Sub5_Sub1 local13 = (Class4_Sub5_Sub1) this.aClass4_Sub5_5;
		@Pc(18) int local18 = this.anInt510 << 8;
		@Pc(23) int local23 = this.anInt509 << 8;
		@Pc(29) int local29 = local13.aByteArray57.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt507 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt514 < 0) {
			if (this.anInt503 <= 0) {
				this.method518();
				this.method4690();
				return;
			}
			this.anInt514 = 0;
		}
		if (this.anInt514 >= local29) {
			if (this.anInt503 >= 0) {
				this.method518();
				this.method4690();
				return;
			}
			this.anInt514 = local29 - 1;
		}
		if (this.anInt507 >= 0) {
			if (this.anInt507 > 0) {
				if (this.aBoolean37) {
					label131: {
						if (this.anInt503 < 0) {
							local40 = this.method500(arg0, arg1, local18, local44, local13.aByteArray57[this.anInt510]);
							if (this.anInt514 >= local18) {
								return;
							}
							this.anInt514 = local18 + local18 - this.anInt514 - 1;
							this.anInt503 = -this.anInt503;
							if (--this.anInt507 == 0) {
								break label131;
							}
						}
						do {
							local40 = this.method494(arg0, local40, local23, local44, local13.aByteArray57[this.anInt509 - 1]);
							if (this.anInt514 < local23) {
								return;
							}
							this.anInt514 = local23 + local23 - this.anInt514 - 1;
							this.anInt503 = -this.anInt503;
							if (--this.anInt507 == 0) {
								break;
							}
							local40 = this.method500(arg0, local40, local18, local44, local13.aByteArray57[this.anInt510]);
							if (this.anInt514 >= local18) {
								return;
							}
							this.anInt514 = local18 + local18 - this.anInt514 - 1;
							this.anInt503 = -this.anInt503;
						} while (--this.anInt507 != 0);
					}
				} else {
					@Pc(417) int local417;
					if (this.anInt503 < 0) {
						while (true) {
							local40 = this.method500(arg0, local40, local18, local44, local13.aByteArray57[this.anInt509 - 1]);
							if (this.anInt514 >= local18) {
								return;
							}
							local417 = (local23 - this.anInt514 - 1) / local33;
							if (local417 >= this.anInt507) {
								this.anInt514 += local33 * this.anInt507;
								this.anInt507 = 0;
								break;
							}
							this.anInt514 += local33 * local417;
							this.anInt507 -= local417;
						}
					} else {
						while (true) {
							local40 = this.method494(arg0, local40, local23, local44, local13.aByteArray57[this.anInt510]);
							if (this.anInt514 < local23) {
								return;
							}
							local417 = (this.anInt514 - local18) / local33;
							if (local417 >= this.anInt507) {
								this.anInt514 -= local33 * this.anInt507;
								this.anInt507 = 0;
								break;
							}
							this.anInt514 -= local33 * local417;
							this.anInt507 -= local417;
						}
					}
				}
			}
			if (this.anInt503 < 0) {
				this.method500(arg0, local40, 0, local44, 0);
				if (this.anInt514 < 0) {
					this.anInt514 = -1;
					this.method518();
					this.method4690();
				}
			} else {
				this.method494(arg0, local40, local29, local44, 0);
				if (this.anInt514 >= local29) {
					this.anInt514 = local29;
					this.method518();
					this.method4690();
				}
			}
		} else if (this.aBoolean37) {
			if (this.anInt503 < 0) {
				local40 = this.method500(arg0, arg1, local18, local44, local13.aByteArray57[this.anInt510]);
				if (this.anInt514 >= local18) {
					return;
				}
				this.anInt514 = local18 + local18 - this.anInt514 - 1;
				this.anInt503 = -this.anInt503;
			}
			while (true) {
				local40 = this.method494(arg0, local40, local23, local44, local13.aByteArray57[this.anInt509 - 1]);
				if (this.anInt514 < local23) {
					return;
				}
				this.anInt514 = local23 + local23 - this.anInt514 - 1;
				this.anInt503 = -this.anInt503;
				local40 = this.method500(arg0, local40, local18, local44, local13.aByteArray57[this.anInt510]);
				if (this.anInt514 >= local18) {
					return;
				}
				this.anInt514 = local18 + local18 - this.anInt514 - 1;
				this.anInt503 = -this.anInt503;
			}
		} else if (this.anInt503 < 0) {
			while (true) {
				local40 = this.method500(arg0, local40, local18, local44, local13.aByteArray57[this.anInt509 - 1]);
				if (this.anInt514 >= local18) {
					return;
				}
				this.anInt514 = local23 - (local23 - 1 - this.anInt514) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method494(arg0, local40, local23, local44, local13.aByteArray57[this.anInt510]);
				if (this.anInt514 < local23) {
					return;
				}
				this.anInt514 = local18 + (this.anInt514 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!bh", name = "k", descriptor = "()V")
	private void method517() {
		this.anInt506 = this.anInt502;
		this.anInt505 = Static310.method510(this.anInt502, this.anInt511);
		this.anInt513 = Static310.method503(this.anInt502, this.anInt511);
	}

	@OriginalMember(owner = "client!bh", name = "l", descriptor = "()V")
	private void method518() {
		if (this.anInt504 == 0) {
			return;
		}
		if (this.anInt502 == Integer.MIN_VALUE) {
			this.anInt502 = 0;
		}
		this.anInt504 = 0;
		this.method517();
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "()I")
	@Override
	public int method3722() {
		@Pc(6) int local6 = this.anInt506 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt507 == 0) {
			local6 -= local6 * this.anInt514 / (((Class4_Sub5_Sub1) this.aClass4_Sub5_5).aByteArray57.length << 8);
		} else if (this.anInt507 >= 0) {
			local6 -= local6 * this.anInt510 / ((Class4_Sub5_Sub1) this.aClass4_Sub5_5).aByteArray57.length;
		}
		return local6 > 255 ? 255 : local6;
	}
}
