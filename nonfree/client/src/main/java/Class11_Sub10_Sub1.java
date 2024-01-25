import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dd")
public final class Class11_Sub10_Sub1 extends Class11_Sub10 {

	@OriginalMember(owner = "client!dd", name = "n", descriptor = "I")
	private int anInt979;

	@OriginalMember(owner = "client!dd", name = "p", descriptor = "I")
	public int anInt981;

	@OriginalMember(owner = "client!dd", name = "u", descriptor = "I")
	public int anInt986;

	@OriginalMember(owner = "client!dd", name = "w", descriptor = "I")
	public int anInt988;

	@OriginalMember(owner = "client!dd", name = "x", descriptor = "I")
	public int anInt989;

	@OriginalMember(owner = "client!dd", name = "y", descriptor = "I")
	public int anInt990;

	@OriginalMember(owner = "client!dd", name = "z", descriptor = "I")
	public int anInt991;

	@OriginalMember(owner = "client!dd", name = "A", descriptor = "I")
	private int anInt992;

	@OriginalMember(owner = "client!dd", name = "t", descriptor = "I")
	private final int anInt985;

	@OriginalMember(owner = "client!dd", name = "s", descriptor = "I")
	private final int anInt984;

	@OriginalMember(owner = "client!dd", name = "B", descriptor = "Z")
	private final boolean aBoolean62;

	@OriginalMember(owner = "client!dd", name = "o", descriptor = "I")
	private int anInt980;

	@OriginalMember(owner = "client!dd", name = "v", descriptor = "I")
	private int anInt987;

	@OriginalMember(owner = "client!dd", name = "q", descriptor = "I")
	private int anInt982;

	@OriginalMember(owner = "client!dd", name = "r", descriptor = "I")
	public int anInt983;

	@OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(Lclient!vj;II)V")
	public Class11_Sub10_Sub1(@OriginalArg(0) Class11_Sub15_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass11_Sub15_5 = arg0;
		this.anInt985 = arg0.anInt6417;
		this.anInt984 = arg0.anInt6418;
		this.aBoolean62 = arg0.aBoolean416;
		this.anInt980 = arg1;
		this.anInt987 = arg2;
		this.anInt982 = 8192;
		this.anInt983 = 0;
		this.method758();
	}

	@OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(Lclient!vj;III)V")
	public Class11_Sub10_Sub1(@OriginalArg(0) Class11_Sub15_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass11_Sub15_5 = arg0;
		this.anInt985 = arg0.anInt6417;
		this.anInt984 = arg0.anInt6418;
		this.aBoolean62 = arg0.aBoolean416;
		this.anInt980 = arg1;
		this.anInt987 = arg2;
		this.anInt982 = arg3;
		this.anInt983 = 0;
		this.method758();
	}

	@OriginalMember(owner = "client!dd", name = "e", descriptor = "()V")
	private void method758() {
		this.anInt990 = this.anInt987;
		this.anInt981 = Static361.method771(this.anInt987, this.anInt982);
		this.anInt989 = Static361.method770(this.anInt987, this.anInt982);
	}

	@OriginalMember(owner = "client!dd", name = "c", descriptor = "(I)V")
	public synchronized void method760(@OriginalArg(0) int arg0) {
		this.method774(arg0 << 6, this.method769());
	}

