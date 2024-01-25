import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!or")
public final class Class2_Sub12_Sub3 extends Class2_Sub12 {

	@OriginalMember(owner = "client!or", name = "p", descriptor = "I")
	public int anInt6505;

	@OriginalMember(owner = "client!or", name = "r", descriptor = "I")
	private int anInt6507;

	@OriginalMember(owner = "client!or", name = "t", descriptor = "I")
	private int anInt6508;

	@OriginalMember(owner = "client!or", name = "v", descriptor = "I")
	public int anInt6510;

	@OriginalMember(owner = "client!or", name = "w", descriptor = "I")
	public int anInt6511;

	@OriginalMember(owner = "client!or", name = "x", descriptor = "I")
	public int anInt6512;

	@OriginalMember(owner = "client!or", name = "y", descriptor = "I")
	public int anInt6513;

	@OriginalMember(owner = "client!or", name = "A", descriptor = "I")
	public int anInt6515;

	@OriginalMember(owner = "client!or", name = "n", descriptor = "I")
	private final int anInt6503;

	@OriginalMember(owner = "client!or", name = "q", descriptor = "I")
	private final int anInt6506;

	@OriginalMember(owner = "client!or", name = "s", descriptor = "Z")
	private final boolean aBoolean482;

	@OriginalMember(owner = "client!or", name = "z", descriptor = "I")
	private int anInt6514;

	@OriginalMember(owner = "client!or", name = "m", descriptor = "I")
	private int anInt6502;

	@OriginalMember(owner = "client!or", name = "u", descriptor = "I")
	private int anInt6509;

	@OriginalMember(owner = "client!or", name = "o", descriptor = "I")
	public int anInt6504;

	@OriginalMember(owner = "client!or", name = "<init>", descriptor = "(Lclient!mca;II)V")
	public Class2_Sub12_Sub3(@OriginalArg(0) Class2_Sub31_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass2_Sub31_5 = arg0;
		this.anInt6503 = arg0.anInt5386;
		this.anInt6506 = arg0.anInt5385;
		this.aBoolean482 = arg0.aBoolean401;
		this.anInt6514 = arg1;
		this.anInt6502 = arg2;
		this.anInt6509 = 8192;
		this.anInt6504 = 0;
		this.method5593();
	}

	@OriginalMember(owner = "client!or", name = "<init>", descriptor = "(Lclient!mca;III)V")
	public Class2_Sub12_Sub3(@OriginalArg(0) Class2_Sub31_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass2_Sub31_5 = arg0;
		this.anInt6503 = arg0.anInt5386;
		this.anInt6506 = arg0.anInt5385;
		this.aBoolean482 = arg0.aBoolean401;
		this.anInt6514 = arg1;
		this.anInt6502 = arg2;
		this.anInt6509 = arg3;
		this.anInt6504 = 0;
		this.method5593();
	}

