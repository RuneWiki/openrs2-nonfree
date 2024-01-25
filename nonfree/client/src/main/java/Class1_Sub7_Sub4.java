import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wl")
public final class Class1_Sub7_Sub4 extends Class1_Sub7 {

	@OriginalMember(owner = "client!wl", name = "s", descriptor = "I")
	public int anInt7645;

	@OriginalMember(owner = "client!wl", name = "z", descriptor = "I")
	public int anInt7652;

	@OriginalMember(owner = "client!wl", name = "A", descriptor = "I")
	public int anInt7653;

	@OriginalMember(owner = "client!wl", name = "B", descriptor = "I")
	public int anInt7654;

	@OriginalMember(owner = "client!wl", name = "C", descriptor = "I")
	public int anInt7655;

	@OriginalMember(owner = "client!wl", name = "D", descriptor = "I")
	private int anInt7656;

	@OriginalMember(owner = "client!wl", name = "E", descriptor = "I")
	public int anInt7657;

	@OriginalMember(owner = "client!wl", name = "F", descriptor = "I")
	private int anInt7658;

	@OriginalMember(owner = "client!wl", name = "u", descriptor = "I")
	private final int anInt7647;

	@OriginalMember(owner = "client!wl", name = "y", descriptor = "I")
	private final int anInt7651;

	@OriginalMember(owner = "client!wl", name = "r", descriptor = "Z")
	private final boolean aBoolean487;

	@OriginalMember(owner = "client!wl", name = "v", descriptor = "I")
	private int anInt7648;

	@OriginalMember(owner = "client!wl", name = "t", descriptor = "I")
	private int anInt7646;

	@OriginalMember(owner = "client!wl", name = "w", descriptor = "I")
	private int anInt7649;

	@OriginalMember(owner = "client!wl", name = "x", descriptor = "I")
	public int anInt7650;

	@OriginalMember(owner = "client!wl", name = "<init>", descriptor = "(Lclient!nv;II)V")
	public Class1_Sub7_Sub4(@OriginalArg(0) Class1_Sub32_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass1_Sub32_5 = arg0;
		this.anInt7647 = arg0.anInt4941;
		this.anInt7651 = arg0.anInt4940;
		this.aBoolean487 = arg0.aBoolean329;
		this.anInt7648 = arg1;
		this.anInt7646 = arg2;
		this.anInt7649 = 8192;
		this.anInt7650 = 0;
		this.method5943();
	}

	@OriginalMember(owner = "client!wl", name = "<init>", descriptor = "(Lclient!nv;III)V")
	public Class1_Sub7_Sub4(@OriginalArg(0) Class1_Sub32_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass1_Sub32_5 = arg0;
		this.anInt7647 = arg0.anInt4941;
		this.anInt7651 = arg0.anInt4940;
		this.aBoolean487 = arg0.aBoolean329;
		this.anInt7648 = arg1;
		this.anInt7646 = arg2;
		this.anInt7649 = arg3;
		this.anInt7650 = 0;
		this.method5943();
	}

	@OriginalMember(owner = "client!wl", name = "d", descriptor = "(I)V")
	public synchronized void method5933(@OriginalArg(0) int arg0) {
		this.anInt7656 = arg0;
	}