	@OriginalMember(owner = "client!dd", name = "f", descriptor = "()Z")
	private boolean method763() {
		@Pc(2) int local2 = this.anInt987;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static361.method771(local2, this.anInt982);
			local8 = Static361.method770(local2, this.anInt982);
		}
		if (this.anInt990 != local2 || this.anInt981 != local10 || this.anInt989 != local8) {
			if (this.anInt990 < local2) {
				this.anInt986 = 1;
				this.anInt979 = local2 - this.anInt990;
			} else if (this.anInt990 > local2) {
				this.anInt986 = -1;
				this.anInt979 = this.anInt990 - local2;
			} else {
				this.anInt986 = 0;
			}
			if (this.anInt981 < local10) {
				this.anInt991 = 1;
				if (this.anInt979 == 0 || this.anInt979 > local10 - this.anInt981) {
					this.anInt979 = local10 - this.anInt981;
				}
			} else if (this.anInt981 > local10) {
				this.anInt991 = -1;
				if (this.anInt979 == 0 || this.anInt979 > this.anInt981 - local10) {
					this.anInt979 = this.anInt981 - local10;
				}
			} else {
				this.anInt991 = 0;
			}
			if (this.anInt989 < local8) {
				this.anInt988 = 1;
				if (this.anInt979 == 0 || this.anInt979 > local8 - this.anInt989) {
					this.anInt979 = local8 - this.anInt989;
				}
			} else if (this.anInt989 > local8) {
				this.anInt988 = -1;
				if (this.anInt979 == 0 || this.anInt979 > this.anInt989 - local8) {
					this.anInt979 = this.anInt989 - local8;
				}
			} else {
				this.anInt988 = 0;
			}
			return false;
		} else if (this.anInt987 == Integer.MIN_VALUE) {
			this.anInt987 = 0;
			this.anInt990 = this.anInt981 = this.anInt989 = 0;
			this.method5701();
			return true;
		} else {
			this.method758();
			return false;
		}
	}

	@OriginalMember(owner = "client!dd", name = "g", descriptor = "()I")
	public synchronized int method769() {
		return this.anInt982 < 0 ? -1 : this.anInt982;
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method4057(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt987 == 0 && this.anInt979 == 0) {
			this.method4060(arg2);
			return;
		}
		@Pc(13) Class11_Sub15_Sub1 local13 = (Class11_Sub15_Sub1) super.aClass11_Sub15_5;
		@Pc(18) int local18 = this.anInt985 << 8;
		@Pc(23) int local23 = this.anInt984 << 8;
		@Pc(29) int local29 = local13.aByteArray95.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt992 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt983 < 0) {
			if (this.anInt980 <= 0) {
				this.method794();
				this.method5701();
				return;
			}
			this.anInt983 = 0;
		}
		if (this.anInt983 >= local29) {
			if (this.anInt980 >= 0) {
				this.method794();
				this.method5701();
				return;
			}
			this.anInt983 = local29 - 1;
		}
		if (this.anInt992 >= 0) {
			if (this.anInt992 > 0) {
				if (this.aBoolean62) {
					label130: {
						if (this.anInt980 < 0) {
							local40 = this.method777(arg0, arg1, local18, local44, local13.aByteArray95[this.anInt985]);
							if (this.anInt983 >= local18) {
								return;
							}
							this.anInt983 = local18 + local18 - this.anInt983 - 1;
							this.anInt980 = -this.anInt980;
							if (--this.anInt992 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method772(arg0, local40, local23, local44, local13.aByteArray95[this.anInt984 - 1]);
							if (this.anInt983 < local23) {
								return;
							}
							this.anInt983 = local23 + local23 - this.anInt983 - 1;
							this.anInt980 = -this.anInt980;
							if (--this.anInt992 == 0) {
								break;
							}
							local40 = this.method777(arg0, local40, local18, local44, local13.aByteArray95[this.anInt985]);
							if (this.anInt983 >= local18) {
								return;
							}
							this.anInt983 = local18 + local18 - this.anInt983 - 1;
							this.anInt980 = -this.anInt980;
						} while (--this.anInt992 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt980 < 0) {
						while (true) {
							local40 = this.method777(arg0, local40, local18, local44, local13.aByteArray95[this.anInt984 - 1]);
							if (this.anInt983 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt983 - 1) / local33;
							if (local416 >= this.anInt992) {
								this.anInt983 += local33 * this.anInt992;
								this.anInt992 = 0;
								break;
							}
							this.anInt983 += local33 * local416;
							this.anInt992 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method772(arg0, local40, local23, local44, local13.aByteArray95[this.anInt985]);
							if (this.anInt983 < local23) {
								return;
							}
							local416 = (this.anInt983 - local18) / local33;
							if (local416 >= this.anInt992) {
								this.anInt983 -= local33 * this.anInt992;
								this.anInt992 = 0;
								break;
							}
							this.anInt983 -= local33 * local416;
							this.anInt992 -= local416;
						}
					}
				}
			}
			if (this.anInt980 < 0) {
				this.method777(arg0, local40, 0, local44, 0);
				if (this.anInt983 < 0) {
					this.anInt983 = -1;
					this.method794();
					this.method5701();
					return;
				}
			} else {
				this.method772(arg0, local40, local29, local44, 0);
				if (this.anInt983 >= local29) {
					this.anInt983 = local29;
					this.method794();
					this.method5701();
				}
			}
		} else if (this.aBoolean62) {
			if (this.anInt980 < 0) {
				local40 = this.method777(arg0, arg1, local18, local44, local13.aByteArray95[this.anInt985]);
				if (this.anInt983 >= local18) {
					return;
				}
				this.anInt983 = local18 + local18 - this.anInt983 - 1;
				this.anInt980 = -this.anInt980;
			}
			while (true) {
				local40 = this.method772(arg0, local40, local23, local44, local13.aByteArray95[this.anInt984 - 1]);
				if (this.anInt983 < local23) {
					return;
				}
				this.anInt983 = local23 + local23 - this.anInt983 - 1;
				this.anInt980 = -this.anInt980;
				local40 = this.method777(arg0, local40, local18, local44, local13.aByteArray95[this.anInt985]);
				if (this.anInt983 >= local18) {
					return;
				}
				this.anInt983 = local18 + local18 - this.anInt983 - 1;
				this.anInt980 = -this.anInt980;
			}
		} else if (this.anInt980 < 0) {
			while (true) {
				local40 = this.method777(arg0, local40, local18, local44, local13.aByteArray95[this.anInt984 - 1]);
				if (this.anInt983 >= local18) {
					return;
				}
				this.anInt983 = local23 - (local23 - 1 - this.anInt983) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method772(arg0, local40, local23, local44, local13.aByteArray95[this.anInt985]);
				if (this.anInt983 < local23) {
					return;
				}
				this.anInt983 = local18 + (this.anInt983 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "([IIIII)I")
	private int method772(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt979 <= 0) {
				if (this.anInt980 == 256 && (this.anInt983 & 0xFF) == 0) {
					if (Static178.aBoolean224) {
						return Static361.method789(((Class11_Sub15_Sub1) super.aClass11_Sub15_5).aByteArray95, arg0, this.anInt983, arg1, this.anInt981, this.anInt989, arg3, arg2, this);
					}
					return Static361.method768(((Class11_Sub15_Sub1) super.aClass11_Sub15_5).aByteArray95, arg0, this.anInt983, arg1, this.anInt990, arg3, arg2, this);
				}
				if (Static178.aBoolean224) {
					return Static361.method779(((Class11_Sub15_Sub1) super.aClass11_Sub15_5).aByteArray95, arg0, this.anInt983, arg1, this.anInt981, this.anInt989, arg3, arg2, this, this.anInt980, arg4);
				}
				return Static361.method767(((Class11_Sub15_Sub1) super.aClass11_Sub15_5).aByteArray95, arg0, this.anInt983, arg1, this.anInt990, arg3, arg2, this, this.anInt980, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt979;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt979 += arg1;
			if (this.anInt980 == 256 && (this.anInt983 & 0xFF) == 0) {
				if (Static178.aBoolean224) {
					arg1 = Static361.method759(((Class11_Sub15_Sub1) super.aClass11_Sub15_5).aByteArray95, arg0, this.anInt983, arg1, this.anInt981, this.anInt989, this.anInt991, this.anInt988, local5, arg2, this);
				} else {
					arg1 = Static361.method795(((Class11_Sub15_Sub1) super.aClass11_Sub15_5).aByteArray95, arg0, this.anInt983, arg1, this.anInt990, this.anInt986, local5, arg2, this);
				}
			} else if (Static178.aBoolean224) {
				arg1 = Static361.method783(((Class11_Sub15_Sub1) super.aClass11_Sub15_5).aByteArray95, arg0, this.anInt983, arg1, this.anInt981, this.anInt989, this.anInt991, this.anInt988, local5, arg2, this, this.anInt980, arg4);
			} else {
				arg1 = Static361.method766(((Class11_Sub15_Sub1) super.aClass11_Sub15_5).aByteArray95, arg0, this.anInt983, arg1, this.anInt990, this.anInt986, local5, arg2, this, this.anInt980, arg4);
			}
			this.anInt979 -= arg1;
			if (this.anInt979 != 0) {
				return arg1;
			}
		} while (!this.method763());
		return arg3;
	}

	@OriginalMember(owner = "client!dd", name = "c", descriptor = "(II)V")
	private synchronized void method774(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt987 = arg0;
		this.anInt982 = arg1;
		this.anInt979 = 0;
		this.method758();
	}

	@OriginalMember(owner = "client!dd", name = "d", descriptor = "(I)V")
	public synchronized void method776(@OriginalArg(0) int arg0) {
		if (this.anInt980 < 0) {
			this.anInt980 = -arg0;
		} else {
			this.anInt980 = arg0;
		}
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "([IIIII)I")
	private int method777(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt979 <= 0) {
				if (this.anInt980 == -256 && (this.anInt983 & 0xFF) == 0) {
					if (Static178.aBoolean224) {
						return Static361.method778(((Class11_Sub15_Sub1) super.aClass11_Sub15_5).aByteArray95, arg0, this.anInt983, arg1, this.anInt981, this.anInt989, arg3, arg2, this);
					}
					return Static361.method764(((Class11_Sub15_Sub1) super.aClass11_Sub15_5).aByteArray95, arg0, this.anInt983, arg1, this.anInt990, arg3, arg2, this);
				}
				if (Static178.aBoolean224) {
					return Static361.method761(((Class11_Sub15_Sub1) super.aClass11_Sub15_5).aByteArray95, arg0, this.anInt983, arg1, this.anInt981, this.anInt989, arg3, arg2, this, this.anInt980, arg4);
				}
				return Static361.method782(((Class11_Sub15_Sub1) super.aClass11_Sub15_5).aByteArray95, arg0, this.anInt983, arg1, this.anInt990, arg3, arg2, this, this.anInt980, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt979;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt979 += arg1;
			if (this.anInt980 == -256 && (this.anInt983 & 0xFF) == 0) {
				if (Static178.aBoolean224) {
					arg1 = Static361.method780(((Class11_Sub15_Sub1) super.aClass11_Sub15_5).aByteArray95, arg0, this.anInt983, arg1, this.anInt981, this.anInt989, this.anInt991, this.anInt988, local5, arg2, this);
				} else {
					arg1 = Static361.method765(((Class11_Sub15_Sub1) super.aClass11_Sub15_5).aByteArray95, arg0, this.anInt983, arg1, this.anInt990, this.anInt986, local5, arg2, this);
				}
			} else if (Static178.aBoolean224) {
				arg1 = Static361.method775(((Class11_Sub15_Sub1) super.aClass11_Sub15_5).aByteArray95, arg0, this.anInt983, arg1, this.anInt981, this.anInt989, this.anInt991, this.anInt988, local5, arg2, this, this.anInt980, arg4);
			} else {
				arg1 = Static361.method762(((Class11_Sub15_Sub1) super.aClass11_Sub15_5).aByteArray95, arg0, this.anInt983, arg1, this.anInt990, this.anInt986, local5, arg2, this, this.anInt980, arg4);
			}
			this.anInt979 -= arg1;
			if (this.anInt979 != 0) {
				return arg1;
			}
		} while (!this.method763());
		return arg3;
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method4060(@OriginalArg(0) int arg0) {
		if (this.anInt979 > 0) {
			if (arg0 >= this.anInt979) {
				if (this.anInt987 == Integer.MIN_VALUE) {
					this.anInt987 = 0;
					this.anInt990 = this.anInt981 = this.anInt989 = 0;
					this.method5701();
					arg0 = this.anInt979;
				}
				this.anInt979 = 0;
				this.method758();
			} else {
				this.anInt990 += this.anInt986 * arg0;
				this.anInt981 += this.anInt991 * arg0;
				this.anInt989 += this.anInt988 * arg0;
				this.anInt979 -= arg0;
			}
		}
		@Pc(71) Class11_Sub15_Sub1 local71 = (Class11_Sub15_Sub1) super.aClass11_Sub15_5;
		@Pc(76) int local76 = this.anInt985 << 8;
		@Pc(81) int local81 = this.anInt984 << 8;
		@Pc(87) int local87 = local71.aByteArray95.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt992 = 0;
		}
		if (this.anInt983 < 0) {
			if (this.anInt980 <= 0) {
				this.method794();
				this.method5701();
				return;
			}
			this.anInt983 = 0;
		}
		if (this.anInt983 >= local87) {
			if (this.anInt980 >= 0) {
				this.method794();
				this.method5701();
				return;
			}
			this.anInt983 = local87 - 1;
		}
		this.anInt983 += this.anInt980 * arg0;
		if (this.anInt992 >= 0) {
			if (this.anInt992 > 0) {
				if (this.aBoolean62) {
					label125: {
						if (this.anInt980 < 0) {
							if (this.anInt983 >= local76) {
								return;
							}
							this.anInt983 = local76 + local76 - this.anInt983 - 1;
							this.anInt980 = -this.anInt980;
							if (--this.anInt992 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt983 < local81) {
								return;
							}
							this.anInt983 = local81 + local81 - this.anInt983 - 1;
							this.anInt980 = -this.anInt980;
							if (--this.anInt992 == 0) {
								break;
							}
							if (this.anInt983 >= local76) {
								return;
							}
							this.anInt983 = local76 + local76 - this.anInt983 - 1;
							this.anInt980 = -this.anInt980;
						} while (--this.anInt992 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt980 < 0) {
						if (this.anInt983 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt983 - 1) / local91;
						if (local361 < this.anInt992) {
							this.anInt983 += local91 * local361;
							this.anInt992 -= local361;
							return;
						}
						this.anInt983 += local91 * this.anInt992;
						this.anInt992 = 0;
					} else if (this.anInt983 >= local81) {
						local361 = (this.anInt983 - local76) / local91;
						if (local361 < this.anInt992) {
							this.anInt983 -= local91 * local361;
							this.anInt992 -= local361;
							return;
						}
						this.anInt983 -= local91 * this.anInt992;
						this.anInt992 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt980 < 0) {
				if (this.anInt983 < 0) {
					this.anInt983 = -1;
					this.method794();
					this.method5701();
					return;
				}
			} else if (this.anInt983 >= local87) {
				this.anInt983 = local87;
				this.method794();
				this.method5701();
			}
		} else if (this.aBoolean62) {
			if (this.anInt980 < 0) {
				if (this.anInt983 >= local76) {
					return;
				}
				this.anInt983 = local76 + local76 - this.anInt983 - 1;
				this.anInt980 = -this.anInt980;
			}
			while (this.anInt983 >= local81) {
				this.anInt983 = local81 + local81 - this.anInt983 - 1;
				this.anInt980 = -this.anInt980;
				if (this.anInt983 >= local76) {
					return;
				}
				this.anInt983 = local76 + local76 - this.anInt983 - 1;
				this.anInt980 = -this.anInt980;
			}
		} else if (this.anInt980 < 0) {
			if (this.anInt983 < local76) {
				this.anInt983 = local81 - (local81 - 1 - this.anInt983) % local91 - 1;
			}
		} else if (this.anInt983 >= local81) {
			this.anInt983 = local76 + (this.anInt983 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(III)V")
	public synchronized void method781(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method774(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static361.method771(arg1, arg2);
		@Pc(14) int local14 = Static361.method770(arg1, arg2);
		if (this.anInt981 == local10 && this.anInt989 == local14) {
			this.anInt979 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt990;
		if (this.anInt990 - arg1 > local31) {
			local31 = this.anInt990 - arg1;
		}
		if (local10 - this.anInt981 > local31) {
			local31 = local10 - this.anInt981;
		}
		if (this.anInt981 - local10 > local31) {
			local31 = this.anInt981 - local10;
		}
		if (local14 - this.anInt989 > local31) {
			local31 = local14 - this.anInt989;
		}
		if (this.anInt989 - local14 > local31) {
			local31 = this.anInt989 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt979 = arg0;
		this.anInt987 = arg1;
		this.anInt982 = arg2;
		this.anInt986 = (arg1 - this.anInt990) / arg0;
		this.anInt991 = (local10 - this.anInt981) / arg0;
		this.anInt988 = (local14 - this.anInt989) / arg0;
	}

	@OriginalMember(owner = "client!dd", name = "d", descriptor = "()Lclient!er;")
	@Override
	public Class11_Sub10 method4059() {
		return null;
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "()I")
	@Override
	public int method4056() {
		return this.anInt987 == 0 && this.anInt979 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!dd", name = "e", descriptor = "(I)V")
	public synchronized void method784(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class11_Sub15_Sub1) super.aClass11_Sub15_5).aByteArray95.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt983 = arg0;
	}

	@OriginalMember(owner = "client!dd", name = "f", descriptor = "(I)V")
	private synchronized void method785() {
		this.method774(0, this.method769());
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "()I")
	@Override
	public int method4054() {
		@Pc(6) int local6 = this.anInt990 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt992 == 0) {
			local6 -= local6 * this.anInt983 / (((Class11_Sub15_Sub1) super.aClass11_Sub15_5).aByteArray95.length << 8);
		} else if (this.anInt992 >= 0) {
			local6 -= local6 * this.anInt985 / ((Class11_Sub15_Sub1) super.aClass11_Sub15_5).aByteArray95.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!dd", name = "g", descriptor = "(I)V")
	public synchronized void method786(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method785();
			this.method5701();
		} else if (this.anInt981 == 0 && this.anInt989 == 0) {
			this.anInt979 = 0;
			this.anInt987 = 0;
			this.anInt990 = 0;
			this.method5701();
		} else {
			@Pc(31) int local31 = -this.anInt990;
			if (this.anInt990 > local31) {
				local31 = this.anInt990;
			}
			if (-this.anInt981 > local31) {
				local31 = -this.anInt981;
			}
			if (this.anInt981 > local31) {
				local31 = this.anInt981;
			}
			if (-this.anInt989 > local31) {
				local31 = -this.anInt989;
			}
			if (this.anInt989 > local31) {
				local31 = this.anInt989;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt979 = arg0;
			this.anInt987 = Integer.MIN_VALUE;
			this.anInt986 = -this.anInt990 / arg0;
			this.anInt991 = -this.anInt981 / arg0;
			this.anInt988 = -this.anInt989 / arg0;
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Z)V")
	public synchronized void method787() {
		this.anInt980 = (this.anInt980 ^ this.anInt980 >> 31) + (this.anInt980 >>> 31);
		this.anInt980 = -this.anInt980;
	}

	@OriginalMember(owner = "client!dd", name = "d", descriptor = "(II)V")
	public synchronized void method788(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method781(arg0, arg1, this.method769());
	}

	@OriginalMember(owner = "client!dd", name = "h", descriptor = "()Z")
	public boolean method790() {
		return this.anInt979 != 0;
	}

	@OriginalMember(owner = "client!dd", name = "i", descriptor = "()Z")
	public boolean method791() {
		return this.anInt983 < 0 || this.anInt983 >= ((Class11_Sub15_Sub1) super.aClass11_Sub15_5).aByteArray95.length << 8;
	}

	@OriginalMember(owner = "client!dd", name = "c", descriptor = "()Lclient!er;")
	@Override
	public Class11_Sub10 method4058() {
		return null;
	}

	@OriginalMember(owner = "client!dd", name = "j", descriptor = "()I")
	public synchronized int method793() {
		return this.anInt980 < 0 ? -this.anInt980 : this.anInt980;
	}

	@OriginalMember(owner = "client!dd", name = "k", descriptor = "()V")
	private void method794() {
		if (this.anInt979 == 0) {
			return;
		}
		if (this.anInt987 == Integer.MIN_VALUE) {
			this.anInt987 = 0;
		}
		this.anInt979 = 0;
		this.method758();
	}

	@OriginalMember(owner = "client!dd", name = "l", descriptor = "()I")
	public synchronized int method796() {
		return this.anInt987 == Integer.MIN_VALUE ? 0 : this.anInt987;
	}

	@OriginalMember(owner = "client!dd", name = "h", descriptor = "(I)V")
	public synchronized void method797(@OriginalArg(0) int arg0) {
		this.anInt992 = arg0;
	}
}