	@OriginalMember(owner = "client!or", name = "c", descriptor = "()Lclient!ft;")
	@Override
	public Class2_Sub12 method7196() {
		return null;
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(III)V")
	public synchronized void method5560(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method5592(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static555.method5584(arg1, arg2);
		@Pc(14) int local14 = Static555.method5597(arg1, arg2);
		if (this.anInt6505 == local10 && this.anInt6515 == local14) {
			this.anInt6507 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt6513;
		if (this.anInt6513 - arg1 > local31) {
			local31 = this.anInt6513 - arg1;
		}
		if (local10 - this.anInt6505 > local31) {
			local31 = local10 - this.anInt6505;
		}
		if (this.anInt6505 - local10 > local31) {
			local31 = this.anInt6505 - local10;
		}
		if (local14 - this.anInt6515 > local31) {
			local31 = local14 - this.anInt6515;
		}
		if (this.anInt6515 - local14 > local31) {
			local31 = this.anInt6515 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt6507 = arg0;
		this.anInt6502 = arg1;
		this.anInt6509 = arg2;
		this.anInt6510 = (arg1 - this.anInt6513) / arg0;
		this.anInt6511 = (local10 - this.anInt6505) / arg0;
		this.anInt6512 = (local14 - this.anInt6515) / arg0;
	}

	@OriginalMember(owner = "client!or", name = "e", descriptor = "()I")
	public synchronized int method5563() {
		return this.anInt6509 < 0 ? -1 : this.anInt6509;
	}

	@OriginalMember(owner = "client!or", name = "b", descriptor = "(I)V")
	public synchronized void method5565(@OriginalArg(0) int arg0) {
		if (this.anInt6514 < 0) {
			this.anInt6514 = -arg0;
		} else {
			this.anInt6514 = arg0;
		}
	}

	@OriginalMember(owner = "client!or", name = "f", descriptor = "()I")
	public synchronized int method5567() {
		return this.anInt6514 < 0 ? -this.anInt6514 : this.anInt6514;
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "([IIIII)I")
	private int method5568(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt6507 <= 0) {
				if (this.anInt6514 == -256 && (this.anInt6504 & 0xFF) == 0) {
					if (Static313.aBoolean513) {
						return Static555.method5566(((Class2_Sub31_Sub1) super.aClass2_Sub31_5).aByteArray91, arg0, this.anInt6504, arg1, this.anInt6505, this.anInt6515, arg3, arg2, this);
					}
					return Static555.method5594(((Class2_Sub31_Sub1) super.aClass2_Sub31_5).aByteArray91, arg0, this.anInt6504, arg1, this.anInt6513, arg3, arg2, this);
				}
				if (Static313.aBoolean513) {
					return Static555.method5578(((Class2_Sub31_Sub1) super.aClass2_Sub31_5).aByteArray91, arg0, this.anInt6504, arg1, this.anInt6505, this.anInt6515, arg3, arg2, this, this.anInt6514, arg4);
				}
				return Static555.method5576(((Class2_Sub31_Sub1) super.aClass2_Sub31_5).aByteArray91, arg0, this.anInt6504, arg1, this.anInt6513, arg3, arg2, this, this.anInt6514, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt6507;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt6507 += arg1;
			if (this.anInt6514 == -256 && (this.anInt6504 & 0xFF) == 0) {
				if (Static313.aBoolean513) {
					arg1 = Static555.method5588(((Class2_Sub31_Sub1) super.aClass2_Sub31_5).aByteArray91, arg0, this.anInt6504, arg1, this.anInt6505, this.anInt6515, this.anInt6511, this.anInt6512, local5, arg2, this);
				} else {
					arg1 = Static555.method5564(((Class2_Sub31_Sub1) super.aClass2_Sub31_5).aByteArray91, arg0, this.anInt6504, arg1, this.anInt6513, this.anInt6510, local5, arg2, this);
				}
			} else if (Static313.aBoolean513) {
				arg1 = Static555.method5577(((Class2_Sub31_Sub1) super.aClass2_Sub31_5).aByteArray91, arg0, this.anInt6504, arg1, this.anInt6505, this.anInt6515, this.anInt6511, this.anInt6512, local5, arg2, this, this.anInt6514, arg4);
			} else {
				arg1 = Static555.method5585(((Class2_Sub31_Sub1) super.aClass2_Sub31_5).aByteArray91, arg0, this.anInt6504, arg1, this.anInt6513, this.anInt6510, local5, arg2, this, this.anInt6514, arg4);
			}
			this.anInt6507 -= arg1;
			if (this.anInt6507 != 0) {
				return arg1;
			}
		} while (!this.method5582());
		return arg3;
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(Z)V")
	public synchronized void method5569() {
		this.anInt6514 = (this.anInt6514 ^ this.anInt6514 >> 31) + (this.anInt6514 >>> 31);
		this.anInt6514 = -this.anInt6514;
	}

	@OriginalMember(owner = "client!or", name = "c", descriptor = "(I)V")
	private synchronized void method5572() {
		this.method5592(0, this.method5563());
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(II)V")
	public synchronized void method5573(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method5560(arg0, arg1, this.method5563());
	}

	@OriginalMember(owner = "client!or", name = "g", descriptor = "(I)V")
	public synchronized void method5574(@OriginalArg(0) int arg0) {
		this.method5592(arg0 << 6, this.method5563());
	}

	@OriginalMember(owner = "client!or", name = "g", descriptor = "()Z")
	public boolean method5575() {
		return this.anInt6507 != 0;
	}

	@OriginalMember(owner = "client!or", name = "h", descriptor = "(I)V")
	public synchronized void method5579(@OriginalArg(0) int arg0) {
		this.anInt6508 = arg0;
	}

	@OriginalMember(owner = "client!or", name = "d", descriptor = "()I")
	@Override
	public int method7197() {
		@Pc(6) int local6 = this.anInt6513 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt6508 == 0) {
			local6 -= local6 * this.anInt6504 / (((Class2_Sub31_Sub1) super.aClass2_Sub31_5).aByteArray91.length << 8);
		} else if (this.anInt6508 >= 0) {
			local6 -= local6 * this.anInt6503 / ((Class2_Sub31_Sub1) super.aClass2_Sub31_5).aByteArray91.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "()I")
	@Override
	public int method7191() {
		return this.anInt6502 == 0 && this.anInt6507 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!or", name = "i", descriptor = "(I)V")
	public synchronized void method5581(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class2_Sub31_Sub1) super.aClass2_Sub31_5).aByteArray91.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt6504 = arg0;
	}

	@OriginalMember(owner = "client!or", name = "h", descriptor = "()Z")
	private boolean method5582() {
		@Pc(2) int local2 = this.anInt6502;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static555.method5584(local2, this.anInt6509);
			local8 = Static555.method5597(local2, this.anInt6509);
		}
		if (this.anInt6513 != local2 || this.anInt6505 != local10 || this.anInt6515 != local8) {
			if (this.anInt6513 < local2) {
				this.anInt6510 = 1;
				this.anInt6507 = local2 - this.anInt6513;
			} else if (this.anInt6513 > local2) {
				this.anInt6510 = -1;
				this.anInt6507 = this.anInt6513 - local2;
			} else {
				this.anInt6510 = 0;
			}
			if (this.anInt6505 < local10) {
				this.anInt6511 = 1;
				if (this.anInt6507 == 0 || this.anInt6507 > local10 - this.anInt6505) {
					this.anInt6507 = local10 - this.anInt6505;
				}
			} else if (this.anInt6505 > local10) {
				this.anInt6511 = -1;
				if (this.anInt6507 == 0 || this.anInt6507 > this.anInt6505 - local10) {
					this.anInt6507 = this.anInt6505 - local10;
				}
			} else {
				this.anInt6511 = 0;
			}
			if (this.anInt6515 < local8) {
				this.anInt6512 = 1;
				if (this.anInt6507 == 0 || this.anInt6507 > local8 - this.anInt6515) {
					this.anInt6507 = local8 - this.anInt6515;
				}
			} else if (this.anInt6515 > local8) {
				this.anInt6512 = -1;
				if (this.anInt6507 == 0 || this.anInt6507 > this.anInt6515 - local8) {
					this.anInt6507 = this.anInt6515 - local8;
				}
			} else {
				this.anInt6512 = 0;
			}
			return false;
		} else if (this.anInt6502 == Integer.MIN_VALUE) {
			this.anInt6502 = 0;
			this.anInt6513 = this.anInt6505 = this.anInt6515 = 0;
			this.method7802();
			return true;
		} else {
			this.method5593();
			return false;
		}
	}

	@OriginalMember(owner = "client!or", name = "i", descriptor = "()V")
	private void method5583() {
		if (this.anInt6507 == 0) {
			return;
		}
		if (this.anInt6502 == Integer.MIN_VALUE) {
			this.anInt6502 = 0;
		}
		this.anInt6507 = 0;
		this.method5593();
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method7192(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt6502 == 0 && this.anInt6507 == 0) {
			this.method7193(arg2);
			return;
		}
		@Pc(13) Class2_Sub31_Sub1 local13 = (Class2_Sub31_Sub1) super.aClass2_Sub31_5;
		@Pc(18) int local18 = this.anInt6503 << 8;
		@Pc(23) int local23 = this.anInt6506 << 8;
		@Pc(29) int local29 = local13.aByteArray91.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt6508 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt6504 < 0) {
			if (this.anInt6514 <= 0) {
				this.method5583();
				this.method7802();
				return;
			}
			this.anInt6504 = 0;
		}
		if (this.anInt6504 >= local29) {
			if (this.anInt6514 >= 0) {
				this.method5583();
				this.method7802();
				return;
			}
			this.anInt6504 = local29 - 1;
		}
		if (this.anInt6508 >= 0) {
			if (this.anInt6508 > 0) {
				if (this.aBoolean482) {
					label130: {
						if (this.anInt6514 < 0) {
							local40 = this.method5568(arg0, arg1, local18, local44, local13.aByteArray91[this.anInt6503]);
							if (this.anInt6504 >= local18) {
								return;
							}
							this.anInt6504 = local18 + local18 - this.anInt6504 - 1;
							this.anInt6514 = -this.anInt6514;
							if (--this.anInt6508 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method5589(arg0, local40, local23, local44, local13.aByteArray91[this.anInt6506 - 1]);
							if (this.anInt6504 < local23) {
								return;
							}
							this.anInt6504 = local23 + local23 - this.anInt6504 - 1;
							this.anInt6514 = -this.anInt6514;
							if (--this.anInt6508 == 0) {
								break;
							}
							local40 = this.method5568(arg0, local40, local18, local44, local13.aByteArray91[this.anInt6503]);
							if (this.anInt6504 >= local18) {
								return;
							}
							this.anInt6504 = local18 + local18 - this.anInt6504 - 1;
							this.anInt6514 = -this.anInt6514;
						} while (--this.anInt6508 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt6514 < 0) {
						while (true) {
							local40 = this.method5568(arg0, local40, local18, local44, local13.aByteArray91[this.anInt6506 - 1]);
							if (this.anInt6504 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt6504 - 1) / local33;
							if (local416 >= this.anInt6508) {
								this.anInt6504 += local33 * this.anInt6508;
								this.anInt6508 = 0;
								break;
							}
							this.anInt6504 += local33 * local416;
							this.anInt6508 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method5589(arg0, local40, local23, local44, local13.aByteArray91[this.anInt6503]);
							if (this.anInt6504 < local23) {
								return;
							}
							local416 = (this.anInt6504 - local18) / local33;
							if (local416 >= this.anInt6508) {
								this.anInt6504 -= local33 * this.anInt6508;
								this.anInt6508 = 0;
								break;
							}
							this.anInt6504 -= local33 * local416;
							this.anInt6508 -= local416;
						}
					}
				}
			}
			if (this.anInt6514 < 0) {
				this.method5568(arg0, local40, 0, local44, 0);
				if (this.anInt6504 < 0) {
					this.anInt6504 = -1;
					this.method5583();
					this.method7802();
					return;
				}
			} else {
				this.method5589(arg0, local40, local29, local44, 0);
				if (this.anInt6504 >= local29) {
					this.anInt6504 = local29;
					this.method5583();
					this.method7802();
				}
			}
		} else if (this.aBoolean482) {
			if (this.anInt6514 < 0) {
				local40 = this.method5568(arg0, arg1, local18, local44, local13.aByteArray91[this.anInt6503]);
				if (this.anInt6504 >= local18) {
					return;
				}
				this.anInt6504 = local18 + local18 - this.anInt6504 - 1;
				this.anInt6514 = -this.anInt6514;
			}
			while (true) {
				local40 = this.method5589(arg0, local40, local23, local44, local13.aByteArray91[this.anInt6506 - 1]);
				if (this.anInt6504 < local23) {
					return;
				}
				this.anInt6504 = local23 + local23 - this.anInt6504 - 1;
				this.anInt6514 = -this.anInt6514;
				local40 = this.method5568(arg0, local40, local18, local44, local13.aByteArray91[this.anInt6503]);
				if (this.anInt6504 >= local18) {
					return;
				}
				this.anInt6504 = local18 + local18 - this.anInt6504 - 1;
				this.anInt6514 = -this.anInt6514;
			}
		} else if (this.anInt6514 < 0) {
			while (true) {
				local40 = this.method5568(arg0, local40, local18, local44, local13.aByteArray91[this.anInt6506 - 1]);
				if (this.anInt6504 >= local18) {
					return;
				}
				this.anInt6504 = local23 - (local23 - 1 - this.anInt6504) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method5589(arg0, local40, local23, local44, local13.aByteArray91[this.anInt6503]);
				if (this.anInt6504 < local23) {
					return;
				}
				this.anInt6504 = local18 + (this.anInt6504 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!or", name = "j", descriptor = "()I")
	public synchronized int method5587() {
		return this.anInt6502 == Integer.MIN_VALUE ? 0 : this.anInt6502;
	}

	@OriginalMember(owner = "client!or", name = "b", descriptor = "([IIIII)I")
	private int method5589(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt6507 <= 0) {
				if (this.anInt6514 == 256 && (this.anInt6504 & 0xFF) == 0) {
					if (Static313.aBoolean513) {
						return Static555.method5590(((Class2_Sub31_Sub1) super.aClass2_Sub31_5).aByteArray91, arg0, this.anInt6504, arg1, this.anInt6505, this.anInt6515, arg3, arg2, this);
					}
					return Static555.method5571(((Class2_Sub31_Sub1) super.aClass2_Sub31_5).aByteArray91, arg0, this.anInt6504, arg1, this.anInt6513, arg3, arg2, this);
				}
				if (Static313.aBoolean513) {
					return Static555.method5599(((Class2_Sub31_Sub1) super.aClass2_Sub31_5).aByteArray91, arg0, this.anInt6504, arg1, this.anInt6505, this.anInt6515, arg3, arg2, this, this.anInt6514, arg4);
				}
				return Static555.method5598(((Class2_Sub31_Sub1) super.aClass2_Sub31_5).aByteArray91, arg0, this.anInt6504, arg1, this.anInt6513, arg3, arg2, this, this.anInt6514, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt6507;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt6507 += arg1;
			if (this.anInt6514 == 256 && (this.anInt6504 & 0xFF) == 0) {
				if (Static313.aBoolean513) {
					arg1 = Static555.method5586(((Class2_Sub31_Sub1) super.aClass2_Sub31_5).aByteArray91, arg0, this.anInt6504, arg1, this.anInt6505, this.anInt6515, this.anInt6511, this.anInt6512, local5, arg2, this);
				} else {
					arg1 = Static555.method5591(((Class2_Sub31_Sub1) super.aClass2_Sub31_5).aByteArray91, arg0, this.anInt6504, arg1, this.anInt6513, this.anInt6510, local5, arg2, this);
				}
			} else if (Static313.aBoolean513) {
				arg1 = Static555.method5561(((Class2_Sub31_Sub1) super.aClass2_Sub31_5).aByteArray91, arg0, this.anInt6504, arg1, this.anInt6505, this.anInt6515, this.anInt6511, this.anInt6512, local5, arg2, this, this.anInt6514, arg4);
			} else {
				arg1 = Static555.method5562(((Class2_Sub31_Sub1) super.aClass2_Sub31_5).aByteArray91, arg0, this.anInt6504, arg1, this.anInt6513, this.anInt6510, local5, arg2, this, this.anInt6514, arg4);
			}
			this.anInt6507 -= arg1;
			if (this.anInt6507 != 0) {
				return arg1;
			}
		} while (!this.method5582());
		return arg3;
	}

	@OriginalMember(owner = "client!or", name = "c", descriptor = "(II)V")
	private synchronized void method5592(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6502 = arg0;
		this.anInt6509 = arg1;
		this.anInt6507 = 0;
		this.method5593();
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method7193(@OriginalArg(0) int arg0) {
		if (this.anInt6507 > 0) {
			if (arg0 >= this.anInt6507) {
				if (this.anInt6502 == Integer.MIN_VALUE) {
					this.anInt6502 = 0;
					this.anInt6513 = this.anInt6505 = this.anInt6515 = 0;
					this.method7802();
					arg0 = this.anInt6507;
				}
				this.anInt6507 = 0;
				this.method5593();
			} else {
				this.anInt6513 += this.anInt6510 * arg0;
				this.anInt6505 += this.anInt6511 * arg0;
				this.anInt6515 += this.anInt6512 * arg0;
				this.anInt6507 -= arg0;
			}
		}
		@Pc(71) Class2_Sub31_Sub1 local71 = (Class2_Sub31_Sub1) super.aClass2_Sub31_5;
		@Pc(76) int local76 = this.anInt6503 << 8;
		@Pc(81) int local81 = this.anInt6506 << 8;
		@Pc(87) int local87 = local71.aByteArray91.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt6508 = 0;
		}
		if (this.anInt6504 < 0) {
			if (this.anInt6514 <= 0) {
				this.method5583();
				this.method7802();
				return;
			}
			this.anInt6504 = 0;
		}
		if (this.anInt6504 >= local87) {
			if (this.anInt6514 >= 0) {
				this.method5583();
				this.method7802();
				return;
			}
			this.anInt6504 = local87 - 1;
		}
		this.anInt6504 += this.anInt6514 * arg0;
		if (this.anInt6508 >= 0) {
			if (this.anInt6508 > 0) {
				if (this.aBoolean482) {
					label125: {
						if (this.anInt6514 < 0) {
							if (this.anInt6504 >= local76) {
								return;
							}
							this.anInt6504 = local76 + local76 - this.anInt6504 - 1;
							this.anInt6514 = -this.anInt6514;
							if (--this.anInt6508 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt6504 < local81) {
								return;
							}
							this.anInt6504 = local81 + local81 - this.anInt6504 - 1;
							this.anInt6514 = -this.anInt6514;
							if (--this.anInt6508 == 0) {
								break;
							}
							if (this.anInt6504 >= local76) {
								return;
							}
							this.anInt6504 = local76 + local76 - this.anInt6504 - 1;
							this.anInt6514 = -this.anInt6514;
						} while (--this.anInt6508 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt6514 < 0) {
						if (this.anInt6504 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt6504 - 1) / local91;
						if (local361 < this.anInt6508) {
							this.anInt6504 += local91 * local361;
							this.anInt6508 -= local361;
							return;
						}
						this.anInt6504 += local91 * this.anInt6508;
						this.anInt6508 = 0;
					} else if (this.anInt6504 >= local81) {
						local361 = (this.anInt6504 - local76) / local91;
						if (local361 < this.anInt6508) {
							this.anInt6504 -= local91 * local361;
							this.anInt6508 -= local361;
							return;
						}
						this.anInt6504 -= local91 * this.anInt6508;
						this.anInt6508 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt6514 < 0) {
				if (this.anInt6504 < 0) {
					this.anInt6504 = -1;
					this.method5583();
					this.method7802();
					return;
				}
			} else if (this.anInt6504 >= local87) {
				this.anInt6504 = local87;
				this.method5583();
				this.method7802();
			}
		} else if (this.aBoolean482) {
			if (this.anInt6514 < 0) {
				if (this.anInt6504 >= local76) {
					return;
				}
				this.anInt6504 = local76 + local76 - this.anInt6504 - 1;
				this.anInt6514 = -this.anInt6514;
			}
			while (this.anInt6504 >= local81) {
				this.anInt6504 = local81 + local81 - this.anInt6504 - 1;
				this.anInt6514 = -this.anInt6514;
				if (this.anInt6504 >= local76) {
					return;
				}
				this.anInt6504 = local76 + local76 - this.anInt6504 - 1;
				this.anInt6514 = -this.anInt6514;
			}
		} else if (this.anInt6514 < 0) {
			if (this.anInt6504 < local76) {
				this.anInt6504 = local81 - (local81 - 1 - this.anInt6504) % local91 - 1;
			}
		} else if (this.anInt6504 >= local81) {
			this.anInt6504 = local76 + (this.anInt6504 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!or", name = "k", descriptor = "()V")
	private void method5593() {
		this.anInt6513 = this.anInt6502;
		this.anInt6505 = Static555.method5584(this.anInt6502, this.anInt6509);
		this.anInt6515 = Static555.method5597(this.anInt6502, this.anInt6509);
	}

	@OriginalMember(owner = "client!or", name = "b", descriptor = "()Lclient!ft;")
	@Override
	public Class2_Sub12 method7195() {
		return null;
	}

	@OriginalMember(owner = "client!or", name = "j", descriptor = "(I)V")
	public synchronized void method5595(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method5572();
			this.method7802();
		} else if (this.anInt6505 == 0 && this.anInt6515 == 0) {
			this.anInt6507 = 0;
			this.anInt6502 = 0;
			this.anInt6513 = 0;
			this.method7802();
		} else {
			@Pc(31) int local31 = -this.anInt6513;
			if (this.anInt6513 > local31) {
				local31 = this.anInt6513;
			}
			if (-this.anInt6505 > local31) {
				local31 = -this.anInt6505;
			}
			if (this.anInt6505 > local31) {
				local31 = this.anInt6505;
			}
			if (-this.anInt6515 > local31) {
				local31 = -this.anInt6515;
			}
			if (this.anInt6515 > local31) {
				local31 = this.anInt6515;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt6507 = arg0;
			this.anInt6502 = Integer.MIN_VALUE;
			this.anInt6510 = -this.anInt6513 / arg0;
			this.anInt6511 = -this.anInt6505 / arg0;
			this.anInt6512 = -this.anInt6515 / arg0;
		}
	}

	@OriginalMember(owner = "client!or", name = "l", descriptor = "()Z")
	public boolean method5596() {
		return this.anInt6504 < 0 || this.anInt6504 >= ((Class2_Sub31_Sub1) super.aClass2_Sub31_5).aByteArray91.length << 8;
	}
}
