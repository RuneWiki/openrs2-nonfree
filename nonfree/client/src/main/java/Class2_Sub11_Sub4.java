import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gs")
public final class Class2_Sub11_Sub4 extends Class2_Sub11 {

	@OriginalMember(owner = "client!gs", name = "n", descriptor = "I")
	public int anInt3877;

	@OriginalMember(owner = "client!gs", name = "p", descriptor = "I")
	private int anInt3879;

	@OriginalMember(owner = "client!gs", name = "q", descriptor = "I")
	public int anInt3880;

	@OriginalMember(owner = "client!gs", name = "r", descriptor = "I")
	public int anInt3881;

	@OriginalMember(owner = "client!gs", name = "s", descriptor = "I")
	public int anInt3882;

	@OriginalMember(owner = "client!gs", name = "w", descriptor = "I")
	public int anInt3886;

	@OriginalMember(owner = "client!gs", name = "A", descriptor = "I")
	public int anInt3889;

	@OriginalMember(owner = "client!gs", name = "B", descriptor = "I")
	private int anInt3890;

	@OriginalMember(owner = "client!gs", name = "y", descriptor = "I")
	private final int anInt3887;

	@OriginalMember(owner = "client!gs", name = "u", descriptor = "I")
	private final int anInt3884;

	@OriginalMember(owner = "client!gs", name = "x", descriptor = "Z")
	private final boolean aBoolean293;

	@OriginalMember(owner = "client!gs", name = "z", descriptor = "I")
	private int anInt3888;

	@OriginalMember(owner = "client!gs", name = "o", descriptor = "I")
	private int anInt3878;

	@OriginalMember(owner = "client!gs", name = "t", descriptor = "I")
	private int anInt3883;

	@OriginalMember(owner = "client!gs", name = "v", descriptor = "I")
	public int anInt3885;

	@OriginalMember(owner = "client!gs", name = "<init>", descriptor = "(Lclient!ct;III)V")
	public Class2_Sub11_Sub4(@OriginalArg(0) Class2_Sub14_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass2_Sub14_6 = arg0;
		this.anInt3887 = arg0.anInt2197;
		this.anInt3884 = arg0.anInt2198;
		this.aBoolean293 = arg0.aBoolean184;
		this.anInt3888 = arg1;
		this.anInt3878 = arg2;
		this.anInt3883 = arg3;
		this.anInt3885 = 0;
		this.method3363();
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "()Lclient!lea;")
	@Override
	public Class2_Sub11 method6156() {
		return null;
	}

	@OriginalMember(owner = "client!gs", name = "b", descriptor = "(I)V")
	public synchronized void method3333(@OriginalArg(0) int arg0) {
		this.method3350(arg0 << 6, this.method3344());
	}