	@OriginalMember(owner = "client!wl", name = "b", descriptor = "()I")
	@Override
	public int method5929() {
		@Pc(6) int local6 = this.anInt7657 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt7656 == 0) {
			local6 -= local6 * this.anInt7650 / (((Class1_Sub32_Sub1) super.aClass1_Sub32_5).aByteArray62.length << 8);
		} else if (this.anInt7656 >= 0) {
			local6 -= local6 * this.anInt7647 / ((Class1_Sub32_Sub1) super.aClass1_Sub32_5).aByteArray62.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!wl", name = "e", descriptor = "(I)V")
	public synchronized void method5937(@OriginalArg(0) int arg0) {
		if (this.anInt7648 < 0) {
			this.anInt7648 = -arg0;
		} else {
			this.anInt7648 = arg0;
		}
	}

	@OriginalMember(owner = "client!wl", name = "c", descriptor = "()Lclient!dm;")
	@Override
	public Class1_Sub7 method5930() {
		return null;
	}

	@OriginalMember(owner = "client!wl", name = "f", descriptor = "(I)V")
	public synchronized void method5938(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method5942();
			this.method6071();
		} else if (this.anInt7645 == 0 && this.anInt7653 == 0) {
			this.anInt7658 = 0;
			this.anInt7646 = 0;
			this.anInt7657 = 0;
			this.method6071();
		} else {
			@Pc(31) int local31 = -this.anInt7657;
			if (this.anInt7657 > local31) {
				local31 = this.anInt7657;
			}
			if (-this.anInt7645 > local31) {
				local31 = -this.anInt7645;
			}
			if (this.anInt7645 > local31) {
				local31 = this.anInt7645;
			}
			if (-this.anInt7653 > local31) {
				local31 = -this.anInt7653;
			}
			if (this.anInt7653 > local31) {
				local31 = this.anInt7653;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt7658 = arg0;
			this.anInt7646 = Integer.MIN_VALUE;
			this.anInt7654 = -this.anInt7657 / arg0;
			this.anInt7652 = -this.anInt7645 / arg0;
			this.anInt7655 = -this.anInt7653 / arg0;
		}
	}

	@OriginalMember(owner = "client!wl", name = "e", descriptor = "()I")
	public synchronized int method5939() {
		return this.anInt7648 < 0 ? -this.anInt7648 : this.anInt7648;
	}

	@OriginalMember(owner = "client!wl", name = "g", descriptor = "(I)V")
	public synchronized void method5940(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class1_Sub32_Sub1) super.aClass1_Sub32_5).aByteArray62.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt7650 = arg0;
	}

	@OriginalMember(owner = "client!wl", name = "f", descriptor = "()I")
	public synchronized int method5941() {
		return this.anInt7649 < 0 ? -1 : this.anInt7649;
	}

	@OriginalMember(owner = "client!wl", name = "h", descriptor = "(I)V")
	private synchronized void method5942() {
		this.method5964(0, this.method5941());
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method5927(@OriginalArg(0) int arg0) {
		if (this.anInt7658 > 0) {
			if (arg0 >= this.anInt7658) {
				if (this.anInt7646 == Integer.MIN_VALUE) {
					this.anInt7646 = 0;
					this.anInt7657 = this.anInt7645 = this.anInt7653 = 0;
					this.method6071();
					arg0 = this.anInt7658;
				}
				this.anInt7658 = 0;
				this.method5943();
			} else {
				this.anInt7657 += this.anInt7654 * arg0;
				this.anInt7645 += this.anInt7652 * arg0;
				this.anInt7653 += this.anInt7655 * arg0;
				this.anInt7658 -= arg0;
			}
		}
		@Pc(71) Class1_Sub32_Sub1 local71 = (Class1_Sub32_Sub1) super.aClass1_Sub32_5;
		@Pc(76) int local76 = this.anInt7647 << 8;
		@Pc(81) int local81 = this.anInt7651 << 8;
		@Pc(87) int local87 = local71.aByteArray62.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt7656 = 0;
		}
		if (this.anInt7650 < 0) {
			if (this.anInt7648 <= 0) {
				this.method5972();
				this.method6071();
				return;
			}
			this.anInt7650 = 0;
		}
		if (this.anInt7650 >= local87) {
			if (this.anInt7648 >= 0) {
				this.method5972();
				this.method6071();
				return;
			}
			this.anInt7650 = local87 - 1;
		}
		this.anInt7650 += this.anInt7648 * arg0;
		if (this.anInt7656 >= 0) {
			if (this.anInt7656 > 0) {
				if (this.aBoolean487) {
					label125: {
						if (this.anInt7648 < 0) {
							if (this.anInt7650 >= local76) {
								return;
							}
							this.anInt7650 = local76 + local76 - this.anInt7650 - 1;
							this.anInt7648 = -this.anInt7648;
							if (--this.anInt7656 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt7650 < local81) {
								return;
							}
							this.anInt7650 = local81 + local81 - this.anInt7650 - 1;
							this.anInt7648 = -this.anInt7648;
							if (--this.anInt7656 == 0) {
								break;
							}
							if (this.anInt7650 >= local76) {
								return;
							}
							this.anInt7650 = local76 + local76 - this.anInt7650 - 1;
							this.anInt7648 = -this.anInt7648;
						} while (--this.anInt7656 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt7648 < 0) {
						if (this.anInt7650 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt7650 - 1) / local91;
						if (local361 < this.anInt7656) {
							this.anInt7650 += local91 * local361;
							this.anInt7656 -= local361;
							return;
						}
						this.anInt7650 += local91 * this.anInt7656;
						this.anInt7656 = 0;
					} else if (this.anInt7650 >= local81) {
						local361 = (this.anInt7650 - local76) / local91;
						if (local361 < this.anInt7656) {
							this.anInt7650 -= local91 * local361;
							this.anInt7656 -= local361;
							return;
						}
						this.anInt7650 -= local91 * this.anInt7656;
						this.anInt7656 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt7648 < 0) {
				if (this.anInt7650 < 0) {
					this.anInt7650 = -1;
					this.method5972();
					this.method6071();
					return;
				}
			} else if (this.anInt7650 >= local87) {
				this.anInt7650 = local87;
				this.method5972();
				this.method6071();
			}
		} else if (this.aBoolean487) {
			if (this.anInt7648 < 0) {
				if (this.anInt7650 >= local76) {
					return;
				}
				this.anInt7650 = local76 + local76 - this.anInt7650 - 1;
				this.anInt7648 = -this.anInt7648;
			}
			while (this.anInt7650 >= local81) {
				this.anInt7650 = local81 + local81 - this.anInt7650 - 1;
				this.anInt7648 = -this.anInt7648;
				if (this.anInt7650 >= local76) {
					return;
				}
				this.anInt7650 = local76 + local76 - this.anInt7650 - 1;
				this.anInt7648 = -this.anInt7648;
			}
		} else if (this.anInt7648 < 0) {
			if (this.anInt7650 < local76) {
				this.anInt7650 = local81 - (local81 - 1 - this.anInt7650) % local91 - 1;
			}
		} else if (this.anInt7650 >= local81) {
			this.anInt7650 = local76 + (this.anInt7650 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!wl", name = "g", descriptor = "()V")
	private void method5943() {
		this.anInt7657 = this.anInt7646;
		this.anInt7645 = Static463.method5935(this.anInt7646, this.anInt7649);
		this.anInt7653 = Static463.method5953(this.anInt7646, this.anInt7649);
	}

	@OriginalMember(owner = "client!wl", name = "h", descriptor = "()Z")
	public boolean method5944() {
		return this.anInt7658 != 0;
	}

	@OriginalMember(owner = "client!wl", name = "i", descriptor = "()I")
	public synchronized int method5951() {
		return this.anInt7646 == Integer.MIN_VALUE ? 0 : this.anInt7646;
	}

	@OriginalMember(owner = "client!wl", name = "d", descriptor = "()Lclient!dm;")
	@Override
	public Class1_Sub7 method5932() {
		return null;
	}

	@OriginalMember(owner = "client!wl", name = "j", descriptor = "()Z")
	private boolean method5954() {
		@Pc(2) int local2 = this.anInt7646;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static463.method5935(local2, this.anInt7649);
			local8 = Static463.method5953(local2, this.anInt7649);
		}
		if (this.anInt7657 != local2 || this.anInt7645 != local10 || this.anInt7653 != local8) {
			if (this.anInt7657 < local2) {
				this.anInt7654 = 1;
				this.anInt7658 = local2 - this.anInt7657;
			} else if (this.anInt7657 > local2) {
				this.anInt7654 = -1;
				this.anInt7658 = this.anInt7657 - local2;
			} else {
				this.anInt7654 = 0;
			}
			if (this.anInt7645 < local10) {
				this.anInt7652 = 1;
				if (this.anInt7658 == 0 || this.anInt7658 > local10 - this.anInt7645) {
					this.anInt7658 = local10 - this.anInt7645;
				}
			} else if (this.anInt7645 > local10) {
				this.anInt7652 = -1;
				if (this.anInt7658 == 0 || this.anInt7658 > this.anInt7645 - local10) {
					this.anInt7658 = this.anInt7645 - local10;
				}
			} else {
				this.anInt7652 = 0;
			}
			if (this.anInt7653 < local8) {
				this.anInt7655 = 1;
				if (this.anInt7658 == 0 || this.anInt7658 > local8 - this.anInt7653) {
					this.anInt7658 = local8 - this.anInt7653;
				}
			} else if (this.anInt7653 > local8) {
				this.anInt7655 = -1;
				if (this.anInt7658 == 0 || this.anInt7658 > this.anInt7653 - local8) {
					this.anInt7658 = this.anInt7653 - local8;
				}
			} else {
				this.anInt7655 = 0;
			}
			return false;
		} else if (this.anInt7646 == Integer.MIN_VALUE) {
			this.anInt7646 = 0;
			this.anInt7657 = this.anInt7645 = this.anInt7653 = 0;
			this.method6071();
			return true;
		} else {
			this.method5943();
			return false;
		}
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "([IIIII)I")
	private int method5955(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt7658 <= 0) {
				if (this.anInt7648 == 256 && (this.anInt7650 & 0xFF) == 0) {
					if (Static93.aBoolean97) {
						return Static463.method5971(((Class1_Sub32_Sub1) super.aClass1_Sub32_5).aByteArray62, arg0, this.anInt7650, arg1, this.anInt7645, this.anInt7653, arg3, arg2, this);
					}
					return Static463.method5949(((Class1_Sub32_Sub1) super.aClass1_Sub32_5).aByteArray62, arg0, this.anInt7650, arg1, this.anInt7657, arg3, arg2, this);
				}
				if (Static93.aBoolean97) {
					return Static463.method5950(((Class1_Sub32_Sub1) super.aClass1_Sub32_5).aByteArray62, arg0, this.anInt7650, arg1, this.anInt7645, this.anInt7653, arg3, arg2, this, this.anInt7648, arg4);
				}
				return Static463.method5966(((Class1_Sub32_Sub1) super.aClass1_Sub32_5).aByteArray62, arg0, this.anInt7650, arg1, this.anInt7657, arg3, arg2, this, this.anInt7648, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt7658;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt7658 += arg1;
			if (this.anInt7648 == 256 && (this.anInt7650 & 0xFF) == 0) {
				if (Static93.aBoolean97) {
					arg1 = Static463.method5956(((Class1_Sub32_Sub1) super.aClass1_Sub32_5).aByteArray62, arg0, this.anInt7650, arg1, this.anInt7645, this.anInt7653, this.anInt7652, this.anInt7655, local5, arg2, this);
				} else {
					arg1 = Static463.method5934(((Class1_Sub32_Sub1) super.aClass1_Sub32_5).aByteArray62, arg0, this.anInt7650, arg1, this.anInt7657, this.anInt7654, local5, arg2, this);
				}
			} else if (Static93.aBoolean97) {
				arg1 = Static463.method5947(((Class1_Sub32_Sub1) super.aClass1_Sub32_5).aByteArray62, arg0, this.anInt7650, arg1, this.anInt7645, this.anInt7653, this.anInt7652, this.anInt7655, local5, arg2, this, this.anInt7648, arg4);
			} else {
				arg1 = Static463.method5970(((Class1_Sub32_Sub1) super.aClass1_Sub32_5).aByteArray62, arg0, this.anInt7650, arg1, this.anInt7657, this.anInt7654, local5, arg2, this, this.anInt7648, arg4);
			}
			this.anInt7658 -= arg1;
			if (this.anInt7658 != 0) {
				return arg1;
			}
		} while (!this.method5954());
		return arg3;
	}

	@OriginalMember(owner = "client!wl", name = "i", descriptor = "(I)V")
	public synchronized void method5957(@OriginalArg(0) int arg0) {
		this.method5964(arg0 << 6, this.method5941());
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "()I")
	@Override
	public int method5926() {
		return this.anInt7646 == 0 && this.anInt7658 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(Z)V")
	public synchronized void method5959() {
		this.anInt7648 = (this.anInt7648 ^ this.anInt7648 >> 31) + (this.anInt7648 >>> 31);
		this.anInt7648 = -this.anInt7648;
	}

	@OriginalMember(owner = "client!wl", name = "c", descriptor = "(II)V")
	public synchronized void method5960(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method5968(arg0, arg1, this.method5941());
	}

	@OriginalMember(owner = "client!wl", name = "b", descriptor = "([IIIII)I")
	private int method5963(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt7658 <= 0) {
				if (this.anInt7648 == -256 && (this.anInt7650 & 0xFF) == 0) {
					if (Static93.aBoolean97) {
						return Static463.method5948(((Class1_Sub32_Sub1) super.aClass1_Sub32_5).aByteArray62, arg0, this.anInt7650, arg1, this.anInt7645, this.anInt7653, arg3, arg2, this);
					}
					return Static463.method5969(((Class1_Sub32_Sub1) super.aClass1_Sub32_5).aByteArray62, arg0, this.anInt7650, arg1, this.anInt7657, arg3, arg2, this);
				}
				if (Static93.aBoolean97) {
					return Static463.method5962(((Class1_Sub32_Sub1) super.aClass1_Sub32_5).aByteArray62, arg0, this.anInt7650, arg1, this.anInt7645, this.anInt7653, arg3, arg2, this, this.anInt7648, arg4);
				}
				return Static463.method5958(((Class1_Sub32_Sub1) super.aClass1_Sub32_5).aByteArray62, arg0, this.anInt7650, arg1, this.anInt7657, arg3, arg2, this, this.anInt7648, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt7658;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt7658 += arg1;
			if (this.anInt7648 == -256 && (this.anInt7650 & 0xFF) == 0) {
				if (Static93.aBoolean97) {
					arg1 = Static463.method5952(((Class1_Sub32_Sub1) super.aClass1_Sub32_5).aByteArray62, arg0, this.anInt7650, arg1, this.anInt7645, this.anInt7653, this.anInt7652, this.anInt7655, local5, arg2, this);
				} else {
					arg1 = Static463.method5946(((Class1_Sub32_Sub1) super.aClass1_Sub32_5).aByteArray62, arg0, this.anInt7650, arg1, this.anInt7657, this.anInt7654, local5, arg2, this);
				}
			} else if (Static93.aBoolean97) {
				arg1 = Static463.method5965(((Class1_Sub32_Sub1) super.aClass1_Sub32_5).aByteArray62, arg0, this.anInt7650, arg1, this.anInt7645, this.anInt7653, this.anInt7652, this.anInt7655, local5, arg2, this, this.anInt7648, arg4);
			} else {
				arg1 = Static463.method5936(((Class1_Sub32_Sub1) super.aClass1_Sub32_5).aByteArray62, arg0, this.anInt7650, arg1, this.anInt7657, this.anInt7654, local5, arg2, this, this.anInt7648, arg4);
			}
			this.anInt7658 -= arg1;
			if (this.anInt7658 != 0) {
				return arg1;
			}
		} while (!this.method5954());
		return arg3;
	}

	@OriginalMember(owner = "client!wl", name = "d", descriptor = "(II)V")
	private synchronized void method5964(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt7646 = arg0;
		this.anInt7649 = arg1;
		this.anInt7658 = 0;
		this.method5943();
	}

	@OriginalMember(owner = "client!wl", name = "k", descriptor = "()Z")
	public boolean method5967() {
		return this.anInt7650 < 0 || this.anInt7650 >= ((Class1_Sub32_Sub1) super.aClass1_Sub32_5).aByteArray62.length << 8;
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(III)V")
	public synchronized void method5968(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method5964(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static463.method5935(arg1, arg2);
		@Pc(14) int local14 = Static463.method5953(arg1, arg2);
		if (this.anInt7645 == local10 && this.anInt7653 == local14) {
			this.anInt7658 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt7657;
		if (this.anInt7657 - arg1 > local31) {
			local31 = this.anInt7657 - arg1;
		}
		if (local10 - this.anInt7645 > local31) {
			local31 = local10 - this.anInt7645;
		}
		if (this.anInt7645 - local10 > local31) {
			local31 = this.anInt7645 - local10;
		}
		if (local14 - this.anInt7653 > local31) {
			local31 = local14 - this.anInt7653;
		}
		if (this.anInt7653 - local14 > local31) {
			local31 = this.anInt7653 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt7658 = arg0;
		this.anInt7646 = arg1;
		this.anInt7649 = arg2;
		this.anInt7654 = (arg1 - this.anInt7657) / arg0;
		this.anInt7652 = (local10 - this.anInt7645) / arg0;
		this.anInt7655 = (local14 - this.anInt7653) / arg0;
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method5928(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt7646 == 0 && this.anInt7658 == 0) {
			this.method5927(arg2);
			return;
		}
		@Pc(13) Class1_Sub32_Sub1 local13 = (Class1_Sub32_Sub1) super.aClass1_Sub32_5;
		@Pc(18) int local18 = this.anInt7647 << 8;
		@Pc(23) int local23 = this.anInt7651 << 8;
		@Pc(29) int local29 = local13.aByteArray62.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt7656 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt7650 < 0) {
			if (this.anInt7648 <= 0) {
				this.method5972();
				this.method6071();
				return;
			}
			this.anInt7650 = 0;
		}
		if (this.anInt7650 >= local29) {
			if (this.anInt7648 >= 0) {
				this.method5972();
				this.method6071();
				return;
			}
			this.anInt7650 = local29 - 1;
		}
		if (this.anInt7656 >= 0) {
			if (this.anInt7656 > 0) {
				if (this.aBoolean487) {
					label130: {
						if (this.anInt7648 < 0) {
							local40 = this.method5963(arg0, arg1, local18, local44, local13.aByteArray62[this.anInt7647]);
							if (this.anInt7650 >= local18) {
								return;
							}
							this.anInt7650 = local18 + local18 - this.anInt7650 - 1;
							this.anInt7648 = -this.anInt7648;
							if (--this.anInt7656 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method5955(arg0, local40, local23, local44, local13.aByteArray62[this.anInt7651 - 1]);
							if (this.anInt7650 < local23) {
								return;
							}
							this.anInt7650 = local23 + local23 - this.anInt7650 - 1;
							this.anInt7648 = -this.anInt7648;
							if (--this.anInt7656 == 0) {
								break;
							}
							local40 = this.method5963(arg0, local40, local18, local44, local13.aByteArray62[this.anInt7647]);
							if (this.anInt7650 >= local18) {
								return;
							}
							this.anInt7650 = local18 + local18 - this.anInt7650 - 1;
							this.anInt7648 = -this.anInt7648;
						} while (--this.anInt7656 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt7648 < 0) {
						while (true) {
							local40 = this.method5963(arg0, local40, local18, local44, local13.aByteArray62[this.anInt7651 - 1]);
							if (this.anInt7650 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt7650 - 1) / local33;
							if (local416 >= this.anInt7656) {
								this.anInt7650 += local33 * this.anInt7656;
								this.anInt7656 = 0;
								break;
							}
							this.anInt7650 += local33 * local416;
							this.anInt7656 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method5955(arg0, local40, local23, local44, local13.aByteArray62[this.anInt7647]);
							if (this.anInt7650 < local23) {
								return;
							}
							local416 = (this.anInt7650 - local18) / local33;
							if (local416 >= this.anInt7656) {
								this.anInt7650 -= local33 * this.anInt7656;
								this.anInt7656 = 0;
								break;
							}
							this.anInt7650 -= local33 * local416;
							this.anInt7656 -= local416;
						}
					}
				}
			}
			if (this.anInt7648 < 0) {
				this.method5963(arg0, local40, 0, local44, 0);
				if (this.anInt7650 < 0) {
					this.anInt7650 = -1;
					this.method5972();
					this.method6071();
					return;
				}
			} else {
				this.method5955(arg0, local40, local29, local44, 0);
				if (this.anInt7650 >= local29) {
					this.anInt7650 = local29;
					this.method5972();
					this.method6071();
				}
			}
		} else if (this.aBoolean487) {
			if (this.anInt7648 < 0) {
				local40 = this.method5963(arg0, arg1, local18, local44, local13.aByteArray62[this.anInt7647]);
				if (this.anInt7650 >= local18) {
					return;
				}
				this.anInt7650 = local18 + local18 - this.anInt7650 - 1;
				this.anInt7648 = -this.anInt7648;
			}
			while (true) {
				local40 = this.method5955(arg0, local40, local23, local44, local13.aByteArray62[this.anInt7651 - 1]);
				if (this.anInt7650 < local23) {
					return;
				}
				this.anInt7650 = local23 + local23 - this.anInt7650 - 1;
				this.anInt7648 = -this.anInt7648;
				local40 = this.method5963(arg0, local40, local18, local44, local13.aByteArray62[this.anInt7647]);
				if (this.anInt7650 >= local18) {
					return;
				}
				this.anInt7650 = local18 + local18 - this.anInt7650 - 1;
				this.anInt7648 = -this.anInt7648;
			}
		} else if (this.anInt7648 < 0) {
			while (true) {
				local40 = this.method5963(arg0, local40, local18, local44, local13.aByteArray62[this.anInt7651 - 1]);
				if (this.anInt7650 >= local18) {
					return;
				}
				this.anInt7650 = local23 - (local23 - 1 - this.anInt7650) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method5955(arg0, local40, local23, local44, local13.aByteArray62[this.anInt7647]);
				if (this.anInt7650 < local23) {
					return;
				}
				this.anInt7650 = local18 + (this.anInt7650 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!wl", name = "l", descriptor = "()V")
	private void method5972() {
		if (this.anInt7658 == 0) {
			return;
		}
		if (this.anInt7646 == Integer.MIN_VALUE) {
			this.anInt7646 = 0;
		}
		this.anInt7658 = 0;
		this.method5943();
	}
}