	@OriginalMember(owner = "client!gs", name = "c", descriptor = "(I)V")
	public synchronized void method3334(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class2_Sub14_Sub1) super.aClass2_Sub14_6).aByteArray17.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt3885 = arg0;
	}

	@OriginalMember(owner = "client!gs", name = "e", descriptor = "(I)V")
	public synchronized void method3336(@OriginalArg(0) int arg0) {
		this.method3350(this.method3365(), arg0);
	}

	@OriginalMember(owner = "client!gs", name = "b", descriptor = "(III)V")
	public synchronized void method3337(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method3350(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static653.method3371(arg1, arg2);
		@Pc(14) int local14 = Static653.method3339(arg1, arg2);
		if (this.anInt3882 == local10 && this.anInt3886 == local14) {
			this.anInt3879 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt3877;
		if (this.anInt3877 - arg1 > local31) {
			local31 = this.anInt3877 - arg1;
		}
		if (local10 - this.anInt3882 > local31) {
			local31 = local10 - this.anInt3882;
		}
		if (this.anInt3882 - local10 > local31) {
			local31 = this.anInt3882 - local10;
		}
		if (local14 - this.anInt3886 > local31) {
			local31 = local14 - this.anInt3886;
		}
		if (this.anInt3886 - local14 > local31) {
			local31 = this.anInt3886 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt3879 = arg0;
		this.anInt3878 = arg1;
		this.anInt3883 = arg2;
		this.anInt3880 = (arg1 - this.anInt3877) / arg0;
		this.anInt3889 = (local10 - this.anInt3882) / arg0;
		this.anInt3881 = (local14 - this.anInt3886) / arg0;
	}

	@OriginalMember(owner = "client!gs", name = "f", descriptor = "(I)V")
	public synchronized void method3341(@OriginalArg(0) int arg0) {
		this.anInt3890 = arg0;
	}

	@OriginalMember(owner = "client!gs", name = "b", descriptor = "()Lclient!lea;")
	@Override
	public Class2_Sub11 method6157() {
		return null;
	}

	@OriginalMember(owner = "client!gs", name = "e", descriptor = "()I")
	public synchronized int method3344() {
		return this.anInt3883 < 0 ? -1 : this.anInt3883;
	}

	@OriginalMember(owner = "client!gs", name = "f", descriptor = "()Z")
	public boolean method3346() {
		return this.anInt3885 < 0 || this.anInt3885 >= ((Class2_Sub14_Sub1) super.aClass2_Sub14_6).aByteArray17.length << 8;
	}

	@OriginalMember(owner = "client!gs", name = "g", descriptor = "()V")
	private void method3347() {
		if (this.anInt3879 == 0) {
			return;
		}
		if (this.anInt3878 == Integer.MIN_VALUE) {
			this.anInt3878 = 0;
		}
		this.anInt3879 = 0;
		this.method3363();
	}

	@OriginalMember(owner = "client!gs", name = "g", descriptor = "(I)V")
	public synchronized void method3348(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method3370();
			this.method8920();
		} else if (this.anInt3882 == 0 && this.anInt3886 == 0) {
			this.anInt3879 = 0;
			this.anInt3878 = 0;
			this.anInt3877 = 0;
			this.method8920();
		} else {
			@Pc(31) int local31 = -this.anInt3877;
			if (this.anInt3877 > local31) {
				local31 = this.anInt3877;
			}
			if (-this.anInt3882 > local31) {
				local31 = -this.anInt3882;
			}
			if (this.anInt3882 > local31) {
				local31 = this.anInt3882;
			}
			if (-this.anInt3886 > local31) {
				local31 = -this.anInt3886;
			}
			if (this.anInt3886 > local31) {
				local31 = this.anInt3886;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt3879 = arg0;
			this.anInt3878 = Integer.MIN_VALUE;
			this.anInt3880 = -this.anInt3877 / arg0;
			this.anInt3889 = -this.anInt3882 / arg0;
			this.anInt3881 = -this.anInt3886 / arg0;
		}
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method6159(@OriginalArg(0) int arg0) {
		if (this.anInt3879 > 0) {
			if (arg0 >= this.anInt3879) {
				if (this.anInt3878 == Integer.MIN_VALUE) {
					this.anInt3878 = 0;
					this.anInt3877 = this.anInt3882 = this.anInt3886 = 0;
					this.method8920();
					arg0 = this.anInt3879;
				}
				this.anInt3879 = 0;
				this.method3363();
			} else {
				this.anInt3877 += this.anInt3880 * arg0;
				this.anInt3882 += this.anInt3889 * arg0;
				this.anInt3886 += this.anInt3881 * arg0;
				this.anInt3879 -= arg0;
			}
		}
		@Pc(71) Class2_Sub14_Sub1 local71 = (Class2_Sub14_Sub1) super.aClass2_Sub14_6;
		@Pc(76) int local76 = this.anInt3887 << 8;
		@Pc(81) int local81 = this.anInt3884 << 8;
		@Pc(87) int local87 = local71.aByteArray17.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt3890 = 0;
		}
		if (this.anInt3885 < 0) {
			if (this.anInt3888 <= 0) {
				this.method3347();
				this.method8920();
				return;
			}
			this.anInt3885 = 0;
		}
		if (this.anInt3885 >= local87) {
			if (this.anInt3888 >= 0) {
				this.method3347();
				this.method8920();
				return;
			}
			this.anInt3885 = local87 - 1;
		}
		this.anInt3885 += this.anInt3888 * arg0;
		if (this.anInt3890 >= 0) {
			if (this.anInt3890 > 0) {
				if (this.aBoolean293) {
					label125: {
						if (this.anInt3888 < 0) {
							if (this.anInt3885 >= local76) {
								return;
							}
							this.anInt3885 = local76 + local76 - this.anInt3885 - 1;
							this.anInt3888 = -this.anInt3888;
							if (--this.anInt3890 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt3885 < local81) {
								return;
							}
							this.anInt3885 = local81 + local81 - this.anInt3885 - 1;
							this.anInt3888 = -this.anInt3888;
							if (--this.anInt3890 == 0) {
								break;
							}
							if (this.anInt3885 >= local76) {
								return;
							}
							this.anInt3885 = local76 + local76 - this.anInt3885 - 1;
							this.anInt3888 = -this.anInt3888;
						} while (--this.anInt3890 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt3888 < 0) {
						if (this.anInt3885 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt3885 - 1) / local91;
						if (local361 < this.anInt3890) {
							this.anInt3885 += local91 * local361;
							this.anInt3890 -= local361;
							return;
						}
						this.anInt3885 += local91 * this.anInt3890;
						this.anInt3890 = 0;
					} else if (this.anInt3885 >= local81) {
						local361 = (this.anInt3885 - local76) / local91;
						if (local361 < this.anInt3890) {
							this.anInt3885 -= local91 * local361;
							this.anInt3890 -= local361;
							return;
						}
						this.anInt3885 -= local91 * this.anInt3890;
						this.anInt3890 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt3888 < 0) {
				if (this.anInt3885 < 0) {
					this.anInt3885 = -1;
					this.method3347();
					this.method8920();
					return;
				}
			} else if (this.anInt3885 >= local87) {
				this.anInt3885 = local87;
				this.method3347();
				this.method8920();
			}
		} else if (this.aBoolean293) {
			if (this.anInt3888 < 0) {
				if (this.anInt3885 >= local76) {
					return;
				}
				this.anInt3885 = local76 + local76 - this.anInt3885 - 1;
				this.anInt3888 = -this.anInt3888;
			}
			while (this.anInt3885 >= local81) {
				this.anInt3885 = local81 + local81 - this.anInt3885 - 1;
				this.anInt3888 = -this.anInt3888;
				if (this.anInt3885 >= local76) {
					return;
				}
				this.anInt3885 = local76 + local76 - this.anInt3885 - 1;
				this.anInt3888 = -this.anInt3888;
			}
		} else if (this.anInt3888 < 0) {
			if (this.anInt3885 < local76) {
				this.anInt3885 = local81 - (local81 - 1 - this.anInt3885) % local91 - 1;
			}
		} else if (this.anInt3885 >= local81) {
			this.anInt3885 = local76 + (this.anInt3885 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!gs", name = "b", descriptor = "(II)V")
	private synchronized void method3350(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3878 = arg0;
		this.anInt3883 = arg1;
		this.anInt3879 = 0;
		this.method3363();
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method6155(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt3878 == 0 && this.anInt3879 == 0) {
			this.method6159(arg2);
			return;
		}
		@Pc(13) Class2_Sub14_Sub1 local13 = (Class2_Sub14_Sub1) super.aClass2_Sub14_6;
		@Pc(18) int local18 = this.anInt3887 << 8;
		@Pc(23) int local23 = this.anInt3884 << 8;
		@Pc(29) int local29 = local13.aByteArray17.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt3890 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt3885 < 0) {
			if (this.anInt3888 <= 0) {
				this.method3347();
				this.method8920();
				return;
			}
			this.anInt3885 = 0;
		}
		if (this.anInt3885 >= local29) {
			if (this.anInt3888 >= 0) {
				this.method3347();
				this.method8920();
				return;
			}
			this.anInt3885 = local29 - 1;
		}
		if (this.anInt3890 >= 0) {
			if (this.anInt3890 > 0) {
				if (this.aBoolean293) {
					label130: {
						if (this.anInt3888 < 0) {
							local40 = this.method3369(arg0, arg1, local18, local44, local13.aByteArray17[this.anInt3887]);
							if (this.anInt3885 >= local18) {
								return;
							}
							this.anInt3885 = local18 + local18 - this.anInt3885 - 1;
							this.anInt3888 = -this.anInt3888;
							if (--this.anInt3890 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method3368(arg0, local40, local23, local44, local13.aByteArray17[this.anInt3884 - 1]);
							if (this.anInt3885 < local23) {
								return;
							}
							this.anInt3885 = local23 + local23 - this.anInt3885 - 1;
							this.anInt3888 = -this.anInt3888;
							if (--this.anInt3890 == 0) {
								break;
							}
							local40 = this.method3369(arg0, local40, local18, local44, local13.aByteArray17[this.anInt3887]);
							if (this.anInt3885 >= local18) {
								return;
							}
							this.anInt3885 = local18 + local18 - this.anInt3885 - 1;
							this.anInt3888 = -this.anInt3888;
						} while (--this.anInt3890 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt3888 < 0) {
						while (true) {
							local40 = this.method3369(arg0, local40, local18, local44, local13.aByteArray17[this.anInt3884 - 1]);
							if (this.anInt3885 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt3885 - 1) / local33;
							if (local416 >= this.anInt3890) {
								this.anInt3885 += local33 * this.anInt3890;
								this.anInt3890 = 0;
								break;
							}
							this.anInt3885 += local33 * local416;
							this.anInt3890 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method3368(arg0, local40, local23, local44, local13.aByteArray17[this.anInt3887]);
							if (this.anInt3885 < local23) {
								return;
							}
							local416 = (this.anInt3885 - local18) / local33;
							if (local416 >= this.anInt3890) {
								this.anInt3885 -= local33 * this.anInt3890;
								this.anInt3890 = 0;
								break;
							}
							this.anInt3885 -= local33 * local416;
							this.anInt3890 -= local416;
						}
					}
				}
			}
			if (this.anInt3888 < 0) {
				this.method3369(arg0, local40, 0, local44, 0);
				if (this.anInt3885 < 0) {
					this.anInt3885 = -1;
					this.method3347();
					this.method8920();
					return;
				}
			} else {
				this.method3368(arg0, local40, local29, local44, 0);
				if (this.anInt3885 >= local29) {
					this.anInt3885 = local29;
					this.method3347();
					this.method8920();
				}
			}
		} else if (this.aBoolean293) {
			if (this.anInt3888 < 0) {
				local40 = this.method3369(arg0, arg1, local18, local44, local13.aByteArray17[this.anInt3887]);
				if (this.anInt3885 >= local18) {
					return;
				}
				this.anInt3885 = local18 + local18 - this.anInt3885 - 1;
				this.anInt3888 = -this.anInt3888;
			}
			while (true) {
				local40 = this.method3368(arg0, local40, local23, local44, local13.aByteArray17[this.anInt3884 - 1]);
				if (this.anInt3885 < local23) {
					return;
				}
				this.anInt3885 = local23 + local23 - this.anInt3885 - 1;
				this.anInt3888 = -this.anInt3888;
				local40 = this.method3369(arg0, local40, local18, local44, local13.aByteArray17[this.anInt3887]);
				if (this.anInt3885 >= local18) {
					return;
				}
				this.anInt3885 = local18 + local18 - this.anInt3885 - 1;
				this.anInt3888 = -this.anInt3888;
			}
		} else if (this.anInt3888 < 0) {
			while (true) {
				local40 = this.method3369(arg0, local40, local18, local44, local13.aByteArray17[this.anInt3884 - 1]);
				if (this.anInt3885 >= local18) {
					return;
				}
				this.anInt3885 = local23 - (local23 - 1 - this.anInt3885) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method3368(arg0, local40, local23, local44, local13.aByteArray17[this.anInt3887]);
				if (this.anInt3885 < local23) {
					return;
				}
				this.anInt3885 = local18 + (this.anInt3885 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(Z)V")
	public synchronized void method3352() {
		this.anInt3888 = (this.anInt3888 ^ this.anInt3888 >> 31) + (this.anInt3888 >>> 31);
		this.anInt3888 = -this.anInt3888;
	}

	@OriginalMember(owner = "client!gs", name = "c", descriptor = "(II)V")
	public synchronized void method3353(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method3337(arg0, arg1, this.method3344());
	}

	@OriginalMember(owner = "client!gs", name = "h", descriptor = "(I)V")
	public synchronized void method3357(@OriginalArg(0) int arg0) {
		if (this.anInt3888 < 0) {
			this.anInt3888 = -arg0;
		} else {
			this.anInt3888 = arg0;
		}
	}

	@OriginalMember(owner = "client!gs", name = "c", descriptor = "()I")
	@Override
	public int method6160() {
		@Pc(6) int local6 = this.anInt3877 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt3890 == 0) {
			local6 -= local6 * this.anInt3885 / (((Class2_Sub14_Sub1) super.aClass2_Sub14_6).aByteArray17.length << 8);
		} else if (this.anInt3890 >= 0) {
			local6 -= local6 * this.anInt3887 / ((Class2_Sub14_Sub1) super.aClass2_Sub14_6).aByteArray17.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!gs", name = "d", descriptor = "()I")
	@Override
	public int method6161() {
		return this.anInt3878 == 0 && this.anInt3879 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!gs", name = "h", descriptor = "()Z")
	private boolean method3360() {
		@Pc(2) int local2 = this.anInt3878;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static653.method3371(local2, this.anInt3883);
			local8 = Static653.method3339(local2, this.anInt3883);
		}
		if (this.anInt3877 != local2 || this.anInt3882 != local10 || this.anInt3886 != local8) {
			if (this.anInt3877 < local2) {
				this.anInt3880 = 1;
				this.anInt3879 = local2 - this.anInt3877;
			} else if (this.anInt3877 > local2) {
				this.anInt3880 = -1;
				this.anInt3879 = this.anInt3877 - local2;
			} else {
				this.anInt3880 = 0;
			}
			if (this.anInt3882 < local10) {
				this.anInt3889 = 1;
				if (this.anInt3879 == 0 || this.anInt3879 > local10 - this.anInt3882) {
					this.anInt3879 = local10 - this.anInt3882;
				}
			} else if (this.anInt3882 > local10) {
				this.anInt3889 = -1;
				if (this.anInt3879 == 0 || this.anInt3879 > this.anInt3882 - local10) {
					this.anInt3879 = this.anInt3882 - local10;
				}
			} else {
				this.anInt3889 = 0;
			}
			if (this.anInt3886 < local8) {
				this.anInt3881 = 1;
				if (this.anInt3879 == 0 || this.anInt3879 > local8 - this.anInt3886) {
					this.anInt3879 = local8 - this.anInt3886;
				}
			} else if (this.anInt3886 > local8) {
				this.anInt3881 = -1;
				if (this.anInt3879 == 0 || this.anInt3879 > this.anInt3886 - local8) {
					this.anInt3879 = this.anInt3886 - local8;
				}
			} else {
				this.anInt3881 = 0;
			}
			return false;
		} else if (this.anInt3878 == Integer.MIN_VALUE) {
			this.anInt3878 = 0;
			this.anInt3877 = this.anInt3882 = this.anInt3886 = 0;
			this.method8920();
			return true;
		} else {
			this.method3363();
			return false;
		}
	}

	@OriginalMember(owner = "client!gs", name = "i", descriptor = "()Z")
	public boolean method3361() {
		return this.anInt3879 != 0;
	}

	@OriginalMember(owner = "client!gs", name = "j", descriptor = "()V")
	private void method3363() {
		this.anInt3877 = this.anInt3878;
		this.anInt3882 = Static653.method3371(this.anInt3878, this.anInt3883);
		this.anInt3886 = Static653.method3339(this.anInt3878, this.anInt3883);
	}

	@OriginalMember(owner = "client!gs", name = "k", descriptor = "()I")
	public synchronized int method3365() {
		return this.anInt3878 == Integer.MIN_VALUE ? 0 : this.anInt3878;
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "([IIIII)I")
	private int method3368(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt3879 <= 0) {
				if (this.anInt3888 == 256 && (this.anInt3885 & 0xFF) == 0) {
					if (Static40.aBoolean75) {
						return Static653.method3351(((Class2_Sub14_Sub1) super.aClass2_Sub14_6).aByteArray17, arg0, this.anInt3885, arg1, this.anInt3882, this.anInt3886, arg3, arg2, this);
					}
					return Static653.method3335(((Class2_Sub14_Sub1) super.aClass2_Sub14_6).aByteArray17, arg0, this.anInt3885, arg1, this.anInt3877, arg3, arg2, this);
				}
				if (Static40.aBoolean75) {
					return Static653.method3359(((Class2_Sub14_Sub1) super.aClass2_Sub14_6).aByteArray17, arg0, this.anInt3885, arg1, this.anInt3882, this.anInt3886, arg3, arg2, this, this.anInt3888, arg4);
				}
				return Static653.method3340(((Class2_Sub14_Sub1) super.aClass2_Sub14_6).aByteArray17, arg0, this.anInt3885, arg1, this.anInt3877, arg3, arg2, this, this.anInt3888, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt3879;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt3879 += arg1;
			if (this.anInt3888 == 256 && (this.anInt3885 & 0xFF) == 0) {
				if (Static40.aBoolean75) {
					arg1 = Static653.method3342(((Class2_Sub14_Sub1) super.aClass2_Sub14_6).aByteArray17, arg0, this.anInt3885, arg1, this.anInt3882, this.anInt3886, this.anInt3889, this.anInt3881, local5, arg2, this);
				} else {
					arg1 = Static653.method3362(((Class2_Sub14_Sub1) super.aClass2_Sub14_6).aByteArray17, arg0, this.anInt3885, arg1, this.anInt3877, this.anInt3880, local5, arg2, this);
				}
			} else if (Static40.aBoolean75) {
				arg1 = Static653.method3355(((Class2_Sub14_Sub1) super.aClass2_Sub14_6).aByteArray17, arg0, this.anInt3885, arg1, this.anInt3882, this.anInt3886, this.anInt3889, this.anInt3881, local5, arg2, this, this.anInt3888, arg4);
			} else {
				arg1 = Static653.method3354(((Class2_Sub14_Sub1) super.aClass2_Sub14_6).aByteArray17, arg0, this.anInt3885, arg1, this.anInt3877, this.anInt3880, local5, arg2, this, this.anInt3888, arg4);
			}
			this.anInt3879 -= arg1;
			if (this.anInt3879 != 0) {
				return arg1;
			}
		} while (!this.method3360());
		return arg3;
	}

	@OriginalMember(owner = "client!gs", name = "b", descriptor = "([IIIII)I")
	private int method3369(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt3879 <= 0) {
				if (this.anInt3888 == -256 && (this.anInt3885 & 0xFF) == 0) {
					if (Static40.aBoolean75) {
						return Static653.method3358(((Class2_Sub14_Sub1) super.aClass2_Sub14_6).aByteArray17, arg0, this.anInt3885, arg1, this.anInt3882, this.anInt3886, arg3, arg2, this);
					}
					return Static653.method3356(((Class2_Sub14_Sub1) super.aClass2_Sub14_6).aByteArray17, arg0, this.anInt3885, arg1, this.anInt3877, arg3, arg2, this);
				}
				if (Static40.aBoolean75) {
					return Static653.method3349(((Class2_Sub14_Sub1) super.aClass2_Sub14_6).aByteArray17, arg0, this.anInt3885, arg1, this.anInt3882, this.anInt3886, arg3, arg2, this, this.anInt3888, arg4);
				}
				return Static653.method3367(((Class2_Sub14_Sub1) super.aClass2_Sub14_6).aByteArray17, arg0, this.anInt3885, arg1, this.anInt3877, arg3, arg2, this, this.anInt3888, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt3879;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt3879 += arg1;
			if (this.anInt3888 == -256 && (this.anInt3885 & 0xFF) == 0) {
				if (Static40.aBoolean75) {
					arg1 = Static653.method3338(((Class2_Sub14_Sub1) super.aClass2_Sub14_6).aByteArray17, arg0, this.anInt3885, arg1, this.anInt3882, this.anInt3886, this.anInt3889, this.anInt3881, local5, arg2, this);
				} else {
					arg1 = Static653.method3345(((Class2_Sub14_Sub1) super.aClass2_Sub14_6).aByteArray17, arg0, this.anInt3885, arg1, this.anInt3877, this.anInt3880, local5, arg2, this);
				}
			} else if (Static40.aBoolean75) {
				arg1 = Static653.method3366(((Class2_Sub14_Sub1) super.aClass2_Sub14_6).aByteArray17, arg0, this.anInt3885, arg1, this.anInt3882, this.anInt3886, this.anInt3889, this.anInt3881, local5, arg2, this, this.anInt3888, arg4);
			} else {
				arg1 = Static653.method3364(((Class2_Sub14_Sub1) super.aClass2_Sub14_6).aByteArray17, arg0, this.anInt3885, arg1, this.anInt3877, this.anInt3880, local5, arg2, this, this.anInt3888, arg4);
			}
			this.anInt3879 -= arg1;
			if (this.anInt3879 != 0) {
				return arg1;
			}
		} while (!this.method3360());
		return arg3;
	}

	@OriginalMember(owner = "client!gs", name = "i", descriptor = "(I)V")
	private synchronized void method3370() {
		this.method3350(0, this.method3344());
	}

	@OriginalMember(owner = "client!gs", name = "l", descriptor = "()I")
	public synchronized int method3372() {
		return this.anInt3888 < 0 ? -this.anInt3888 : this.anInt3888;
	}
}
